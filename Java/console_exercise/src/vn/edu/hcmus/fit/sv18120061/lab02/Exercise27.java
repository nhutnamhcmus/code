package vn.edu.hcmus.fit.sv18120061.lab02;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:47 PM
 * @Description: Viết chương trình để tìm ra tất cả các phần tử chỉ xuất hiện 1 lần trong mảng một chiều các số
 * nguyên.
 * @Example:  [10, 20, 30, 20, 50, 10, 40] -> Output: 50, 40
 */
public class Exercise27 {
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
     * addElement function
     *
     * @param map is the map structure
     * @param element is the element need to add to the map
     */
    private static void addElement(Map<Integer, Integer> map, int element) {
        if (map.containsKey(element)) {
            int count = map.get(element) + 1;
            map.put(element, count);
        } else {
            map.put(element, 1);
        }
    }

    /**
     * Solution exercise 27 function
     *
     */
    public static void Function27(){
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number of elements: ");
        int n = scanner.nextInt();
        int [] arr = new int [n];
        input1DArray(arr);

        // Display input
        System.out.println("Your array: ");
        display1DArray(arr);

        // Processing
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            addElement(map, arr[i]);
        }

        // Output
        System.out.print("Exercise 27 - Cac phan tu chi xuat hien mot lan");
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1){
                System.out.print(key + " ");
            }
        }
    }
}
