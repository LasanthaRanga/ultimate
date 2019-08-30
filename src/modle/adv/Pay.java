/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modle.adv;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.sun.jmx.snmp.SnmpUnknownModelLcdException;
import modle.GetInstans;
import modle.StaticViews;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import pojo.AdvAdvertising;
import pojo.Cheack;
import pojo.Receipt;

/**
 * @author RM.LasanthaRanga@gmail.com
 */
public class Pay {

    public int payNow(int advID, double cash, double check, double total, String chNo, Date chDate, int bank) {

        Date systemDate = GetInstans.getQuater().getSystemDate();

        String genarateRisiptNo = genarateRisiptNo();

        Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        int idRecipt = 0;
        try {
            pojo.ApplicationCatagory ac = (pojo.ApplicationCatagory) session.load(pojo.ApplicationCatagory.class, 1);
            AdvAdvertising Advertising = (AdvAdvertising) session.load(AdvAdvertising.class, advID);
            //Recipt ======= 
            Receipt receipt = new Receipt(ac);
            receipt.setReceptApplicationId(advID);
            receipt.setReceiptPrintNo(genarateRisiptNo);
            receipt.setCheack(check);
            receipt.setCesh(cash);
            receipt.setReceiptTotal(total);
            receipt.setReceiptStatus(0);
            receipt.setReceiptSyn(1);
            receipt.setChqueNo(chNo);
            receipt.setChqueBank(bank + "");
            receipt.setReceiptDay(systemDate);
            receipt.setChqueDate(chDate);
            Integer officeIdOffice = StaticViews.getLogUser().getOfficeIdOffice();
            int appAccountByOffice = GetInstans.getAha().getAppAccountByOffice(1, officeIdOffice);
            receipt.setOfficeIdOffice(officeIdOffice);
            pojo.User u = (pojo.User) session.load(pojo.User.class, StaticViews.getLogUser().getIdUser());
            receipt.setUser(u);
            receipt.setReceiptAccountId(appAccountByOffice);


            Serializable save = session.save(receipt);
            idRecipt = Integer.parseInt(save.toString());

            Advertising.setAdvPaidNotpaid(0);
            Advertising.setAdvCheque(check);
            Advertising.setAdvCash(cash);
            Advertising.setAdvChequeNo(chNo);
            Advertising.setAdvChequeBank(bank);
            Advertising.setAdvChequeDate(chDate);
            Advertising.setReceiptIdReceipt(receipt.getIdReceipt());
            Advertising.setUserIdUser(modle.StaticViews.getLogUser().getIdUser());
            Advertising.setOfficeId(officeIdOffice);

            if (check > 0) {
                Cheack ch = new Cheack(receipt);
                ch.setCheackToday(new Date());
                ch.setCheackNo(chNo);
                ch.setCheackDate(chDate);
                ch.setCheackStatus(1);
                ch.setCheackSyn(1);
                ch.setCheackPrice(check);
                session.save(ch);
            }

            session.update(Advertising);
            transaction.commit();
            return idRecipt;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return 0;
        } finally {
            session.close();
        }
    }

    public String genarateRisiptNo() {
        Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
        String rn = "";
        try {
            Criteria criteria = session.createCriteria(Receipt.class);
            List<Receipt> list = criteria.add(Restrictions.eq("applicationCatagory", (pojo.ApplicationCatagory) session.load(pojo.ApplicationCatagory.class, 1))).list();
            int size = list.size();
            rn = "MCK/ADV : " + (size + 1);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return rn;
    }


    public void compleetePayment(int payid) {
        System.out.println(payid);
        try {
            conn.DB.setData("UPDATE `adv_advertising` SET   `adv_paid_notpaid`='1' WHERE (`receipt_idReceipt`='" + payid + "')");
            conn.DB.setData("UPDATE `receipt` SET  `receipt_status`='1'  WHERE (`idReceipt`='" + payid + "')");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

    }


}
