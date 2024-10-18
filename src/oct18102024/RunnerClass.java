package oct18102024;

import java.util.Scanner;

public class RunnerClass {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter name");
        String input = sc.next();


        CountString cs = new CountString();
        int value =  cs.StringCalculate(input);
        System.out.println(input+"'s count is :- "+ value);

        sc.close();
    }


}
