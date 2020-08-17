package vn.edu.hcmus.fit.sv18120061.lab02;

import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:45 PM
 * @Description: S(n) = 1 * 2 * 3 * ... * n. Trong đó n được nhập từ người dùng với n > 6
 */
public class Exercise09 {
    /**
     * Solution exercise 9 function
     *
     */
    public static void Function09(){
        // Input
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter (n > 6) = ");
            n = scanner.nextInt();
        } while (n <= 6);

        // Calculate
        int result = 1;
        for (int i = 1; i <= n;i++){
            result *= i;
        }

        // Output
        System.out.println("Exercise 09 - S(n) = " + result);
    }
}
