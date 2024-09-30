package Sept.ex_25092024;

import java.util.Scanner;

public class primeNumberWhileLoop {
    //Prime Number from 1 to 100. (for loop)
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter a Number");
            int num = sc.nextInt();
            sc.close();

            int i =2;
            while(i<=100)
            {
                int j=1,count=0;
                while(j<=i)
                {
                    if(i%j == 0)
                    {
                        count++;
                    }
                    j++;
                }
                if(count == 2)
                {
                    System.out.println(i + " is a prime number");

                }
                i++;
            }

        }
        catch (Exception e)
        {
            System.out.println("Please enter a integer");
        }
    }
}
