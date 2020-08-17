package vn.edu.hcmus.fit.sv18120061.lab02;


import java.util.Scanner;

public class Main {
    private static void menu(){
        System.out.println("--- LIST EXERCISE ---");
        System.out.println("01. Exercise 01 \t 02. Exercise 02 \t 03. Exercise 03");
        System.out.println("04. Exercise 04 \t 05. Exercise 05 \t 06. Exercise 06");
        System.out.println("07. Exercise 07 \t 08. Exercise 08 \t 09. Exercise 09");
        System.out.println("10. Exercise 10 \t 11. Exercise 11 \t 12. Exercise 12");
        System.out.println("13. Exercise 13 \t 14. Exercise 14 \t 15. Exercise 15");
        System.out.println("16. Exercise 16 \t 17. Exercise 17 \t 18. Exercise 18");
        System.out.println("19. Exercise 19 \t 20. Exercise 20 \t 21. Exercise 21");
        System.out.println("22. Exercise 22 \t 23. Exercise 23 \t 24. Exercise 24");
        System.out.println("25. Exercise 25 \t 26. Exercise 26 \t 27. Exercise 27");
        System.out.println("28. Exercise 28 \t 29. Exercise 29 \t 30. Exercise 30");
        System.out.println("31. Exercise 31");
        System.out.println("----------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu();
        System.out.print("Enter your choose: ");
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                Exercise01 exercise01 = new Exercise01();
                exercise01.Function01();
                break;
            case 2:
                Exercise02 exercise02 = new Exercise02();
                exercise02.Function02();
                break;
            case 3:
                Exercise03 exercise03 = new Exercise03();
                exercise03.Function03();
                break;
            case 4:
                Exercise04 exercise04 = new Exercise04();
                exercise04.Function04();
                break;
            case 5:
                Exercise05 exercise05 = new Exercise05();
                exercise05.Function05();
                break;
            case 6:
                Exercise06 exercise06 = new Exercise06();
                exercise06.Function06();
                break;
            case 7:
                Exercise07 exercise07 = new Exercise07();
                exercise07.Function07();
                break;
            case 8:
                Exercise08 exercise08 = new Exercise08();
                exercise08.Function08();
                break;
            case 9:
                Exercise09 exercise09 = new Exercise09();
                exercise09.Function09();
                break;
            case 10:
                Exercise10 exercise10 = new Exercise10();
                exercise10.Function10();
                break;
            case 11:
                Exercise11 exercise11 = new Exercise11();
                exercise11.Function11();
                break;
            case 12:
                Exercise12 exercise12 = new Exercise12();
                exercise12.Function12();
                break;
            case 13:
                Exercise13 exercise13 = new Exercise13();
                exercise13.Function13();
                break;
            case 14:
                Exercise14 exercise14 = new Exercise14();
                exercise14.Function14();
                break;
            case 15:
                Exercise15 exercise15 = new Exercise15();
                exercise15.Function15();
                break;
            case 16:
                Exercise16 exercise16 = new Exercise16();
                exercise16.Function16();
                break;
            case 17:
                Exercise17 exercise17 = new Exercise17();
                exercise17.Function17();
                break;
            case 18:
                Exercise18 exercise18 = new Exercise18();
                exercise18.Function18();
                break;
            case 19:
                Exercise19 exercise19 = new Exercise19();
                exercise19.Function19();
                break;
            case 20:
                Exercise20 exercise20 = new Exercise20();
                exercise20.Function20();
                break;
            case 21:
                Exercise21 exercise21 = new Exercise21();
                exercise21.Function21();
                break;
            case 22:
                Exercise22 exercise22 = new Exercise22();
                exercise22.Function22();
                break;
            case 23:
                Exercise23 exercise23 = new Exercise23();
                exercise23.Function23();
                break;
            case 24:
                Exercise24 exercise24 = new Exercise24();
                exercise24.Function24();
                break;
            case 25:
                Exercise25 exercise25 = new Exercise25();
                exercise25.Function25();
                break;
            case 26:
                Exercise26 exercise26 = new Exercise26();
                exercise26.Function26();
                break;
            case 27:
                Exercise27 exercise27 = new Exercise27();
                exercise27.Function27();
                break;
            case 28:
                Exercise28 exercise28 = new Exercise28();
                exercise28.Function28();
                break;
            case 29:
                Exercise29 exercise29 = new Exercise29();
                exercise29.Function29();
                break;
            case 30:
                Exercise30 exercise30 = new Exercise30();
                exercise30.Function30();
                break;
            case 31:
                Exercise31 exercise31 = new Exercise31();
                exercise31.Function31();
                break;
            default:
                break;
        }
    }
}
