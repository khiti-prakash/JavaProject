package Sept.ex_27092024;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Lab01_EvenNumberDoWhile {
    //Create a Java program that prints the first 5 even numbers using a do-while loop.

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter number a Start value");
            int num1 = sc.nextInt();
            System.out.println("Please enter number a End value");
            int num2 = sc.nextInt();
            sc.close();

            do {
                if (num1 % 2 == 0) {
                    System.out.println(num1 + " :- Even Number");
                }
                num1++;
            }
            while (num1 <= num2);
        }
        catch(Exception e)
        {
            System.out.println("Enter Only integer value");
        }

    }
}
