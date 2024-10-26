package oct231024;

public class ThrowException {
    public static void main(String[] args) {

        PrintStar();

    }

    public static void PrintStar()
    {
        for (int i = 0; i < 5; i++) {

            for (int j = i; j < 6; j++) {

                System.out.println("*");
                throw new ArithmeticException();
               // throw new NullPointerException();  // Throw will not execute multiple time
            }
        }
    }

}
