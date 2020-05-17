package controller.assess;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import conn.DB;

import java.net.URL;
import java.sql.ResultSet;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import conn.NewHibernateUtil;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import modle.ComboItem;
import modle.ComboLoad;
import modle.GetInstans;
import modle.adv.customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.*;
import pojo.Customer;

/**
 * FXML Controller class
 *
 * @author RM.LasanthaRanga@gmail.com
 */
public class SubOwnersController implements Initializable {

    @FXML
    private JFXTextField txt_owner;
    @FXML
    private JFXTextField txt_nic;
    @FXML
    private JFXButton btn_add;
    @FXML
    private Label lbl_assessmant;
    @FXML
    private TableView<Owner> tbl_sub;
    @FXML
    private TableColumn<Owner, String> col_sub;
    @FXML
    private TableColumn<Owner, String> col_nic;
    @FXML
    private TableColumn<Owner, String> col_status;
    @FXML
    private TableColumn<Owner, String> col_sinhala;
    /**
     * Initializes the controller class.
     */
    pojo.Assessment assessment;
    modle.asses.SubOwner subOwnerModle;
    @FXML
    private JFXButton btn_done1;
    @FXML
    private JFXButton btn_done11;
    @FXML
    private ToggleGroup print;
    @FXML
    private JFXRadioButton radio_print;
    @FXML
    private JFXRadioButton radio_no;
    @FXML
    private JFXButton btn_new;
    @FXML
    private JFXComboBox<ComboItem> com_title;
    @FXML
    private JFXTextField txt_owner_sinhala;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        assessment = modle.asses.StaticBadu.getAssessment();
        subOwnerModle = new modle.asses.SubOwner();
        lbl_assessmant.setText(assessment.getAssessmentNo());
        loadSubOwnerTable();
        com_title.setItems(ComboLoad.loadCombo("SELECT person_title.title_id, person_title.title_name FROM person_title"));
    }

    @FXML
    private void add(ActionEvent event) {

        String title = null;
        if (com_title.getSelectionModel().getSelectedItem() != null) {
            title = com_title.getSelectionModel().getSelectedItem().getId() + "";
        }


        int status = 1;

        if (radio_print.isSelected()) {
            status = 1;
        } else {
            status = 0;
        }
        if (so == null) {
            if (txt_owner.getText().length() > 2 && txt_owner_sinhala.getText().length() > 2) {

                Session session = NewHibernateUtil.getSessionFactory().openSession();
                Transaction transaction = session.beginTransaction();
                try {


                    pojo.Customer customer = new Customer();
                    customer.setCusName(txt_owner.getText());
                    customer.setCusNameSinhala(txt_owner_sinhala.getText());
                    customer.setCusNic(txt_nic.getText());
                    customer.setCusPersonTitle(title);
                    customer.setCusSyn(status);

//                AssSubowner subowner = new AssSubowner(assessment,
//                        txt_owner.getText(),
//                        txt_nic.getText(),
//                        status,
//                        title,
//                        txt_owner_sinhala.getText());

                    Cushasassess cushasassess = new Cushasassess(assessment, customer, 1, GetInstans.getQuater().getSystemDate());
                    session.save(customer);
                    session.save(cushasassess);
                    transaction.commit();

                    //boolean saveSubOwner = subOwnerModle.saveSubOwner(subowner);


                    modle.Allert.notificationGood("Saved", txt_owner.getText());
                    cleare();
                    loadSubOwnerTable();

                } catch (Exception e) {
                    transaction.rollback();
                    e.printStackTrace();
                    modle.Allert.notificationWorning("Something Wrong", e.getMessage());
                } finally {
                    session.close();
                }
            } else {
                modle.Allert.notificationError("Error", "cheack sub owner name");

            }
        } else {

            Session session = NewHibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            try {

                pojo.Customer customer = (pojo.Customer) session.load(Customer.class, so.getId());
                customer.setCusName(txt_owner.getText());
                customer.setCusNameSinhala(txt_owner_sinhala.getText());
                customer.setCusNic(txt_nic.getText());
                customer.setCusPersonTitle(title);
                customer.setCusSyn(status);
                session.update(customer);
                transaction.commit();
                modle.Allert.notificationGood("Updated", txt_owner.getText());
                cleare();
                loadSubOwnerTable();

            } catch (Exception e) {
                transaction.rollback();
                e.printStackTrace();
                modle.Allert.notificationWorning("Something Wrong", e.getMessage());
            } finally {
                session.close();
            }


        }

    }

    public void cleare() {
        txt_owner.setText("");
        txt_nic.setText("");
    }

    private void done(ActionEvent event) {
        loadSubOwnerTable();
    }

    ObservableList<Owner> obal = FXCollections.observableArrayList();

    public void loadSubOwnerTable() {
        try {
            obal.clear();
            ResultSet data = DB.getData("SELECT\n" +
                    "assessment.idAssessment,\n" +
                    "customer.idCustomer,\n" +
                    "customer.cus_name,\n" +
                    "customer.cus_person_title,\n" +
                    "customer.cus_nic,\n" +
                    "customer.cus_status,\n" +
                    "customer.cus_syn,\n" +
                    "customer.cus_reg_date,\n" +
                    "customer.cus_name_sinhala\n" +
                    "FROM\n" +
                    "assessment\n" +
                    "INNER JOIN cushasassess ON cushasassess.assessment_id = assessment.idAssessment\n" +
                    "INNER JOIN customer ON cushasassess.customer_id = customer.idCustomer\n" +
                    "WHERE  cushasassess.`status` = 1 AND \n" +
                    "assessment.idAssessment = " + modle.asses.StaticBadu.getAssessment().getIdAssessment());

            while (data.next()) {
                obal.add(new Owner(data.getInt("idCustomer"), data.getString("cus_name"), data.getString("cus_nic"), data.getInt("cus_syn"), data.getString("cus_name_sinhala")));
            }
            col_sub.setCellValueFactory(new PropertyValueFactory<>("sname"));
            col_nic.setCellValueFactory(new PropertyValueFactory<>("snic"));
            col_status.setCellValueFactory(new PropertyValueFactory<>("status"));
            col_sinhala.setCellValueFactory(new PropertyValueFactory<>("sinhala"));
            tbl_sub.setItems(obal);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @FXML
    private void finish(ActionEvent event) {
        btn_done1.getScene().getWindow().hide();
    }

    Owner so = null;

    @FXML
    private void selectSubOwner(MouseEvent event) {
        so = tbl_sub.getSelectionModel().getSelectedItem();
        btn_add.setText("Update");
        txt_owner.setText(so.getSname());
        txt_nic.setText(so.getSnic());
        String status = so.getStatus();
        if (status.equals("print")) {
            radio_print.setSelected(true);
        } else {
            radio_no.setSelected(true);
        }
    }

    @FXML
    private void clickOnDelete(MouseEvent event) {
        Owner so = tbl_sub.getSelectionModel().getSelectedItem();
        if (so != null) {


            boolean deleteSubOwner = subOwnerModle.deleteSubOwner(so.getId(), assessment.getIdAssessment());
            if (deleteSubOwner) {
                modle.Allert.notificationGood("deleted", so.getSname());
                loadSubOwnerTable();
                cleare();
            }
            loadSubOwnerTable();
        } else {
            modle.Allert.notificationError("Select Owner First", "No Selected owner");
        }
    }

    @FXML
    private void newOnAction(ActionEvent event) {
        so = null;
        btn_add.setText("Add");
        cleare();
    }

    public class Owner {

        /**
         * @return the id
         */
        public int getId() {
            return id;
        }

        /**
         * @return the sname
         */
        public String getSname() {
            return sname.get();
        }

        /**
         * @return the snic
         */
        public String getSnic() {
            return snic.get();
        }

        public Owner(int id, String sname, String snic, int status, String sinhala) {
            this.id = id;
            this.sname = new SimpleStringProperty(sname);
            this.snic = new SimpleStringProperty(snic);
            this.status = status;
            this.sinhala = new SimpleStringProperty(sinhala);

        }

        private final int id;
        private final SimpleStringProperty sname;
        private final SimpleStringProperty snic;
        private final int status;
        private final SimpleStringProperty sinhala;

        public void setSname(String sname) {
            this.sname.set(sname);
        }

        public String getSinhala() {
            return sinhala.get();
        }

        public SimpleStringProperty sinhalaProperty() {
            return sinhala;
        }

        /**
         * @return the status
         */
        public String getStatus() {
            if (status == 1) {
                return "print";
            } else {
                return "no";
            }
        }
    }

}
