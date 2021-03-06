package pojo;
// Generated Sep 6, 2019 4:30:16 PM by Hibernate Tools 4.3.1



/**
 * SlPaymentAmount generated by hbm2java
 */
public class SlPaymentAmount  implements java.io.Serializable {


     private int slPaymentAmountId;
     private Integer slPaymentAppCatgry;
     private Double slPaymentAmount;
     private Double slPaymentAmountVat;
     private Double slPaymentAmountStamp;
     private Double slPaymentAmountNbt;
     private Double slPaymentAmountOther;
     private Double slPaymentAmountOther1;
     private Double slPaymentAmountOther2;
     private Double slPaymentAmountDeposit;

    public SlPaymentAmount() {
    }

	
    public SlPaymentAmount(int slPaymentAmountId) {
        this.slPaymentAmountId = slPaymentAmountId;
    }
    public SlPaymentAmount(int slPaymentAmountId, Integer slPaymentAppCatgry, Double slPaymentAmount, Double slPaymentAmountVat, Double slPaymentAmountStamp, Double slPaymentAmountNbt, Double slPaymentAmountOther, Double slPaymentAmountOther1, Double slPaymentAmountOther2, Double slPaymentAmountDeposit) {
       this.slPaymentAmountId = slPaymentAmountId;
       this.slPaymentAppCatgry = slPaymentAppCatgry;
       this.slPaymentAmount = slPaymentAmount;
       this.slPaymentAmountVat = slPaymentAmountVat;
       this.slPaymentAmountStamp = slPaymentAmountStamp;
       this.slPaymentAmountNbt = slPaymentAmountNbt;
       this.slPaymentAmountOther = slPaymentAmountOther;
       this.slPaymentAmountOther1 = slPaymentAmountOther1;
       this.slPaymentAmountOther2 = slPaymentAmountOther2;
       this.slPaymentAmountDeposit = slPaymentAmountDeposit;
    }
   
    public int getSlPaymentAmountId() {
        return this.slPaymentAmountId;
    }
    
    public void setSlPaymentAmountId(int slPaymentAmountId) {
        this.slPaymentAmountId = slPaymentAmountId;
    }
    public Integer getSlPaymentAppCatgry() {
        return this.slPaymentAppCatgry;
    }
    
    public void setSlPaymentAppCatgry(Integer slPaymentAppCatgry) {
        this.slPaymentAppCatgry = slPaymentAppCatgry;
    }
    public Double getSlPaymentAmount() {
        return this.slPaymentAmount;
    }
    
    public void setSlPaymentAmount(Double slPaymentAmount) {
        this.slPaymentAmount = slPaymentAmount;
    }
    public Double getSlPaymentAmountVat() {
        return this.slPaymentAmountVat;
    }
    
    public void setSlPaymentAmountVat(Double slPaymentAmountVat) {
        this.slPaymentAmountVat = slPaymentAmountVat;
    }
    public Double getSlPaymentAmountStamp() {
        return this.slPaymentAmountStamp;
    }
    
    public void setSlPaymentAmountStamp(Double slPaymentAmountStamp) {
        this.slPaymentAmountStamp = slPaymentAmountStamp;
    }
    public Double getSlPaymentAmountNbt() {
        return this.slPaymentAmountNbt;
    }
    
    public void setSlPaymentAmountNbt(Double slPaymentAmountNbt) {
        this.slPaymentAmountNbt = slPaymentAmountNbt;
    }
    public Double getSlPaymentAmountOther() {
        return this.slPaymentAmountOther;
    }
    
    public void setSlPaymentAmountOther(Double slPaymentAmountOther) {
        this.slPaymentAmountOther = slPaymentAmountOther;
    }
    public Double getSlPaymentAmountOther1() {
        return this.slPaymentAmountOther1;
    }
    
    public void setSlPaymentAmountOther1(Double slPaymentAmountOther1) {
        this.slPaymentAmountOther1 = slPaymentAmountOther1;
    }
    public Double getSlPaymentAmountOther2() {
        return this.slPaymentAmountOther2;
    }
    
    public void setSlPaymentAmountOther2(Double slPaymentAmountOther2) {
        this.slPaymentAmountOther2 = slPaymentAmountOther2;
    }
    public Double getSlPaymentAmountDeposit() {
        return this.slPaymentAmountDeposit;
    }
    
    public void setSlPaymentAmountDeposit(Double slPaymentAmountDeposit) {
        this.slPaymentAmountDeposit = slPaymentAmountDeposit;
    }




}


