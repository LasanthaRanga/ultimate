package pojo;
// Generated Aug 6, 2019 9:53:07 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * DocHandApprove generated by hbm2java
 */
public class DocHandApprove  implements java.io.Serializable {


     private Integer approveDocHandId;
     private Integer applicationDocHandCategoryId;
     private Integer docHandSubjectId;
     private Integer docHandSendUserCategory;
     private Date docHandSendDate;
     private Date docHandSendTime;
     private Integer docHandReceviedUserCategory;
     private Integer docHandCompleteStatus;
     private Date docHandCompleteDate;
     private Date docHandCompleteTime;
     private Integer docHandSendUserId;
     private Integer docHandReceviedUserId;
     private Integer docHandAcceptOrReject;

    public DocHandApprove() {
    }

    public DocHandApprove(Integer applicationDocHandCategoryId, Integer docHandSubjectId, Integer docHandSendUserCategory, Date docHandSendDate, Date docHandSendTime, Integer docHandReceviedUserCategory, Integer docHandCompleteStatus, Date docHandCompleteDate, Date docHandCompleteTime, Integer docHandSendUserId, Integer docHandReceviedUserId, Integer docHandAcceptOrReject) {
       this.applicationDocHandCategoryId = applicationDocHandCategoryId;
       this.docHandSubjectId = docHandSubjectId;
       this.docHandSendUserCategory = docHandSendUserCategory;
       this.docHandSendDate = docHandSendDate;
       this.docHandSendTime = docHandSendTime;
       this.docHandReceviedUserCategory = docHandReceviedUserCategory;
       this.docHandCompleteStatus = docHandCompleteStatus;
       this.docHandCompleteDate = docHandCompleteDate;
       this.docHandCompleteTime = docHandCompleteTime;
       this.docHandSendUserId = docHandSendUserId;
       this.docHandReceviedUserId = docHandReceviedUserId;
       this.docHandAcceptOrReject = docHandAcceptOrReject;
    }
   
    public Integer getApproveDocHandId() {
        return this.approveDocHandId;
    }
    
    public void setApproveDocHandId(Integer approveDocHandId) {
        this.approveDocHandId = approveDocHandId;
    }
    public Integer getApplicationDocHandCategoryId() {
        return this.applicationDocHandCategoryId;
    }
    
    public void setApplicationDocHandCategoryId(Integer applicationDocHandCategoryId) {
        this.applicationDocHandCategoryId = applicationDocHandCategoryId;
    }
    public Integer getDocHandSubjectId() {
        return this.docHandSubjectId;
    }
    
    public void setDocHandSubjectId(Integer docHandSubjectId) {
        this.docHandSubjectId = docHandSubjectId;
    }
    public Integer getDocHandSendUserCategory() {
        return this.docHandSendUserCategory;
    }
    
    public void setDocHandSendUserCategory(Integer docHandSendUserCategory) {
        this.docHandSendUserCategory = docHandSendUserCategory;
    }
    public Date getDocHandSendDate() {
        return this.docHandSendDate;
    }
    
    public void setDocHandSendDate(Date docHandSendDate) {
        this.docHandSendDate = docHandSendDate;
    }
    public Date getDocHandSendTime() {
        return this.docHandSendTime;
    }
    
    public void setDocHandSendTime(Date docHandSendTime) {
        this.docHandSendTime = docHandSendTime;
    }
    public Integer getDocHandReceviedUserCategory() {
        return this.docHandReceviedUserCategory;
    }
    
    public void setDocHandReceviedUserCategory(Integer docHandReceviedUserCategory) {
        this.docHandReceviedUserCategory = docHandReceviedUserCategory;
    }
    public Integer getDocHandCompleteStatus() {
        return this.docHandCompleteStatus;
    }
    
    public void setDocHandCompleteStatus(Integer docHandCompleteStatus) {
        this.docHandCompleteStatus = docHandCompleteStatus;
    }
    public Date getDocHandCompleteDate() {
        return this.docHandCompleteDate;
    }
    
    public void setDocHandCompleteDate(Date docHandCompleteDate) {
        this.docHandCompleteDate = docHandCompleteDate;
    }
    public Date getDocHandCompleteTime() {
        return this.docHandCompleteTime;
    }
    
    public void setDocHandCompleteTime(Date docHandCompleteTime) {
        this.docHandCompleteTime = docHandCompleteTime;
    }
    public Integer getDocHandSendUserId() {
        return this.docHandSendUserId;
    }
    
    public void setDocHandSendUserId(Integer docHandSendUserId) {
        this.docHandSendUserId = docHandSendUserId;
    }
    public Integer getDocHandReceviedUserId() {
        return this.docHandReceviedUserId;
    }
    
    public void setDocHandReceviedUserId(Integer docHandReceviedUserId) {
        this.docHandReceviedUserId = docHandReceviedUserId;
    }
    public Integer getDocHandAcceptOrReject() {
        return this.docHandAcceptOrReject;
    }
    
    public void setDocHandAcceptOrReject(Integer docHandAcceptOrReject) {
        this.docHandAcceptOrReject = docHandAcceptOrReject;
    }




}


