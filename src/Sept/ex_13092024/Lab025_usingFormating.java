package Sept.ex_13092024;
import java.util.Scanner;
public class Lab025_usingFormating
{
    //Write a program to print the table of number which user will give( int num 10)
    //output will be like this (by using the printf()

    public static void main(String[] args)
    {
        // Use this for taking data from user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        sc.close();
        int a= 1,b= 2,c= 3,d= 4,e= 5,f=6,g=7,h=8,i=9,j=10;

        // use formating to write a table
        System.out.printf("%d x %d = %d%n" ,num,a, num*a);
        System.out.printf("%d x %d = %d%n" ,num,b, num*b);
        System.out.printf("%d x %d = %d%n" ,num,c, num*c);
        System.out.printf("%d x %d = %d%n" ,num,d, num*d);
        System.out.printf("%d x %d = %d%n" ,num,e, num*e);
        System.out.printf("%d x %d = %d%n" ,num,f, num*f);
        System.out.printf("%d x %d = %d%n" ,num,g, num*g);
        System.out.printf("%d x %d = %d%n" ,num,h, num*h);
        System.out.printf("%d x %d = %d%n" ,num,i, num*i);
        System.out.printf("%d x %d = %d%n" ,num,j, num*j);

    }

}
