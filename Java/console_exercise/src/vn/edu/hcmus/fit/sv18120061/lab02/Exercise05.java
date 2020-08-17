package vn.edu.hcmus.fit.sv18120061.lab02;

import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:40 PM
 * @Description: S(n) = 1 + (1/3) + (1/5) + ... + (1/(2n+1)). Trong đó n được nhập từ người dùng với n >= 2
 */
public class Exercise05 {
    /**
     * Solution exercise 5 function
     *
     */
    public static void Function05 (){
        // Input
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter (n >= 2) = ");
            n = scanner.nextInt();
        } while (n < 2);

        // Calculate
        double S = 0;
        for(int i = 1; i <= n;i++){
            S += 1.0/ (2*n + 1);
        }

        // Output
        System.out.println("Exercise 05 - S(n) = " + S);
    }
}
