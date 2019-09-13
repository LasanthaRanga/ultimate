package controller.assess;

import com.jfoenix.controls.*;
import conn.DB;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import modle.ComboItem;
import modle.GetInstans;
import modle.asses.AppType;
import modle.asses.GetArrias;
import modle.asses.HolderAssess;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import static modle.Allert.*;

public class AppProcess implements Initializable {

    @FXML
    private TableView<HolderAssess> tbl_assess;
    @FXML
    private TableColumn<HolderAssess, Double> col_order;
    @FXML
    private TableColumn<HolderAssess, String> col_nature;
    @FXML
    private TableColumn<HolderAssess, String> col_ward;
    @FXML
    private TableColumn<HolderAssess, String> col_street;
    @FXML
    private TableColumn<HolderAssess, String> col_assess;
    @FXML
    private TableColumn<HolderAssess, String> col_obsalut;
    @FXML
    private TableColumn<HolderAssess, String> col_allocation;
    @FXML
    private TableColumn<HolderAssess, String> col_owner;
    @FXML
    private TableColumn<HolderAssess, JFXCheckBox> col_ch;


    @FXML
    private TableView<HolderAssess> tbl_assess1;

    @FXML
    private TableColumn<HolderAssess, Double> col_order1;

    @FXML
    private TableColumn<HolderAssess, String> col_nature1;

    @FXML
    private TableColumn<HolderAssess, String> col_ward1;

    @FXML
    private TableColumn<HolderAssess, String> col_street1;

    @FXML
    private TableColumn<HolderAssess, String> col_assess1;

    @FXML
    private TableColumn<HolderAssess, String> col_obsalut1;

    @FXML
    private TableColumn<HolderAssess, String> col_allocation1;

    @FXML
    private TableColumn<HolderAssess, String> col_owner1;

    @FXML
    private TableColumn<HolderAssess, JFXCheckBox> col_ch1;


    @FXML
    private Text txt_arrias;

    @FXML
    private Text txt_warant;

    @FXML
    private Text txt_cd;

    @FXML
    private Text txt_total;


    @FXML
    private JFXButton btn_start_process;

    @FXML
    private JFXComboBox<ComboItem> com_for;

    @FXML
    private JFXTextArea txt_description;

    @FXML
    private JFXTextField txt_names;

