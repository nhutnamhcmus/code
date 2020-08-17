package vn.edu.hcmus.fit.sv18120061.lab02;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:47 PM
 * @Description: Viết chương trình nhập và ma trận A có n dòng và m cột
 * - Tìm giá trị max.
 * - Tìm giá trị min.
 * - Nhập một giá trị k, xuất ra vị trí i và j của giá trị này trong ma trận, nếu không có thì return ra (-1, -1).
 */

public class Exercise21 {
    // Pair class
    private static class Pair<A, B>{
        private A first;
        private B second;

        public Pair(A first, B second) {
            super();
            this.first = first;
            this.second = second;
        }

        public Pair() {

        }

        @Override
        public int hashCode() {
            int hashFirst = first != null ? first.hashCode() : 0;
            int hashSecond = second != null ? second.hashCode() : 0;

            return (hashFirst + hashSecond) * hashSecond + hashFirst;
        }

        @Override
        public boolean equals(Object other) {
            if (other instanceof Pair) {
                Pair otherPair = (Pair) other;
                return
                        ((  this.first == otherPair.first ||
                                ( this.first != null && otherPair.first != null &&
                                        this.first.equals(otherPair.first))) &&
                                (  this.second == otherPair.second ||
                                        ( this.second != null && otherPair.second != null &&
                                                this.second.equals(otherPair.second))) );
            }

            return false;
        }

        @Override
        public String toString() {
            return "(" +
                    "" + first +
                    ", " + second +
                    ')';
        }

        public A getFirst(){
            return this.first;
        }

        public B getSecond(){
            return this.second;
        }

        public void setFirst(A first){
            this.first = first;
        }

        public void setSecond(B second){
            this.second = second;
        }
    }

    /**
     * inputValueToMatrix function
     *
     * @param matrix is the matrix input
     * @param row is the number of row
     * @param col is the number of column
     * @functional: read the input values for the matrix from keyboard
     */
    private static void inputValueToMatrix(int[][] matrix, int row, int col){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.printf("matrix[%d][%d] = ",i,j);
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    /**
     * displayMatrix function
     *
     * @param matrix is the matrix input
     * @param row is the number of row
     * @param col is the number of column
     * @functional: display the matrix
     */
    private static void displayMatrix(int[][] matrix, int row, int col){
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
               System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * minimumValueInMatrix function
     *
     * @return the maximum value in the matrix
     * @param matrix is the matrix input
     * @param row is the number of row
     * @param col is the number of column
     */
    private static int maximumValueInMatrix(int[][] matrix, int row, int col){
        int maxValue = matrix[0][0];
        for (int i = 0; i < row ;i++){
            for (int j = 0; i< col; i++){
                if(matrix[i][j] > maxValue){
                    maxValue = matrix[i][j];
                }
            }
        }
        return maxValue;
    }

    /**
     * minimumValueInMatrix function
     *
     * @return the minimum value in the matrix
     * @param matrix is the matrix input
     * @param row is the number of row
     * @param col is the number of column
     */
    private static int minimumValueInMatrix(int[][] matrix, int row, int col){
        int minValue = matrix[0][0];
        for (int i = 0; i < row ;i++){
            for (int j = 0; i< col; i++){
                if(matrix[i][j] > minValue){
                    minValue = matrix[i][j];
                }
            }
        }
        return minValue;
    }

    /**
     * searchKeyInMatrix function
     *
     * @return the position (i, j) which contain k value.
     * @param matrix is the matrix input
     * @param row is the number of row
     * @param col is the number of column
     * @param k is the value need to find its index
     */
    private static Pair<Integer,Integer> searchKeyInMatrix(int[][] matrix, int row, int col, int k){
        int i, j;
        Pair<Integer,Integer> result = new Pair<Integer,Integer>(-1,-1);
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (matrix[i][j] == k) {
                    result.setFirst(i);
                    result.setSecond(j);
                    return result;
                }
            }
        }
        return result;
    }

    /**
     * findAllTheKey function
     *
     * @display the position (i, j) which contain k value, if matrix doesn't have k, print (-1, -1)
     * @param matrix is the matrix input
     * @param row is the number of row
     * @param col is the number of column
     * @param k is the value need to find its index
     */
    private static void findAllTheKey(int[][] matrix, int row, int col, int k){
        boolean have = false;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if(matrix[i][j] == k){
                    have = true;
                    System.out.printf("(%d, %d)", i, j);
                }
            }
        }
        if (have == false){
            System.out.println("(-1, -1)");
        }
    }

    /**
     * Solution exercise 21 function
     *
     */
    public static void Function21(){
        // Input
        int n, m;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter n = ");
            n = scanner.nextInt();
            System.out.print("Enter m = ");
            m = scanner.nextInt();
            if (n < 1 || m < 1){
                System.out.println("Invalid number! Please enter again!");
            }
        } while (n < 1 || m < 1);

        int[][] matrix = new int[n][m];
        inputValueToMatrix(matrix, n, m);

        // Display input matrix
        System.out.println("The matrix: ");
        displayMatrix(matrix,n,m);

        // Output solution
        System.out.println("The maximum value in the matrix: " + maximumValueInMatrix(matrix,n,m));
        System.out.println("The minimum value in the matrix: " + minimumValueInMatrix(matrix,n,m));
        int k;
        System.out.print("Enter k = ");
        k = scanner.nextInt();
        Pair<Integer, Integer> result = searchKeyInMatrix(matrix, n, m, k);
        findAllTheKey(matrix, n, m, k);
        System.out.println(result.toString());
    }
}
