package pojo;
// Generated Aug 6, 2019 9:53:07 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Cheack generated by hbm2java
 */
public class Cheack  implements java.io.Serializable {


     private Integer idCheack;
     private Receipt receipt;
     private String cheackNo;
     private Date cheackDate;
     private Double cheackPrice;
     private Date cheackToday;
     private Integer cheackStatus;
     private Integer cheackSyn;
     private String cheackcol;

    public Cheack() {
    }

	
    public Cheack(Receipt receipt) {
        this.receipt = receipt;
    }
    public Cheack(Receipt receipt, String cheackNo, Date cheackDate, Double cheackPrice, Date cheackToday, Integer cheackStatus, Integer cheackSyn, String cheackcol) {
       this.receipt = receipt;
       this.cheackNo = cheackNo;
       this.cheackDate = cheackDate;
       this.cheackPrice = cheackPrice;
       this.cheackToday = cheackToday;
       this.cheackStatus = cheackStatus;
       this.cheackSyn = cheackSyn;
       this.cheackcol = cheackcol;
    }
   
    public Integer getIdCheack() {
        return this.idCheack;
    }
    
    public void setIdCheack(Integer idCheack) {
        this.idCheack = idCheack;
    }
    public Receipt getReceipt() {
        return this.receipt;
    }
    
    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }
    public String getCheackNo() {
        return this.cheackNo;
    }
    
    public void setCheackNo(String cheackNo) {
        this.cheackNo = cheackNo;
    }
    public Date getCheackDate() {
        return this.cheackDate;
    }
    
    public void setCheackDate(Date cheackDate) {
        this.cheackDate = cheackDate;
    }
    public Double getCheackPrice() {
        return this.cheackPrice;
    }
    
    public void setCheackPrice(Double cheackPrice) {
        this.cheackPrice = cheackPrice;
    }
    public Date getCheackToday() {
        return this.cheackToday;
    }
    
    public void setCheackToday(Date cheackToday) {
        this.cheackToday = cheackToday;
    }
    public Integer getCheackStatus() {
        return this.cheackStatus;
    }
    
    public void setCheackStatus(Integer cheackStatus) {
        this.cheackStatus = cheackStatus;
    }
    public Integer getCheackSyn() {
        return this.cheackSyn;
    }
    
    public void setCheackSyn(Integer cheackSyn) {
        this.cheackSyn = cheackSyn;
    }
    public String getCheackcol() {
        return this.cheackcol;
    }
    
    public void setCheackcol(String cheackcol) {
        this.cheackcol = cheackcol;
    }




}


