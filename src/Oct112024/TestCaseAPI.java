package Oct112024;

public class TestCaseAPI extends BaseTestAPI {

    public TestCaseAPI()
    {
       super();
        System.out.println("TestCaseAPI Constructor Called");
    }
@Override
    public void performGET()
    {
        System.out.println("I am overriding the GET method");
    }
    @Override
    public  void performPOST()
    {
       System.out.println("I am overriding the POST method");
    }
    public void performPUT(int id)
    {
        System.out.println("I am overriding the PUT method");
    }
    //method overloading
    public void performPUT(String name)
    {
        System.out.println("I am overriding the PUT method");
    }
    @Override
    public void performPATCH()
    {
        System.out.println("I am overriding the PATCH method");
    }
    public void performDELETE(int name)
    {
        System.out.println("I am overriding the DELETE method");
    }


    protected void childMethod()
    {
        ParentMethod();
        System.out.printf("My name is %s","khiti");
    }
    public void childMethod1()
    {
       // super.childMethod1();
        System.out.printf("My name is TestClassAPI child method","khiti");
    }
}
