package vn.edu.hcmus.fit.sv18120061.lab02;

import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:46 PM
 * @Description: S(x, n) = x + (x*2)/(1+2) + (x*3)/(1+2+3) + ... + (x*n)/(1+2+3+...+n). Trong đó x, n được nhập từ người dùng
 */
public class Exercise16 {
    public static int sumOfN(int n){
        int result = 0;
        for (int i = 1; i <=n; i++){
            result += i;
        }
        return result;
    }

    /**
     * Solution exercise 16 function
     *
     */
    public static void Function16(){
        // Input
        int n;
        double x;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter (n > 1) = ");
            n = scanner.nextInt();
            if (n < 1){
                System.out.println("Invalid number! Please enter again!");
            }
        } while (n < 1);
        System.out.print("Enter x = ");
        x = scanner.nextDouble();

        // Calculate
        double result = 0;
        for (int i = 0; i <= n; i++){
            result += 1.0 * x * i/ sumOfN(i);
        }

        // Output
        String output = String.format("Exercise 16 - S(x, n) = S(%.3f, %d) = %.8f",x,n,result);
        System.out.print(output);
    }
}