    @FXML
    private JFXButton btn_process;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tableCollomAssing();
        loadTableFromSelected();
        com_for.setItems(modle.GetInstans.getAppType().loadAppTypeCombo());
    }

    @FXML
    void selectFormTable(MouseEvent event) {

        if (tbl_assess.getSelectionModel().getSelectedItem() != null) {
            HolderAssess selectedItem = tbl_assess.getSelectionModel().getSelectedItem();
            System.out.println(selectedItem.getIdAssess());
            testArriasWarrant(selectedItem.getIdAssess());
        }


    }

    public void tableCollomAssing() {
        col_order.setCellValueFactory(new PropertyValueFactory<>("order"));
        col_nature.setCellValueFactory(new PropertyValueFactory<>("Natrue"));
        col_ward.setCellValueFactory(new PropertyValueFactory<>("ward"));
        col_street.setCellValueFactory(new PropertyValueFactory<>("street"));
        col_assess.setCellValueFactory(new PropertyValueFactory<>("assessmentNo"));
        col_obsalut.setCellValueFactory(new PropertyValueFactory<>("osaleteNo"));
        col_allocation.setCellValueFactory(new PropertyValueFactory<>("alocation"));
        col_owner.setCellValueFactory(new PropertyValueFactory<>("owner"));
        // col_status.setCellValueFactory(new PropertyValueFactory<>("status"));
        col_ch.setCellValueFactory(new PropertyValueFactory<>("ch"));


        col_order1.setCellValueFactory(new PropertyValueFactory<>("order"));
        col_nature1.setCellValueFactory(new PropertyValueFactory<>("Natrue"));
        col_ward1.setCellValueFactory(new PropertyValueFactory<>("ward"));
        col_street1.setCellValueFactory(new PropertyValueFactory<>("street"));
        col_assess1.setCellValueFactory(new PropertyValueFactory<>("assessmentNo"));
        col_obsalut1.setCellValueFactory(new PropertyValueFactory<>("osaleteNo"));
        col_allocation1.setCellValueFactory(new PropertyValueFactory<>("alocation"));
        col_owner1.setCellValueFactory(new PropertyValueFactory<>("owner"));
        // col_status.setCellValueFactory(new PropertyValueFactory<>("status"));
//        col_ch1.setCellValueFactory(new PropertyValueFactory<>("ch"));


    }

    public void loadTableFromSelected() {
        tbl_assess.setItems(modle.StaticBadu.getSelectedList());
    }


    public void testArriasWarrant(int id) {
        GetArrias.AllArrias awc = modle.GetInstans.getGetArrias().getAllArriasGetAllWarrant(id);
        txt_arrias.setText(modle.Round.roundToString(awc.getTotalArrias()));
        txt_warant.setText(modle.Round.roundToString(awc.getTotalWarrant()));
        txt_cd.setText(modle.Round.roundToString(awc.getCd()));
        txt_total.setText(modle.Round.roundToString(awc.getCd() + awc.getTotalArrias() + awc.getTotalWarrant()));
    }


    @FXML
    void clickOnAddToProcess(MouseEvent event) {
        checkOllArrias();


    }

    @FXML
    void clickOnStart(MouseEvent event) {
        if (tbl_assess1.getItems().size() > 0) {
            ComboItem selectedItem = com_for.getSelectionModel().getSelectedItem();
            if (selectedItem != null) {
                if (txt_description.getText().length() > 2 && txt_names.getText().length() > 1) {
                    crateNewApp();
                }
            }
        }
    }


    ObservableList<HolderAssess> selected = FXCollections.observableArrayList();


    public boolean checkOllArrias() {
        boolean hasArrias = false;
        selected.clear();
        ObservableList<HolderAssess> items = tbl_assess.getItems();
        for (HolderAssess ha : items) {
            if (ha.getCh().isSelected()) {
                GetArrias.AllArrias awc = modle.GetInstans.getGetArrias().getAllArriasGetAllWarrant(ha.getIdAssess());
                if (awc.HaveArrias()) {
                    modle.Allert.notificationError("There is an Arrears", ha.getAssessmentNo());
                    // hasArrias = true;
                    // break;
                } else {
                    selected.add(ha);
                }
            }
        }
        tbl_assess1.setItems(selected);
        return hasArrias;
    }


    public void crateNewApp() {
        try {
            String systemdate = GetInstans.getQuater().getSystemDateStringByQuary();

            String appQuery = "INSERT INTO `ass_app` (  `assapp_date`, `assapp_user`, `assapp_step`, `assapp_description`, `assapp_status`, `assapp_type`, `assapp_refno`,`assapp_names` )\n" +
                    "VALUES\n" +
                    "\t( '" + systemdate + "', '" + modle.StaticViews.getLogUser().getIdUser() + "', 1, '" + txt_description.getText() + "', 0, '" + com_for.getSelectionModel().getSelectedItem().getId() + "', '', '" + txt_names.getText() + "' )";
            String query = "SELECT MAX(idAssapp) FROM ass_app";
            int appid = 0;
            conn.DB.setData(appQuery);
            ResultSet data = DB.getData(query);
            if (data.last()) {
                appid = data.getInt("MAX(idAssapp)");
            }

            for (HolderAssess ha : selected) {
                int idAssess = ha.getIdAssess();
                conn.DB.setData("INSERT INTO `ass_newold` (  `oldid`, `newid`, `appid`, `newold_status` )\n" +
                        "VALUES\n" +
                        "\t(  '" + idAssess + "', NULL, '" + appid + "', 1 )");
                conn.DB.setData("UPDATE `assessment` SET `assessment_syn` = 3 WHERE `idAssessment` = '" + idAssess + "'");
            }
            modle.Allert.notificationGood("Process Start", com_for.getSelectionModel().getSelectedItem().getNamee());
            clearAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }

    public void clearAll() {
        tbl_assess1.setItems(null);
        selected.clear();
        tbl_assess.setItems(null);
        txt_names.setText(null);
        txt_description.setText(null);
        txt_total.setText(null);
        txt_warant.setText(null);
        txt_arrias.setText(null);
        txt_cd.setText(null);
    }


}
