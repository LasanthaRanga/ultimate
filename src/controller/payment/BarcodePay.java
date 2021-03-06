package controller.payment;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import conn.DB;
import controller.assess.DayendController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import modle.GetInstans;
import modle.Payment.StaticPay;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import pojo.AdvAdvertising;
import pojo.Customer;

import java.net.URL;
import java.sql.ResultSet;

import java.util.HashMap;
import java.util.ResourceBundle;

public class BarcodePay implements Initializable {


    @FXML
    private JFXRadioButton radio_print;

    @FXML
    private ToggleGroup PrintView;

    @FXML
    private JFXRadioButton radio_view;

    @FXML
    private JFXTextField txt_barcode;

    @FXML
    private Text txt_tot;

    @FXML
    private Text txt_dis1;

    @FXML
    private Text txt_dis2;

    @FXML
    private Text txt_dis3;

    @FXML
    private Text txt_dis4;

    @FXML
    private JFXButton btn_pay;

    @FXML
    private JFXButton btn_print;

    @FXML
    private JFXTextField txt_rn;


    public int catid;
    public int idRecipt;
    public int appid;

    public static DayendController dec;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        radio_print.setSelected(modle.StaticViews.isPrint());

        btn_print.setDisable(true);
        btn_pay.setDisable(true);

