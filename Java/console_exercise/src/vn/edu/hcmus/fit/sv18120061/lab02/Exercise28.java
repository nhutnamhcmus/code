package vn.edu.hcmus.fit.sv18120061.lab02;

import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:48 PM
 * @Description: Viết chương trình để loại bỏ các phần tử trùng trong mảng một chiều.
 * @Example:
 * [1, 1, 2, 2, 3, 3, 3, 2, 4] -> [1, 2, 3, 4]
 */
public class Exercise28 {
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

    /**
     * less function
     *
     * @param a is the first number
     * @param b is the second number
     * @return true if a > b and false if a < b
     */
    private static boolean less(int a, int b){
        return a - b < 0;
    }

    private static void swap(int[] arr, int idx, int idy){
        int swap = arr[idx];
        arr[idx] = arr[idy];
        arr[idy] = swap;
    }

    /**
     * randomPartition function
     *
     * @param arr is the array input
     * @param left
     * @param right
     */
    private static int randomPartition(int[] arr, int left, int right){
        int randomIndex = left + (int)(Math.random()*(right - left + 1));
        swap(arr, randomIndex, right);
        return partition(arr, left, right);
    }

    /**
     * partition function
     *
     * @param arr is the array input
     * @param left
     * @param right
     */
    private static int partition(int[] arr, int left, int right){
        int mid = (left + right) / 2;
        int pivot = arr[mid];

        while (left <= right) {
            while (less(arr[left], pivot)) {
                ++left;
            }
            while (less(pivot, arr[right])) {
                --right;
            }
            if (left <= right) {
                swap(arr, left, right);
                ++left;
                --right;
            }
        }
        return left;
    }

    /**
     * sort function
     *
     * @param arr is the array input
     * @param left
     * @param right
     */
    private static void sort(int[] arr, int left, int right){
        if (left < right) {
            int pivot = randomPartition(arr, left, right);
            sort(arr, left, pivot - 1);
            sort(arr, pivot, right);
        }
    }

    /**
     * quickSort function
     *
     * @param arr is the array input
     */
    private static int[] quickSort(int[] arr){
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    /**
     * removeDuplicates function
     *
     * @param arr is the array input
     */
    private static int removeDuplicates(int[] arr) {
        int temp = Integer.MIN_VALUE, index = 0;
        for(int i = 0; i < arr.length; i++){
            if(temp != arr[i]) {
                temp = arr[i];
                arr[index] = temp;
                index++;
            }
        }
        return index;
    }

    /**
     * Solution exercise 28 function
     *
     */
    public static void Function28(){
        // Initialization
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter your number of elements: ");
        n = scanner.nextInt();
        int[] arr = new int[n];

        // Input
        input1DArray(arr);
        // Display input array
        display1DArray(arr);

        // Remove duplicates
        quickSort(arr);
        removeDuplicates(arr);

        // Output
        System.out.println("Your array after remove duplicates: ");
        display1DArray(arr);
    }
}
