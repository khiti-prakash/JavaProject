package oct231024;

public class Ex03 {

    public static void main(String[] args)
    {
        try
        {
            int a = 10/10;
        }
        catch (Exception e)
        {
            System.out.println("I am catch 1");
            System.exit(-1);
        }
        finally {
            System.out.println("I am finally 1");
        }
        try
        {
            int a = 10/0;

        }
        catch (Exception e)
        {
            System.out.println("I am catch 2");
            System.exit(-1);
        }
        finally
        {
            System.out.println("I am finally 2");
        }
        try
        {
            Integer a = 10/20;
        }
        catch(Exception e)
        {
            System.out.println("I am catch 3");
        }
        finally {
            System.out.println("I am finally 3");
        }
        try {
            Integer a = 10/20;
        }
        catch(Exception e)
        {
            System.out.println("I am catch 3");
            System.exit(-1);
        }
        finally {
            System.out.println("I am finally 3");
        }
    }
}
