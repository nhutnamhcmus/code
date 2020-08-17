package vn.edu.hcmus.fit.sv18120061.lab02;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:14 PM
 * @Description: S(n) = 1^2 + 2^2 + 3^2 + … + n^2. Trong đó n được nhập từ người dùng với 5 <= n và n <= 20
 */

import java.util.Scanner;

import static java.lang.Math.pow;

public class Exercise02 {
    /**
     * Solution exercise 1 function
     *
     */
    public static void Function02(){
        // Input
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter (5 <= n <= 20) = ");
            n = scanner.nextInt();
        } while (n < 5 || n > 20);

        // Calculate
        int S = 0;
        for (int i =1;i<=n;i++){
            S += pow(i,2);
        }
        // Output
        System.out.println("Exercise 02 - S(n) = " + S);
    }
}
