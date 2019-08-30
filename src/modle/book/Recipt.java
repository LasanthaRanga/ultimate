package modle.book;

import conn.DB;
import javafx.geometry.Pos;
import javafx.util.Duration;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;
import org.controlsfx.control.Notifications;
import org.hibernate.engine.spi.SessionFactoryImplementor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class Recipt {

    private static Connection getConnection() {
        try {
            return ((SessionFactoryImplementor) conn.NewHibernateUtil.getSessionFactory()).getConnectionProvider().getConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static int insertReciptWithoutNo(int idAppCat, int applicationID, double check, double cash, double total, String date, String chno, String chdate, int chbank, int office, int acoount, int user) {

        int x = 0;
        String rq = "";

        rq = "INSERT INTO `receipt` (\n" +

                "\t`Application_Catagory_idApplication_Catagory`,\n" +
                "\t`recept_applicationId`,\n" +
                "\t`cheack`,\n" +
                "\t`cesh`,\n" +
                "\t`receipt_total`,\n" +
                "\t`receipt_day`,\n" +
                "\t`receipt_status`,\n" +
                "\t`receipt_syn`,\n" +
                "\t`chque_no`,\n" +
                "\t`chque_date`,\n" +
                "\t`chque_bank`,\n" +
                "\t`office_idOffice`,\n" +
                "\t`receipt_account_id`,\n" +
                "\t`receipt_user_id`\n" +

                ")\n" +
                "VALUES\n" +
                "\t(\n" +
                "'" + idAppCat + "',\n" +
                "'" + applicationID + "',\n" +
                "'" + check + "',\n" +
                "'" + cash + "',\n" +
                "'" + total + "',\n" +
                "'" + date + "',\n" +
                "0,\n" +
                "1,\n" +
                "'" + chno + "',\n";
        if (chdate != null) {
            rq += "'" + chdate + "',\n";
        } else {
            rq += "" + chdate + ",\n";
        }
        rq += "'" + chbank + "',\n" +
                "'" + office + "',\n" +
                "'" + acoount + "',\n" +
                "'" + user + "' \n" +
                ");";


        try {
            conn.DB.setData(rq);
            ResultSet data = DB.getData("SELECT\n" +
                    "\treceipt.idReceipt\n" +
                    "FROM\n" +
                    "\t`receipt`\n" +
                    "WHERE\n" +
                    "\treceipt.Application_Catagory_idApplication_Catagory = '" + idAppCat + "'\n" +
                    "AND receipt.recept_applicationId = '" + applicationID + "'\n" +
                    "AND receipt.receipt_print_no IS NULL\n" +
                    "ORDER BY\n" +
                    "\treceipt.idReceipt DESC\n" +
                    "LIMIT 1");

            if (data.last()) {
                x = data.getInt("idReceipt");
            }
            return x;
        } catch (Exception e) {
            e.printStackTrace();
            return x;
        }
    }


    public static void updateReciptNo(int idRecipt, int idAppCat, String text) {
        String qu = "SELECT\n" +
                "MAX(receipt.oder) as max\n" +
                "FROM\n" +
                "receipt\n" +
                "WHERE\n" +
                "Application_Catagory_idApplication_Catagory = " + idAppCat;
        try {
            ResultSet max = DB.getData(qu);
            int x = 0;
            if (max.next()) {
                x = max.getInt("max");
            }
            int i = x + 1;
            text += i;
            System.out.println(text);
            conn.DB.setData("UPDATE `receipt`\n" +
                    "SET \n" +
                    " `receipt_print_no` = '" + text + "',\n" +
                    " `oder` = '" + i + "',\n" +
                    " `receipt_status` = '1'\n" +
                    "WHERE\n" +
                    "\t(`idReceipt` = '" + idRecipt + "')");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void bookingRecipt(HashMap hm, boolean print) {
        try {
            String path = "C:\\Ultimate\\Report\\booking\\booking.jrxml";// IN SYSTEM
            JasperReport jr = JasperCompileManager.compileReport(path);
            HashMap param = hm;
            getConnection().commit();
            JasperPrint jp = JasperFillManager.fillReport(jr, param, getConnection());
            if (print) {
                JasperPrintManager.printReport(jp, false);
            } else {
                JasperViewer.viewReport(jp, false);
            }

        } catch (Exception jRException) {
            //       modle.ErrorLog.writeLog(jRException.getMessage(), "AssessReport", "getBook", "modle.assess.AssessReport");
            jRException.printStackTrace();
            Notifications.create()
                    .title("Warning")
                    .text("Can not generate report. Something went wrong.\n(" + jRException.getMessage() + ")")
                    .hideAfter(Duration.seconds(3))
                    .position(Pos.BOTTOM_RIGHT).showWarning();
        }
    }

    public static void genarateBookingRecipt(String idRecipt, boolean print) {
        try {
            ResultSet data = DB.getData("SELECT\n" +
                    "receipt.idReceipt,\n" +
                    "book_date.idbook_date,\n" +
                    "book_date.book_idbook,\n" +
                    "book_date.book_date_day,\n" +
                    "book_date.book_date_start,\n" +
                    "book_date.book_date_end,\n" +
                    "book_date.book_date_amount,\n" +
                    "book_date.book_date_diposit,\n" +
                    "receipt.recept_applicationId,\n" +
                    "book.book_book_status\n" +
                    "FROM\n" +
                    "receipt\n" +
                    "INNER JOIN book ON book.idbook = receipt.recept_applicationId\n" +
                    "INNER JOIN book_date ON book_date.book_idbook = book.idbook\n" +
                    "WHERE\n" +
                    "receipt.Application_Catagory_idApplication_Catagory = 10 AND\n" +
                    "receipt.idReceipt = " + idRecipt);
            String dis = "";
            while (data.next()) {
                int book_book_status = data.getInt("book_book_status");
                if (book_book_status == 1) {
                    dis += " " + data.getString("book_date_day") + " ";
                }

                if (book_book_status == 2) {
                    dis += " " + data.getString("book_date_day") + " " + data.getString("book_date_start") + "-" + data.getString("book_date_end");
                }
            }
            HashMap<String, String> hm = new HashMap<>();
            hm.put("idRecipt", idRecipt);
            hm.put("description", dis);
            bookingRecipt(hm, print);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }

}
