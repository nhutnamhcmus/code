package vn.edu.hcmus.fit.sv18120061.lab02;

import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:46 PM
 * @Description: S(n) = 1 + 1/(1+2) + 1/(1+2+3) + ... + 1/(1+2+3+...+n). Trong đó n được nhập từ người dùng
 */
public class Exercise15 {
    /**
     * sumOfN function
     *
     * @param n is the number input to calculate sum from 1 to it.
     */
    public static int sumOfN(int n){
        int result = 0;
        for (int i = 1; i <=n; i++){
            result += i;
        }
        return result;
    }

    /**
     * Solution exercise 15 function
     *
     */
    public static void Function15(){
        // Input
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter (n > 1) = ");
            n = scanner.nextInt();
            if (n < 1){
                System.out.println("Invalid number! Please enter again!");
            }
        } while (n < 1);

        // Calculate
        double result = 0;
        for (int i = 1; i < n; i++) {
            result += 1.0/sumOfN(i);
        }

        // Output
        String output = String.format("Exercise 15 - S(n) = S(%d) = %.8f",n,result);
        System.out.print(output);
    }
}
