package vn.edu.hcmus.fit.sv18120061.lab02;

import java.util.*;

import static java.lang.Math.abs;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:47 PM
 * @Description: Viết chương trình tìm phần tử có giá trị giữa nhất trong một mảng chưa được sắp xếp
 * @Example:
 * [10, 2, 38, 23, 38, 23, 21] -> Output: 23
 */
public class Exercise26 {
    /**
     * input1DArray function
     *
     * @param arr is the array input
     */
    private static void input1DArray(int[] arr){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            System.out.printf("arr[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
    }

    /**
     * display1DArray function
     *
     * @param arr is the array input
     */
    private static void display1DArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

    private static double averageArray(int[] arr){
        return Arrays.stream(arr).reduce(0, (x, y) -> x + y)/ arr.length;
    }

    private static double distance(double a, double b){
        return abs(a - b);
    }

    /**
     * Solution exercise 26 function
     *
     */
    public static void Function26(){
        // Input
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter your number of elements: ");
        n = scanner.nextInt();

        int[] arr = new int[n];
        input1DArray(arr);

        // Show input
        System.out.println("Your array: ");
        display1DArray(arr);

        // Processing
        double average = averageArray(arr);
        double minDistance = distance(arr[0], average);
        int index = 0;
        for (int i = 1; i < arr.length; i++){
            if (distance(arr[i],average) < minDistance){
                minDistance = distance(arr[i],average);
                index = i;
            }
        }

        // Output
        System.out.println("Exercise 26 - Phan tử giữa nhất: " + arr[index]);
    }
}
