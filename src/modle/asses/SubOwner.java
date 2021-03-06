/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modle.asses;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import pojo.AssSubowner;
import pojo.Cushasassess;
import pojo.Customer;


/**
 * @author RM.LasanthaRanga@gmail.com
 */
public class SubOwner {

    public boolean saveSubOwner(AssSubowner sub) {
        Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(sub);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return false;
        } finally {
            session.close();
        }
    }

    public List<AssSubowner> getSubList(pojo.Assessment assessment) {
        Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        try {
            pojo.Assessment load = (pojo.Assessment) session.load(pojo.Assessment.class, assessment.getIdAssessment());
            List<AssSubowner> list = session.createCriteria(AssSubowner.class).add(Restrictions.eq("assessment", load)).list();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return null;
        } finally {
            session.close();
        }
    }

    public boolean deleteSubOwner(int sub, int id) {

        Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            pojo.Customer customer = (pojo.Customer) session.load(Customer.class, sub);
            List<pojo.Cushasassess> cha = session.createCriteria(Cushasassess.class).add(Restrictions.eq("customer", customer)).list();
            for (pojo.Cushasassess cus : cha) {
                Integer idAssessment = cus.getAssessment().getIdAssessment();
                if (id == idAssessment) {
                    cus.setStatus(0);
                    session.update(cus);
                }
            }
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return false;
        } finally {
            session.close();
        }
    }


    public boolean updateSubOwner(int id, String name, String nic, int status) {
        Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            AssSubowner subowner = (AssSubowner) session.load(AssSubowner.class, id);
            subowner.setAssSubOwnerName(name);
            subowner.setAssSubOwnerNic(nic);
            subowner.setAssSubOwnerStatus(status);
            session.update(subowner);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return false;
        } finally {
            session.close();
        }
    }

}
