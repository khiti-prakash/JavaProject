package oct231024;

import java.awt.desktop.SystemEventListener;
import java.io.Console;

public class TryAndCatch {
    public static void main(String[] args) {

        Integer  i = 10;

        try {
            int value = i / 0;
            System.out.println(value);
        }
        catch(ArithmeticException a)
        {
           // a.printStackTrace();
            System.out.println("By Zero");
        }

        System.out.println("----------------------------");

        try {
            String a = args[0];
            a.trim();
            System.out.println(a);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Index out of Bound");
        }
        catch (NullPointerException n)
        {
            System.out.println("Null pointer Exception");
        }

        System.out.println("----------------------------");

      StringBuffer sb = new StringBuffer();
        try
        {
            sb = null;

            String a = sb.toString().trim();
        }
        catch (NullPointerException n)
        {
            System.out.println("Null pointer Exception");
        }





    }
}
