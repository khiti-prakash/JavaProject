package oc16102024;

import java.security.PrivateKey;

public enum URL {
    WEBSITE("https://www.vabro.com"),
    BASEURL("https://app.vabro.com"),
    DEVURL("https://dev.vabro.com"),
    STAGINGURL("https://staging.vabro.com");

    private final String url;
    private URL(String url)
    {
      this.url =url;
    }

    public String getUrl()
    {
        return url;
    }

    public enum Days{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;
        private Days()
        {

        }
    }

    public enum BugLevel{
        HIGH,
        LOW,
        CRITICAL,
        MAJOR,
        MINOR,
        CRASH,

    }
    public enum BugDescription{
        HIGH("Need to fix in sort period of time"),
        LOW("Devloper fix when he/she free"),
        CRITICAL("Main module is not able to Test"),
        MAJOR("Tester give the status as major and need to fix first"),
        MINOR("Tester give the status as minor and need to fix after some days"),
        CRASH("immediately Fix the bug");

        private String  InfoBug;
        private BugDescription(String _infoBug)
        {
            InfoBug =_infoBug;
        }
        public  String GetInfoBug()
        {
            return InfoBug;
        }

    }
}
