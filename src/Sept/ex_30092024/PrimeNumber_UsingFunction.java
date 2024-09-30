package Sept.ex_30092024;

public class PrimeNumber_UsingFunction {
    //Prime Number from 1 to 100. (for loop)
    public static void main(String[] args) {
try {
    primeNumber();
    Prime_Number_Using_While_Loop();
}
catch (Exception e)
{
    System.out.println("Enter only Inter value");
}


    }

    public static void primeNumber()
    {
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
    public static void Prime_Number_Using_While_Loop()
    {
        int i =2;
     while(i<=100)
     {
         int j=1,count=0;
       while(j<=i)
       {
           if(i%j == 0)
           {
              count++;
           }
           j++;
       }
       if(count == 2)
       {
           System.out.println(i + " is a prime number");

       }
         i++;
     }

    }
}
