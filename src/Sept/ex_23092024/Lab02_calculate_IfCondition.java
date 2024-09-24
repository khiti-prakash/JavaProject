package Sept.ex_23092024;

import java.util.Scanner;

public class Lab02_calculate_IfCondition {
    //Create a simple calculator that performs addition, subtraction, multiplication, and division, modus based on user input using switch statements.
    //
    //Inputs :   num 1, num 2, +
    //Output :  num1+num2 → print information.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number");
        int num1 = sc.nextInt();

        System.out.println("Please enter operator {+,-,*,/,%}");
        String symbol = sc.next();

        System.out.println("Please enter Second number");
        int num2 = sc.nextInt();

        sc.close();

        int  res;
        if(symbol != null && symbol.equals( "+"))
        {
            res = num1 + num2;
            System.out.printf("%d + %d = %d%n",num1,num2,res);
        }
        else  if(symbol != null && symbol.equals ("-"))
        {
            res = num1 - num2;
            System.out.printf("%d + %d = %d%n",num1,num2,res);
        }
        else  if(symbol != null && symbol.equals( "*"))
        {
            res = num1 * num2;
            System.out.printf("%d * %d = %d%n",num1,num2,res);
        }
        else  if(symbol != null && symbol.equals( "/"))
        {
            if(num2 != 0) {
                res = num1 / num2;
                System.out.printf("%d / %d = %d%n", num1, num2, res);
            }
        }
        else  if(symbol != null && symbol.equals( "%"))
        {
            if(num2 != 0)
            {
                res = num1 % num2;
                System.out.printf("%d %% %d = %d%n",num1,num2,res);
            }

        }
        else
        {
            System.out.println("Please provide Correct symbol and value");
        }
    }
}
