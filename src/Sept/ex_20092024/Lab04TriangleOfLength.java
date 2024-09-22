package Sept.ex_20092024;
import java.util.Scanner;
import java.lang.Math;

public class Lab04TriangleOfLength {
    /*Write a program that classifies a triangle based on its side lengths.
Given three input values representing the lengths of the sides, determine
if the triangle is equilateral (all sides are equal),
isosceles (exactly two sides are equal), or
scalene (no sides are equal).
Use an if-else statement to classify the triangle. side1, side2, side3 ->*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Triangle side1 Length");
        int side1 = sc.nextInt();
        System.out.println("Enter Triangle side2 Length");
        int side2 = sc.nextInt();
        System.out.println("Enter Triangle side3 Length");
        int side3 = sc.nextInt();
        sc.close();
        if(side1 > 0 && side2 > 0 && side3 > 0)
        {
            if (side1 == side2 && side1 == side3) {
                System.out.println("Equilateral triangle: All sides are equal.");
            }
            else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("Isosceles triangle: Exactly two sides are equal.");
            }
            else
            {
                System.out.println("no sides are equal");
            }
        }
        else if (side1 <= 0 && side2 <= 0 && side3 <= 0)
        {
            System.out.printf("You have provided All data as %d, %d, %d ",side1,side2,side3);
        }
        else if (side1 <= 0 && side2 >= 0 && side3 >= 0)
        {
            System.out.printf("You have provided First data as %d ", side1);
        }
        else if (side1 >= 0 && side2 <= 0 && side3 >= 0)
        {
            System.out.printf("You have provided Second data as %d ", side2);
        }
        else if (side1 >= 0 && side2 >= 0 && side3 <= 0)
        {
            System.out.printf("You have provided Thrid data as %d ", side3);
        }
    }
}
