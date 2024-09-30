package Sept.ex_30092024;

import java.util.Scanner;

public class Factorial_Program_Using_Function {
   // Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120

    // n = 1 ->  Fact = 1*1 -> 1

    // n = 3 -> Fact = 3*2*1 -> 6
    public static void main(String[] args)
    {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please entre a number");
            int number = sc.nextInt();
            FactorialNumber(number);

            FactorialNumber_WhileLoop(number);

            int res= FactorialNumber_DoWhile(number);
            System.out.printf("Factorial Number of %d:- %d",number,res);

        } catch (RuntimeException e) {
           System.out.println("Enter only Integer Value");
        }
    }

    public static void FactorialNumber(int enterNumber)
    {
        int num = 1;
        for(int i =enterNumber; i>1;i--)
    {
          num = num * i;

    }
       System.out.println("Factorial Number of "+enterNumber+":- "+num);
    }

    public static void FactorialNumber_WhileLoop(int enterNumber)
    {
       int value = enterNumber;
        int num = 1;
        while ( enterNumber>= 1)
        {
            num = enterNumber * num;

            enterNumber--;
        }
        System.out.println("Factorial Number of "+value+":- "+num);
    }

    public static int FactorialNumber_DoWhile(int number)
    {
        int i =1;
        do
        {
            i = number*i;
            number--;
        }
        while (number>=1);

        return i;

    }
}
