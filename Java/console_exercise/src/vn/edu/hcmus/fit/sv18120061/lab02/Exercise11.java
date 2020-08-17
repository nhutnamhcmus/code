package vn.edu.hcmus.fit.sv18120061.lab02;

import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:46 PM
 * @Description S(n) = 1 + 1*2 + 1*2*3 + ... + 1*2*3*...*n. Trong đó n được nhập từ người dùng
 */
public class Exercise11 {
    public static int factorial(int number){
        if (number >= 1){
            return number * factorial(number - 1);
        } else{
            return 1;
        }
    }

    /**
     * Solution exercise 11 function
     *
     */
    public static void Function11(){
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
        long s = 0, p = 1;
        for (int i = 1; i <= n; i++){
            p *= i;
            s += p;
        }

        // Output
        System.out.println("Exercise 11 - S(n) = " + s);
    }
}
