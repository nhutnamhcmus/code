package vn.edu.hcmus.fit.sv18120061.lab02;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:48 PM
 * @Description: Viết chương trình để tìm ra số đường có thể leo lên đỉnh của một ngọn đồi (với n bước để lên
 * tới đỉnh đồi). Với mỗi lần di chuyển, chúng ta chỉ có thể thực hiện 1 hoặc 2 bước.
 * @Example
 * - Input: n = 5
 * - Sẽ có các con đường:
 *  +) 1 + 1 + 1 + 1 + 1 = 5
 *  +) 1 + 1 + 1 + 2 = 5
 *  +) 1 + 2 + 2 = 5
 *  +) 2 + 1 + 2 = 5
 *  +) 2 + 2 + 1 = 5
 *  +) 1 + 1 + 2 + 1 = 5
 *  +) 1 + 2 + 1 + 1 = 5
 *  +) 2 + 1 + 1 + 1 = 5
 * - Output: Số đường để lên đỉnh đồi là 8
 */
public class Exercise29 {
    /**
     * Solution exercise 29 function
     *
     */

    /**
     * Nếu n = 1 thì sẽ có 1 cách đi lên
     * Nếu n = 2 thì sẽ có 2 cách đi lên, bước 2 bước 1 hoặc là bước 1 bước 2
     *
     * Nếu n = 3 thì sẽ có 3 cách đi lên bước 3 bước 1 hoặc bước 1 bước 1 sau đó bước 1 bước 2 hoặc bước 1 bước 2 rồi bước 1 bước 1
     *
     * Theo nhận xét trên
     * Nếu n = 2 -> số cách = 2
     * Nếu n = 3 -> số cách = 3
     * Nếu n = 4 -> số cách = 5
     * Nếu n = 5 -> số cách = 8
     * Nếu n = 6 -> số cách = 13
     * Nếu n = 7 -> số cách = 21
     * Nếu n = 8 -> số cách = 24
     * Nếu n = 9 -> số cách = 55
     * Nếu n = 10 -> số cách = 89
     * Nếu n = 11 -> số cách = 144
     * Nếu n = 12 -> số cách = 233
     * Nếu n = 13 -> số cách = 377
     *
     * -> Đây là 1 dãy Fibonacci
     *
     * Gọi F[i] là cách đi đến đi núi có i bước
     * F[i] = F[i-1] + F[i-2]
     *
     * */

    public static void Function29(){
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số bước để đi lên đỉnh núi: ");
        int n = scanner.nextInt();

        // Initialization
        int prev = 1;
        int curr = 1;
        int result = 0;
        for (int i = 2; i <= n; i++){
            result = prev + curr;
            prev = curr;
            curr = result;
        }

        // Output
        System.out.println("Exercise 29 - Số cách để lên đỉnh núi là: " + result);
    }
}
