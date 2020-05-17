package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SwimCorchRegistration generated by hbm2java
 */
public class SwimCorchRegistration  implements java.io.Serializable {


     private Integer swimCorchRegId;
     private Customer customer;
     private SwimGameDetails swimGameDetails;
     private Integer swimCorchActiveStatus;
     private String swimCorchCode;
     private Date swimCorchRegDate;
     private Set<SwimApp> swimApps = new HashSet<SwimApp>(0);

    public SwimCorchRegistration() {
    }

    public SwimCorchRegistration(Customer customer, SwimGameDetails swimGameDetails, Integer swimCorchActiveStatus, String swimCorchCode, Date swimCorchRegDate, Set<SwimApp> swimApps) {
       this.customer = customer;
       this.swimGameDetails = swimGameDetails;
       this.swimCorchActiveStatus = swimCorchActiveStatus;
       this.swimCorchCode = swimCorchCode;
       this.swimCorchRegDate = swimCorchRegDate;
       this.swimApps = swimApps;
    }
   
    public Integer getSwimCorchRegId() {
        return this.swimCorchRegId;
    }
    
    public void setSwimCorchRegId(Integer swimCorchRegId) {
        this.swimCorchRegId = swimCorchRegId;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public SwimGameDetails getSwimGameDetails() {
        return this.swimGameDetails;
    }
    
    public void setSwimGameDetails(SwimGameDetails swimGameDetails) {
        this.swimGameDetails = swimGameDetails;
    }
    public Integer getSwimCorchActiveStatus() {
        return this.swimCorchActiveStatus;
    }
    
    public void setSwimCorchActiveStatus(Integer swimCorchActiveStatus) {
        this.swimCorchActiveStatus = swimCorchActiveStatus;
    }
    public String getSwimCorchCode() {
        return this.swimCorchCode;
    }
    
    public void setSwimCorchCode(String swimCorchCode) {
        this.swimCorchCode = swimCorchCode;
    }
    public Date getSwimCorchRegDate() {
        return this.swimCorchRegDate;
    }
    
    public void setSwimCorchRegDate(Date swimCorchRegDate) {
        this.swimCorchRegDate = swimCorchRegDate;
    }
    public Set<SwimApp> getSwimApps() {
        return this.swimApps;
    }
    
    public void setSwimApps(Set<SwimApp> swimApps) {
        this.swimApps = swimApps;
    }




}

