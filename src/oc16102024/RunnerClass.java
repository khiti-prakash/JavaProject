package oc16102024;

public class RunnerClass {

    public static void main(String[] args) {
        System.out.println(URL.BugLevel.LOW);
        System.out.println(URL.BugDescription.CRASH.GetInfoBug());
        System.out.println(URL.STAGINGURL.getUrl());
        System.out.println(URL.Days.FRIDAY);


        System.out.println("----------------------------------------------");

        for (URL.BugDescription bugLevel : URL.BugDescription.values())
        {
            System.out.print(bugLevel + ":- " );
            System.out.println(bugLevel.GetInfoBug());
        }

    }
}
