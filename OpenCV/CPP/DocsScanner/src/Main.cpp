#include <iostream>

// CV Include
#include <opencv2/opencv.hpp>
#include <opencv2/highgui/highgui.hpp>

// STL Include

class DocsScanner {
public:
	
	cv::Mat erodeImage;
	
	cv::Mat cropImage;

	

	cv::Mat preProcessing(cv::Mat sourceImage) {
		cv::Mat grayscaleImage;
		cv::Mat bluringImage;
		cv::Mat cannyImage;
		cv::Mat dilImage;

		// originalImage = sourceImage.clone();
		cv::cvtColor(sourceImage, grayscaleImage, cv::COLOR_BGR2GRAY);
		cv::GaussianBlur(grayscaleImage, bluringImage, cv::Size(3, 3), 3, 0);
		cv::Canny(bluringImage, cannyImage, 25, 75);
		cv::Mat kernel = cv::getStructuringElement(cv::MORPH_RECT, cv::Size(3, 3));
		dilate(cannyImage, dilImage, kernel);
		//erode(imgDil, imgErode, kernel);
		return dilImage;
	}


	std::vector<cv::Point> getContours(cv::Mat sourceImage) {

		std::vector<std::vector<cv::Point>> contours;
		std::vector<cv::Vec4i> hierarchy;

		findContours(sourceImage, contours, hierarchy, cv::RETR_EXTERNAL, cv::CHAIN_APPROX_SIMPLE);
		//drawContours(img, contours, -1, Scalar(255, 0, 255), 2);
		std::vector<std::vector<cv::Point>> conPoly(contours.size());
		std::vector<cv::Rect> boundRect(contours.size());

		std::vector<cv::Point> biggest;
		int maxArea = 0;

		for (int i = 0; i < contours.size(); i++)
		{
			int area = contourArea(contours[i]);
			//cout << area << endl;

			std::string objectType;

			if (area > 1000)
			{
				float peri = arcLength(contours[i], true);
				approxPolyDP(contours[i], conPoly[i], 0.02 * peri, true);

				if (area > maxArea && conPoly[i].size() == 4) {

					//drawContours(imgOriginal, conPoly, i, Scalar(255, 0, 255), 5);
					biggest = { conPoly[i][0],conPoly[i][1] ,conPoly[i][2] ,conPoly[i][3] };
					maxArea = area;
				}

				//drawContours(imgOriginal, conPoly, i, Scalar(255, 0, 255), 2);
				//rectangle(imgOriginal, boundRect[i].tl(), boundRect[i].br(), Scalar(0, 255, 0), 5);
			}
		}

		return biggest;
	}

	void drawPoints(cv::Mat &originalImage, std::vector<cv::Point> points, cv::Scalar color)
	{
		for (int i = 0; i < points.size(); i++)
		{
			circle(originalImage, points[i], 10, color, cv::FILLED);
			putText(originalImage, std::to_string(i), points[i], cv::FONT_HERSHEY_PLAIN, 4, color, 4);
		}
	}

	std::vector<cv::Point> reorder(std::vector<cv::Point> points)
	{
		std::vector<cv::Point> newPoints;
		std::vector<int> sumPoints;
		std::vector<int> subPoints;

		for (int i = 0; i < 4; i++)
		{
			int x = points[i].x;
			int y = points[i].y;
			sumPoints.push_back(x + y);
			subPoints.push_back(x - y);
		}

		newPoints.push_back(points[std::distance(min_element(sumPoints.begin(), sumPoints.end()), sumPoints.begin())]); // 0
		newPoints.push_back(points[std::distance(max_element(subPoints.begin(), subPoints.end()), subPoints.begin())]); //1
		newPoints.push_back(points[std::distance(min_element(subPoints.begin(), subPoints.end()), subPoints.begin())]); //2
		newPoints.push_back(points[std::distance(max_element(sumPoints.begin(), sumPoints.end()), sumPoints.begin())]); //3

		return newPoints;
	}


	cv::Mat getWarp(cv::Mat image, std::vector<cv::Point> points, float w, float h)
	{
		cv::Mat warpImage;

		cv::Point2f src[4] = { points[0],points[1],points[2],points[3] };
		cv::Point2f dst[4] = { {0.0f,0.0f},{w,0.0f},{0.0f,h},{w,h} };

		cv::Mat matrix = getPerspectiveTransform(src, dst);
		warpPerspective(image, warpImage, matrix, cv::Point(w, h));

		return warpImage;
	}


	void exec(std::string path) {
		cv::Mat originalImage = cv::imread(path);
		//resize(imgOriginal, imgOriginal, Size(), 0.5, 0.5);
		int w = 420, h = 596;

		std::vector<cv::Point> initialPoints, docPoints;

		// Preprpcessing – Step 1
		cv::Mat thresholdImage = preProcessing(originalImage);

		// Get Contours – Biggest – Step 2
		initialPoints = getContours(thresholdImage);
		//drawPoints(initialPoints, Scalar(0, 0, 255));
		docPoints = reorder(initialPoints);
		//drawPoints(docPoints, Scalar(0, 255, 0));

		// Warp – Step 3
		cv::Mat warpImage = getWarp(originalImage, docPoints, w, h);

		//Crop – Step 4
		int cropVal = 5;
		cv::Rect roi(cropVal, cropVal, w - (2 * cropVal), h - (2 * cropVal));
		cv::Mat imgCrop = warpImage(roi);

		cv::imshow("Image", originalImage);
		//imshow(“Image Dilation”, imgThre);
		//imshow(“Image Warp”, imgWarp);
		cv::imshow("Image Crop", imgCrop);
		cv::waitKey(0);
	}
};

int main() {
	DocsScanner docscanner;
	docscanner.exec("E:/lena.jpg");
	return 0;
}