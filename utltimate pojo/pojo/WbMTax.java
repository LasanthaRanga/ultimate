package pojo;
// Generated Oct 3, 2019 9:56:57 AM by Hibernate Tools 4.3.1



/**
 * WbMTax generated by hbm2java
 */
public class WbMTax  implements java.io.Serializable {


     private Integer id;
     private String taxName;
     private Double percentage;
     private String status;
     private Double taxAmountToTakeVat;
     private Integer vattakeAmountActiveNot;

    public WbMTax() {
    }

    public WbMTax(String taxName, Double percentage, String status, Double taxAmountToTakeVat, Integer vattakeAmountActiveNot) {
       this.taxName = taxName;
       this.percentage = percentage;
       this.status = status;
       this.taxAmountToTakeVat = taxAmountToTakeVat;
       this.vattakeAmountActiveNot = vattakeAmountActiveNot;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTaxName() {
        return this.taxName;
    }
    
    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }
    public Double getPercentage() {
        return this.percentage;
    }
    
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Double getTaxAmountToTakeVat() {
        return this.taxAmountToTakeVat;
    }
    
    public void setTaxAmountToTakeVat(Double taxAmountToTakeVat) {
        this.taxAmountToTakeVat = taxAmountToTakeVat;
    }
    public Integer getVattakeAmountActiveNot() {
        return this.vattakeAmountActiveNot;
    }
    
    public void setVattakeAmountActiveNot(Integer vattakeAmountActiveNot) {
        this.vattakeAmountActiveNot = vattakeAmountActiveNot;
    }




}

