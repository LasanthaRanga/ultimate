package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TradeLicense generated by hbm2java
 */
public class TradeLicense  implements java.io.Serializable {


     private Integer idTradeLicense;
     private Application application;
     private Payment payment;
     private String licenNo;
     private Date tradeLicenseDate;
     private Integer status;
     private Integer syn;
     private Set<CustomerHasTradeLicense> customerHasTradeLicenses = new HashSet<CustomerHasTradeLicense>(0);

    public TradeLicense() {
    }

	
    public TradeLicense(Application application, Payment payment) {
        this.application = application;
        this.payment = payment;
    }
    public TradeLicense(Application application, Payment payment, String licenNo, Date tradeLicenseDate, Integer status, Integer syn, Set<CustomerHasTradeLicense> customerHasTradeLicenses) {
       this.application = application;
       this.payment = payment;
       this.licenNo = licenNo;
       this.tradeLicenseDate = tradeLicenseDate;
       this.status = status;
       this.syn = syn;
       this.customerHasTradeLicenses = customerHasTradeLicenses;
    }
   
    public Integer getIdTradeLicense() {
        return this.idTradeLicense;
    }
    
    public void setIdTradeLicense(Integer idTradeLicense) {
        this.idTradeLicense = idTradeLicense;
    }
    public Application getApplication() {
        return this.application;
    }
    
    public void setApplication(Application application) {
        this.application = application;
    }
    public Payment getPayment() {
        return this.payment;
    }
    
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    public String getLicenNo() {
        return this.licenNo;
    }
    
    public void setLicenNo(String licenNo) {
        this.licenNo = licenNo;
    }
    public Date getTradeLicenseDate() {
        return this.tradeLicenseDate;
    }
    
    public void setTradeLicenseDate(Date tradeLicenseDate) {
        this.tradeLicenseDate = tradeLicenseDate;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getSyn() {
        return this.syn;
    }
    
    public void setSyn(Integer syn) {
        this.syn = syn;
    }
    public Set<CustomerHasTradeLicense> getCustomerHasTradeLicenses() {
        return this.customerHasTradeLicenses;
    }
    
    public void setCustomerHasTradeLicenses(Set<CustomerHasTradeLicense> customerHasTradeLicenses) {
        this.customerHasTradeLicenses = customerHasTradeLicenses;
    }




}


