package Sept.ex_20092024;

import java.util.Scanner;

public class Lab08LeapYear {
    // Leap Year Program 2024

    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Year");
        int year = sc.nextInt();
        sc.close(); */
         int year = 1900;
          if(year % 4 == 0 && year %100 == 0 && year %400 == 0)
          {
              System.out.println(year+" is a Leap Year");
          }
          else if (year % 4 == 0 && year %100 != 0 && year %400 != 0)
          {
              System.out.println(year+" is a Leap Year");
          } else
          {
              System.out.println(year+" is not a Leap Year");
          }
    }
}
