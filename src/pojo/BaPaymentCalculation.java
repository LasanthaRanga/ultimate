package pojo;
// Generated Oct 3, 2019 9:56:57 AM by Hibernate Tools 4.3.1



/**
 * BaPaymentCalculation generated by hbm2java
 */
public class BaPaymentCalculation  implements java.io.Serializable {


     private int baPayId;
     private Double baPayStartRate;
     private Double baPayEndRate;
     private Double baPayPrice;
     private String baPayType;
     private Integer baPayStatus;

    public BaPaymentCalculation() {
    }

	
    public BaPaymentCalculation(int baPayId) {
        this.baPayId = baPayId;
    }
    public BaPaymentCalculation(int baPayId, Double baPayStartRate, Double baPayEndRate, Double baPayPrice, String baPayType, Integer baPayStatus) {
       this.baPayId = baPayId;
       this.baPayStartRate = baPayStartRate;
       this.baPayEndRate = baPayEndRate;
       this.baPayPrice = baPayPrice;
       this.baPayType = baPayType;
       this.baPayStatus = baPayStatus;
    }
   
    public int getBaPayId() {
        return this.baPayId;
    }
    
    public void setBaPayId(int baPayId) {
        this.baPayId = baPayId;
    }
    public Double getBaPayStartRate() {
        return this.baPayStartRate;
    }
    
    public void setBaPayStartRate(Double baPayStartRate) {
        this.baPayStartRate = baPayStartRate;
    }
    public Double getBaPayEndRate() {
        return this.baPayEndRate;
    }
    
    public void setBaPayEndRate(Double baPayEndRate) {
        this.baPayEndRate = baPayEndRate;
    }
    public Double getBaPayPrice() {
        return this.baPayPrice;
    }
    
    public void setBaPayPrice(Double baPayPrice) {
        this.baPayPrice = baPayPrice;
    }
    public String getBaPayType() {
        return this.baPayType;
    }
    
    public void setBaPayType(String baPayType) {
        this.baPayType = baPayType;
    }
    public Integer getBaPayStatus() {
        return this.baPayStatus;
    }
    
    public void setBaPayStatus(Integer baPayStatus) {
        this.baPayStatus = baPayStatus;
    }




}

