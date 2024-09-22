package Sept.ex_20092024;

import java.util.Scanner;

public class Lab07TraingaleOfLengthWithTernaryOperator {
    /*Write a program that classifies a triangle based on its side lengths.
Given three input values representing the lengths of the sides, determine
if the triangle is equilateral (all sides are equal),
isosceles (exactly two sides are equal), or
scalene (no sides are equal).
Use an if-else statement to classify the triangle. side1, side2, side3 ->*/
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Triangle side1 Length");
        int side1 = sc.nextInt();

        System.out.println("Enter Triangle side2 Length");
        int side2 = sc.nextInt();

        System.out.println("Enter Triangle side3 Length");
        int side3 = sc.nextInt();
        sc.close();

        String value = (side1 == side2 && side1 == side3) ? "Equilateral triangle: All sides are equal." :
                (side1 == side2 || side1 == side3 || side2 == side3) ? "Isosceles triangle: Exactly two sides are equal." :
                (side1 != side2 || side1 != side3 || side2 != side3) ? "no sides are equal" : "Please Provide Correct Data";

        System.out.printf("%S",value);
        //System.out.println(value);



    }
}
