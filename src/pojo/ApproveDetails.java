package pojo;
// Generated Aug 6, 2019 9:53:07 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * ApproveDetails generated by hbm2java
 */
public class ApproveDetails  implements java.io.Serializable {


     private Integer idApproveDetails;
     private SendToApprove sendToApprove;
     private String comment;
     private Double pricing;
     private Integer statusApprovDetails;
     private String others;
     private Date dateApproveDetails;

    public ApproveDetails() {
    }

	
    public ApproveDetails(SendToApprove sendToApprove) {
        this.sendToApprove = sendToApprove;
    }
    public ApproveDetails(SendToApprove sendToApprove, String comment, Double pricing, Integer statusApprovDetails, String others, Date dateApproveDetails) {
       this.sendToApprove = sendToApprove;
       this.comment = comment;
       this.pricing = pricing;
       this.statusApprovDetails = statusApprovDetails;
       this.others = others;
       this.dateApproveDetails = dateApproveDetails;
    }
   
    public Integer getIdApproveDetails() {
        return this.idApproveDetails;
    }
    
    public void setIdApproveDetails(Integer idApproveDetails) {
        this.idApproveDetails = idApproveDetails;
    }
    public SendToApprove getSendToApprove() {
        return this.sendToApprove;
    }
    
    public void setSendToApprove(SendToApprove sendToApprove) {
        this.sendToApprove = sendToApprove;
    }
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }
    public Double getPricing() {
        return this.pricing;
    }
    
    public void setPricing(Double pricing) {
        this.pricing = pricing;
    }
    public Integer getStatusApprovDetails() {
        return this.statusApprovDetails;
    }
    
    public void setStatusApprovDetails(Integer statusApprovDetails) {
        this.statusApprovDetails = statusApprovDetails;
    }
    public String getOthers() {
        return this.others;
    }
    
    public void setOthers(String others) {
        this.others = others;
    }
    public Date getDateApproveDetails() {
        return this.dateApproveDetails;
    }
    
    public void setDateApproveDetails(Date dateApproveDetails) {
        this.dateApproveDetails = dateApproveDetails;
    }




}


