package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Applications generated by hbm2java
 */
public class Applications  implements java.io.Serializable {


     private Integer idApplications;
     private ApplicationCatagory applicationCatagory;
     private Bop bop;
     private Customer customer;
     private Streetline streetline;
     private Integer applicationId;
     private Integer completed;
     private Set<SendToApprove> sendToApproves = new HashSet<SendToApprove>(0);

    public Applications() {
    }

    public Applications(ApplicationCatagory applicationCatagory, Bop bop, Customer customer, Streetline streetline, Integer applicationId, Integer completed, Set<SendToApprove> sendToApproves) {
       this.applicationCatagory = applicationCatagory;
       this.bop = bop;
       this.customer = customer;
       this.streetline = streetline;
       this.applicationId = applicationId;
       this.completed = completed;
       this.sendToApproves = sendToApproves;
    }
   
    public Integer getIdApplications() {
        return this.idApplications;
    }
    
    public void setIdApplications(Integer idApplications) {
        this.idApplications = idApplications;
    }
    public ApplicationCatagory getApplicationCatagory() {
        return this.applicationCatagory;
    }
    
    public void setApplicationCatagory(ApplicationCatagory applicationCatagory) {
        this.applicationCatagory = applicationCatagory;
    }
    public Bop getBop() {
        return this.bop;
    }
    
    public void setBop(Bop bop) {
        this.bop = bop;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Streetline getStreetline() {
        return this.streetline;
    }
    
    public void setStreetline(Streetline streetline) {
        this.streetline = streetline;
    }
    public Integer getApplicationId() {
        return this.applicationId;
    }
    
    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }
    public Integer getCompleted() {
        return this.completed;
    }
    
    public void setCompleted(Integer completed) {
        this.completed = completed;
    }
    public Set<SendToApprove> getSendToApproves() {
        return this.sendToApproves;
    }
    
    public void setSendToApproves(Set<SendToApprove> sendToApproves) {
        this.sendToApproves = sendToApproves;
    }




}


