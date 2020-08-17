package vn.edu.hcmus.fit.sv18120061.lab02;

import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:47 PM
 * @Description: Viết chương trình tìm vị trí của một giá trị trong một mảng đã được sắp xếp. Nêu không tìm
 * thấy, thì insert giá trị này vào vị trí được sắp xếp trong mảng
 * @Exmaple
 * [1, 2, 4, 5, 6] -> 5 (target) -> 3 (index)
 * [1, 2, 4, 5, 6] -> 0 (target) -> 0 (index)
 * [1, 2, 4, 5, 6] -> 7 (target) -> 6 (indext)
 */
public class Exercise25 {

    /**
     * binarySearch function
     *
     * @param arr is the array input
     * @param left is the left index
     * @param right is the right index
     * @param key is the key need to find
     */
    private static int binarySearch(int[] arr, int left, int right, int key){
        if (left >= right){
            int mid = (left + right) / 2;
            if(arr[mid] == key){
                return mid;
            }
            if (arr[mid] > key){
                return binarySearch(arr, left, mid -1, key);
            }
            return  binarySearch(arr, mid + 1, right, key);
        }
        return -1;
    }


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
        System.out.println();
    }

    /**
     * insertSortedArray function
     *
     * @param arr is the array input, this array has sorted.
     * @param value is the value need to insert.
     */
    private static int[] insertSortedArray(int[] arr, int value){
        int[] temp = new int[arr.length + 1];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        temp[temp.length - 1] = value;
        int j;
        for (j = temp.length - 1; j > 0 && value < temp[j-1];j--){
            temp[j] = temp[j -1];
        }
        temp[j] = value;
        arr = temp;
        return arr;
    }

    /**
     * Solution exercise 25 function
     *
     */
    public static void Function25(){
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
        int k;
        System.out.print("Enter k = ");
        k = scanner.nextInt();
        if (binarySearch(arr, 0, arr.length, k) == 1){
            System.out.printf("k = %d had found!", k);
        } else {
            arr = insertSortedArray(arr, k);
            display1DArray(arr);
        }
    }
}
