package vn.edu.hcmus.fit.sv18120061.lab02;

import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:47 PM
 * @Description: Viết chương trình tìm mảng con liên tục có tổng giá trị nhỏ nhất trong mảng số nguyên
 */
public class Exercise24 {

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

    // Brute Force
    private static int minSubarray(int[] arr){
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            int count = arr[i];

            if (count < min) min = count;

            for (int j = i + 1; j < arr.length; j++) {
                count += arr[j];
                if (count < min) min = count;
            }
        }
        return min;
    }
    /**
     * Solution exercise 24 function
     *
     */
    public static void Function24(){
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
        int min = minSubarray(arr);
        // Output
        System.out.println("Exercise 23 - Tổng mảng con nhỏ nhất là: " + min);
    }
}
