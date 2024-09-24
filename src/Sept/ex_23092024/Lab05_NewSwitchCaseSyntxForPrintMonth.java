package Sept.ex_23092024;

import java.util.Scanner;

public class Lab05_NewSwitchCaseSyntxForPrintMonth {
    /* Write a program that takes an integer input (1-12) and prints the name of the corresponding month using a switch statement.
   Input  - 12
   Out - Dec. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please entre number of month");
        int month_num = sc.nextInt();
        sc.close();

        switch (month_num)
        {
            case 1 -> System.out.println(" 1 ----->>>> January");
            case 2 -> System.out.println(" 2 ----->>>> Febuary");
            case 3 -> System.out.println(" 3 ----->>>> March");
            case 4 -> System.out.println(" 4 ----->>>> April");
            case 5 -> System.out.println(" 5 ----->>>> May");
            case 6 -> System.out.println(" 6 ----->>>> June");
            case 7 -> System.out.println(" 7 ----->>>> July");
            case 8 -> System.out.println(" 8 ----->>>> August");
            case 9 -> System.out.println(" 9 ----->>>> September");
            case 10 -> System.out.println(" 10 ----->>>> October");
            case 11 -> System.out.println(" 11 ----->>>> November");
            case 12 -> System.out.println(" 12 ----->>>> December");
            default -> System.out.println("Provided number is incorrect");
        }
    }
}
