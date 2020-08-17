package vn.edu.hcmus.fit.sv18120061.lab02;

import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:46 PM
 * @Description: T(x,n) = x + x^2 + x^3 + ... + x^n. Trong đó n được nhập từ người dùng
 */
public class Exercise12 {
    /**
     * power function
     *
     * @param x is the base
     * @param y is the exponent
     */

    public static double power(double x, int y){
        if(y == 0)
            return 1;
        double temp = power(x, y / 2);
        if (y % 2 == 0)
            return temp * temp;
        else
        {
            if(y > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }
    }

    /**
     * Solution exercise 12 function
     *
     */
    public static void Function12(){
        // Input
        double x;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base x = ");
        x = scanner.nextDouble();
        System.out.print("Enter n = ");
        int n = scanner.nextInt();

        // Calculate
        double result = 0;
        for (int i = 1; i <= n; i++){
            result += power(x, i);
        }

        // Output
        String output = String.format("Exercise 12 - T(x,n) = T(%.3f, %d) = %.8f",x,n,result);
        System.out.print(output);
    }
}
