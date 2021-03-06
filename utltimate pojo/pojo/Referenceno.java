package pojo;
// Generated Sep 6, 2019 4:30:16 PM by Hibernate Tools 4.3.1



/**
 * Referenceno generated by hbm2java
 */
public class Referenceno  implements java.io.Serializable {


     private Integer idReferenceNo;
     private ApplicationCatagory applicationCatagory;
     private Customer customer;
     private Integer appId;
     private String refno;
     private Integer oder;

    public Referenceno() {
    }

	
    public Referenceno(ApplicationCatagory applicationCatagory, Customer customer) {
        this.applicationCatagory = applicationCatagory;
        this.customer = customer;
    }
    public Referenceno(ApplicationCatagory applicationCatagory, Customer customer, Integer appId, String refno, Integer oder) {
       this.applicationCatagory = applicationCatagory;
       this.customer = customer;
       this.appId = appId;
       this.refno = refno;
       this.oder = oder;
    }
   
    public Integer getIdReferenceNo() {
        return this.idReferenceNo;
    }
    
    public void setIdReferenceNo(Integer idReferenceNo) {
        this.idReferenceNo = idReferenceNo;
    }
    public ApplicationCatagory getApplicationCatagory() {
        return this.applicationCatagory;
    }
    
    public void setApplicationCatagory(ApplicationCatagory applicationCatagory) {
        this.applicationCatagory = applicationCatagory;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Integer getAppId() {
        return this.appId;
    }
    
    public void setAppId(Integer appId) {
        this.appId = appId;
    }
    public String getRefno() {
        return this.refno;
    }
    
    public void setRefno(String refno) {
        this.refno = refno;
    }
    public Integer getOder() {
        return this.oder;
    }
    
    public void setOder(Integer oder) {
        this.oder = oder;
    }




}


