package oct17102024;

public class StaticAndNonstaticBloackAndVariable {

    public static String CollegeName;
    public String Stream;

    //Constructor
   public StaticAndNonstaticBloackAndVariable()
    {

    }

    //Static block
   static
    {
       System.out.println("SIB");

    }

    // instance Block
    {
        System.out.println("IIB");
   }
}
