package vn.edu.hcmus.fit.sv18120061.lab02;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:14 PM
 * @Description: S(n) = 1 + 2 + 3 + 4 + … + n. Trong đó n được nhập từ người dùng với 3 < n và n < 50
 */

import java.util.Scanner;

public class Exercise01 {
    public static int recursionFunction01(int n){
        if (n != 0){
            return n + recursionFunction01(n -1);
        } else {
            return n;
        }
    }

    /**
     * Solution exercise 1 function
     *
     */
    public static void Function01(){
        // Input
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter (3 < n < 50) = ");
            n = scanner.nextInt();
        } while (n <3 || n > 50);

        // Calculate
        int S = 0;
        for (int i =1;i<=n;i++){
            S += i;
        }
        // Output
        System.out.println("Exercise 01 - S(n) = " + S);
    }
}
