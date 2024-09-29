package Sept.ex_27092024;

import java.util.Scanner;

public class Lab02_calculateSumOfNumber {
    //Write a Java program that calculates the sum of numbers from 1 to 100 using a while loop.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number a Start value");
        int num1 = sc.nextInt();
        System.out.println("Please enter number a End value");
        int num2 = sc.nextInt();
        sc.close();

        int res=0;
        while (num1 <= num2)
        {
            res += num1;
            num1++;
        }
        System.out.println("The sum of numbers between the given range is: " +res);

    }

}
