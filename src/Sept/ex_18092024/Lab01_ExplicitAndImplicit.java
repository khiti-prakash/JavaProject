package Sept.ex_18092024;
import  java.lang.String;

//Give some another example of Widening with Implicit and Explicit,
// Narrowing with implicit and explicit.
public class Lab01_ExplicitAndImplicit {
     public static void main(String[] args){

         // Narrowing with explicit
         long date_time = 20240918084505L;
         int implicit = (int)date_time;
         System.out.println("Narrowing with explicit: "+implicit);

         //Narrowing with implicit
         short num =5;
         byte b =(byte)num;
         System.out.println("Narrowing with implicit: "+b);

         System.out.println("------------------------------------------------------");

         //Widening with Implicit
          byte countryCode = 91;
          short s =countryCode;
         System.out.println("Widening with Implicit: "+s);

         //Widening with Explicit
         short time = 1038;
         int time_convert =time; //zero loss
         System.out.println("Widening with Implicit: "+time_convert);

     }

}
