package vn.edu.hcmus.fit.sv18120061.lab02;

import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:46 PM
 * @Description: T(x, n) = x^n. Trong đó x, n được nhập từ người dùng
 */
public class Exercise10 {
    /**
     * power function
     *
     * @param x is the base
     * @param y is the exponent
     */
    public static double power(double x, int y){
        double temp;
        if(y == 0)
            return 1;
        temp = power(x, y / 2);
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
     * Solution exercise 9 function
     *
     */
    public static void Function10(){
        // Input
        double x;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base x = ");
        x = scanner.nextDouble();
        System.out.print("Enter exponent n = ");
        n = scanner.nextInt();

        // Calculate
        double result = power(x,n);

        // Output
        String output = String.format("T(%.3f, %d) = %.8f",x,n,result);
        System.out.print(output);
    }
}
