package pojo;
// Generated Dec 19, 2019 12:34:46 PM by Hibernate Tools 4.3.1



/**
 * SrShopHasValue generated by hbm2java
 */
public class SrShopHasValue  implements java.io.Serializable {


     private Integer shopHasValueId;
     private SrShop srShop;
     private SrShopValues srShopValues;
     private Integer valueStatus;

    public SrShopHasValue() {
    }

    public SrShopHasValue(SrShop srShop, SrShopValues srShopValues, Integer valueStatus) {
       this.srShop = srShop;
       this.srShopValues = srShopValues;
       this.valueStatus = valueStatus;
    }
   
    public Integer getShopHasValueId() {
        return this.shopHasValueId;
    }
    
    public void setShopHasValueId(Integer shopHasValueId) {
        this.shopHasValueId = shopHasValueId;
    }
    public SrShop getSrShop() {
        return this.srShop;
    }
    
    public void setSrShop(SrShop srShop) {
        this.srShop = srShop;
    }
    public SrShopValues getSrShopValues() {
        return this.srShopValues;
    }
    
    public void setSrShopValues(SrShopValues srShopValues) {
        this.srShopValues = srShopValues;
    }
    public Integer getValueStatus() {
        return this.valueStatus;
    }
    
    public void setValueStatus(Integer valueStatus) {
        this.valueStatus = valueStatus;
    }




}

