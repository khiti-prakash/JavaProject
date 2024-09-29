package Sept.ex_25092024;

import java.util.Scanner;

public class Lab03_Factorial_Program_For_Loop {
    //Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120
    //
    //        // n = 1 ->  Fact = 1*1 -> 1
    //
    //        // n = 3 -> Fact = 3*2*1 -> 6

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter a number");
            int num = sc.nextInt();
        sc.close();
        int res=1;

            if (num <= 0) {

                for (int i = num; i >= 1; i--) {
                    res = res * i;
                }

                System.out.println(res);
            }
        } catch (Exception e) {
           // throw new RuntimeException(e);
            System.out.println("You have provided Wrong Number");
        }
    }
}
