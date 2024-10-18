package oct18102024;

import java.util.Scanner;

public class ReverseString {


    public static void main(String[] args) {
        StringReverse();

        ReverseString rs = new ReverseString();

       String vv  = rs.Reverse();
       System.out.println(vv);
    }




    public static void StringReverse()
    {
        String name = "Pramod";
        String revName;

        for (int i = name.length()-1; i >= 0; i--) {
            char value = name.charAt(i);
            System.out.print(value);
        }
        System.out.println("");
    }
    public String Reverse()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Name");
        String inputValue = sc.next();
        sc.close();

        StringBuilder sb = new StringBuilder(inputValue);
        String value = sb.reverse().toString();
        return value;
    }
}

