package pojo;
// Generated Aug 6, 2019 9:53:07 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * AssCreditdebit generated by hbm2java
 */
public class AssCreditdebit  implements java.io.Serializable {


     private Integer idAssCreditDebit;
     private Assessment assessment;
     private String assCreditDebitDiscription;
     private Integer assCreditDebitCd;
     private Double assCreditDebitAmount;
     private Double assBalance;
     private Date assCreditDebitDate;
     private Integer assCreditDebitStatus;

    public AssCreditdebit() {
    }

	
    public AssCreditdebit(Assessment assessment) {
        this.assessment = assessment;
    }
    public AssCreditdebit(Assessment assessment, String assCreditDebitDiscription, Integer assCreditDebitCd, Double assCreditDebitAmount, Double assBalance, Date assCreditDebitDate, Integer assCreditDebitStatus) {
       this.assessment = assessment;
       this.assCreditDebitDiscription = assCreditDebitDiscription;
       this.assCreditDebitCd = assCreditDebitCd;
       this.assCreditDebitAmount = assCreditDebitAmount;
       this.assBalance = assBalance;
       this.assCreditDebitDate = assCreditDebitDate;
       this.assCreditDebitStatus = assCreditDebitStatus;
    }
   
    public Integer getIdAssCreditDebit() {
        return this.idAssCreditDebit;
    }
    
    public void setIdAssCreditDebit(Integer idAssCreditDebit) {
        this.idAssCreditDebit = idAssCreditDebit;
    }
    public Assessment getAssessment() {
        return this.assessment;
    }
    
    public void setAssessment(Assessment assessment) {
        this.assessment = assessment;
    }
    public String getAssCreditDebitDiscription() {
        return this.assCreditDebitDiscription;
    }
    
    public void setAssCreditDebitDiscription(String assCreditDebitDiscription) {
        this.assCreditDebitDiscription = assCreditDebitDiscription;
    }
    public Integer getAssCreditDebitCd() {
        return this.assCreditDebitCd;
    }
    
    public void setAssCreditDebitCd(Integer assCreditDebitCd) {
        this.assCreditDebitCd = assCreditDebitCd;
    }
    public Double getAssCreditDebitAmount() {
        return this.assCreditDebitAmount;
    }
    
    public void setAssCreditDebitAmount(Double assCreditDebitAmount) {
        this.assCreditDebitAmount = assCreditDebitAmount;
    }
    public Double getAssBalance() {
        return this.assBalance;
    }
    
    public void setAssBalance(Double assBalance) {
        this.assBalance = assBalance;
    }
    public Date getAssCreditDebitDate() {
        return this.assCreditDebitDate;
    }
    
    public void setAssCreditDebitDate(Date assCreditDebitDate) {
        this.assCreditDebitDate = assCreditDebitDate;
    }
    public Integer getAssCreditDebitStatus() {
        return this.assCreditDebitStatus;
    }
    
    public void setAssCreditDebitStatus(Integer assCreditDebitStatus) {
        this.assCreditDebitStatus = assCreditDebitStatus;
    }




}


