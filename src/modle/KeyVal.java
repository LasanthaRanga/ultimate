package modle;

import conn.DB;

import java.sql.ResultSet;

public class KeyVal {
    public static String getVal(String key) {
        String value = null;
        try {
            ResultSet data = DB.getData("SELECT *\n" +
                    "FROM `fxkeyvalue`\n" +
                    "WHERE\n" +
                    "fxkeyvalue.`key` = '" + key + "'");
            if (data.last()) {
                value = data.getString("value");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }
}
