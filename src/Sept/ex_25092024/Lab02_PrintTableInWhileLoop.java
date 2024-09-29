package Sept.ex_25092024;

import java.util.Scanner;

public class Lab02_PrintTableInWhileLoop {

    // Table of number n = 10, print table with For or while.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number");

        int num = sc.nextInt();
        sc.close();

        int count = 1;
        while (count <= 10)
        {
            System.out.printf("%d x %d  = %d%n",num,count,num*count);
            count++;
        }
    }
}
