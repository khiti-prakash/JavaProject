package oct26102024;

import java.util.Arrays;

public class pattenUsingArray {


    public void arrayMethod() {
    Integer[] a = new Integer[5];

        for (int i = 0; i < a.length; i++)
        {
            for (int j = i; j < a.length; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
