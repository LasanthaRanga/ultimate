package pojo;
// Generated Aug 6, 2019 9:53:07 AM by Hibernate Tools 4.3.1



/**
 * TaxRate generated by hbm2java
 */
public class TaxRate  implements java.io.Serializable {


     private Integer idTaxRate;
     private Double min;
     private Double max;
     private Double rate;
     private Integer status;
     private String taxType;
     private Integer taxTypeNo;

    public TaxRate() {
    }

    public TaxRate(Double min, Double max, Double rate, Integer status, String taxType, Integer taxTypeNo) {
       this.min = min;
       this.max = max;
       this.rate = rate;
       this.status = status;
       this.taxType = taxType;
       this.taxTypeNo = taxTypeNo;
    }
   
    public Integer getIdTaxRate() {
        return this.idTaxRate;
    }
    
    public void setIdTaxRate(Integer idTaxRate) {
        this.idTaxRate = idTaxRate;
    }
    public Double getMin() {
        return this.min;
    }
    
    public void setMin(Double min) {
        this.min = min;
    }
    public Double getMax() {
        return this.max;
    }
    
    public void setMax(Double max) {
        this.max = max;
    }
    public Double getRate() {
        return this.rate;
    }
    
    public void setRate(Double rate) {
        this.rate = rate;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getTaxType() {
        return this.taxType;
    }
    
    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }
    public Integer getTaxTypeNo() {
        return this.taxTypeNo;
    }
    
    public void setTaxTypeNo(Integer taxTypeNo) {
        this.taxTypeNo = taxTypeNo;
    }




}


