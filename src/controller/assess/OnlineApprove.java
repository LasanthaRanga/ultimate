package controller.assess;

import com.jfoenix.controls.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class OnlineApprove implements Initializable {

    @FXML
    private TableView<Online> tbl;

    @FXML
    private TableColumn<Online, Integer> col_index;

    @FXML
    private TableColumn<Online, String> col_customer;

    @FXML
    private TableColumn<Online, String> col_appcat;

    @FXML
    private TableColumn<Online, String> col_amount;

    @FXML
    private TableColumn<Online, String> col_status;

    @FXML
    private TableColumn<Online, JFXCheckBox> col_checks;

    @FXML
    private JFXCheckBox check;

    @FXML
    private JFXDatePicker dp;

    @FXML
    private JFXRadioButton radio_confirmed;

    @FXML
    private ToggleGroup confirmed;

    @FXML
    private JFXRadioButton radio_reject;

    @FXML
    private JFXRadioButton radio_completed;

    @FXML
    private ToggleGroup finish;

    @FXML
    private JFXRadioButton radio_pending;

    @FXML
    private JFXButton btn_complete;

    @FXML
    private JFXProgressBar progress;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        col_checks.setCellValueFactory(new PropertyValueFactory<>("select"));
        col_status.setCellValueFactory(new PropertyValueFactory<>("status"));
        col_amount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        col_appcat.setCellValueFactory(new PropertyValueFactory<>("appcat"));
        col_customer.setCellValueFactory(new PropertyValueFactory<>("select"));


    }


    @FXML
    void checkAll(ActionEvent event) {

    }

    @FXML
    void clickOnTbl(MouseEvent event) {

    }

    @FXML
    void completeOnAction(ActionEvent event) {

    }

    @FXML
    void dateChange(ActionEvent event) {

    }

    @FXML
    void radioOnAction(ActionEvent event) {

        int status = 0;

        if (radio_confirmed.isSelected()) {
            radio_completed.setDisable(false);
            radio_pending.setDisable(false);
            if (radio_completed.isSelected()) {
                status = 2;
            }
            if (radio_pending.isSelected()) {
                status = 1;
            }
        }



        if (radio_reject.isSelected()) {
            status = 0;
            radio_completed.setDisable(true);
            radio_pending.setDisable(true);
        }


    }


    public void loadTable(int status) {


    }


    class Online {

        public Online(int onpayid, int cusid, String cus_name, int appcatid, String appcat, int appid, double amount, int statusid, String status) {
            this.onpayid = onpayid;
            this.cusid = cusid;
            this.cus_name = cus_name;
            this.appcatid = appcatid;
            this.appcat = appcat;
            this.appid = appid;
            this.amount = amount;
            this.statusid = statusid;
            this.status = status;
            this.select = new JFXCheckBox();
        }

        private int onpayid;
        private int cusid;
        private String cus_name;
        private int appcatid;
        private String appcat;
        private int appid;
        private double amount;
        private int statusid;
        private String status;
        private JFXCheckBox select;

        public void setOnpayid(int onpayid) {
            this.onpayid = onpayid;
        }

        public void setCusid(int cusid) {
            this.cusid = cusid;
        }

        public void setCus_name(String cus_name) {
            this.cus_name = cus_name;
        }

        public void setAppcatid(int appcatid) {
            this.appcatid = appcatid;
        }

        public void setAppcat(String appcat) {
            this.appcat = appcat;
        }

        public void setAppid(int appid) {
            this.appid = appid;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public void setStatusid(int statusid) {
            this.statusid = statusid;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public void setSelect(boolean select) {
            this.select.setSelected(true);
        }

        public int getOnpayid() {
            return onpayid;
        }

        public int getCusid() {
            return cusid;
        }

        public String getCus_name() {
            return cus_name;
        }

        public int getAppcatid() {
            return appcatid;
        }

        public String getAppcat() {
            return appcat;
        }

        public int getAppid() {
            return appid;
        }

        public double getAmount() {
            return amount;
        }

        public int getStatusid() {
            return statusid;
        }

        public String getStatus() {
            return status;
        }

        public Boolean getSelect() {
            return select.isSelected();
        }
    }


}
