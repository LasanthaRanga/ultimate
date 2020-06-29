package controller.mix;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;
import modle.ComboItem;
import modle.ComboLoad;


import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Ranga Rathnayake on 2020-06-04.
 */
public class Advance implements Initializable {

    @FXML
    private JFXComboBox<ComboItem> com_1;

    @FXML
    private JFXComboBox<ComboItem> com2;


    @FXML
    private JFXButton btn_close;

    @FXML
    void close_on_action(ActionEvent event) {
        btn_close.getScene().getWindow().hide();
    }


    @FXML
    void com1Action(ActionEvent event) {
        int x = com_1.getSelectionModel().getSelectedItem().getId();


        ObservableList<ComboItem> comboItems = ComboLoad.loadCombo("SELECT\n" +
                "acc_bal_sheet_subtitle.bal_sheet_subtitle_id,\n" +
                "acc_bal_sheet_subtitle.bal_sheet_subtitle_name\n" +
                "FROM\n" +
                "acc_bal_sheet_subtitle\n" +
                "WHERE\n" +
                "acc_bal_sheet_subtitle.bal_sheet_title_id = " + x);
        com2.setItems(comboItems);
    }

    @FXML
    void com2Action(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadBalanceSheetTitle();
    }

    public void loadBalanceSheetTitle() {
        ObservableList<ComboItem> comboItems = ComboLoad.loadCombo("SELECT\n" +
                "acc_bal_sheet_title.bal_sheet_title_id,\n" +
                "acc_bal_sheet_title.bal_sheet_title_name\n" +
                "FROM\n" +
                "acc_bal_sheet_title\n");
        com_1.setItems(comboItems);


    }



}
