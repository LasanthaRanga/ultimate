package controller.assess;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXProgressBar;

import java.net.URL;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.util.Callback;
import modle.asses.QSProcess;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import pojo.Systemdate;

import static javax.swing.text.StyleConstants.Background;

/**
 * FXML Controller class
 *
 * @author RM.LasanthaRanga@gmail.com
 */
public class SystemSettingsController implements Initializable {

    @FXML
    private JFXDatePicker dp_systemDate;
    @FXML
    public JFXProgressBar progras;
    @FXML
    private Text txt_qStart;

    @FXML
    private DatePicker dp_1;

    @FXML
    private JFXButton btn_bup;

    @FXML
    void clickOnBup(MouseEvent event) {








    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        modle.StaticViews.getMc().changeTitle("System Settings");
    }


    @FXML
    void mouseEnterd(MouseEvent event) {
        System.out.println("ENTER");
    }

    @FXML
    void mouseExited(MouseEvent event) {
        System.out.println("EXITED");
    }


    final javafx.scene.layout.Background markedBackground = new Background(new BackgroundFill(Color.rgb(0x99, 0xE6, 0x99),
            CornerRadii.EMPTY,
            Insets.EMPTY));


    public static final LocalDate NOW_LOCAL_DATE() {
        String date = "20-12-2019";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        return localDate;
    }


    @FXML
    private void dateOnAction(ActionEvent event) {

        Date selectDate = Date.from(dp_systemDate.getValue().atStartOfDay().atZone(ZoneId.of("Asia/Colombo")).toInstant());

        Date systemdate = new Date();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String system = format.format(systemdate);
        String selected = format.format(selectDate);

        if (system.equals(selected)) {
            setSystemDate(selectDate);
        } else {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("System Date");
            alert.setHeaderText("You are going to apply wrong system date please check again");
            alert.setContentText("If you want to apply this date \n click ok");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
                modle.StaticBadu.setSelectedSystemDate(selectDate);
                setSystemDate(selectDate);
            } else {
                modle.StaticBadu.setSelectedSystemDate(null);
            }
        }
        System.out.println(modle.StaticBadu.getSelectedSystemDate());
    }

    public void setSystemDate(Date day) {
        Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            Systemdate systemDate = (Systemdate) session.createCriteria(Systemdate.class).add(Restrictions.eq("systemDateStatus", 1)).uniqueResult();
            if (systemDate != null) {
                Date systemDate1 = systemDate.getSystemDate();
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                String dbDate = format.format(systemDate1);
                String input = format.format(day);
                if (dbDate.equals(input)) {
                    modle.Allert.notificationInfo("System is date already set", dbDate);
                    System.out.println("Samanai");
                } else {
                    systemDate.setSystemDateStatus(0);
                    session.update(systemDate);
                    Systemdate sd = new Systemdate();
                    sd.setSystemDate(day);
                    sd.setSystemDateStatus(1);
                    Integer uid = modle.StaticViews.getLogUser().getIdUser();
                    sd.setChangeUserId(uid);
                    session.save(sd);
                    System.out.println("UPDate Una");
                }
            } else {
                //
                Systemdate sd = new Systemdate();
                sd.setSystemDate(day);
                sd.setSystemDateStatus(1);
                Integer uid = modle.StaticViews.getLogUser().getIdUser();
                sd.setChangeUserId(uid);
                session.save(sd);
                System.out.println("EMptye Update");
            }
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        } finally {
            session.close();
        }
        modle.StaticViews.getMc().systemDate();

    }

    @FXML
    private void qstartAction(ActionEvent event) {
        new Thread(() -> {

            new QSProcess().startProcess(progras);

        }).start();

    }

    @FXML
    private void onAction(ActionEvent event) {
        QuaryRun();
    }

    public static void QuaryRun() {
        String quary = "SELECT\n"
                + "alocationstatus1.idass_allocation,\n"
                + "alocationstatus1.Assessment_idAssessment,\n"
                + "alocationstatus1.ass_allocation,\n"
                + "alocationstatus1.co\n"
                + "FROM\n"
                + "alocationstatus1\n"
                + "WHERE\n"
                + "alocationstatus1.co > 1";

        int y = 0;

        try {
            ResultSet d1 = conn.DB.getData(quary);
            while (d1.next()) {
                int aid = d1.getInt("Assessment_idAssessment");

                String Q2 = "select *\n"
                        + "from ass_allocation\n"
                        + "where  Assessment_idAssessment = '" + aid + "'\n"
                        + "ORDER BY\n"
                        + "ass_allocation.idass_allocation ASC";

                ResultSet d2 = conn.DB.getData(Q2);

                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                while (d2.next()) {
                    int aloid = d2.getInt("idass_allocation");
                    int status = d2.getInt("ass_allocation_status");
                    arrayList.add(aloid);
                }
                int size = arrayList.size();
                System.out.println("SIZE = " + size);
                for (int x = 0; x < arrayList.size(); x++) {
                    Integer get = arrayList.get(x);

                    if (x == arrayList.size() - 1) {
                        System.out.println("Anthima Eka = " + get);
                    } else {
                        String update = "Update ass_allocation SET ass_allocation_status = 0 WHERE idass_allocation = '" + get + "'";
                        conn.DB.setData(update);
                        System.out.println("updated");
                        y++;
                    }
                }
                System.out.println("---");

            }

            System.out.println("Y==========" + y);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @FXML
    private void textOnAction(ActionEvent event) {
        modle.ErrorLog.writeLog("as", "asd", "asdf", "asdfg");
    }

}
