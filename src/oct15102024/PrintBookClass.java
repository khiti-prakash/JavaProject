package oct15102024;

public class PrintBookClass extends BookClass{

    public PrintBookClass(String name, String author, int price)
    {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    @Override
    void getDetails()
    {
       System.out.println("Abstract Method");
    }
}
