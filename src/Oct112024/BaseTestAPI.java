package Oct112024;

public class BaseTestAPI {

    private String name;
    private int id;

    //Default Constructor
    public BaseTestAPI()
    {
        System.out.println("Calling BaseTestAPI");
    }
    //parameterize constructor
    public BaseTestAPI(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    //Constructor overloading
    public BaseTestAPI(String name,int id)
    {

        this.name = name;
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void performGET()
    {

    }
    public  void performPOST()
    {

    }
    public void performPUT()
    {

    }
    public void performPATCH()
    {

    }
    public void performDELETE()
    {

    }
    protected void ParentMethod()
    {
        System.out.printf("My name is %s","Pabani");
    }
    public void childMethod1()
    {
        System.out.println("My name is TestClassAPI Parent method");
    }
}
