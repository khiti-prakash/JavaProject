package Sept.ex_30092024;

public class PrimeNumber_Function {
    //Prime Number 1 to 100
    public static void main(String[] args) {
        try{
            for (int i =2; i<=100; i++)
            {
                int count=0;
                for(int j=1;j<=100;j++)
                {
                    if(i%j==0)
                    {
                        count++;
                    }
                }
                if(count == 2)
                {
                    System.out.println(i + " is a prime number");
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println("Enter only Integer Number");
        }
    }

}
