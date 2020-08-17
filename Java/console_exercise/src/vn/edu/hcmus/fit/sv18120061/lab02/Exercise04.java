package vn.edu.hcmus.fit.sv18120061.lab02;

import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:14 PM
 * @Description: S(n) = (1/2) + (1/4) + ... + (1/2n). Trong đó n được nhập từ người dùng với n > 9
 */
public class Exercise04 {
    /**
     * Solution exercise 4 function
     *
     */
    public static void Function04 (){
        // Input
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter (n > 9) = ");
            n = scanner.nextInt();
        } while (n <= 9);

        // Calculate
        double S = 0;
        for (int i = 1; i <= n; i++){
            S += 1.0 / (i*2);
        }

        // Output
        System.out.println("Exercise 04 - S(n) = " + S);
    }
}
