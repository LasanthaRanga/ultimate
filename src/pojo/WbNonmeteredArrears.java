package pojo;
// Generated Oct 3, 2019 9:56:57 AM by Hibernate Tools 4.3.1



/**
 * WbNonmeteredArrears generated by hbm2java
 */
public class WbNonmeteredArrears  implements java.io.Serializable {


     private String customerId;
     private WbMCustomer wbMCustomer;
     private double arrears;
     private Integer status;

    public WbNonmeteredArrears() {
    }

	
    public WbNonmeteredArrears(WbMCustomer wbMCustomer, double arrears) {
        this.wbMCustomer = wbMCustomer;
        this.arrears = arrears;
    }
    public WbNonmeteredArrears(WbMCustomer wbMCustomer, double arrears, Integer status) {
       this.wbMCustomer = wbMCustomer;
       this.arrears = arrears;
       this.status = status;
    }
   
    public String getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public WbMCustomer getWbMCustomer() {
        return this.wbMCustomer;
    }
    
    public void setWbMCustomer(WbMCustomer wbMCustomer) {
        this.wbMCustomer = wbMCustomer;
    }
    public double getArrears() {
        return this.arrears;
    }
    
    public void setArrears(double arrears) {
        this.arrears = arrears;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }




}


