package oct12102024;

public class SuperKeyWord {

    private String name;
    private int id;
    private String company_name;
    private String Joining_date;



    SuperKeyWord(int id,String name,String company_name,String Joining_date)
    {
        this.id = id;
        this.name = name;
        this.company_name = company_name;
        this.Joining_date = Joining_date;
       // System.out.println("'+id =5,name=\"khiti\",company_name=\"Edusys\",Joining_date=\"1/3/1995\"+'");

        getName();
        getId();
        getCompany_name();
        getJoining_date();
    }

    private String getName()
    {
        System.out.println(name);
        return name;
    }
    private int getId()
    {
        System.out.println(id);
        return id;
    }
    private String getCompany_name()
    {
        System.out.println(company_name);

        return company_name;
    }
    private String getJoining_date()
    {
        System.out.println(Joining_date);
        return Joining_date;
    }

}
