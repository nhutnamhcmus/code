package vn.edu.hcmus.fit.sv18120061.lab02;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:48 PM
 * @Description: Viết chương trình để kiểm tra chuỗi có các ký tự duy nhất hay không?
 * @Example:
 * Ví dụ 01: input: “Green” à output: False
 * Ví dụ 02: input: “Orange” à output: True
 */
public class Exercise31 {

    /**
     * checkStringSingleCharacters function
     *
     * @param string is the string need to check
     */
    public static boolean checkStringSingleCharacters(String string){
        Map<Character, Integer> map = new TreeMap<Character, Integer>();
        for (int i = 0; i < string.length(); i++){
            if (map.containsKey(string.charAt(i))) {
                int count = map.get(string.charAt(i)) + 1;
                map.put(string.charAt(i), count);
            } else {
                map.put(string.charAt(i), 1);
            }
        }
        for (Character key : map.keySet()) {
            if (map.get(key) != 1){
                return false;
            }
        }
        return true;
    }

    /**
     * Solution exercise 31 function
     *
     */
    public static void Function31(){
        // Initialization
        String string01 = "Green";
        String string02 = "Orange";

        // Output
        System.out.println("Exercise 31: ");
        System.out.println(checkStringSingleCharacters(string01));
        System.out.println(checkStringSingleCharacters(string02));
    }
}
