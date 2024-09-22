package Sept.ex_20092024;

public class Lab01TernaryOperator {

    //By using Ternary Operators max between 3 numbers.
    // Input int - a,b,c - a = 10, b = 20, c = 45
    public static void main(String[] args) {
        int a = 10, b = 20, c = 45;

        //int MaxValue = (a > b)  || (c > b) || (c > a) ? a : b ;
        int MaxValue = (a > b)?((a>c) ? a:c) :((b > c) ? b:c);
        System.out.println(MaxValue);

    }
}
