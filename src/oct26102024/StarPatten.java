package oct26102024;

import javax.swing.plaf.synth.SynthTextAreaUI;

class StarPattern {

    public static void main(String[] args) {
        //Star star = new Star();
        //star.method1(5);

        pattenUsingArray pp= new pattenUsingArray();
        pp.arrayMethod();;
    }




   static class Star
    {
        public void method1(int value)
        {
            Integer num = value;

            for (int i = num; i >= 1; i--) {

                for (int j = i; j >=1 ; j--) {

                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }


}

