package oct18102024;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args)
    {
       Scanner sc =  new Scanner(System.in);
       System.out.println("Please enter a name");
       String input = sc.next();
       sc.close();

      StringBuilder sb = new StringBuilder(input);
      String reverseValue = sb.reverse().toString();

      if(input.equals(reverseValue))
      {
         System.out.println("It is a palindrome");
      }
      else
      {
          System.out.println("It is not a palindrome");
      }

    }
}
