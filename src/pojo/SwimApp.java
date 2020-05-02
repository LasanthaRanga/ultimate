package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * SwimApp generated by hbm2java
 */
public class SwimApp  implements java.io.Serializable {


     private Integer swimAppId;
     private Customer customer;
     private SchoolDetails schoolDetails;
     private SwGrade swGrade;
     private SwimCorchRegistration swimCorchRegistration;
     private String swimAppRegNo;
     private Integer swimAppOrderNo;
     private Integer swimAppAge;
     private Date swimAppDate;
     private Date swimAppTime;
     private Integer swimAppStatus;

    public SwimApp() {
    }

    public SwimApp(Customer customer, SchoolDetails schoolDetails, SwGrade swGrade, SwimCorchRegistration swimCorchRegistration, String swimAppRegNo, Integer swimAppOrderNo, Integer swimAppAge, Date swimAppDate, Date swimAppTime, Integer swimAppStatus) {
       this.customer = customer;
       this.schoolDetails = schoolDetails;
       this.swGrade = swGrade;
       this.swimCorchRegistration = swimCorchRegistration;
       this.swimAppRegNo = swimAppRegNo;
       this.swimAppOrderNo = swimAppOrderNo;
       this.swimAppAge = swimAppAge;
       this.swimAppDate = swimAppDate;
       this.swimAppTime = swimAppTime;
       this.swimAppStatus = swimAppStatus;
    }
   
    public Integer getSwimAppId() {
        return this.swimAppId;
    }
    
    public void setSwimAppId(Integer swimAppId) {
        this.swimAppId = swimAppId;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public SchoolDetails getSchoolDetails() {
        return this.schoolDetails;
    }
    
    public void setSchoolDetails(SchoolDetails schoolDetails) {
        this.schoolDetails = schoolDetails;
    }
    public SwGrade getSwGrade() {
        return this.swGrade;
    }
    
    public void setSwGrade(SwGrade swGrade) {
        this.swGrade = swGrade;
    }
    public SwimCorchRegistration getSwimCorchRegistration() {
        return this.swimCorchRegistration;
    }
    
    public void setSwimCorchRegistration(SwimCorchRegistration swimCorchRegistration) {
        this.swimCorchRegistration = swimCorchRegistration;
    }
    public String getSwimAppRegNo() {
        return this.swimAppRegNo;
    }
    
    public void setSwimAppRegNo(String swimAppRegNo) {
        this.swimAppRegNo = swimAppRegNo;
    }
    public Integer getSwimAppOrderNo() {
        return this.swimAppOrderNo;
    }
    
    public void setSwimAppOrderNo(Integer swimAppOrderNo) {
        this.swimAppOrderNo = swimAppOrderNo;
    }
    public Integer getSwimAppAge() {
        return this.swimAppAge;
    }
    
    public void setSwimAppAge(Integer swimAppAge) {
        this.swimAppAge = swimAppAge;
    }
    public Date getSwimAppDate() {
        return this.swimAppDate;
    }
    
    public void setSwimAppDate(Date swimAppDate) {
        this.swimAppDate = swimAppDate;
    }
    public Date getSwimAppTime() {
        return this.swimAppTime;
    }
    
    public void setSwimAppTime(Date swimAppTime) {
        this.swimAppTime = swimAppTime;
    }
    public Integer getSwimAppStatus() {
        return this.swimAppStatus;
    }
    
    public void setSwimAppStatus(Integer swimAppStatus) {
        this.swimAppStatus = swimAppStatus;
    }




}


