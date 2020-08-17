package vn.edu.hcmus.fit.sv18120061.lab02;

import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:14 PM
 * @Description: S(n) = 1 + (1/2) + (1/3) + ... + (1/n). Trong đó n được nhập từ người dùng với n >= 7
 */
public class Exercise03 {
    /**
     * Solution exercise 3 function
     *
     */
    public static void Function03 () {
        // Input
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter (n >=7) = ");
            n = scanner.nextInt();
        } while (n < 7);

        // Calculate
        double S = 0;
        for (int i = 1; i <= n;i++){
            S += 1.0/i;
        }
        // Output
        System.out.println("Exercise 03 - S(n) = " + S);
    }
}
