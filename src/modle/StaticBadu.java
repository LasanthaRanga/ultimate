package modle;

import modle.asses.SearchHolder;

import java.util.Date;

public class StaticBadu {

    private static Date selectedSystemDate;

    private static int appcatid;
    private static int appid;
    private static SearchHolder sh;

    public static Date getSelectedSystemDate() {
        return selectedSystemDate;
    }

    public static void setSelectedSystemDate(Date aSelectedSystemDate) {
        selectedSystemDate = aSelectedSystemDate;
    }

    public static int getAppcatid() {
        return appcatid;
    }

    public static void setAppcatid(int appcatid) {
        StaticBadu.appcatid = appcatid;
    }

    public static int getAppid() {
        return appid;
    }

    public static void setAppid(int appid) {
        StaticBadu.appid = appid;
    }

    public static SearchHolder getSH() {
        if (sh == null) {
            sh = new SearchHolder();
        }
        return sh;
    }

    public static void setSH(SearchHolder sh) {
        StaticBadu.sh = sh;
    }


}
