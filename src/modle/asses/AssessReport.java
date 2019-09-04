package modle.asses;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import conn.DB;
import javafx.geometry.Pos;
import javafx.util.Duration;
import modle.KeyVal;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.fill.JRVerticalFiller.*;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

import net.sf.jasperreports.view.JasperViewer;

import org.controlsfx.control.Notifications;
import org.hibernate.engine.spi.SessionFactoryImplementor;

/**
 * @author RM.LasanthaRanga@gmail.com
 */
public class AssessReport {

    private Connection getConnection() {
        try {
            return ((SessionFactoryImplementor) conn.NewHibernateUtil.getSessionFactory()).getConnectionProvider().getConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public void getKform(String list) { 
        try {
            // String path = "C:\\UltimateCat\\Report\\adv_bill.jrxml";
            //  String path = "C:\\Users\\Punnajee\\JaspersoftWorkspace\\MyReports\\ultimate\\kfrom_1.jrxml";
//            String path = "C:\\Ultimate\\Report\\assessment\\kfrom_1.jrxml";// IN SYSTEM
            String path = "C:\\Ultimate\\Report\\assessment\\kfrom_wattegama.jrxml";// IN SYSTEM
            JasperReport jr = JasperCompileManager.compileReport(path);
            HashMap param = new HashMap<String, Integer>();
            param.put("assList", list);
            JasperPrint jp = JasperFillManager.fillReport(jr, param, this.getConnection());
            JasperViewer.viewReport(jp, false);

        } catch (Exception jRException) {
            jRException.printStackTrace();
            Notifications.create()
                    .title("Warning")
                    .text("Can not generate report. Something went wrong.\n(" + jRException.getMessage() + ")")
                    .hideAfter(Duration.seconds(3))
                    .position(Pos.BOTTOM_RIGHT).showWarning();
        }
    }

    public void getBook(String list) {
        try {
            String path = "C:\\Ultimate\\Report\\assessment\\book.jrxml";// IN SYSTEM
            JasperReport jr = JasperCompileManager.compileReport(path);
            HashMap param = new HashMap<String, Integer>();
            param.put("assList", list);
            param.put("year", modle.GetInstans.getQuater().getCurrentYear() + "");
            JasperPrint jp = JasperFillManager.fillReport(jr, param, this.getConnection());
            JasperViewer.viewReport(jp, false);

        } catch (Exception jRException) {
            modle.ErrorLog.writeLog(jRException.getMessage(), "AssessReport", "getBook", "modle.assess.AssessReport");
            jRException.printStackTrace();
            Notifications.create()
                    .title("Warning")
                    .text("Can not generate report. Something went wrong.\n(" + jRException.getMessage() + ")")
                    .hideAfter(Duration.seconds(3))
                    .position(Pos.BOTTOM_RIGHT).showWarning();
        }
    }

    public void getReciptPrint(String id, double tyw, double tya) {//one
        try {

            String path = "C:\\Ultimate\\Report\\assessment/mbil.jrxml";// IN SYSTEM
            JasperReport jr = JasperCompileManager.compileReport(path);
            HashMap param = new HashMap<String, Integer>();
            param.put("pid", id);
            param.put("tyw", tyw);
            param.put("tya", tya);
            this.getConnection().commit();
            JasperPrint jp = JasperFillManager.fillReport(jr, param, this.getConnection());
            JasperViewer.viewReport(jp, false);

        } catch (Exception jRException) {
            jRException.printStackTrace();
            modle.ErrorLog.writeLog(jRException.getMessage(), "AssessReport", "Ricipt", "modle.assess.AssessReport");
            //./ jRException.printStackTrace();
            Notifications.create()
                    .title("Warning")
                    .text("Can not generate report. Something went wrong.\n(" + jRException.getMessage() + ")")
                    .hideAfter(Duration.seconds(3))
                    .position(Pos.BOTTOM_RIGHT).showWarning();
        }
    }

    public void getReciptPrintEdited1(String id, double tyw, double tya, boolean print) {//one
        try {

            String path = "C:\\Ultimate\\Report\\assessment/mbilEdited.jrxml";// IN SYSTEM
            JasperReport jr = JasperCompileManager.compileReport(path);
            HashMap param = new HashMap<String, Integer>();
            param.put("pid", id);
            param.put("tyw", tyw);
            param.put("tya", tya);
            JasperPrint jp = JasperFillManager.fillReport(jr, param, this.getConnection());
            if (print) {
                JasperPrintManager.printReport(jp, false);
            } else {
                JasperViewer.viewReport(jp, false);
            }

        } catch (Exception jRException) {
            jRException.printStackTrace();
            modle.ErrorLog.writeLog(jRException.getMessage(), "AssessReport", "Ricipt", "modle.assess.AssessReport");
            //./ jRException.printStackTrace();
            Notifications.create()
                    .title("Warning")
                    .text("Can not generate report. Something went wrong.\n(" + jRException.getMessage() + ")")
                    .hideAfter(Duration.seconds(3))
                    .position(Pos.BOTTOM_RIGHT).showWarning();
        }
    }


    public void getReciptPrintPlane(String id, double tyw, double tya, boolean print) {//one
        try {

            String ass_bill_path = KeyVal.getVal("ass_bill_path");

            String path = ass_bill_path;// IN SYSTEM
            JasperReport jr = JasperCompileManager.compileReport(path);
            HashMap param = new HashMap<String, Integer>();
            param.put("pid", id);
            param.put("tyw", tyw);
            param.put("tya", tya);
            JasperPrint jp = JasperFillManager.fillReport(jr, param, this.getConnection());
            if (print) {
                JasperPrintManager.printReport(jp, false);
            } else {
                JasperViewer.viewReport(jp, false);
            }

        } catch (Exception jRException) {
            jRException.printStackTrace();
            modle.ErrorLog.writeLog(jRException.getMessage(), "AssessReport", "Ricipt", "modle.assess.AssessReport");
            //./ jRException.printStackTrace();
            Notifications.create()
                    .title("Warning")
                    .text("Can not generate report. Something went wrong.\n(" + jRException.getMessage() + ")")
                    .hideAfter(Duration.seconds(3))
                    .position(Pos.BOTTOM_RIGHT).showWarning();
        }
    }


    public void getReciptView(String id, double tyw, double tya, boolean print) {//two
        try {
            String path = "C:\\Ultimate\\Report\\assessment/mbil.jrxml";// IN SYSTEM
            //  String path="C:\\Users\\Ranga\\JaspersoftWorkspace\\MyReports\\Assessment\\assbill.jrxml" ;


            JasperReport jr = JasperCompileManager.compileReport(path);

            HashMap param = new HashMap<String, Integer>();
            param.put("pid", id);
            param.put("tyw", tyw);
            param.put("tya", tya);
            JasperPrint jp = JasperFillManager.fillReport(jr, param, this.getConnection());


            if (print) {
                JasperPrintManager.printReport(jp, false);
            } else {
                JasperViewer.viewReport(jp, false);
            }


        } catch (Exception jRException) {
            modle.ErrorLog.writeLog(jRException.getMessage(), "AssessReport", "Ricipt", "modle.assess.AssessReport");
            jRException.printStackTrace();
            Notifications.create()
                    .title("Warning")
                    .text("Can not generate report. Something went wrong.\n(" + jRException.getMessage() + ")")
                    .hideAfter(Duration.seconds(3))
                    .position(Pos.BOTTOM_RIGHT).showWarning();
        }
    }


    public void getDayEndShedule(String day) {
        try {
            String path = "C:\\Ultimate\\Report\\assessment\\dayend_1.jrxml";// IN SYSTEM
            JasperReport jr = JasperCompileManager.compileReport(path);
            HashMap param = new HashMap<String, Integer>();
            param.put("day", day);
            JasperPrint jp = JasperFillManager.fillReport(jr, param, this.getConnection());
            //          JasperPrintManager.printReport(jp, false);
            JasperViewer.viewReport(jp, false);

        } catch (Exception jRException) {
            modle.ErrorLog.writeLog(jRException.getMessage(), "AssessReport", "Ricipt", "modle.assess.AssessReport");
            jRException.printStackTrace();
            Notifications.create()
                    .title("Warning")
                    .text("Can not generate report. Something went wrong.\n(" + jRException.getMessage() + ")")
                    .hideAfter(Duration.seconds(3))
                    .position(Pos.BOTTOM_RIGHT).showWarning();
        }
    }

    public void getDayEndSheduleByOffice(String day, int idOffice) {
        try {
            String path = "C:\\Ultimate\\Report\\assessment\\dayend_byOffice.jrxml";// IN SYSTEM
            JasperReport jr = JasperCompileManager.compileReport(path);
            HashMap param = new HashMap<String, Integer>();
            param.put("day", day);
            param.put("idOffice", idOffice);
            JasperPrint jp = JasperFillManager.fillReport(jr, param, this.getConnection());
            //          JasperPrintManager.printReport(jp, false);
            JasperViewer.viewReport(jp, false);

        } catch (Exception jRException) {
            modle.ErrorLog.writeLog(jRException.getMessage(), "AssessReport", "Ricipt", "modle.assess.AssessReport");
            jRException.printStackTrace();
            Notifications.create()
                    .title("Warning")
                    .text("Can not generate report. Something went wrong.\n(" + jRException.getMessage() + ")")
                    .hideAfter(Duration.seconds(3))
                    .position(Pos.BOTTOM_RIGHT).showWarning();
        }
    }

    public void longBill(String pid, boolean print) {

        System.out.println(pid);

        try {
            ResultSet data = DB.getData("SELECT\n" +
                    "receipt.receipt_print_no,\n" +
                    "receipt.receipt_day,\n" +
                    "customer.cus_name,\n" +
                    "assessment.assessment_no,\n" +
                    "ass_payment.ass_Payment_LY_Arrears,\n" +
                    "ass_payment.ass_Payment_LY_Warrant,\n" +
                    "ass_payment.ass_Payment_fullTotal,\n" +
                    "ass_payment.ass_Payment_idUser,\n" +
                    "ass_payment.ass_cash,\n" +
                    "ass_payment.ass_check_no,\n" +
                    "ass_payment.ass_bank,\n" +
                    "bank.bank_name,\n" +
                    "ass_payment.cd_balance,\n" +
                    "street.street_name,\n" +
                    "ward.ward_name,\n" +
                    "ass_payment.ass_Payment_goto_debit\n" +
                    "FROM\n" +
                    "receipt\n" +
                    "INNER JOIN ass_payment ON ass_payment.Receipt_idReceipt = receipt.idReceipt\n" +
                    "INNER JOIN assessment ON ass_payment.Assessment_idAssessment = assessment.idAssessment\n" +
                    "INNER JOIN customer ON assessment.Customer_idCustomer = customer.idCustomer\n" +
                    "LEFT JOIN bank ON bank.idBank = ass_payment.ass_bank\n" +
                    "INNER JOIN street ON assessment.Street_idStreet = street.idStreet\n" +
                    "INNER JOIN ward ON assessment.Ward_idWard = ward.idWard AND street.Ward_idWard = ward.idWard\n" +
                    "WHERE\n" +
                    "ass_payment.idass_Payment =" + pid);


            ResultSet payto = DB.getData("SELECT\n" +
                    "ass_payto.idass_payto,\n" +
                    "ass_payto.ass_payto_Qno,\n" +
                    "ass_payto.ass_payto_warrant,\n" +
                    "ass_payto.ass_payto_arrears,\n" +
                    "ass_payto.ass_payto_qvalue,\n" +
                    "ass_payto.ass_payto_discount,\n" +
                    "ass_payto.ass_payto_discount_rate,\n" +
                    "ass_payto.ass_Payment_idass_Payment,\n" +
                    "ass_payto.ass_payto_status\n" +
                    "FROM\n" +
                    "ass_payto\n" +
                    "WHERE\n" +
                    "ass_payto.ass_Payment_idass_Payment =" + pid);


            double arrias = 0;
            double warant = 0;
            double qptot = 0;
            double fullpay = 0;
            double cd = 0;
            double overnext = 0;
            double discount = 0;
            double overquater = 0;
            String chequeno = "";
            String ricitno = "";
            String day = "";
            String asno = "";
            String cus_name = "";
            String des = "";
            System.out.println("thama Data ne");
            if (data.last()) {
                System.out.println("data thiyanawa");
                ricitno = data.getString("receipt_print_no");
                day = data.getString("receipt_day");
                asno = data.getString("ward_name") + " | " + data.getString("street_name") + " | " + data.getString("assessment_no");
                cus_name = data.getString("cus_name");
                fullpay = data.getDouble("ass_Payment_fullTotal");
                cd = data.getDouble("cd_balance");
                overnext = data.getDouble("ass_Payment_goto_debit");
                warant += data.getDouble("ass_Payment_LY_Warrant");
                arrias += data.getDouble("ass_Payment_LY_Arrears");
                chequeno = data.getString("ass_check_no");
                if (chequeno.length() > 0) {
                    chequeno += " | " + data.getString("bank_name");
                } else {
                    chequeno = "";
                }

                System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
                System.out.println(arrias);
                System.out.println(warant);

                while (payto.next()) {
                    int paystatus = payto.getInt("ass_payto_status");
                    arrias += payto.getDouble("ass_payto_arrears");
                    warant += payto.getDouble("ass_payto_warrant");

                    if (paystatus == 1) {
                        qptot += payto.getDouble("ass_payto_qvalue");
                        des += " Q" + payto.getString("ass_payto_Qno") + ",  ";


                    } else {
                        overquater += payto.getDouble("ass_payto_qvalue");
                    }
                    discount += payto.getDouble("ass_payto_discount");
                }

                System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
                System.out.println(arrias);
                System.out.println(warant);


                fullpay += cd + overnext;

            }

            System.out.println("cal hari");
            String path = "C:\\Ultimate\\Report\\assessment\\longbil.jrxml";// IN SYSTEM
            JasperReport jr = JasperCompileManager.compileReport(path);
            HashMap param = new HashMap<String, Integer>();
            param.put("pid", pid + "");
            param.put("ricitno", ricitno);
            param.put("day", day);
            param.put("asno", asno);
            param.put("cus_name", cus_name);
            param.put("arrias", modle.Round.roundToString(arrias));
            param.put("warant", modle.Round.roundToString(warant));
            param.put("qptot", modle.Round.roundToString(qptot));
            param.put("qptot", modle.Round.roundToString(qptot));
            param.put("cd", modle.Round.roundToString(cd));
            param.put("overnext", modle.Round.roundToString(overnext + overquater));
            param.put("fullpay", modle.Round.roundToString(fullpay));
            param.put("des", des);
            param.put("discount", modle.Round.roundToString(discount));
            param.put("chequeno", chequeno);


            System.out.println("Full Pay = " + fullpay);
            System.out.println("OVER Pay = " + (overnext + overquater));


            JasperPrint jp = JasperFillManager.fillReport(jr, param, this.getConnection());

            if (print) {
                JasperPrintManager.printReport(jp, false);
            } else {
                JasperViewer.viewReport(jp, false);
            }

        } catch (Exception jRException) {
            jRException.printStackTrace();
            modle.ErrorLog.writeLog(jRException.getMessage(), "AssessReport", "Ricipt", "modle.assess.AssessReport");
            Notifications.create()
                    .title("Warning")
                    .text("Can not generate report. Something went wrong.\n(" + jRException.getMessage() + ")")
                    .hideAfter(Duration.seconds(3))
                    .position(Pos.BOTTOM_RIGHT).showWarning();
        }

    }


    public void longBillPrint(String pid) {

        System.out.println(pid);

        try {
            ResultSet data = DB.getData("SELECT\n" +
                    "\treceipt.receipt_print_no,\n" +
                    "\treceipt.receipt_day,\n" +
                    "\tcustomer.cus_name,\n" +
                    "\tassessment.assessment_no,\n" +
                    "\tass_payment.ass_Payment_LY_Arrears,\n" +
                    "\tass_payment.ass_Payment_LY_Warrant,\n" +
                    "\tass_payment.ass_Payment_fullTotal,\n" +
                    "\tass_payment.ass_Payment_idUser,\n" +
                    "\tass_payment.ass_cash,\n" +
                    "\tass_payment.ass_check_no,\n" +
                    "\tass_payment.ass_bank,\n" +
                    "\tbank.bank_name,\n" +
                    "\tass_payment.cd_balance,\n" +
                    "\tstreet.street_name,\n" +
                    "\tward.ward_name,\n" +
                    "\tass_payment.ass_Payment_goto_debit\n" +
                    "FROM\n" +
                    "\treceipt\n" +
                    "LEFT JOIN ass_payment ON ass_payment.Receipt_idReceipt = receipt.idReceipt\n" +
                    "LEFT JOIN assessment ON ass_payment.Assessment_idAssessment = assessment.idAssessment\n" +
                    "LEFT JOIN customer ON assessment.Customer_idCustomer = customer.idCustomer\n" +
                    "LEFT JOIN bank ON bank.idBank = ass_payment.ass_bank\n" +
                    "LEFT JOIN street ON assessment.Street_idStreet = street.idStreet\n" +
                    "LEFT JOIN ward ON assessment.Ward_idWard = ward.idWard\n" +
                    "AND street.Ward_idWard = ward.idWard\n" +
                    "WHERE\n" +
                    "\tass_payment.idass_Payment =" + pid);

            ResultSet payto = DB.getData("SELECT\n" +
                    "ass_payto.idass_payto,\n" +
                    "ass_payto.ass_payto_Qno,\n" +
                    "ass_payto.ass_payto_warrant,\n" +
                    "ass_payto.ass_payto_arrears,\n" +
                    "ass_payto.ass_payto_qvalue,\n" +
                    "ass_payto.ass_payto_discount,\n" +
                    "ass_payto.ass_payto_discount_rate,\n" +
                    "ass_payto.ass_Payment_idass_Payment,\n" +
                    "ass_payto.ass_payto_status\n" +
                    "FROM\n" +
                    "ass_payto\n" +
                    "WHERE\n" +
                    "ass_payto.ass_Payment_idass_Payment =" + pid);
            double arrias = 0;
            double warant = 0;
            double qptot = 0;
            double fullpay = 0;
            double cd = 0;
            double overnext = 0;
            double discount = 0;
            double overquater = 0;
            String chequeno = "";
            String ricitno = "";
            String day = "";
            String asno = "";
            String cus_name = "";
            String des = "";

            System.out.println("THama Data ne");


            if (data.last()) {
                System.out.println("Data thiyanawa");
                ricitno = data.getString("receipt_print_no");
                day = data.getString("receipt_day");
                asno = data.getString("ward_name") + "|" + data.getString("street_name") + "|" + data.getString("assessment_no");
                cus_name = data.getString("cus_name");
                fullpay = data.getDouble("ass_Payment_fullTotal");
                cd = data.getDouble("cd_balance");
                overnext = data.getDouble("ass_Payment_goto_debit");
                warant += data.getDouble("ass_Payment_LY_Warrant");
                arrias += data.getDouble("ass_Payment_LY_Arrears");
                chequeno = data.getString("ass_check_no");
                if (chequeno.length() > 0) {
                    chequeno += " | " + data.getString("bank_name");
                } else {
                    chequeno = "";
                }
                System.out.println("Calqulation hari");


                while (payto.next()) {
                    int paystatus = payto.getInt("ass_payto_status");
                    arrias += payto.getDouble("ass_payto_arrears");
                    warant += payto.getDouble("ass_payto_warrant");
                    if (paystatus == 1) {
                        qptot += payto.getDouble("ass_payto_qvalue");
                        des += " Q" + payto.getString("ass_payto_Qno") + ",  ";

                    } else {
                        overquater += payto.getDouble("ass_payto_qvalue");
                    }
                    discount += payto.getDouble("ass_payto_discount");
                }

                System.out.println("methana cal hari");
                fullpay += cd + overnext;

            }


            String path = "C:\\Ultimate\\Report\\assessment\\longbil.jrxml";// IN SYSTEM
            JasperReport jr = JasperCompileManager.compileReport(path);
            HashMap param = new HashMap<String, Integer>();
            param.put("pid", pid + "");
            param.put("ricitno", ricitno);
            param.put("day", day);
            param.put("asno", asno);
            param.put("cus_name", cus_name);
            param.put("arrias", modle.Round.roundToString(arrias));
            param.put("warant", modle.Round.roundToString(warant));
            param.put("qptot", modle.Round.roundToString(qptot));
            param.put("qptot", modle.Round.roundToString(qptot));
            param.put("cd", modle.Round.roundToString(cd));
            param.put("overnext", modle.Round.roundToString(overnext + overquater));
            param.put("fullpay", modle.Round.roundToString(fullpay));
            param.put("des", des);
            param.put("discount", modle.Round.roundToString(discount));
            param.put("chequeno", chequeno);


            System.out.println("Full Pay = " + fullpay);
            System.out.println("OVER Pay = " + (overnext + overquater));


            JasperPrint jp = JasperFillManager.fillReport(jr, param, this.getConnection());
            JasperPrintManager.printReport(jp, false);
            //  JasperViewer.viewReport(jp, false);

        } catch (Exception jRException) {
            jRException.printStackTrace();
            modle.ErrorLog.writeLog(jRException.getMessage(), "AssessReport", "Ricipt", "modle.assess.AssessReport");
            Notifications.create()
                    .title("Warning")
                    .text("Can not generate report. Something went wrong.\n(" + jRException.getMessage() + ")")
                    .hideAfter(Duration.seconds(3))
                    .position(Pos.BOTTOM_RIGHT).showWarning();
        }

    }

    public void getReciptPrintStrretLine(String slid, boolean print) {
        try {

            String path = "C:\\Ultimate\\Report\\streetline\\strretline.jrxml";// IN SYSTEM
            JasperReport jr = JasperCompileManager.compileReport(path);
            HashMap param = new HashMap<String, Integer>();
            param.put("reciptid", slid);
            System.out.println(slid);
            this.getConnection().commit();
            JasperPrint jp = JasperFillManager.fillReport(jr, param, this.getConnection());
            if (print) {
                JasperPrintManager.printReport(jp, false);
            } else {
                JasperViewer.viewReport(jp, false);
            }

        } catch (Exception jRException) {
            jRException.printStackTrace();
            modle.ErrorLog.writeLog(jRException.getMessage(), "AssessReport", "Ricipt", "modle.assess.AssessReport");
            //./ jRException.printStackTrace();
            Notifications.create()
                    .title("Warning")
                    .text("Can not generate report. Something went wrong.\n(" + jRException.getMessage() + ")")
                    .hideAfter(Duration.seconds(3))
                    .position(Pos.BOTTOM_RIGHT).showWarning();
        }
    }

    public void getReciptPrintNonVesting(String slid, boolean print) {
        try {

            String path = "C:\\Ultimate\\Report\\streetline\\nonvesting.jrxml";// IN SYSTEM
            JasperReport jr = JasperCompileManager.compileReport(path);
            HashMap param = new HashMap<String, Integer>();
            param.put("reciptid", slid);
            System.out.println(slid);
            this.getConnection().commit();
            JasperPrint jp = JasperFillManager.fillReport(jr, param, this.getConnection());
            if (print) {
                JasperPrintManager.printReport(jp, false);
            } else {
                JasperViewer.viewReport(jp, false);
            }

        } catch (Exception jRException) {
            jRException.printStackTrace();
            modle.ErrorLog.writeLog(jRException.getMessage(), "AssessReport", "Ricipt", "modle.assess.AssessReport");
            //./ jRException.printStackTrace();
            Notifications.create()
                    .title("Warning")
                    .text("Can not generate report. Something went wrong.\n(" + jRException.getMessage() + ")")
                    .hideAfter(Duration.seconds(3))
                    .position(Pos.BOTTOM_RIGHT).showWarning();
        }
    }


    public void getArriasReport1(ArrayList<RipHolder> holders) {
        try {

            String path = "C:\\Users\\Ranga\\JaspersoftWorkspace\\MyReports\\Assessment\\arriars_report.jrxml";// IN SYSTEM

            JasperReport jr = JasperCompileManager.compileReport(path);

            JRBeanCollectionDataSource jrBeanCollectionDataSource = new JRBeanCollectionDataSource(holders);

            HashMap param = new HashMap<String, Object>();

            param.put("Lists", jrBeanCollectionDataSource);

            JasperPrint jp = JasperFillManager.fillReport(jr, param, this.getConnection());

            JasperViewer.viewReport(jp, false);

        } catch (Exception jRException) {
            jRException.printStackTrace();
            modle.ErrorLog.writeLog(jRException.getMessage(), "AssessReport", "Ricipt", "modle.assess.AssessReport");
            //./ jRException.printStackTrace();
            Notifications.create()
                    .title("Warning")
                    .text("Can not generate report. Something went wrong.\n(" + jRException.getMessage() + ")")
                    .hideAfter(Duration.seconds(3))
                    .position(Pos.BOTTOM_RIGHT).showWarning();
        }
    }


    public void getArriasList(String list) {
        try {
            // String path = "C:\\UltimateCat\\Report\\adv_bill.jrxml";
            //  String path = "C:\\Users\\Punnajee\\JaspersoftWorkspace\\MyReports\\ultimate\\kfrom_1.jrxml";
            String path = "C:\\Ultimate\\Report\\assessment\\LYAW.jrxml";// IN SYSTEM
            JasperReport jr = JasperCompileManager.compileReport(path);
            HashMap param = new HashMap<String, Integer>();
            param.put("idList", list);
            JasperPrint jp = JasperFillManager.fillReport(jr, param, this.getConnection());
            JasperViewer.viewReport(jp, false);

        } catch (Exception jRException) {
            jRException.printStackTrace();
            Notifications.create()
                    .title("Warning")
                    .text("Can not generate report. Something went wrong.\n(" + jRException.getMessage() + ")")
                    .hideAfter(Duration.seconds(3))
                    .position(Pos.BOTTOM_RIGHT).showWarning();
        }
    }


    public void getArriasPaidList(String list) {
        try {
            // String path = "C:\\UltimateCat\\Report\\adv_bill.jrxml";
            //  String path = "C:\\Users\\Punnajee\\JaspersoftWorkspace\\MyReports\\ultimate\\kfrom_1.jrxml";
            String path = "C:\\Ultimate\\Report\\assessment\\HigaLebeem.jrxml";// IN SYSTEM
            JasperReport jr = JasperCompileManager.compileReport(path);
            HashMap param = new HashMap<String, Integer>();
            param.put("idList", list);
            JasperPrint jp = JasperFillManager.fillReport(jr, param, this.getConnection());
            JasperViewer.viewReport(jp, false);

        } catch (Exception jRException) {
            jRException.printStackTrace();
            Notifications.create()
                    .title("Warning")
                    .text("Can not generate report. Something went wrong.\n(" + jRException.getMessage() + ")")
                    .hideAfter(Duration.seconds(3))
                    .position(Pos.BOTTOM_RIGHT).showWarning();
        }
    }


    public void getVehiclepassReport(String from, String to) {
        try {
            String path = "C:\\Ultimate\\Report\\assessment\\vpass.jrxml";// IN SYSTEM
            JasperReport jr = JasperCompileManager.compileReport(path);
            HashMap param = new HashMap<String, String>();
            param.put("from", from);
            param.put("to", to);
            JasperPrint jp = JasperFillManager.fillReport(jr, param, this.getConnection());
            JasperViewer.viewReport(jp, false);

        } catch (Exception jRException) {
            jRException.printStackTrace();
            Notifications.create()
                    .title("Warning")
                    .text("Can not generate report. Something went wrong.\n(" + jRException.getMessage() + ")")
                    .hideAfter(Duration.seconds(3))
                    .position(Pos.BOTTOM_RIGHT).showWarning();
        }
    }

    public void getRiShedule(String from, String to, String username) {
        try {
            String path = "C:\\Ultimate\\Report\\assessment\\rishedule.jrxml";// IN SYSTEM
            JasperReport jr = JasperCompileManager.compileReport(path);
            HashMap param = new HashMap<String, String>();
            param.put("from", from);
            param.put("to", to);
            param.put("username", username);
            JasperPrint jp = JasperFillManager.fillReport(jr, param, this.getConnection());
            JasperViewer.viewReport(jp, false);

        } catch (Exception jRException) {
            jRException.printStackTrace();
            Notifications.create()
                    .title("Warning")
                    .text("Can not generate report. Something went wrong.\n(" + jRException.getMessage() + ")")
                    .hideAfter(Duration.seconds(3))
                    .position(Pos.BOTTOM_RIGHT).showWarning();
        }
    }

    public void getRiShedulePending(String from, String to, String username) {
        try {
            String path = "C:\\Ultimate\\Report\\assessment\\rishedule_pending.jrxml";// IN SYSTEM
            JasperReport jr = JasperCompileManager.compileReport(path);
            HashMap param = new HashMap<String, String>();
            param.put("from", from);
            param.put("to", to);
            param.put("username", username);
            JasperPrint jp = JasperFillManager.fillReport(jr, param, this.getConnection());
            JasperViewer.viewReport(jp, false);

        } catch (Exception jRException) {
            jRException.printStackTrace();
            Notifications.create()
                    .title("Warning")
                    .text("Can not generate report. Something went wrong.\n(" + jRException.getMessage() + ")")
                    .hideAfter(Duration.seconds(3))
                    .position(Pos.BOTTOM_RIGHT).showWarning();
        }
    }


    public static void loadReportByDataSource(ArrayList<RipHolder> list) {

        try {
            String current_arriars_report_path = KeyVal.getVal("current_arriars_report_path");

            String path = current_arriars_report_path;// IN SYSTEM
            JasperReport jr = JasperCompileManager.compileReport(path);
            HashMap param = new HashMap<String, String>();

            JRDataSource jrDataSource = new JRBeanCollectionDataSource(list);

            JasperPrint jp = JasperFillManager.fillReport(jr, param, jrDataSource);
            JasperViewer.viewReport(jp, false);

        } catch (Exception jRException) {
            jRException.printStackTrace();
        }


    }

    public static void loadReportAWPayByDatasourc(ArrayList<RipHolder> list, String from, String to) {

        try {

            String path = "C:\\Ultimate\\Report\\assessment\\AWPay.jrxml";// IN SYSTEM
            JasperReport jr = JasperCompileManager.compileReport(path);
            HashMap param = new HashMap<String, String>();
            param.put("from", from);
            param.put("to", to);

            JRDataSource jrDataSource = new JRBeanCollectionDataSource(list);

            JasperPrint jp = JasperFillManager.fillReport(jr, param, jrDataSource);
            JasperViewer.viewReport(jp, false);

        } catch (Exception jRException) {
            jRException.printStackTrace();
        }


    }

    public static void loadReportAWPayByDatasourcAndUser(ArrayList<RipHolder> list, String from, String to, String ri_name) {

        try {

            String path = "C:\\Ultimate\\Report\\assessment\\AWPayByUser.jrxml";// IN SYSTEM
            JasperReport jr = JasperCompileManager.compileReport(path);
            HashMap param = new HashMap<String, String>();
            param.put("from", from);
            param.put("to", to);
            param.put("ri_name", ri_name);

            JRDataSource jrDataSource = new JRBeanCollectionDataSource(list);

            JasperPrint jp = JasperFillManager.fillReport(jr, param, jrDataSource);
            JasperViewer.viewReport(jp, false);

        } catch (Exception jRException) {
            jRException.printStackTrace();
        }


    }

    public void RiBill(String idRibill, String billnos, String chequeno, boolean print) {
        try {


            String RI_bill_path = KeyVal.getVal("RI_bill_path");

            String path = RI_bill_path;// IN SYSTEM


            JasperReport jr = JasperCompileManager.compileReport(path);
            HashMap param = new HashMap<String, String>();
            param.put("idRibill", idRibill);
            param.put("billnos", billnos);
            param.put("chequeno", chequeno);

            Connection connection = this.getConnection();
            connection.commit();

            JasperPrint jp = JasperFillManager.fillReport(jr, param, connection);
            if (print) {
                JasperPrintManager.printReport(jp, false);
            } else {
                JasperViewer.viewReport(jp, false);
            }

        } catch (Exception jRException) {
            jRException.printStackTrace();
        }


    }


}
