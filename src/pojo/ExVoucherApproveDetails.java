package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * ExVoucherApproveDetails generated by hbm2java
 */
public class ExVoucherApproveDetails  implements java.io.Serializable {


     private Integer exApproveInfoId;
     private Integer exVoucherVoucherInformationId;
     private Integer exVoucherApproveReject;
     private Integer exAproveUserId;
     private Integer exApproveDepeartment;
     private Date exApproveDate;
     private Date exApproveTime;
     private Integer exApproveActiveStatus;
     private String exApproveDescription;

    public ExVoucherApproveDetails() {
    }

    public ExVoucherApproveDetails(Integer exVoucherVoucherInformationId, Integer exVoucherApproveReject, Integer exAproveUserId, Integer exApproveDepeartment, Date exApproveDate, Date exApproveTime, Integer exApproveActiveStatus, String exApproveDescription) {
       this.exVoucherVoucherInformationId = exVoucherVoucherInformationId;
       this.exVoucherApproveReject = exVoucherApproveReject;
       this.exAproveUserId = exAproveUserId;
       this.exApproveDepeartment = exApproveDepeartment;
       this.exApproveDate = exApproveDate;
       this.exApproveTime = exApproveTime;
       this.exApproveActiveStatus = exApproveActiveStatus;
       this.exApproveDescription = exApproveDescription;
    }
   
    public Integer getExApproveInfoId() {
        return this.exApproveInfoId;
    }
    
    public void setExApproveInfoId(Integer exApproveInfoId) {
        this.exApproveInfoId = exApproveInfoId;
    }
    public Integer getExVoucherVoucherInformationId() {
        return this.exVoucherVoucherInformationId;
    }
    
    public void setExVoucherVoucherInformationId(Integer exVoucherVoucherInformationId) {
        this.exVoucherVoucherInformationId = exVoucherVoucherInformationId;
    }
    public Integer getExVoucherApproveReject() {
        return this.exVoucherApproveReject;
    }
    
    public void setExVoucherApproveReject(Integer exVoucherApproveReject) {
        this.exVoucherApproveReject = exVoucherApproveReject;
    }
    public Integer getExAproveUserId() {
        return this.exAproveUserId;
    }
    
    public void setExAproveUserId(Integer exAproveUserId) {
        this.exAproveUserId = exAproveUserId;
    }
    public Integer getExApproveDepeartment() {
        return this.exApproveDepeartment;
    }
    
    public void setExApproveDepeartment(Integer exApproveDepeartment) {
        this.exApproveDepeartment = exApproveDepeartment;
    }
    public Date getExApproveDate() {
        return this.exApproveDate;
    }
    
    public void setExApproveDate(Date exApproveDate) {
        this.exApproveDate = exApproveDate;
    }
    public Date getExApproveTime() {
        return this.exApproveTime;
    }
    
    public void setExApproveTime(Date exApproveTime) {
        this.exApproveTime = exApproveTime;
    }
    public Integer getExApproveActiveStatus() {
        return this.exApproveActiveStatus;
    }
    
    public void setExApproveActiveStatus(Integer exApproveActiveStatus) {
        this.exApproveActiveStatus = exApproveActiveStatus;
    }
    public String getExApproveDescription() {
        return this.exApproveDescription;
    }
    
    public void setExApproveDescription(String exApproveDescription) {
        this.exApproveDescription = exApproveDescription;
    }




}


