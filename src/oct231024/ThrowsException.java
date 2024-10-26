package oct231024;

public class ThrowsException {
    public static void main(String[] args) {

        PrintCount(3);
    }

    public static void PrintCount(int i) throws ArithmeticException
    {
        if(i ==0)
        {
            System.out.println("*");
        }
        else
        {
            System.out.println("throws exception");
        }
    }
}
