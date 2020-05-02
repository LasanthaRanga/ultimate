package modle.asses;

import conn.DB;

import java.sql.ResultSet;

/**
 * Created by Ranga on 2020-04-18.
 */
public class AssCustomer {

    public static int getFirstCustomerID(int idAssessment) {
        int cusid = 0;
        try {
            ResultSet data = DB.getData("SELECT cushasassess.customer_id FROM cushasassess WHERE cushasassess.assessment_id= '" + idAssessment + "' AND cushasassess.`status`=1 ORDER BY cushasassess.idCusHasAssess ASC");
            if (data.last()) {
                cusid = data.getInt("customer_id");
                return cusid;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cusid;
    }

    public static String getFirstCustomerName(int idAssessment) {
        String cusname = "";
        try {
            ResultSet data = DB.getData("SELECT customer.cus_name FROM cushasassess INNER JOIN customer ON cushasassess.customer_id=customer.idCustomer WHERE cushasassess.assessment_id='" + idAssessment + "' AND cushasassess.`status`=1 ORDER BY cushasassess.idCusHasAssess ASC");
            if (data.last()) {
                cusname = data.getString("cus_name");
                return cusname;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cusname;
    }

    public static CustomerObj getFirstCustomerObject(int idAssessment) {
        CustomerObj customerObj = null;
        try {
            ResultSet data = DB.getData("SELECT\n" +
                    "customer.idCustomer,\n" +
                    "customer.cus_name,\n" +
                    "customer.cus_person_title,\n" +
                    "customer.cus_nic,\n" +
                    "customer.cus_mobile,\n" +
                    "customer.cus_tel,\n" +
                    "customer.cus_address_l1,\n" +
                    "customer.cus_address_l2,\n" +
                    "customer.cus_address_l3,\n" +
                    "customer.cus_sity,\n" +
                    "customer.cus_status,\n" +
                    "customer.cus_syn,\n" +
                    "customer.cus_reg_date,\n" +
                    "customer.cus_update_date,\n" +
                    "customer.cus_name_sinhala,\n" +
                    "customer.cus_address_l1_sinhala,\n" +
                    "customer.cus_address_l2_sinhala,\n" +
                    "customer.cus_address_l3_sinhala\n" +
                    "FROM\n" +
                    "cushasassess\n" +
                    "INNER JOIN customer ON cushasassess.customer_id = customer.idCustomer\n" +
                    "WHERE\n" +
                    "cushasassess.assessment_id = '" + idAssessment + "' AND\n" +
                    "cushasassess.`status` = 1\n" +
                    "ORDER BY\n" +
                    "cushasassess.idCusHasAssess ASC");
            if (data.last()) {
                customerObj = new CustomerObj(
                        data.getInt("idCustomer"),
                        data.getString("cus_name"),
                        data.getInt("cus_person_title"),
                        data.getString("cus_nic"),
                        data.getString("cus_mobile"),
                        data.getString("cus_tel"),
                        data.getString("cus_address_l1"),
                        data.getString("cus_address_l2"),
                        data.getString("cus_address_l3"),
                        data.getString("cus_sity"),
                        data.getInt("cus_status"),
                        data.getInt("cus_syn"),
                        data.getString("cus_reg_date"),
                        data.getString("cus_update_date"),
                        data.getString("cus_address_l1_sinhala"),
                        data.getString("cus_address_l2_sinhala"),
                        data.getString("cus_address_l3_sinhala")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return customerObj;
    }


}
