package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Ribill generated by hbm2java
 */
public class Ribill  implements java.io.Serializable {


     private Integer idRibill;
     private Date billdate;
     private Double billtotal;
     private Integer userid;
     private Integer ribillStatus;
     private String billNo;
     private Integer officeId;
     private Integer oder;
     private Set<RibillList> ribillLists = new HashSet<RibillList>(0);

    public Ribill() {
    }

    public Ribill(Date billdate, Double billtotal, Integer userid, Integer ribillStatus, String billNo, Integer officeId, Integer oder, Set<RibillList> ribillLists) {
       this.billdate = billdate;
       this.billtotal = billtotal;
       this.userid = userid;
       this.ribillStatus = ribillStatus;
       this.billNo = billNo;
       this.officeId = officeId;
       this.oder = oder;
       this.ribillLists = ribillLists;
    }
   
    public Integer getIdRibill() {
        return this.idRibill;
    }
    
    public void setIdRibill(Integer idRibill) {
        this.idRibill = idRibill;
    }
    public Date getBilldate() {
        return this.billdate;
    }
    
    public void setBilldate(Date billdate) {
        this.billdate = billdate;
    }
    public Double getBilltotal() {
        return this.billtotal;
    }
    
    public void setBilltotal(Double billtotal) {
        this.billtotal = billtotal;
    }
    public Integer getUserid() {
        return this.userid;
    }
    
    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    public Integer getRibillStatus() {
        return this.ribillStatus;
    }
    
    public void setRibillStatus(Integer ribillStatus) {
        this.ribillStatus = ribillStatus;
    }
    public String getBillNo() {
        return this.billNo;
    }
    
    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }
    public Integer getOfficeId() {
        return this.officeId;
    }
    
    public void setOfficeId(Integer officeId) {
        this.officeId = officeId;
    }
    public Integer getOder() {
        return this.oder;
    }
    
    public void setOder(Integer oder) {
        this.oder = oder;
    }
    public Set<RibillList> getRibillLists() {
        return this.ribillLists;
    }
    
    public void setRibillLists(Set<RibillList> ribillLists) {
        this.ribillLists = ribillLists;
    }




}


