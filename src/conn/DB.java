package conn;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;

/**
 * @author Punnajee
 */
public class DB {

    static Connection c = null;

//    // LOCAL
    public static final String DBPATH = "jdbc:mysql://127.0.0.1:3306/ultimate2?zeroDateTimeBehavior=convertToNull&useUnicode=true&amp;characterEncoding=utf8&amp;useSSL=no&amp;autoReconnect=true";
    public static final String USER = "root";
    public static final String PASS = "root";


//    public static final String DBPATH = "jdbc:mysql://192.168.1.6:3306/ultimate2?zeroDateTimeBehavior=convertToNull&useUnicode=true&amp;characterEncoding=utf8&amp;useSSL=no&amp;autoReconnect=true";
//    public static final String USER = "root";
//    public static final String PASS = "root";

//    public static final String DBPATH = "jdbc:mysql://192.168.1.155:3306/ultimate2?zeroDateTimeBehavior=convertToNull&useUnicode=true&amp;characterEncoding=utf8&amp;useSSL=no&amp;autoReconnect=true";
//    public static final String USER = "root";
//    public static final String PASS = "root";

//Cat 2020 Local server
//    public static final String DBPATH = "jdbc:mysql://192.168.1.3:3306/ultimate2?zeroDateTimeBehavior=convertToNull&useUnicode=true&amp;characterEncoding=utf8&amp;useSSL=no&amp;autoReconnect=true";
//    public static final String USER = "root";
//    public static final String PASS = "root";


// LOCAL
//    public static final String DBPATH = "jdbc:mysql://127.0.0.1:3306/polgahawela?zeroDateTimeBehavior=convertToNull&useUnicode=true&amp;characterEncoding=utf8&amp;useSSL=no&amp;autoReconnect=true";
//    public static final String USER = "root";
//    public static final String PASS = "root";


////    MCK
//    public static final String DBPATH = "jdbc:mysql://MCK_SERVER:3306/ultimate2?zeroDateTimeBehavior=convertToNull&useUnicode=true&amp;characterEncoding=utf8&amp;useSSL=no&amp;autoReconnect=true";
//    public static final String USER = "root";
//    public static final String PASS = "@Mck_#321";

////    MCK Online
//    public static final String DBPATH = "jdbc:mysql://124.43.9.57:3306/ultimate2?zeroDateTimeBehavior=convertToNull&useUnicode=true&amp;characterEncoding=utf8&amp;useSSL=no&amp;autoReconnect=true";
//    public static final String USER = "root";
//    public static final String PASS = "@Mck_#321";


////    Polgahawela
//    public static final String DBPATH = "jdbc:mysql://124.43.9.57:3306/polgahawela?zeroDateTimeBehavior=convertToNull&useUnicode=true&amp;characterEncoding=utf8&amp;useSSL=no&amp;autoReconnect=true";
//    public static final String USER = "root";
//    public static final String PASS = "@Mck_#321";


//    // CHILAW
//    public static final String DBPATH = "jdbc:mysql://124.43.11.162:3306/chilaw?zeroDateTimeBehavior=convertToNull&useUnicode=true&amp;characterEncoding=utf8&amp;useSSL=no&amp;autoReconnect=true";
//    public static final String USER = "root";
//    public static final String PASS = "3ta@kela#


//    Pannala
//    public static final String DBPATH = "jdbc:mysql://124.43.11.162:3306/pannala?zeroDateTimeBehavior=convertToNull&useUnicode=true&amp;characterEncoding=utf8&amp;useSSL=no&amp;autoReconnect=true";
//    public static final String USER = "root";
//    public static final String PASS = "3ta@kela#una@";

//    Pannala local
//    public static final String DBPATH = "jdbc:mysql://127.0.0.1:3306/pannala?zeroDateTimeBehavior=convertToNull&useUnicode=true&amp;characterEncoding=utf8&amp;useSSL=no&amp;autoReconnect=true";
//    public static final String USER = "root";
//    public static final String PASS = "root";

// Kuliyapitiya
//    public static final String DBPATH = "jdbc:mysql://124.43.11.162:3306/ultimate2?zeroDateTimeBehavior=convertToNull&useUnicode=true&amp;characterEncoding=utf8&amp;useSSL=no&amp;autoReconnect=true";
//    public static final String USER = "root";
//    public static final String PASS = "3ta@kela#una@";


    public static Connection getConnection() throws Exception {
        if (c == null) {
            Class.forName("com.mysql.jdbc.Driver");
            //   DriverManager.setLoginTimeout(2);

            c = DriverManager.getConnection(DBPATH, USER, PASS);

        }
        return c;
    }

    public static int setData(String sql) throws Exception {
        int row = DB.getConnection().createStatement().executeUpdate(sql);
//       System.out.println("===============\n"+sql+"\n====================");
        return row;
    }

    public static ResultSet getData(String sql) throws Exception {
        ResultSet executeQuery = DB.getConnection().createStatement().executeQuery(sql);
//       System.out.println("===============\n"+sql+"\n====================");
        return executeQuery;
    }

}
