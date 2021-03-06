package controller.assess;

import com.jfoenix.controls.*;
import controller.adv.Customer_regController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import modle.asses.CreditObj;
import modle.asses.CreditProcess;
import modle.asses.PayObj;
import modle.asses.TablePay;
import view.buttons.BTN;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreditAss implements Initializable {

    @FXML
    public JFXTextField txt_idAssess;
    @FXML
    public Text txt_ward;
    @FXML
    public Text txt_street;
    @FXML
    public Text txt_assessmant;
    @FXML
    public Text txt_Obsaloot;
    @FXML
    public Text txt_customer;
    @FXML
    public Text txt_allocation;

    @FXML
    public Text txt_currentQuater;
    @FXML
    public Text txt_currentYear;

    CreditObj payObj;

    @FXML
    public Text txt_lyArrears;
    @FXML
    public Text txt_lyWarrant;
    @FXML
    public Text txt_tyArrears;
    @FXML
    public Text txt_tyWarrant;
    @FXML
    public Text txt_Total;
    @FXML
    public Text txt_quaterValue;
    public Text txt_Complete;
    @FXML
    public Text txt_nature;
    @FXML
    public JFXTextField txt_Pay;
    @FXML
    public TableView<TablePay> table_pay;
    @FXML
    public TableColumn<TablePay, String> col_dis;
    @FXML
    public TableColumn<TablePay, String> col_amount;
    @FXML
    public TableColumn<TablePay, String> col_discount;
    @FXML
    public TableColumn<TablePay, String> col_value;
    @FXML
    public Text txt_cd;
    @FXML
    public Text q1_val;
    @FXML
    public Text q2_val;
    @FXML
    public Text q3_val;
    @FXML
    public Text q4_val;
    @FXML
    public Text q4_tot;
    @FXML
    public JFXComboBox<String> combo_bank;
    @FXML
    public JFXTextField txt_chq_no;
    @FXML
    public JFXTextField txt_cash;
    @FXML
    public JFXTextField txt_check;

    @FXML
    public JFXRadioButton cash;

    @FXML
    public JFXRadioButton check;


    @FXML
    public JFXCheckBox cq1;
    @FXML
    public JFXCheckBox cq2;
    @FXML
    public JFXCheckBox cq3;
    @FXML
    public JFXCheckBox cq4;
    @FXML
    public JFXButton btn_pay;
    @FXML
    private JFXButton btn_search;
    @FXML
    public Text q1pidv;
    @FXML
    public Text q2pidv;
    @FXML
    public Text q3pidv;
    @FXML
    public Text q4pidv;
    @FXML
    public JFXTextArea txt_comment;


    @FXML
    private JFXButton btn_histry;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        payObj = new CreditObj();

        if (modle.asses.StaticBadu.getIdAssessment() != null && modle.asses.StaticBadu.getIdAssessment() != 0) {
            txt_idAssess.setText(modle.asses.StaticBadu.getIdAssessment() + "");
            autoRady();
            txt_Pay.requestFocus();
        }
        modle.StaticViews.getMc().changeTitle("Assessment Pay");
    }


    @FXML
    private void idKeyReleased(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            payObj.cal(Integer.parseInt(txt_idAssess.getText()), this);
            txt_Pay.requestFocus();
        } else {
            if (txt_idAssess.getText().length() == 0) {
                cleare();
            }
        }
    }

    public void autoRady() {
        payObj.cal(Integer.parseInt(txt_idAssess.getText()), this);
    }

    @FXML
    private void payKeyRelesed(KeyEvent event) {
        int length = txt_Pay.getText().length();
        if (length > 0) {
            try {
                double parseDouble = Double.parseDouble(txt_Pay.getText());
                payObj.WarrantArrirasCal(parseDouble);
                fullTot = Double.parseDouble(txt_Pay.getText());
            } catch (Exception e) {
                modle.Allert.notificationError("Error", "Please Enter Valid Number");
            }
        } else {
            payObj.WarrantArrirasCal(0.0);
        }


    }

    @FXML
    private void clickOnPay(MouseEvent event) {

        int length = txt_comment.getText().length();
        if (length > 3) {
            int pay = payObj.pay();
            if (pay > 0) {
                boolean b = new CreditProcess().creditBalance(pay);
                if (b) {
                    System.out.println("ok");
                    payObj = new CreditObj();
                    modle.asses.StaticBadu.setAssessment(null);
                    modle.asses.StaticBadu.setIdAssessment(0);
                    cleare();
                }
            }
        } else {
            modle.Allert.notificationWorning("Comment", "Please Add A Comment");
        }

    }


    double fullTot;

    @FXML
    private void onKeyRelesed(KeyEvent event) {
        double ca = 0, ch = 0;
        JFXTextField tf = (JFXTextField) event.getSource();

        if (tf == txt_check) {
            if (txt_check.getText().matches("\\d*(\\.\\d*)?")) {
                if (txt_check.getText().length() == 0) {
                    ch = 0;
                    txt_cash.setText(fullTot + "");
                    txt_check.setText("0");
                } else {
                    ch = Double.parseDouble(txt_check.getText());
                    if (fullTot - ch > 0) {
                        txt_cash.setText(fullTot - ch + "");
                    } else {
                        java.awt.Toolkit.getDefaultToolkit().beep();
                        txt_check.deletePreviousChar();
                        ch = Double.parseDouble(txt_check.getText());
                    }
                }

            } else {
                java.awt.Toolkit.getDefaultToolkit().beep();
                txt_check.deletePreviousChar();
            }
        } else {

        }

        if (tf == txt_cash) {
            if (txt_cash.getText().matches("\\d*(\\.\\d*)?")) {
                if (txt_cash.getText().length() == 0) {
                    ca = 0;
                    txt_check.setText(fullTot + "");
                    txt_cash.setText("0");
                } else {
                    ca = Double.parseDouble(txt_cash.getText());
                    if (fullTot - ca > 0) {
                        txt_check.setText(fullTot - ca + "");
                    } else {
                        java.awt.Toolkit.getDefaultToolkit().beep();
                        txt_cash.deletePreviousChar();
                        ca = Double.parseDouble(txt_cash.getText());
                    }
                }

            } else {
                java.awt.Toolkit.getDefaultToolkit().beep();
                txt_cash.deletePreviousChar();
            }
        }
    }

    @FXML
    private void cheackValues(ActionEvent event) {
        payObj.viewPay();
    }

    public void cleare() {

        try {
            txt_idAssess.setText("");
            txt_ward.setText("");
            txt_street.setText("");
            txt_assessmant.setText("");
            txt_Obsaloot.setText("");
            txt_customer.setText("");
            txt_allocation.setText("");
//            txt_status.setText("");
            txt_currentQuater.setText("");
            txt_currentYear.setText("");

            txt_lyArrears.setText("");
            txt_lyWarrant.setText("");
            txt_tyArrears.setText("");
            txt_tyWarrant.setText("");
            txt_Total.setText("");
            txt_quaterValue.setText("");
//            txt_Complete.setText("");
            txt_nature.setText("");
            txt_Pay.setText("");

            txt_cd.setText("");
            q1_val.setText("00");
            q2_val.setText("00");
            q3_val.setText("00");
            q4_val.setText("00");
            q4_tot.setText("00");

            q1pidv.setText("00");
            q2pidv.setText("00");
            q3pidv.setText("00");
            q4pidv.setText("00");


            cq1.setSelected(false);
            cq2.setSelected(false);
            cq3.setSelected(false);
            cq4.setSelected(false);

            txt_comment.setText(null);

        } catch (Exception e) {
            e.printStackTrace();
            modle.ErrorLog.writeLog(e.getMessage(), e.getClass().toString(), "cleare", "view.assess");
        }

    }

    @FXML
    private void clickOnSearchBTN(MouseEvent event) {

        AnchorPane container = modle.StaticViews.getContainer();
        container.getChildren().removeAll();
        container.getChildren().clear();
        AnchorPane dashh;
        try {
            dashh = FXMLLoader.load(getClass().getResource("/view/assess/search_assess.fxml"));
            container.getChildren().add(dashh);
        } catch (IOException ex) {
            ex.printStackTrace();
            Logger
                    .getLogger(Customer_regController.class
                            .getName()).log(Level.SEVERE, null, ex);
        }
        Set<String> keySet = modle.StaticViews.getButtonMap().keySet();
        String s = "/view/buttons/assess_search.fxml";

        for (String string : keySet) {
            if (string.equals(s)) {
                try {
                    JFXButton get = modle.StaticViews.getButtonMap().get(string);
                    BTN get1 = modle.StaticViews.getBtnConMap().get(string);
                    get1.setImage("/grafics/search_b.png");
                    get.setStyle("-fx-background-color: #FFFFFF; -fx-text-fill: #03A9F4;");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    JFXButton btn = modle.StaticViews.getButtonMap().get(string);
                    btn.setStyle("-fx-background-color: #03A9F4; -fx-text-fill: #FFFFFF;");
                    BTN get = modle.StaticViews.getBtnConMap().get(string);
                    if (get != null) {
                        get.setImage();
                    }
                } catch (Exception e) {
                    e.printStackTrace();

                }
            }
        }

    }


    @FXML
    void clickOnHistry(MouseEvent event) {

        try {
            String text = txt_idAssess.getText();
            int i = Integer.parseInt(text);
            modle.asses.StaticBadu.setIdAssessment(i);

            if (modle.asses.StaticBadu.getIdAssessment() > 0) {
                Parent root;
                try {
                    root = FXMLLoader.load(getClass().getResource("/view/assess/payHistry.fxml"));
                    Stage stage = new Stage();
                    stage.initStyle(StageStyle.TRANSPARENT);

                    stage.getIcons().add(new Image("/grafics/info.png"));
                    Scene scene = new Scene(root);
                    scene.setFill(Color.TRANSPARENT);
                    stage.setResizable(false);
                    stage.setScene(scene);

                    stage.show();
                } catch (IOException ex) {
                    ex.printStackTrace();

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
