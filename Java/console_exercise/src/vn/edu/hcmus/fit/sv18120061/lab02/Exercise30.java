package vn.edu.hcmus.fit.sv18120061.lab02;

import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:48 PM
 * @Description: Viết chương trình để tìm ra chuỗi dài nhất trong từ điển.
 * @Example:
 * {“cat”, “flag”, “green”, “country”, “w3resource” } ->  Output: “w3resource”
 * {“cat”, “dog”, “red”, “is”} -> Output: “cat”, “dog”, “red”
 */
public class Exercise30 {

    /**
     * Solution exercise 30 function
     *
     */
    public static void Function30(){
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number of word in your dictionaries: ");
        int n = scanner.nextInt();
        String[] dictionaries = new String[n];
        for (int i = 0; i < dictionaries.length; i++){
            System.out.print("Your word: ");
            dictionaries[i] = scanner.nextLine();
        }

        // Processing
        int maxLength = 0;
        String stringMaxLength = "";
        for (int i = 0;i < dictionaries.length; i++){
            if (dictionaries[i].length() > maxLength){
                maxLength = dictionaries[i].length();
                stringMaxLength = dictionaries[i];
            }
        }

        // Output
        System.out.println("Exercise 30 - " + stringMaxLength);

    }
}
