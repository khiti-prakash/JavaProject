package Sept.ex_27092024;

public class Lab03_Difference_Between_DoWhileAndWhile {

    /* -------------do while-----------------
     In do_while first do part will execute then While loop is execute even though while condition is false
      still do part will execute.

      -------------While---------------------
      In while loop if the condition will false then it will not execute.
     */
    public static void main(String[] args) {

       //-------------do while-----------------

       int i =1;
       do{
           System.out.println("Values are :- "+i);
           i++;
       }
       while (i<=100);

        //-------------while-----------------

        System.out.println("------------- while-----------------");
        int j=1;
        while(j <= 10)
        {
            System.out.println("Values are :- "+j);
            j++;
        }

    }
}
