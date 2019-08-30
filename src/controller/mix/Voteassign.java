package controller.mix;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import conn.DB;
import conn.NewHibernateUtil;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import modle.GetInstans;
import modle.asses.OfficeHolder;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Mixintype;

import java.io.Serializable;
import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class Voteassign implements Initializable {

    @FXML
    private JFXTextField txt_appname;

    @FXML
    private JFXComboBox<String> com_vote;

    @FXML
    private JFXButton btn_create;

    @FXML
    private TableView<AppTable> tbl_applist;

    @FXML
    private TableColumn<AppTable, String> col_appname;

    @FXML
    private TableColumn<AppTable, String> col_votnumber;
    @FXML
    private TableColumn<AppTable, String> col_account;

    @FXML
    private JFXComboBox<String> com_account;

    @FXML
    private JFXComboBox<OfficeHolder> com_office;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadVoteCombo();
        loadAccountCombo();

        col_appname.setCellValueFactory(new PropertyValueFactory<>("appname"));
        col_votnumber.setCellValueFactory(new PropertyValueFactory<>("voteid"));
        col_account.setCellValueFactory(new PropertyValueFactory<>("account"));
        loadTable();
        modle.StaticViews.getMc().changeTitle("Create Mix Income Type");
        loadOfficeCombo();
    }

    public void loadOfficeCombo() {
        ObservableList<OfficeHolder> list = GetInstans.getOffice().loadOfficeCombo();
        System.out.println(list);
        com_office.setItems(list);
    }

    @FXML
    void clickOnCreate(MouseEvent event) {
        String text = txt_appname.getText();
        if (text.length() > 2) {
            String selectedItem = com_vote.getSelectionModel().getSelectedItem();
            String selectedacount = com_account.getSelectionModel().getSelectedItem();
            OfficeHolder selectedItem1 = com_office.getSelectionModel().getSelectedItem();
            if (selectedItem != null && selectedacount != null && selectedItem.length() > 0 && selectedItem1 != null) {
                insertNew(text, selectedItem, selectedacount);
                loadTable();
                clearData();
            }
        }
    }

    @FXML
    void clickOnTabel(MouseEvent event) {

    }


    public void loadVoteCombo() {
        ObservableList<String> vlist = FXCollections.observableArrayList();
        try {
            ResultSet data = DB.getData("SELECT\n" +
                    "\taccount_receipt_title.idAccount_receipt_title,\n" +
                    "\taccount_receipt_title.ART_vote_and_bal\n" +
                    "FROM\n" +
                    "\taccount_receipt_title\n" +
                    "ORDER BY\n" +
                    "\taccount_receipt_title.ART_vote_and_bal ASC");
            vlist.clear();
            while (data.next()) {
                String art_vote_and_bal = data.getString("ART_vote_and_bal");
                vlist.add(art_vote_and_bal);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        com_vote.setItems(vlist);
    }

    public void loadAccountCombo() {
        ObservableList<String> banklist = FXCollections.observableArrayList();
        try {
            ResultSet data = DB.getData("SELECT\n" +
                    "bank_info.idBank_Info,\n" +
                    "bank_info.bank_name,\n" +
                    "bank_info.acount_no,\n" +
                    "bank_info.acount_name,\n" +
                    "bank_info.current_ballance,\n" +
                    "bank_info.`status`,\n" +
                    "bank_info.syn\n" +
                    "FROM\n" +
                    "bank_info\n");
            banklist.clear();
            while (data.next()) {
                String art_vote_and_bal = data.getString("acount_name");
                banklist.add(art_vote_and_bal);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        com_account.setItems(banklist);
    }

    public void insertNew(String appname, String voteno, String account) {

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();


        try {
            String idAccount_receipt_title = "0";
            int idBankinof = 0;
            ResultSet data = DB.getData("SELECT\n" +
                    "account_receipt_title.idAccount_receipt_title,\n" +
                    "account_receipt_title.ART_vote_and_bal,\n" +
                    "account_receipt_title.ART_Pro_name_eng\n" +
                    "FROM `account_receipt_title` WHERE ART_vote_and_bal = '" + voteno + "'");

            ResultSet data1 = DB.getData("SELECT\n" +
                    "bank_info.idBank_Info\n" +
                    "FROM\n" +
                    "bank_info\n" +
                    "WHERE\n" +
                    "bank_info.acount_name = '" + account + "'");

            if (data1.last()) {
                idBankinof = data1.getInt("idBank_Info");
            }


            if (data.last()) {
                idAccount_receipt_title = data.getString("idAccount_receipt_title");
            }

            Mixintype mixintype = new Mixintype();
            mixintype.setAccountReceiptTitle((pojo.AccountReceiptTitle) session.load(pojo.AccountReceiptTitle.class, Integer.parseInt(idAccount_receipt_title)));
            mixintype.setMixintypeName(appname);
            mixintype.setMixintypeStatus(1);
            mixintype.setOfficeId(com_office.getSelectionModel().getSelectedItem().getIdOffice());

            Serializable save = session.save(mixintype);
            transaction.commit();

            modle.Allert.notificationGood("Application Created", appname);

            int i = Integer.parseInt(save.toString());

            conn.DB.setData("UPDATE `mixintype`\n" +
                    "SET \n" +
                    " `bankinfo_idBank` = '" + idBankinof + "',\n" +
                    " `active_status` = '1'\n" +
                    "WHERE\n" +
                    "\t(`idMixintype` = '" + i + "')");

        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
            modle.Allert.notificationError("Error", e.getMessage());
        } finally {
            session.close();
        }
    }


    public void loadTable() {
        ObservableList<AppTable> applist = FXCollections.observableArrayList();

        try {
            ResultSet data = DB.getData("SELECT\n" +
                    "\tmixintype.idMixintype,\n" +
                    "\tmixintype.mixintype_name,\n" +
                    "\tmixintype.account_receipt_title_idAccount_receipt_title,\n" +
                    "\tmixintype.mixintype_status,\n" +
                    "\tmixintype.bankinfo_idBank,\n" +
                    "\tbank_info.acount_name,\n" +
                    "\taccount_receipt_title.ART_vote_and_bal\n" +
                    "FROM\n" +
                    "\tmixintype\n" +
                    "INNER JOIN bank_info ON bank_info.idBank_Info = mixintype.bankinfo_idBank\n" +
                    "INNER JOIN account_receipt_title ON mixintype.account_receipt_title_idAccount_receipt_title = account_receipt_title.idAccount_receipt_title");

            applist.clear();
            while (data.next()) {
                applist.add(new AppTable(data.getInt("idMixintype"), data.getString("mixintype.mixintype_name"), data.getString("account_receipt_title.ART_vote_and_bal"), data.getInt("mixintype_status"), data.getString("acount_name")));
            }

            tbl_applist.setItems(applist);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public class AppTable {
        private int id;
        private SimpleStringProperty appname;
        private SimpleStringProperty voteid;
        private SimpleStringProperty account;
        private int status;

        AppTable(int id, String appname, String voted, int status, String account) {
            this.id = id;
            this.appname = new SimpleStringProperty(appname);
            this.voteid = new SimpleStringProperty(voted);
            this.status = status;
            this.account = new SimpleStringProperty(account);
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getAppname() {
            return appname.get();
        }

        public void setAppname(String appname) {
            this.appname = new SimpleStringProperty(appname);
        }

        public String getVoteid() {
            return voteid.get();
        }

        public void setVoteid(String voteid) {
            this.voteid = new SimpleStringProperty(voteid);
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getAccount() {
            return account.get();
        }

        public void setAccount(SimpleStringProperty account) {
            this.account = account;
        }
    }


    public void clearData() {
        txt_appname.setText(null);
    }


}
