package vn.edu.hcmus.fit.sv18120061.lab02;

import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:47 PM
 * @Description S(x, n) = 1 + (x*2)/(2!) + (x*4)/(4!) + ... + (x*2n)/(2n!). Trong đó x, n được nhập từ người dùng
 */
public class Exercise19 {
    public static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n ;i++){
            result *= i;
        }
        return result;
    }

    /**
     * Solution exercise 19 function
     *
     */
    public static void Function19(){
        // Input
        int n;
        double x;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter (n > 1) = ");
            n = scanner.nextInt();
            if (n < 0){
                System.out.println("Invalid number! Please enter again!");
            }
        } while (n < 0);
        System.out.print("Enter x = ");
        x = scanner.nextDouble();

        // Calculate
        double result = 1;
        for (int i = 1; i<=n;i++){
            result += x*(2*i)/factorial((2*i));
        }

        // Output
        String output = String.format("Exercise 18 - S(x, n) = %.8f",result);
        System.out.print(output);
    }
}
