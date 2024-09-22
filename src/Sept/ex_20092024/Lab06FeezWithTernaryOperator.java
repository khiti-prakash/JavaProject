package Sept.ex_20092024;

public class Lab06FeezWithTernaryOperator {
    public static void main(String[] args) {
         for (int i = 1; i <= 100; i++)
         {
             String value = (i % 3 == 0 && i % 5 == 0)? "FizzBuzz" :
                     (i % 3 == 0)? "Fizz":
                     (i % 5 == 0)?"Buzz":
                     "Not able to devided :="+i;
             System.out.println(value);
         }
    }
}
