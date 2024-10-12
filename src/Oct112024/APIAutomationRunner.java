package Oct112024;

public class APIAutomationRunner {
    public static void main(String[] args) {
        TestCaseAPI tca = new TestCaseAPI();
        tca.performGET();
        tca.childMethod();

        System.out.println(" ");
        System.out.println("-----------------------");

       BaseTestAPI bta = new TestCaseAPI();
       bta.ParentMethod();

        System.out.println(" ");
        System.out.println("-----------------------");

        BaseTestAPI btp1= new BaseTestAPI(1,"khiti");
        System.out.println(btp1.getName());
        System.out.println(btp1.getId());
        System.out.println( new BaseTestAPI("Deba",2).getName());
        System.out.println( new BaseTestAPI("Deba",2).getId());

        System.out.println(" ");
        System.out.println("-----------------------");

        //using super keyword
        tca.childMethod1();
    }
}
