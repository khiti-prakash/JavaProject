package Oct.ex_02102024;

public class PalindromeOfString {
    //Create a program that checks whether a given string is a palindrome.
    public static void main(String[] args) {
        String name = "ABBA";

        char ch;
        for (int i = 0; i < name.length(); i++)
        {
            ch = name.charAt(i);


            for (int j = name.length(); j > 0; j--)
            {
               char  cha = name.charAt(j);

               if(ch == cha)
               {
                   System.out.println("It is a palindrome");
               }
            }


        }


    }
}
