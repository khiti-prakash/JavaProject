package oct231024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchFinally {
//    public static void main(String[] args) throws Throwable {
//
//        try
//        {
//           String a = args[0];
//
//            int b = Integer.parseInt(args[0]);
//            int c = b/0;
//
//        }
//
//        catch (ArithmeticException e)
//        {
//          System.out.println("ArithmeticException");
//        }
//        catch (NullPointerException n)
//        {
//            System.out.println("NullPointerException");
//        }
//        catch (ArrayIndexOutOfBoundsException a)
//        {
//            System.out.println("ArrayIndexOutOfBoundsException");
//        }
//        finally {
//            System.out.println("Finally block");
//        }
//    }

    public static void main(String[] args) {
        FileInputStream file = null;
        try {
            file = new FileInputStream("C:\\Users\\dell\\Desktop\\apratice.txt");
            // read from the file
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    // handle the exception
                }
            }
        }
    }
}