        dec = new DayendController();
        String idrecit = StaticPay.id_ricit;
        if (idrecit != null) {

        }
        modle.StaticViews.getMc().changeTitle("Barcode Pay");
    }

    @FXML
    void receiptEnter(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            try {

                String text = txt_rn.getText();

                ResultSet data = DB.getData("SELECT receipt.idReceipt FROM receipt WHERE receipt.receipt_print_no = '" + text + "'");

                if (data.last()) {
                    String idReceipt = data.getString("idReceipt");
                    txt_barcode.setText(idReceipt);
                    barcodeEntered(event);
                } else {
                    modle.Allert.notificationWorning("Not found", text);
                }


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    @FXML
    void barcodeEntered(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            System.out.println("barcode enter");
            loadDataByEnter();

        }
    }


    @FXML
    void clickOnPay(MouseEvent event) {
        switch (catid) {
            case 1:
                new modle.adv.Report().pringAdvBill(appid, false);
                modle.GetInstans.getAdvPayModle().compleetePayment(idRecipt);
                modle.Allert.notificationGood("Completed", "Advertising " + idRecipt);
                clearAll();
                break;
            case 2:
                recitPaid(idRecipt);
                dec.reprintAssessBill(idRecipt + "", false);
                modle.Allert.notificationGood("Completed", "Assessment " + idRecipt);
                clearAll();
                break;
            case 3:
                modle.Payment.PaymentByID.genarateRisiptNo(3, "", appid);
                updateBOP(appid);
                modle.GetInstans.getAssessReport().getReciptPrintNonVesting(idRecipt + "", false);
                modle.Allert.notificationGood("Completed", "BOP " + idRecipt);
                clearAll();
                break;
            case 4:


                break;
            case 5:


                break;
            case 7:
                modle.Payment.PaymentByID.genarateRisiptNo(7, "", appid);
                updateStreetLineStatus(appid);
                modle.GetInstans.getAssessReport().getReciptPrintStrretLine(idRecipt + "", false);
                modle.Allert.notificationGood("Completed", "Street Line " + idRecipt);
                clearAll();
                break;
            case 9:
                modle.Payment.PaymentByID.genarateRisiptNo(9, "", appid);
                modle.GetInstans.getMixPrasaThre().updateMixIncomeStatus(appid, 9);
                modle.GetInstans.getGenarateRecipt().genarateRecipt(idRecipt, false);
                modle.Allert.notificationGood("Completed", "Mix Income " + idRecipt);
                clearAll();
                break;

            case 10:
                modle.Payment.PaymentByID.genarateRisiptNo(10, "", appid);
                modle.book.Recipt.genarateBookingRecipt(idRecipt + "", false);
                modle.Allert.notificationGood("Completed", "Booking " + idRecipt);
                modle.book.Recipt.addToPrasa(idRecipt);
                clearAll();
                break;


            case 12:

                System.out.println("Water");

                break;


            case 13:
                modle.GetInstans.getRiBillComplete().completeRi(idRecipt + "");
                new modle.asses.RiBillPrint().PrintRiBill(idRecipt, false);
                modle.Allert.notificationGood("Completed", "Assessment RI " + idRecipt);
                clearAll();
                break;

            case 14:
                modle.Payment.PaymentByID.genarateRisiptNo(14, "", appid);
                updateNonVesting(appid);
                modle.GetInstans.getAssessReport().getReciptPrintNonVesting(idRecipt + "", false);
                modle.Allert.notificationGood("Completed", "Non Vesting " + idRecipt);
                clearAll();
                break;


            default:
                break;
        }

    }


    @FXML
    void clickOnPrint(MouseEvent event) {
        switch (catid) {
            case 1:
                new modle.adv.Report().pringAdvBill(appid, false);
                clearAll();
                break;
            case 2:
                dec.reprintAssessBill(idRecipt + "", false);
                clearAll();
                break;
            case 3:
                modle.GetInstans.getAssessReport().getReciptPrintNonVesting(idRecipt + "", false);
                clearAll();
                break;

            case 4:


                break;

            case 7:
                modle.GetInstans.getAssessReport().getReciptPrintStrretLine(idRecipt + "", false);
                clearAll();
                break;

            case 8:


                break;

            case 9:
                modle.GetInstans.getGenarateRecipt().genarateRecipt(idRecipt, false);
                clearAll();
                break;

            case 10:
                modle.book.Recipt.genarateBookingRecipt(idRecipt + "", false);
                clearAll();
                break;

            case 13:
                new modle.asses.RiBillPrint().PrintRiBill(idRecipt, false);
                clearAll();
                break;

            case 14:
                modle.GetInstans.getAssessReport().getReciptPrintNonVesting(idRecipt + "", false);
                clearAll();
                break;


            default:
                break;
        }

    }


    @FXML
    void radioOnAction(ActionEvent event) {

        if (radio_view.isSelected()) {
            modle.StaticViews.setPrint(false);
        }

        if (radio_print.isSelected()) {
            modle.StaticViews.setPrint(true);
        }


    }


    public void loadDataByEnter() {

        String text = txt_barcode.getText();
        String[] ss = text.split("_");
        if (ss.length > 1) {
            String s = ss[1];
            System.out.println(s);
            String idRi = ss[0];
            modle.Allert.notificationGood("RI Assessment Receipt", text);
            riBillData(idRi);

        } else {
            String qq = "SELECT\n" +
                    "receipt.idReceipt,\n" +
                    "receipt.Application_Catagory_idApplication_Catagory,\n" +
                    "receipt.recept_applicationId,\n" +
                    "receipt.receipt_print_no,\n" +
                    "receipt.cheack,\n" +
                    "receipt.cesh,\n" +
                    "receipt.receipt_total,\n" +
                    "receipt.receipt_day,\n" +
                    "receipt.receipt_status,\n" +
                    "receipt.receipt_syn,\n" +
                    "receipt.chque_no,\n" +
                    "receipt.chque_date,\n" +
                    "receipt.chque_bank\n" +
                    "FROM\n" +
                    "receipt where idReceipt = " + text;

            try {
                ResultSet rd = DB.getData(qq);

                if (rd.last()) {
                    catid = rd.getInt("Application_Catagory_idApplication_Catagory");
                    int receipt_status = rd.getInt("receipt_status");


                    switch (catid) {
                        case 1:
                            ViewAdvBillDetails(text);
                            break;
                        case 2:
                            assessmentTaxBil(text);
                            break;
                        case 3:
                            bop(text);
                            break;

                        case 4:
                            //Shop Rent
                            shopRent(text);
                            break;

                        case 5:

                            break;

                        case 6:
                            //Trade Licens
                            tradeLicens(text);
                            break;

                        case 7:
                            streetLine2(text);
                            break;

                        case 8:
                            if (radio_print.isSelected()) {
                                modle.GetInstans.getThreweel().getVehiclepassReport(text + "", true);
                            } else {
                                modle.GetInstans.getThreweel().getVehiclepassReport(text + "", false);
                            }
                            clearAll();
                            break;

                        case 9:
                            mixIncomeBillData(text);
                            break;

                        case 12:
                            System.out.println("Water Bill" + text);
                            waterBillInfo(receipt_status, text);


                            break;


                        case 10:
                            viewBookingDetails(text);
                            break;

                        case 14:
                            nonvesting(text);
                            break;

                        default:
                            break;
                    }

                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
            }
        }
    }


    public void waterBillInfo(int status, String text) {

        if (status == 0) {
            // payAnable();
            waterBill(text, true);
        } else {
            //  printAnable();
            waterBill(text, false);
        }


    }


    public void waterBill(String text, boolean pay) {
        //print recipt
        HashMap<String, String> hm = new HashMap<>();
        hm.put("id", text);
        modle.book.Recipt.waterRecipt(hm, false);
        if (pay) {
            try {
                ResultSet selected = DB.getData("SELECT\n" +
                        "\twb_process_pay.wb_process_pay_LYA_bal,\n" +
                        "\twb_process_pay.wb_process_pay_LMA_bal,\n" +
                        "\twb_process_pay.wb_process_pay_TMA_bal,\n" +
                        "\twb_process_pay.wb_process_pay_VAT,\n" +
                        "\twb_process_pay.wb_process_pay_NBT,\n" +
                        "\twb_process_pay.wb_process_pay_STAMP,\n" +
                        "\twb_process_pay.wb_process_pay_com_status,\n" +
                        "\twb_process_pay.wb_process_pay_OP,\n" +
                        "\twb_process_pay.wb_process_pay_proc_id,\n" +
                        "\twb_process_pay.wb_process_pay_complete_process_get,\n" +
                        "\twb_process_pay.wb_process_pay_con_id,\n" +
                        "\twb_process_pay.wb_process_pay_id\n" +
                        "FROM\n" +
                        "wb_process_pay\n" +
                        "INNER JOIN receipt ON wb_process_pay.wb_process_pay_receipt_no = receipt.receipt_print_no\n" +
                        "WHERE\n" +
                        "receipt.idReceipt = '" + text + "'");

                while (selected.next()) {
                    double wb_process_pay_lya_bal = selected.getDouble("wb_process_pay_LYA_bal");
                    double wb_process_pay_lma_bal = selected.getDouble("wb_process_pay_LMA_bal");
                    double wb_process_pay_tma_bal = selected.getDouble("wb_process_pay_TMA_bal");
                    double wb_process_pay_vat = selected.getDouble("wb_process_pay_VAT");
                    double wb_process_pay_nbt = selected.getDouble("wb_process_pay_NBT");
                    double wb_process_pay_stamp = selected.getDouble("wb_process_pay_STAMP");
                    int wb_process_pay_com_status = selected.getInt("wb_process_pay_com_status");
                    double wb_process_pay_op = selected.getDouble("wb_process_pay_OP");
                    int wb_process_pay_proc_id = selected.getInt("wb_process_pay_proc_id");
                    int wb_process_pay_complete_process_get = selected.getInt("wb_process_pay_complete_process_get");
                    int wb_process_pay_con_id = selected.getInt("wb_process_pay_con_id");
                    int wb_process_pay_id = selected.getInt("wb_process_pay_id");


                    conn.DB.setData("UPDATE `wb_process_tbl` \n" +
                            "SET `wb_process_tbl_LYA_bal` = '" + wb_process_pay_lya_bal + "',\n" +
                            "`wb_process_tbl_LMA_bal` = '" + wb_process_pay_lma_bal + "',\n" +
                            "`wb_process_tbl_TMA_bal` = '" + wb_process_pay_tma_bal + "',\n" +
                            "`wb_process_tbl_VAT` = `wb_process_tbl_VAT` + '" + wb_process_pay_vat + "',\n" +
                            "`wb_process_tbl_NBT` = `wb_process_tbl_NBT` + '" + wb_process_pay_nbt + "',\n" +
                            "`wb_process_tbl_STAMP` = `wb_process_tbl_STAMP` + '" + wb_process_pay_stamp + "',\n" +
                            "`wb_process_tbl_com_status` = '" + wb_process_pay_com_status + "' \n" +
                            "WHERE\n" +
                            "\t`wb_process_tbl_id` = '" + wb_process_pay_proc_id + "'");


                    conn.DB.setData("UPDATE `wb_opay` \n" +
                            "SET `wb_opay_amount` = '" + wb_process_pay_op + "' \n" +
                            "WHERE\n" +
                            "\t( `wb_opay_con_id` = '" + wb_process_pay_con_id + "' ) ");


                    conn.DB.setData("UPDATE `wb_process_pay` \n" +
                            "SET `wb_process_pay_complete_process_get` = '1' \n" +
                            "WHERE\n" +
                            "\t( `wb_process_pay_id` = '" + wb_process_pay_id + "' ) ");
                }

                conn.DB.setData("UPDATE `wb_t_paid` SET `wb_t_complete_status`='1' WHERE `wb_t_receipt_id`='" + text + "'");
                conn.DB.setData("UPDATE `wb_t_payment` SET `wb_t_pay_complete_or_not`='1' WHERE `wb_t_receipt_id_payment`='" + text + "'");
                conn.DB.setData("UPDATE `account_ps_three` SET `report_status`='1'  WHERE `report_ricipt_id` = '" + text + "'");
                conn.DB.setData("UPDATE `receipt` SET `receipt_status`='1' WHERE `idReceipt`='" + text + "'");

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
            }
        }

        // update data


    }


    public void viewBookingDetails(String text) {
        try {
            ResultSet data = DB.getData("SELECT\n" +
                    "\tbook.idbook,\n" +
                    "\tbook.book_date,\n" +
                    "\tbook.customer_idCustomer,\n" +
                    "\tbook.book_amount,\n" +
                    "\tbook.book_diposit,\n" +
                    "\tbook.book_vat,\n" +
                    "\tbook.book_nbt,\n" +
                    "\tbook.book_stamp,\n" +
                    "\tbook.book_total,\n" +
                    "\tbook.book_cash,\n" +
                    "\tbook.book_chque,\n" +
                    "\tbook.book_chque_no,\n" +
                    "\tbook.book_book_pay_status,\n" +
                    "\tbook.book_book_status,\n" +
                    "\tbook.book_idRecipt,\n" +
                    "\tbook.book_reson_idbook_reson,\n" +
                    "\tbook.book_place_idbook_place,\n" +
                    "\tcustomer.cus_name,\n" +
                    "\treceipt.idReceipt,\n" +
                    "\treceipt.receipt_total,\n" +
                    "\treceipt.receipt_status,\n" +
                    "\tbook.book_pay_type,\n" +
                    "\tbook.book_idUser\n" +
                    "FROM\n" +
                    "\tbook\n" +
                    "INNER JOIN customer ON customer.idCustomer = book.customer_idCustomer\n" +
                    "INNER JOIN receipt ON receipt.recept_applicationId = book.idbook\n" +
                    "WHERE\n" +
                    "\treceipt.idReceipt =" + text);

            if (data.last()) {
                if (data.getInt("receipt_status") == 0) {

                    modle.Allert.notificationGood("Booking Receipt", text);
                    int book_pay_type = data.getInt("book_pay_type");

                    catid = 10;
                    appid = data.getInt("idbook");
                    idRecipt = Integer.parseInt(text);
                    txt_tot.setText(data.getString("receipt_total"));
                    txt_dis1.setText(data.getString("cus_name"));
                    double fullTot = data.getDouble("receipt_total");
                    if (radio_print.isSelected()) {
                        modle.Payment.PaymentByID.genarateRisiptNo(10, "", appid);
                        modle.book.Recipt.genarateBookingRecipt(idRecipt + "", true);
                        modle.Allert.notificationGood("Completed", "Booking " + idRecipt);
                        modle.book.Recipt.addToPrasa(idRecipt);
                        clearAll();
                    } else {
                        payAnable();
                    }
                } else if (data.getInt("receipt_status") == 1) {
                    catid = 10;
                    appid = data.getInt("idbook");
                    idRecipt = Integer.parseInt(text);
                    txt_tot.setText(data.getString("receipt_total"));
                    txt_dis1.setText(data.getString("cus_name"));
                    double fullTot = data.getDouble("receipt_total");
                    printAnable();

                } else {
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

    }


    public void nonvesting(String text) {
        String query = "SELECT\n" +
                "\treceipt.idReceipt,\n" +
                "\treceipt.Application_Catagory_idApplication_Catagory,\n" +
                "\treceipt.recept_applicationId,\n" +
                "\treceipt.receipt_print_no,\n" +
                "\treceipt.cheack,\n" +
                "\treceipt.cesh,\n" +
                "\treceipt.receipt_total,\n" +
                "\treceipt.receipt_day,\n" +
                "\treceipt.receipt_status,\n" +
                "\treceipt.receipt_syn,\n" +
                "\treceipt.chque_no,\n" +
                "\treceipt.chque_date,\n" +
                "\treceipt.chque_bank,\n" +
                "\treceipt.oder,\n" +
                "\treceipt.office_idOffice,\n" +
                "\tsl_details.idStreetLine,\n" +
                "\tsl_details.ass_id,\n" +
                "\tsl_details.slDate,\n" +
                "\tsl_details.sllotNo,\n" +
                "\tsl_details.slPlanNo,\n" +
                "\tsl_details.slDescription,\n" +
                "\tsl_details.slDeposit,\n" +
                "\tsl_details.slAmount,\n" +
                "\tsl_details.slVat,\n" +
                "\tsl_details.slNbt,\n" +
                "\tsl_details.slStamp,\n" +
                "\tsl_details.slOther1,\n" +
                "\tsl_details.slOther2,\n" +
                "\tsl_details.slApproveToPay,\n" +
                "\tsl_details.slServayOfficer,\n" +
                "\tsl_details.slServayDate,\n" +
                "\tsl_details.slPersonTitle,\n" +
                "\tsl_details.slYesNo_id,\n" +
                "\tsl_details.slStatus,\n" +
                "\tsl_details.office_idOffice,\n" +
                "\tsl_details.customer_idCustomer,\n" +
                "\tsl_details.sl_reference_no,\n" +
                "\tsl_details.slApproveDescription,\n" +
                "\tcustomer.cus_name\n" +
                "FROM\n" +
                "\treceipt\n" +
                "INNER JOIN sl_details ON receipt.recept_applicationId = sl_details.idStreetLine\n" +
                "INNER JOIN customer ON sl_details.customer_idCustomer = customer.idCustomer\n" +
                "WHERE\n" +
                "\treceipt.Application_Catagory_idApplication_Catagory = '14'\n" +
                "AND receipt.idReceipt = " + text;
        try {
            ResultSet data = DB.getData(query);

            if (data.last()) {
                if (data.getInt("receipt_status") == 0) {
                    catid = data.getInt("Application_Catagory_idApplication_Catagory");
                    appid = data.getInt("recept_applicationId");
                    double fullTot = data.getDouble("receipt_total");
                    idRecipt = data.getInt("idReceipt");
                    txt_dis1.setText(data.getString("cus_name"));
                    txt_tot.setText(fullTot + "");

                    if (radio_print.isSelected()) {
                        modle.Payment.PaymentByID.genarateRisiptNo(14, "", appid);
                        updateNonVesting(appid);
                        modle.GetInstans.getAssessReport().getReciptPrintNonVesting(idRecipt + "", true);
                        modle.Allert.notificationGood("Completed", "Non Vesting " + idRecipt);
                        clearAll();
                    } else {
                        payAnable();
                    }
                } else if (data.getInt("receipt_status") == 1) {
                    catid = data.getInt("Application_Catagory_idApplication_Catagory");
                    appid = data.getInt("recept_applicationId");
                    double fullTot = data.getDouble("receipt_total");
                    idRecipt = data.getInt("idReceipt");
                    txt_dis1.setText(data.getString("cus_name"));
                    txt_tot.setText(fullTot + "");
                    printAnable();
                } else {

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }


    }


    public void bop(String text) {
        String query = "SELECT\n" +
                "receipt.idReceipt,\n" +
                "receipt.Application_Catagory_idApplication_Catagory,\n" +
                "receipt.recept_applicationId,\n" +
                "receipt.receipt_print_no,\n" +
                "receipt.cheack,\n" +
                "receipt.cesh,\n" +
                "receipt.receipt_total,\n" +
                "receipt.receipt_day,\n" +
                "receipt.receipt_status,\n" +
                "receipt.receipt_syn,\n" +
                "receipt.chque_no,\n" +
                "receipt.chque_date,\n" +
                "receipt.chque_bank,\n" +
                "receipt.oder,\n" +
                "receipt.office_idOffice,\n" +
                "receipt.receipt_account_id,\n" +
                "receipt.receipt_user_id,\n" +
                "bop.idBOP,\n" +
                "customer.cus_name,\n" +
                "bop.BOP_total_price\n" +
                "FROM\n" +
                "receipt\n" +
                "INNER JOIN bop ON bop.idBOP = receipt.recept_applicationId\n" +
                "INNER JOIN customer ON bop.Customer_idCustomer = customer.idCustomer WHERE idReceipt =" + text;
        try {
            ResultSet data = DB.getData(query);

            if (data.last()) {
                if (data.getInt("receipt_status") == 0) {
                    catid = data.getInt("Application_Catagory_idApplication_Catagory");
                    appid = data.getInt("recept_applicationId");
                    double fullTot = data.getDouble("receipt_total");
                    idRecipt = data.getInt("idReceipt");
                    txt_dis1.setText(data.getString("cus_name"));
                    txt_tot.setText(fullTot + "");
                    if (radio_print.isSelected()) {
                        modle.Payment.PaymentByID.genarateRisiptNo(3, "", appid);
                        updateNonVesting(appid);
                        modle.GetInstans.getAssessReport().getReciptPrintNonVesting(idRecipt + "", true);
                        modle.Allert.notificationGood("Completed", "BOP " + idRecipt);
                        clearAll();
                    } else {
                        payAnable();
                    }
                } else if (data.getInt("receipt_status") == 1) {
                    catid = data.getInt("Application_Catagory_idApplication_Catagory");
                    appid = data.getInt("recept_applicationId");
                    double fullTot = data.getDouble("receipt_total");
                    idRecipt = data.getInt("idReceipt");
                    txt_dis1.setText(data.getString("cus_name"));
                    txt_tot.setText(fullTot + "");
                    printAnable();
                } else {

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }


    }


    public void updateBOP(int appid) {
        String ss = "SELECT\n" +
                "bop.idBOP,\n" +
                "doc_hand_approve.approve_doc_hand_id\n" +
                "FROM\n" +
                "bop\n" +
                "INNER JOIN doc_hand_approve ON bop.idBOP = doc_hand_approve.doc_hand_subject_id\n" +
                "WHERE\n" +
                "bop.idBOP = " + appid;

        try {
            ResultSet data = DB.getData(ss);
            if (data.last()) {
                int approve_doc_hand_id = data.getInt("approve_doc_hand_id");

                conn.DB.setData("UPDATE `doc_hand_approve`\n" +
                        "SET `doc_hand_recevied_user_category` = '5',\n" +
                        " `doc_hand_accept_or_reject` = '4'\n" +
                        "WHERE\n" +
                        "\t(`approve_doc_hand_id` = '" + approve_doc_hand_id + "')");
            }

            ResultSet data1 = DB.getData("SELECT\n" +
                    "receipt.idReceipt,\n" +
                    "receipt.receipt_print_no,\n" +
                    "receipt.receipt_day,\n" +
                    "bop.idBOP\n" +
                    "FROM\n" +
                    "receipt\n" +
                    "INNER JOIN bop ON receipt.recept_applicationId = bop.idBOP\n" +
                    "WHERE\n" +
                    "receipt.Application_Catagory_idApplication_Catagory = 3 AND\n" +
                    "bop.idBOP = " + appid);

            if (data1.last()) {
                int idReceipt = data1.getInt("idReceipt");
                String receipt_day = data1.getString("receipt_day");
                String receipt_print_no = data1.getString("receipt_print_no");
                conn.DB.setData("UPDATE `account_ps_three`\n" +
                        "SET `report_date` = '" + receipt_day + "',\n" +
                        " `report_ricipt_no` = '" + receipt_print_no + "',\n" +
                        " `report_status` = '1'\n" +
                        "WHERE\n" +
                        "\t`report_ricipt_id` = '" + idReceipt + "'");
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }


    }


    public void updateNonVesting(int appid) {

        String ss = "SELECT\n" +
                "sl_details.idStreetLine,\n" +
                "doc_hand_approve.approve_doc_hand_id\n" +
                "FROM\n" +
                "sl_details\n" +
                "INNER JOIN doc_hand_approve ON sl_details.idStreetLine = doc_hand_approve.doc_hand_subject_id\n" +
                "WHERE\n" +
                "sl_details.idStreetLine = " + appid;

        try {
            ResultSet data = DB.getData(ss);
            if (data.last()) {
                int approve_doc_hand_id = data.getInt("approve_doc_hand_id");

                conn.DB.setData("UPDATE `doc_hand_approve`\n" +
                        "SET \n" +
                        " `doc_hand_accept_or_reject` = '4' \n" +
                        "WHERE\n" +
                        "\t(`approve_doc_hand_id` = '" + approve_doc_hand_id + "')");


            }

            ResultSet data1 = DB.getData("SELECT\n" +
                    "receipt.idReceipt,\n" +
                    "sl_details.idStreetLine,\n" +
                    "receipt.receipt_print_no,\n" +
                    "receipt.receipt_day\n" +
                    "FROM\n" +
                    "receipt\n" +
                    "INNER JOIN sl_details ON sl_details.idStreetLine = receipt.recept_applicationId\n" +
                    "WHERE\n" +
                    "receipt.Application_Catagory_idApplication_Catagory = 14 AND\n" +
                    "sl_details.idStreetLine = '" + appid + "'");

            if (data1.last()) {
                int idReceipt = data1.getInt("idReceipt");
                String receipt_day = data1.getString("receipt_day");
                String receipt_print_no = data1.getString("receipt_print_no");
                conn.DB.setData("UPDATE `account_ps_three`\n" +
                        "SET `report_date` = '" + receipt_day + "',\n" +
                        " `report_ricipt_no` = '" + receipt_print_no + "',\n" +
                        " `report_status` = '1', income_or_expence='1' \n" +
                        "WHERE\n" +
                        "\t`report_ricipt_id` = '" + idReceipt + "'");
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }


    }

    public void mixIncomeBillData(String text) {
        try {

            ResultSet data = DB.getData("SELECT\n" +
                    "\treceipt.recept_applicationId,\n" +
                    "\tmixincome.idMixincome,\n" +
                    "\treceipt.idReceipt,\n" +
                    "\treceipt.Application_Catagory_idApplication_Catagory,\n" +
                    "\treceipt.receipt_print_no,\n" +
                    "\treceipt.cheack,\n" +
                    "\treceipt.cesh,\n" +
                    "\treceipt.receipt_total,\n" +
                    "\treceipt.receipt_day,\n" +
                    "\treceipt.receipt_status,\n" +
                    "\treceipt.receipt_syn,\n" +
                    "\treceipt.chque_no,\n" +
                    "\treceipt.chque_date,\n" +
                    "\treceipt.chque_bank,\n" +
                    "\tmixincome.mixincome_date,\n" +
                    "\tmixincome.mixincome_fulltotal,\n" +
                    "\tmixincome.mixincome_status,\n" +
                    "\tmixincome.mixincome_year,\n" +
                    "\tmixincome.customer_idCustomer,\n" +
                    "\tmixincome.mixincome_userid,\n" +
                    "\tcustomer.idCustomer,\n" +
                    "\tcustomer.cus_name,\n" +
                    "\tcustomer.cus_nic,\n" +
                    "\tcustomer.cus_mobile,\n" +
                    "\tcustomer.cus_tel,\n" +
                    "\tcustomer.cus_address_l1,\n" +
                    "\tcustomer.cus_address_l2,\n" +
                    "\tcustomer.cus_address_l3,\n" +
                    "\tcustomer.cus_sity,\n" +
                    "\tcustomer.cus_status,\n" +
                    "\tcustomer.cus_syn,\n" +
                    "\tcustomer.cus_reg_date,\n" +
                    "\tcustomer.cus_update_date,\n" +
                    "\tcustomer.cus_name_sinhala,\n" +
                    "\tcustomer.cus_address_l1_sinhala,\n" +
                    "\tcustomer.cus_address_l2_sinhala,\n" +
                    "\tcustomer.cus_address_l3_sinhala,\n" +
                    "\tmixincome.mixincome_paytype\n" +
                    "FROM\n" +
                    "\treceipt\n" +
                    "INNER JOIN mixincome ON mixincome.idMixincome = receipt.recept_applicationId\n" +
                    "INNER JOIN customer ON customer.idCustomer = mixincome.customer_idCustomer\n" +
                    "WHERE\n" +
                    "\treceipt.idReceipt =" + text);

            if (data.last()) {
                int receipt_status = data.getInt("receipt_status");

                if (receipt_status == 0) {
                    int mixincome_paytype = data.getInt("mixincome_paytype");
                    catid = data.getInt("Application_Catagory_idApplication_Catagory");
                    appid = data.getInt("recept_applicationId");
                    double fullTot = data.getDouble("receipt_total");
                    idRecipt = data.getInt("idReceipt");
                    txt_dis1.setText(data.getString("cus_name"));
                    txt_tot.setText(fullTot + "");
                    if (radio_print.isSelected()) {
                        modle.Payment.PaymentByID.genarateRisiptNo(9, "", appid);
                        modle.GetInstans.getMixPrasaThre().updateMixIncomeStatus(appid, 9);
                        modle.Allert.notificationGood("Completed", "Mix Income " + idRecipt);
                        modle.GetInstans.getGenarateRecipt().genarateRecipt(idRecipt, true);
                        clearAll();
                    } else {
                        payAnable();
                    }
                } else if (receipt_status == 1) {
                    catid = data.getInt("Application_Catagory_idApplication_Catagory");
                    appid = data.getInt("recept_applicationId");
                    double fullTot = data.getDouble("receipt_total");
                    idRecipt = data.getInt("idReceipt");
                    txt_dis1.setText(data.getString("cus_name"));
                    txt_tot.setText(fullTot + "");
                    printAnable();
                } else {
                }


            } else {
                modle.Allert.notificationInfo("NO Receipt", "");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void shopRent(String text) {

        //  modle.GetInstans.getBillComplete().shopRentBillPrintAndComplete(text, true);

        completeShopRent(text);

        if (radio_print.isSelected()) {
            modle.GetInstans.getBillComplete().loadShopRentBill(text, true);
        } else {
            modle.GetInstans.getBillComplete().loadShopRentBill(text, false);
        }

    }


    public void tradeLicens(String text) {
        modle.GetInstans.getBillComplete().tradeLicensBill(text, true);
    }


    public void streetLine2(String text) {
        String query = "SELECT\n" +
                "\treceipt.idReceipt,\n" +
                "\treceipt.Application_Catagory_idApplication_Catagory,\n" +
                "\treceipt.recept_applicationId,\n" +
                "\treceipt.receipt_print_no,\n" +
                "\treceipt.cheack,\n" +
                "\treceipt.cesh,\n" +
                "\treceipt.receipt_total,\n" +
                "\treceipt.receipt_day,\n" +
                "\treceipt.receipt_status,\n" +
                "\treceipt.receipt_syn,\n" +
                "\treceipt.chque_no,\n" +
                "\treceipt.chque_date,\n" +
                "\treceipt.chque_bank,\n" +
                "\treceipt.oder,\n" +
                "\treceipt.office_idOffice,\n" +
                "\tsl_details.idStreetLine,\n" +
                "\tsl_details.ass_id,\n" +
                "\tsl_details.slDate,\n" +
                "\tsl_details.sllotNo,\n" +
                "\tsl_details.slPlanNo,\n" +
                "\tsl_details.slDescription,\n" +
                "\tsl_details.slDeposit,\n" +
                "\tsl_details.slAmount,\n" +
                "\tsl_details.slVat,\n" +
                "\tsl_details.slNbt,\n" +
                "\tsl_details.slStamp,\n" +
                "\tsl_details.slOther1,\n" +
                "\tsl_details.slOther2,\n" +
                "\tsl_details.slApproveToPay,\n" +
                "\tsl_details.slServayOfficer,\n" +
                "\tsl_details.slServayDate,\n" +
                "\tsl_details.slPersonTitle,\n" +
                "\tsl_details.slYesNo_id,\n" +
                "\tsl_details.slStatus,\n" +
                "\tsl_details.office_idOffice,\n" +
                "\tsl_details.customer_idCustomer,\n" +
                "\tsl_details.sl_reference_no,\n" +
                "\tsl_details.slApproveDescription,\n" +
                "\tcustomer.cus_name\n" +
                "FROM\n" +
                "\treceipt\n" +
                "INNER JOIN sl_details ON receipt.recept_applicationId = sl_details.idStreetLine\n" +
                "INNER JOIN customer ON sl_details.customer_idCustomer = customer.idCustomer\n" +
                "WHERE\n" +
                "\treceipt.Application_Catagory_idApplication_Catagory = '7'\n" +
                "AND receipt.idReceipt = " + text;
        try {
            ResultSet data = DB.getData(query);

            if (data.last()) {
                int receipt_status = data.getInt("receipt_status");
                if (receipt_status == 0) {
                    catid = data.getInt("Application_Catagory_idApplication_Catagory");
                    appid = data.getInt("recept_applicationId");
                    double fullTot = data.getDouble("receipt_total");
                    idRecipt = data.getInt("idReceipt");
                    txt_dis1.setText(data.getString("cus_name"));
                    txt_tot.setText(fullTot + "");
                    if (radio_print.isSelected()) {

                        modle.Payment.PaymentByID.genarateRisiptNo(7, "", appid);
                        updateStreetLineStatus(appid);
                        modle.GetInstans.getAssessReport().getReciptPrintStrretLine(idRecipt + "", true);
                        modle.Allert.notificationGood("Completed", "Street Line " + idRecipt);
                        // updateReciptNewCollom(idRecipt, 1, 1, 1, fullTot);

                        clearAll();
                    } else {
                        payAnable();
                    }
                } else if (receipt_status == 1) {
                    catid = data.getInt("Application_Catagory_idApplication_Catagory");
                    appid = data.getInt("recept_applicationId");
                    double fullTot = data.getDouble("receipt_total");
                    idRecipt = data.getInt("idReceipt");
                    txt_dis1.setText(data.getString("cus_name"));
                    txt_tot.setText(fullTot + "");
                    printAnable();
                } else {

                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }


    }

    public void completeShopRent(String idRecipt) {
        String qu = "SELECT\n" +
                "sr_shop_payment.sr_shop_proc_id1,\n" +
                "sr_shop_payment.sr_shop_paid_arrears_bal,\n" +
                "sr_shop_payment.sr_shop_paid_fine_bal,\n" +
                "sr_shop_payment.sr_shop_paid_rental_tot_bal,\n" +
                "sr_shop_payment.sr_shop_paid_over_pay_bal,\n" +
                "sr_shop_payment.sr_shop_paid_proc_complete,\n" +
                "receipt.idReceipt,\n" +
                "receipt.Application_Catagory_idApplication_Catagory,\n" +
                "receipt.receipt_print_no\n" +
                "FROM\n" +
                "sr_shop_payment\n" +
                "INNER JOIN receipt ON sr_shop_payment.sr_receipt_no = receipt.receipt_print_no\n" +
                "WHERE\n" +
                "receipt.idReceipt = " + idRecipt;

        qu = "SELECT\n" +
                "\tsr_shop_payment.sr_shop_proc_id1,\n" +
                "\tsr_shop_payment.sr_shop_paid_arrears_bal,\n" +
                "\tsr_shop_payment.sr_shop_paid_fine_bal,\n" +
                "\tsr_shop_payment.sr_shop_paid_rental_tot_bal,\n" +
                "\tsr_shop_payment.sr_shop_paid_over_pay_bal,\n" +
                "\tsr_shop_payment.sr_shop_paid_proc_complete,\n" +
                "\tsr_shop_payment.sr_shop_last_year_arrears_bal,\n" +
                "\tsr_shop_payment.sr_shop_last_year_fine_bal,\n" +
                "\tsr_shop_payment.sr_shop_sc1_balance,\n" +
                "\tsr_shop_payment.sr_shop_sc2_balance,\n" +
                "\tsr_shop_payment.sr_shop_sc3_balance, receipt.receipt_print_no \n" +
                "FROM\n" +
                "\tsr_shop_payment\n" +
                "\tINNER JOIN receipt ON sr_shop_payment.sr_receipt_no = receipt.receipt_print_no \n" +
                "WHERE\n" +
                "\treceipt.idReceipt = '" + idRecipt + "'";


        try {
            ResultSet data = DB.getData(qu);
            String reciptNo = "";
            while (data.next()) {
                String qu2 = "UPDATE `sr_shop_proc`\n" +
                        "SET `sr_shop_arrears_bal` = '" + data.getDouble("sr_shop_paid_arrears_bal") + "',\n" +
                        " `sr_shop_fine_bal` = '" + data.getDouble("sr_shop_paid_fine_bal") + "',\n" +
                        " `sr_shop_rental_tot_bal` = '" + data.getDouble("sr_shop_paid_rental_tot_bal") + "',\n" +
                        " `sr_shop_over_pay_bal` = '" + data.getDouble("sr_shop_paid_over_pay_bal") + "',\n" +
                        " `sr_shop_proc_complete` = '" + data.getString("sr_shop_paid_proc_complete") + "'\n" +
                        "WHERE\n" +
                        "\t(\n" +
                        "\t\t`sr_shop_proc_id` = '" + data.getString("sr_shop_proc_id1") + "'\n" +
                        "\t)";

                qu2 = "UPDATE `sr_shop_proc` \n" +
                        "SET `sr_shop_arrears_bal` = '" + data.getDouble("sr_shop_paid_arrears_bal") + "',\n" +
                        "`sr_shop_fine_bal` = '" + data.getDouble("sr_shop_paid_fine_bal") + "',\n" +
                        "`sr_shop_rental_tot_bal` = '" + data.getDouble("sr_shop_paid_rental_tot_bal") + "',\n" +
                        "`sr_shop_over_pay_bal` = '" + data.getDouble("sr_shop_paid_over_pay_bal") + "',\n" +
                        "`sr_shop_proc_complete` = '" + data.getString("sr_shop_paid_proc_complete") + "',\n" +
                        "`sr_shop_last_year_arrears_bal` = '" + data.getDouble("sr_shop_last_year_arrears_bal") + "',\n" +
                        "`sr_shop_last_year_fine_bal` = '" + data.getDouble("sr_shop_last_year_fine_bal") + "',\n" +
                        "`sr_shop_sc1_balance` = '" + data.getDouble("sr_shop_sc1_balance") + "',\n" +
                        "`sr_shop_sc2_balance` = '" + data.getDouble("sr_shop_sc2_balance") + "',\n" +
                        "`sr_shop_sc3_balance` = '" + data.getDouble("sr_shop_sc3_balance") + "' \n" +
                        "WHERE\n" +
                        "\t( `sr_shop_proc_id` = '" + data.getString("sr_shop_proc_id1") + "' )";


                conn.DB.setData(qu2);
                reciptNo = data.getString("receipt_print_no");
            }

            conn.DB.setData("UPDATE `sr_shop_payment` SET `sr_shop_payment_complete_or_not`= '1' WHERE `sr_receipt_no`='" + reciptNo + "'");
            conn.DB.setData("UPDATE `sr_shop_payment_cross_tbl` SET `sr_shop_payment2_complete_or_not`='1' WHERE `sr_shop_payment2_receipt_no`='" + reciptNo + "'");
            conn.DB.setData("UPDATE `sr_shop_cashflow` SET `sr_shop_cash_flow_complete_or_not`='1' WHERE `sr_shop_cash_flow_receipt_no`='" + reciptNo + "'");
            conn.DB.setData("UPDATE `account_ps_three` SET `report_status`='1'  WHERE `report_ricipt_no`='" + reciptNo + "'");
            conn.DB.setData("UPDATE `receipt` SET `receipt_status`='1' WHERE `receipt_print_no`='" + reciptNo + "'");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

    }


    public void updateStreetLineStatus(int appid) {

        String ss = "SELECT\n" +
                "sl_details.idStreetLine,\n" +
                "doc_hand_approve.approve_doc_hand_id\n" +
                "FROM\n" +
                "sl_details\n" +
                "INNER JOIN doc_hand_approve ON sl_details.idStreetLine = doc_hand_approve.doc_hand_subject_id\n" +
                "WHERE\n" +
                "sl_details.idStreetLine = " + appid;

        try {
            ResultSet data = DB.getData(ss);
            if (data.last()) {
                int approve_doc_hand_id = data.getInt("approve_doc_hand_id");


                conn.DB.setData("UPDATE `doc_hand_approve`\n" +
                        "SET \n" +
                        " `doc_hand_recevied_user_category` = '7',\n" +
                        " `doc_hand_accept_or_reject` = '4' \n" +
                        "WHERE\n" +
                        "\t(`approve_doc_hand_id` = '" + approve_doc_hand_id + "')");


            }

            ResultSet data1 = DB.getData("SELECT\n" +
                    "receipt.idReceipt,\n" +
                    "sl_details.idStreetLine,\n" +
                    "receipt.receipt_print_no,\n" +
                    "receipt.receipt_day, receipt.receipt_total\n" +
                    "FROM\n" +
                    "receipt\n" +
                    "INNER JOIN sl_details ON sl_details.idStreetLine = receipt.recept_applicationId\n" +
                    "WHERE\n" +
                    "receipt.Application_Catagory_idApplication_Catagory = 7 AND\n" +
                    "sl_details.idStreetLine = '" + appid + "'");

            if (data1.last()) {
                int idReceipt = data1.getInt("idReceipt");
                String receipt_day = data1.getString("receipt_day");
                String receipt_print_no = data1.getString("receipt_print_no");
                double receipt_total = data1.getDouble("receipt_total");

                conn.DB.setData("UPDATE `account_ps_three`\n" +
                        "SET `report_date` = '" + receipt_day + "',\n" +
                        " `report_ricipt_no` = '" + receipt_print_no + "',\n" +
                        " `report_status` = '1' , `income_or_expence` = '1'\n" +
                        "WHERE\n" +
                        "\t`report_ricipt_id` = '" + idReceipt + "'");

                updateReciptNewCollom(idRecipt, 1, 1, 1, receipt_total);


            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }


    }

    public void assessmentTaxBil(String text) {

        String systemDateStringByQuary = GetInstans.getQuater().getSystemDateStringByQuary();
        try {

            String query = "SELECT\n" +
                    "receipt.idReceipt,\n" +
                    "receipt.cheack,\n" +
                    "receipt.cesh,\n" +
                    "receipt.amount,\n" +
                    "customer.cus_name,\n" +
                    "receipt.receipt_day, " +
                    "receipt.receipt_status \n" +
                    "FROM\n" +
                    "receipt\n" +
                    "INNER JOIN assessment ON assessment.idAssessment = receipt.recept_applicationId\n" +
                    "INNER JOIN cushasassess ON cushasassess.assessment_id = assessment.idAssessment\n" +
                    "INNER JOIN customer ON cushasassess.customer_id = customer.idCustomer\n" +
                    "WHERE\n" +
                    "receipt.idReceipt = '" + text + "' AND\n" +
                    "receipt.Application_Catagory_idApplication_Catagory = 2 AND\n" +
                    "receipt.receipt_day = '" + systemDateStringByQuary + "' AND\n" +
                    "cushasassess.`status` = 1\n" +
                    "ORDER BY\n" +
                    "cushasassess.idCusHasAssess ASC";

//            String query = "SELECT\n" +
//                    "customer.cus_name,\n" +
//                    "receipt.cheack,\n" +
//                    "receipt.cesh,\n" +
//                    "assessment.assessment_no,\n" +
//                    "receipt.idReceipt,\n" +
//                    "receipt.receipt_status\n" +
//                    "FROM\n" +
//                    "receipt\n" +
//                    "INNER JOIN assessment ON assessment.idAssessment = receipt.recept_applicationId\n" +
//                    "INNER JOIN customer ON assessment.Customer_idCustomer = customer.idCustomer\n" +
//                    "WHERE\n" +
//                    "receipt.idReceipt = '" + text + "' AND\n" +
//                    "receipt.Application_Catagory_idApplication_Catagory = 2 AND\n" +
//                    "receipt.receipt_day = '" + systemDateStringByQuary + "'\n";

            ResultSet data = DB.getData(query);
            if (data.last()) {
                int receipt_status = data.getInt("receipt_status");
                if (receipt_status == 0) {
                    idRecipt = Integer.parseInt(text);
                    txt_tot.setText((data.getDouble("cheack") + data.getDouble("cesh")) + "");
                    txt_dis1.setText(data.getString("cus_name"));
                    if (radio_print.isSelected()) {
                        recitPaid(idRecipt);
                        dec.reprintAssessBill(idRecipt + "", true);
                        modle.Allert.notificationGood("Completed", "Assessment " + idRecipt);
                        clearAll();
                    } else {
                        payAnable();
                    }
                } else if (receipt_status == 1) {
                    idRecipt = Integer.parseInt(text);
                    txt_tot.setText((data.getDouble("cheack") + data.getDouble("cesh")) + "");
                    txt_dis1.setText(data.getString("cus_name"));
                    printAnable();
                } else {

                }
            } else {

                String query2 = "SELECT\n" +
                        "receipt.idReceipt,\n" +
                        "receipt.cheack,\n" +
                        "receipt.cesh,\n" +
                        "receipt.amount,\n" +
                        "customer.cus_name,\n" +
                        "receipt.receipt_day, " +
                        "receipt.receipt_status \n" +
                        "FROM\n" +
                        "receipt\n" +
                        "INNER JOIN assessment ON assessment.idAssessment = receipt.recept_applicationId\n" +
                        "INNER JOIN cushasassess ON cushasassess.assessment_id = assessment.idAssessment\n" +
                        "INNER JOIN customer ON cushasassess.customer_id = customer.idCustomer\n" +
                        "WHERE\n" +
                        "receipt.idReceipt = '" + text + "' AND\n" +
                        "receipt.Application_Catagory_idApplication_Catagory = 2 AND\n" +
                        "cushasassess.`status` = 1\n" +
                        "ORDER BY\n" +
                        "cushasassess.idCusHasAssess ASC";

                ResultSet data2 = DB.getData(query2);

                if (data2.last()) {
                    int receipt_status = data2.getInt("receipt_status");
                    if (receipt_status == 1) {
                        idRecipt = Integer.parseInt(text);
                        //  txt_tot.setText((data2.getDouble("cheack") + data.getDouble("cesh")) + "");
                        //   txt_dis1.setText(data2.getString("cus_name"));
                        printAnable();
                    } else {
                        modle.Allert.notificationWorning("Please Create New Barcode", "Expired Barcode");
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

    }

    public void riBillData(String text) {
        try {
            String query = "SELECT\n" +
                    "ribill.idRibill,\n" +
                    "ribill.billdate,\n" +
                    "ribill.billtotal,\n" +
                    "ribill.userid,\n" +
                    "ribill.ribill_status,\n" +
                    "ribill.bill_no,\n" +
                    "ribill.office_id,\n" +
                    "ribill.oder,\n" +
                    "`user`.user_full_name,\n" +
                    "office.office_name\n" +
                    "FROM\n" +
                    "ribill\n" +
                    "INNER JOIN `user` ON `user`.idUser = ribill.userid\n" +
                    "LEFT JOIN office ON office.idOffice = ribill.office_id\n" +
                    "WHERE idRibill =" + text;
            ResultSet data = DB.getData(query);
            if (data.last()) {
                int ribill_status = data.getInt("ribill_status");

                if (ribill_status == 0) {
                    catid = 13;
                    idRecipt = data.getInt("idRibill");
                    txt_tot.setText(data.getString("billtotal"));
                    txt_dis1.setText(data.getString("user_full_name"));
                    if (radio_print.isSelected()) {
                        modle.GetInstans.getRiBillComplete().completeRi(idRecipt + "");
                        new modle.asses.RiBillPrint().PrintRiBill(idRecipt, true);
                        modle.Allert.notificationGood("Completed", "Assessment RI" + idRecipt);
                        clearAll();
                    } else {
                        payAnable();
                    }
                } else if (ribill_status == 1) {
                    catid = 13;
                    idRecipt = data.getInt("idRibill");
                    txt_tot.setText(data.getString("billtotal"));
                    txt_dis1.setText(data.getString("user_full_name"));
                    printAnable();
                }


            }
            System.out.println("XXXXXXXXXXXXXXXXX");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }


    }

    public void ViewAdvBillDetails(String text) {
        idRecipt = Integer.parseInt(text);
        catid = 1;
        int status = 0;
        String quary = "SELECT\n" +
                "receipt.recept_applicationId,\n receipt.receipt_status," +
                " receipt.idReceipt\n" +
                "FROM\n" +
                "receipt\n" +
                "WHERE\n" +
                "receipt.Application_Catagory_idApplication_Catagory = 1 AND\n" +
                "receipt.idReceipt = " + text;

        try {
            ResultSet data = DB.getData(quary);
            if (data.last()) {
                status = data.getInt("receipt.receipt_status");
                appid = data.getInt("recept_applicationId");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (status == 0) {
            int advApplicationID = appid;
            Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
            try {
                AdvAdvertising adv = (AdvAdvertising) session.load(AdvAdvertising.class, advApplicationID);
                Customer customer = (Customer) session.createCriteria(Customer.class).add(Restrictions.eq("idCustomer", adv.getCustomerIdCustomer())).uniqueResult();
                appid = adv.getIdAdvAdvertising();
                txt_dis1.setText(customer.getCusName());
                txt_tot.setText(adv.getAdvFullTotal() + "");

                if (radio_print.isSelected()) {
                    new modle.adv.Report().pringAdvBill(appid, true);
                    modle.GetInstans.getAdvPayModle().compleetePayment(idRecipt);
                    modle.Allert.notificationGood("Completed", "Advertising" + idRecipt);
                    clearAll();
                } else {
                    payAnable();
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                session.close();
            }
        } else if (status == 1) {
            printAnable();
            Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
            int advApplicationID = appid;
            btn_pay.setDisable(true);
            try {
                AdvAdvertising adv = (AdvAdvertising) session.load(AdvAdvertising.class, advApplicationID);
                Customer customer = (Customer) session.createCriteria(Customer.class).add(Restrictions.eq("idCustomer", adv.getCustomerIdCustomer())).uniqueResult();
                appid = adv.getIdAdvAdvertising();
                txt_dis1.setText(customer.getCusName());
                txt_tot.setText(adv.getAdvFullTotal() + "");
                printAnable();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                session.close();
            }

        } else {

        }

    }


    //=============================================================================================================================
    //=============================================================================================================================
    //=============================================================================================================================


    public void recitPaid(int idRecipt) {
        System.out.println(idRecipt);
        try {
            conn.DB.setData("UPDATE `receipt`\n" +
                    "SET `receipt_status` = '1', receipt_time='" + modle.Time.getTeime() + "' \n" +
                    "WHERE\n" +
                    "\t`idReceipt` = '" + idRecipt + "'");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }


    //=============================================================================================================================
    //=============================================================================================================================
    //=============================================================================================================================

    public void clearAll() {
        catid = 0;
        idRecipt = 0;
        appid = 0;
        txt_barcode.setText(null);
        txt_tot.setText("00");
        txt_dis1.setText(null);
        txt_dis2.setText(null);
        txt_dis3.setText(null);
        btn_pay.setDisable(true);
        btn_print.setDisable(true);
    }

    public void payAnable() {
        btn_pay.setDisable(false);
        btn_print.setDisable(true);
    }

    public void printAnable() {
        btn_pay.setDisable(true);
        btn_print.setDisable(false);
    }


    public void updateReciptNewCollom(int idRecipt, int inex, int crosReciptVoucher, int payType, double Amount) {
        try {
            conn.DB.setData("UPDATE `receipt` \n" +
                    "SET \n" +
                    "`income_expense` = " + inex + ",\n" +
                    "`cross_recipt_or_voucher` = " + crosReciptVoucher + ",\n" +
                    "`pay_type` = " + payType + ",\n" +
                    "`amount` = " + Amount + " \n" +
                    "WHERE\n" +
                    "\t`idReceipt` = " + idRecipt);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

    }


}
