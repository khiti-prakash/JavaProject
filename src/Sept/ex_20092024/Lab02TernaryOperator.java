package Sept.ex_20092024;
import java.util.Scanner;

public class Lab02TernaryOperator {
    //Ternary Operators to handle multiple conditions.
// Input → int score = 85
// String grade →
//  score >= 90 → A
//  score >= 80 → B
//  score >= 70 → C
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Marked Scured");
        int scored = sc.nextInt();
        sc.close();

        //String grade = (scored>=90)? ((scored>=80)? "A":"B"):((scored>=70)? "C":"Fail");
              // OR
        String grade = (scored>=90)? "A" : (scored>=80)? "B" : (scored>=70)? "C" : "Fail";

        System.out.printf("%s",grade);

    }
}
