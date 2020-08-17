package vn.edu.hcmus.fit.sv18120061.lab02;

import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:44 PM
 * @Description S(n) = (1/(1*2)) + (1/(2*3)) + ... + (1/(n*(n+1))). Trong đó n được nhập từ người dùng với n > 6
 */
public class Exercise06 {
    /**
     * Solution exercise 6 function
     *
     */
    public static void Function06(){
        // Input
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter (n > 6) = ");
            n = scanner.nextInt();
        } while (n <= 6);

        // Calculate
        double S = 0;

        for (int  i = 1; i <=  n; i++){
            S += 1.0 / (i*(i+1));
        }

        // Output
        System.out.println("Exercise 06 - S(n) = " + S);
    }
}
