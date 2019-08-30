package controller.account;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import modle.GetInstans;

import java.net.URL;
import java.util.ResourceBundle;

public class Program implements Initializable {


    @FXML
    private JFXTextField txt_program;

    @FXML
    private JFXTextField txt_wedasatahana;

    @FXML
    private JFXTextField txt_oder;

    @FXML
    private JFXButton btn_addProgram;

    @FXML
    private TableView<?> tbl_program;

    @FXML
    private TableColumn<?, ?> col_program;

    @FXML
    private TableColumn<?, ?> col_wedasatahana;

    @FXML
    private TableColumn<?, ?> col_oder;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    @FXML
    void clickOnAddProgram(MouseEvent event) {

        String english = txt_program.getText();
        String sinhala = txt_wedasatahana.getText();
        String oder = txt_oder.getText();
        try {
            int i = Integer.parseInt(oder);
            boolean b = GetInstans.getProgram().saveProgram(english, sinhala, i, 1);
            if(b){
                modle.Allert.notificationGood("Program added", english);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
