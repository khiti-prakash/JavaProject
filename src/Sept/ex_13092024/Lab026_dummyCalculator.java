package Sept.ex_13092024;
import java.util.Scanner;
public class Lab026_dummyCalculator
{
    /*Prepare a small calculator, which supports +, - , , / and %(?) - Modulus operator
    double a = 34;
    double b = 10;
    Print - a+b, a-b, ab, a/b, a%b all the outputs.*/

    public static void main(String[] args)
    {
        //Taking first number from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        double num1 = sc.nextDouble();

        //Taking arithmetic operator
        System.out.println("Enter Arithmetic operator Symbols(+,-,*,/,%)");
        String  operator = sc.next();

        //Taking second number from user
        System.out.println("Enter Second Number");
        double num2 = sc.nextDouble();
        sc.close();

        switch(operator) {
            case "+":
                System.out.printf("%f + %f = %f%n", num1, num2, num1 + num2);
                break;
            case "-":
                System.out.printf("%f - %f = %f%n", num1, num2, num1 - num2);
                break;
            case "*":
                System.out.printf("%f * %f = %f%n", num1, num2, num1 * num2);
                break;
            case "/":
                System.out.printf("%f / %f = %f%n", num1, num2, num1 / num2);
                break;
            case "%":
                System.out.printf("%f %% %f = %f%n", num1, num2, num1 % num2);
                break;
            default:
                System.out.println("You have provided wrong value or arithmetic operator");
        }
    }
}
