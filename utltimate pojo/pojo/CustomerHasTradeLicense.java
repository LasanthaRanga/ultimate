package pojo;
// Generated Sep 6, 2019 4:30:16 PM by Hibernate Tools 4.3.1



/**
 * CustomerHasTradeLicense generated by hbm2java
 */
public class CustomerHasTradeLicense  implements java.io.Serializable {


     private Integer idCustomerHasTradeLicensecol;
     private Customer customer;
     private TradeLicense tradeLicense;
     private Integer syn;

    public CustomerHasTradeLicense() {
    }

	
    public CustomerHasTradeLicense(Customer customer, TradeLicense tradeLicense) {
        this.customer = customer;
        this.tradeLicense = tradeLicense;
    }
    public CustomerHasTradeLicense(Customer customer, TradeLicense tradeLicense, Integer syn) {
       this.customer = customer;
       this.tradeLicense = tradeLicense;
       this.syn = syn;
    }
   
    public Integer getIdCustomerHasTradeLicensecol() {
        return this.idCustomerHasTradeLicensecol;
    }
    
    public void setIdCustomerHasTradeLicensecol(Integer idCustomerHasTradeLicensecol) {
        this.idCustomerHasTradeLicensecol = idCustomerHasTradeLicensecol;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public TradeLicense getTradeLicense() {
        return this.tradeLicense;
    }
    
    public void setTradeLicense(TradeLicense tradeLicense) {
        this.tradeLicense = tradeLicense;
    }
    public Integer getSyn() {
        return this.syn;
    }
    
    public void setSyn(Integer syn) {
        this.syn = syn;
    }




}

