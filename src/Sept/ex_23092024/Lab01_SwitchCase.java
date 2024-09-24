package Sept.ex_23092024;

import java.util.Scanner;

public class Lab01_SwitchCase {
    //Create a simple calculator that performs addition, subtraction, multiplication, and division, modus based on user input using switch statements.
    //
    //Inputs :   num 1, num 2, +
    //Output :  num1+num2 → print information.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        Double num1 = sc.nextDouble();

        System.out.println("Please enter operator {+,-,*,/,%}");

        String symbol = sc.next();

        System.out.println("Please enter Second number");
        Double num2 = sc.nextDouble();

        sc.close();
        if(symbol != null) {

            Double res;
            switch (symbol) {
                case "+":
                    res = num1 + num2;
                    System.out.printf("%f + %f = %f%n", num1, num2, res);
                    break;
                case "-":
                    res = num1 - num2;
                    System.out.printf("%f - %f = %f%n", num1, num2, res);
                    break;
                case "*":
                    res = num1 * num2;
                    System.out.printf("%f * %f = %f%n", num1, num2, res);
                    break;
                case "/":
                    if (num2 != 0)
                    {
                    res = num1 / num2;
                    System.out.printf("%f / %f = %f%n", num1, num2, res);
                      }
                    break;
                case "%" :
                    if (num2 != 0)
                    {
                        res = num1 % num2;
                        System.out.printf("%f %% %f = %f%n", num1, num2, res);
                    }
                    break;
                default:
                    System.out.println("Please provide Correct symbol and value");

            }
        }
    }
}
