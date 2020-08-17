package vn.edu.hcmus.fit.sv18120061.lab02;

import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:47 PM
 * @Description: Viết chương trình tìm mảng con liên tục có tổng giá trị lớn nhất trong mảng số nguyên
 * @Example:
 * cho -2, 1, -3, 4, -1, 2, 1, -5, 4 -> 4, -1, 2, 1 có tổng là 6 là lớn nhất
 */
public class Exercise23 {
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

    // Greedy Solution: Time Complexity: O(n) linear time + Space Complexity: O(1) contant time
    private static int maxSubArray01(int[] nums) {
        int localMax = nums[0];
        int globalMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            localMax = Math.max(nums[i], localMax + nums[i]);
            globalMax = Math.max(globalMax, localMax);
        }

        return globalMax;
    }

    // Dynamic Solution: Time Complexity: O(n) linear time + Space Complexity (1) constant time
    private static int maxSubArray02(int[] nums) {
        int globalMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            nums[i] = Math.max(nums[i], nums[i - 1] + nums[i]);
            globalMax = Math.max(nums[i], globalMax);
        }

        return globalMax;
    }

    // Brute - force
    private static int maxSubarray03(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            int count = arr[i];

            if (count > max) max = count;

            for (int j = i + 1; j < arr.length; j++) {
                count += arr[j];
                if (count > max) max = count;
            }
        }
        return max;
    }

    /**
     * Solution exercise 23 function
     *
     */
    public static void Function23(){
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
        int max = maxSubArray01(arr);
        // Output
        System.out.println("Exercise 23 - Tổng lớn nhất là: " + max);

    }
}
