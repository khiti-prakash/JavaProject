package Sept.ex_25092024;

import java.util.Scanner;

public class CountVowelAndConsonant {
    //Count vowels and consonants in a String. (pramod) - v = 2 , c =. 4
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Your Name");
            String val = sc.nextLine(); // Use nextLine to capture full name with spaces
            sc.close();

            String noWhitespace = val.replaceAll("\\s", "");
            String lowValue = noWhitespace.toLowerCase();
            int vowels_count = 0;
            int consonants_count = 0;
            for (int i = 0; i < lowValue.length(); i++) {
                char char_Name = lowValue.charAt(i);

                if (char_Name == 'a' || char_Name == 'e' || char_Name == 'i' || char_Name == 'o' || char_Name == 'u') {
                    vowels_count++;
                } else {
                    consonants_count++;
                }
            }
            System.out.printf(val + "'s name vowels_count = '" + vowels_count + "' and consonants_count = '" + consonants_count + "'", vowels_count, consonants_count);
        }
        catch (Exception e)
        {
            System.out.println("Please Enter a string");
        }
    }
}
