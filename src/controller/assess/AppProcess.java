package controller.assess;

import com.jfoenix.controls.JFXCheckBox;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import modle.asses.HolderAssess;

import java.net.URL;
import java.util.ResourceBundle;

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


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tableCollomAssing();
        loadTableFromSelected();
    }

    @FXML
    void selectFormTable(MouseEvent event) {

        if (tbl_assess.getSelectionModel().getSelectedItem() != null) {
            HolderAssess selectedItem = tbl_assess.getSelectionModel().getSelectedItem();

            System.out.println(selectedItem.getIdAssess());
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
    }

    public void loadTableFromSelected() {
        tbl_assess.setItems(modle.StaticBadu.getSelectedList());
    }



    public void testArriasWarrant(int id){
    }


}
