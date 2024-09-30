package Sept.ex_30092024;

import java.util.Scanner;

public class Count_Vowel_Consonant {
    //Count vowels and consonants in a String. (pramod) - v = 2 , c =. 4
    public static void main(String[] args) {
try {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Entre a name");
    String name = sc.nextLine();
    vowel_consonant(name);
    System.out.println("------Using While Loop-----");
    consonant_vowel(name);
    System.out.println("------Using Do While Loop-----");
    _consonant_vowel(name);

    sc.close();
}catch (Exception e){
    System.out.println("Please Entre only name");
}

    }

    public  static void vowel_consonant(String name)
    {
        String withoutSpace = name.replaceAll(" ","");
        String nameWithLowerCase = withoutSpace.toLowerCase();
        int vowelCount=0;
        int consonantCount=0;
        for(int i=0; i<nameWithLowerCase.length();i++)
        {
            char ch = nameWithLowerCase.charAt(i);
            if(ch == 'a'|| ch =='e' || ch =='o'|| ch =='i'|| ch =='u')
            {
                vowelCount++;
            }
            else
            {
                consonantCount++;
            }
        }
        System.out.println("vowelCount:-"+ vowelCount);
        System.out.println("consonantCount:-"+consonantCount);
        //return vowelCount,consonantCount;
    }
    public static void consonant_vowel(String name)
    {
        String withoutSpace = name.replaceAll(" ","");
        String nameWithLowerCase = withoutSpace.toLowerCase();
        int vowelCount=0;
        int consonantCount=0;
        int i =0;
        while(i<nameWithLowerCase.length())
        {
           char ch = nameWithLowerCase.charAt(i);
           if(ch == 'a'|| ch =='e' || ch =='o'|| ch =='i'|| ch =='u')
           {
               vowelCount++;
           }
           else
           {
               consonantCount++;
           }
           i++;
        }
        System.out.println("vowelCount:-"+ vowelCount);
        System.out.println("consonantCount:-"+consonantCount);
    }

    public static void _consonant_vowel(String name)
    {
        String withoutSpace = name.replaceAll(" ","");
        String nameWithLowerCase = withoutSpace.toLowerCase();
        int vowelCount=0;
        int consonantCount=0;
        int nameLength = nameWithLowerCase.length();
        int i =0;

        do {
            char ch = nameWithLowerCase.charAt(i);
                if(ch == 'a'|| ch =='e' || ch =='o'|| ch =='i'|| ch =='u')
                {
                    vowelCount++;
                }
                else
                {
                    consonantCount++;
                }
                i++;

        }while (i<nameLength);
        System.out.println("vowelCount:-"+ vowelCount);
        System.out.println("consonantCount:-"+consonantCount);
    }

}
