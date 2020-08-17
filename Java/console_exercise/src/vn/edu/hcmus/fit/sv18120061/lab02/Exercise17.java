package vn.edu.hcmus.fit.sv18120061.lab02;

import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:47 PM
 * @Description: Tính S(n) = n!. Trong đó n được nhập từ người dùng
 */
public class Exercise17 {
    public static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n ;i++){
            result *= i;
        }
        return result;
    }

    /**
     * Solution exercise 17 function
     *
     */
    public static void Function17(){
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
        int result = 1;
        for (int i = 1; i <= n ;i++){
            result *= i;
        }

        // Output
        String output = String.format("Exercise 17 - S(n) = %d = %d",n,result);
        System.out.print(output);
    }
}
