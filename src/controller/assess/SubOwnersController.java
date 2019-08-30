package controller.assess;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import conn.DB;
import java.net.URL;
import java.sql.ResultSet;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import pojo.AssSubowner;

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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        assessment = modle.asses.StaticBadu.getAssessment();
        subOwnerModle = new modle.asses.SubOwner();
        lbl_assessmant.setText(assessment.getAssessmentNo());
        loadSubOwnerTable();
    }

    @FXML
    private void add(ActionEvent event) {

        int status = 1;

        if (radio_print.isSelected()) {
            status = 1;
        } else {
            status = 0;
        }
        if (so == null) {
            if (txt_owner.getText().length() > 1) {
                AssSubowner subowner = new AssSubowner(assessment, txt_owner.getText(), txt_nic.getText(), status);
                boolean saveSubOwner = subOwnerModle.saveSubOwner(subowner);
                if (saveSubOwner) {
                    modle.Allert.notificationGood("Saved", txt_owner.getText());
                    cleare();
                    loadSubOwnerTable();
                }
            } else {
                modle.Allert.notificationError("Error", "cheack sub owner name");

            }
        } else {
            if (subOwnerModle.updateSubOwner(so.getId(), txt_owner.getText(), txt_nic.getText(), status)) {
                modle.Allert.notificationGood("Updated", txt_owner.getText());
                cleare();
                loadSubOwnerTable();
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
            ResultSet data = DB.getData("SELECT\n"
                    + "ass_subowner.idass_subOwner,\n"
                    + "ass_subowner.ass_subOwner_name,\n"
                    + "ass_subowner.ass_subOwner_nic,\n"
                    + "ass_subowner.ass_subOwner_status,\n"
                    + "ass_subowner.Assessment_idAssessment\n"
                    + "FROM\n"
                    + "ass_subowner\n"
                    + "WHERE ass_subowner.Assessment_idAssessment = '" + modle.asses.StaticBadu.getAssessment().getIdAssessment() + "'");

            while (data.next()) {
                obal.add(new Owner(data.getInt("idass_subOwner"), data.getString("ass_subOwner_name"), data.getString("ass_subOwner_nic"), data.getInt("ass_subOwner_status")));
            }
            col_sub.setCellValueFactory(new PropertyValueFactory<>("sname"));
            col_nic.setCellValueFactory(new PropertyValueFactory<>("snic"));
            col_status.setCellValueFactory(new PropertyValueFactory<>("status"));
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
            boolean deleteSubOwner = subOwnerModle.deleteSubOwner(so.getId());
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

        public Owner(int id, String sname, String snic, int status) {
            this.id = id;
            this.sname = new SimpleStringProperty(sname);
            this.snic = new SimpleStringProperty(snic);
            this.status = status;
        }

        private final int id;
        private final SimpleStringProperty sname;
        private final SimpleStringProperty snic;
        private final int status;

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
