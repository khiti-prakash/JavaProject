package Sept.ex_25092024;

import java.util.Scanner;

public class Lab01_PrintTableInForLoop {
    // Table of number n = 10, print table with For or while.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number");

        int num = sc.nextInt();
        sc.close();

        for (int i = 0; i <= 10; i++)
        {
            int res = num * i;
            System.out.println(num + "x" + i + "=" + res);
        }
    }
}
