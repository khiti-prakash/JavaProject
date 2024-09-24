package Sept.ex_23092024;

import java.util.Scanner;

public class Lab03_NewSwithCaseSyntaxForCalulator {
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

        switch(symbol){
            /* String.format is a method in Java that allows you to create
             formatted strings by specifying a format template and providing
             the values to fill in. It’s similar to printf in C/C++ and
              can help you create strings with specific formatting for numbers, dates, and
               other types of data.
               Ex:- String.format("%d + %d = %d%n",num1,num2,num1+num2); // but it will not print only store
             */
            case "+" -> System.out.printf("%d + %d = %d%n",num1,num2,num1+num2);
            case "-" -> System.out.printf("%d - %d = %d%n",num1,num2,num1-num2);
            case "*" -> System.out.printf("%d * %d = %d%n",num1,num2,num1*num2);
            case  "/" ->
            {
                if(num2 !=0){
                    System.out.printf("%d / %d = %d%n",num1,num2,num1/num2);
                }
                else
                {
                    System.out.println("Error: Division by zero is not allowed.");
                }

            }
            case  "%" ->
            {
                if(num2 !=0)
                {
                    System.out.printf("%d %% %d = %d%n", num1, num2, num1 % num2);
                }
                else
                {
                    System.out.println("Error: Modulus by zero is not allowed.");
                }
            }
            default -> System.out.println("Please Provide Correct value and Symbol.");
        };
    }
}
