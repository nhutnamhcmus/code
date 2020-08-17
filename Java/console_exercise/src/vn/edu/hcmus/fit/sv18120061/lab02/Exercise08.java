package vn.edu.hcmus.fit.sv18120061.lab02;

import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:45 PM
 * @Description: S(n) = (1/2) + (3/4) + ... + ((2n+1)/(2n+2)). Trong đó n được nhập từ người dùng với n > 5
 */
public class Exercise08 {
    /**
     * Solution exercise 8 function
     *
     */
    public static void Function08(){
        // Input
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter (n > 5) = ");
            n = scanner.nextInt();
        } while (n <= 5);

        // Calculate
        double result = 0;
        for (int i = 1; i <= n; i++){
            result += 1.0 * (2*n + 1)/ (2*n + 2);
        }

        // Output
        System.out.println("Exercise 08 - S(n) = " + result);
    }
}
