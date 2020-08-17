package vn.edu.hcmus.fit.sv18120061.lab02;

import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:45 PM
 * @Description: S(n) = (1/2) + (2/3) + ... + (n/(n + 1)). Trong đó n được nhập từ người dùng với n >= 1
 */
public class Exercise07 {
    /**
     * Solution exercise 7 function
     *
     */
    public static void Function07(){
        // Input
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter (n > 6) = ");
            n = scanner.nextInt();
        } while (n < 1);

        // Calculate
        double Result = 0;
        for (int i = 1; i <=  n; i++){
            Result += 1.0 * i/(i+1);
        }

        // Output
        System.out.println("Exercise 07 - S(n) = " + Result);
    }
}
