package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1



/**
 * ExMultyChequeDetails generated by hbm2java
 */
public class ExMultyChequeDetails  implements java.io.Serializable {


     private Integer exMultyChequeId;
     private Integer exMultyChequeVoucherInfoId;
     private Double exChequeAmount;
     private Integer exActiveStatus;
     private Integer exCusId;

    public ExMultyChequeDetails() {
    }

    public ExMultyChequeDetails(Integer exMultyChequeVoucherInfoId, Double exChequeAmount, Integer exActiveStatus, Integer exCusId) {
       this.exMultyChequeVoucherInfoId = exMultyChequeVoucherInfoId;
       this.exChequeAmount = exChequeAmount;
       this.exActiveStatus = exActiveStatus;
       this.exCusId = exCusId;
    }
   
    public Integer getExMultyChequeId() {
        return this.exMultyChequeId;
    }
    
    public void setExMultyChequeId(Integer exMultyChequeId) {
        this.exMultyChequeId = exMultyChequeId;
    }
    public Integer getExMultyChequeVoucherInfoId() {
        return this.exMultyChequeVoucherInfoId;
    }
    
    public void setExMultyChequeVoucherInfoId(Integer exMultyChequeVoucherInfoId) {
        this.exMultyChequeVoucherInfoId = exMultyChequeVoucherInfoId;
    }
    public Double getExChequeAmount() {
        return this.exChequeAmount;
    }
    
    public void setExChequeAmount(Double exChequeAmount) {
        this.exChequeAmount = exChequeAmount;
    }
    public Integer getExActiveStatus() {
        return this.exActiveStatus;
    }
    
    public void setExActiveStatus(Integer exActiveStatus) {
        this.exActiveStatus = exActiveStatus;
    }
    public Integer getExCusId() {
        return this.exCusId;
    }
    
    public void setExCusId(Integer exCusId) {
        this.exCusId = exCusId;
    }




}


