package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Steps generated by hbm2java
 */
public class Steps  implements java.io.Serializable {


     private Integer idSteps;
     private Unique unique;
     private Integer stepNo;
     private String stepName;
     private String comemts;
     private String image;
     private String sms;
     private Integer status;
     private Date dateandtime;
     private Integer userId;
     private String userName;
     private Integer ucatId;
     private String userCat;

    public Steps() {
    }

    public Steps(Unique unique, Integer stepNo, String stepName, String comemts, String image, String sms, Integer status, Date dateandtime, Integer userId, String userName, Integer ucatId, String userCat) {
       this.unique = unique;
       this.stepNo = stepNo;
       this.stepName = stepName;
       this.comemts = comemts;
       this.image = image;
       this.sms = sms;
       this.status = status;
       this.dateandtime = dateandtime;
       this.userId = userId;
       this.userName = userName;
       this.ucatId = ucatId;
       this.userCat = userCat;
    }
   
    public Integer getIdSteps() {
        return this.idSteps;
    }
    
    public void setIdSteps(Integer idSteps) {
        this.idSteps = idSteps;
    }
    public Unique getUnique() {
        return this.unique;
    }
    
    public void setUnique(Unique unique) {
        this.unique = unique;
    }
    public Integer getStepNo() {
        return this.stepNo;
    }
    
    public void setStepNo(Integer stepNo) {
        this.stepNo = stepNo;
    }
    public String getStepName() {
        return this.stepName;
    }
    
    public void setStepName(String stepName) {
        this.stepName = stepName;
    }
    public String getComemts() {
        return this.comemts;
    }
    
    public void setComemts(String comemts) {
        this.comemts = comemts;
    }
    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }
    public String getSms() {
        return this.sms;
    }
    
    public void setSms(String sms) {
        this.sms = sms;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Date getDateandtime() {
        return this.dateandtime;
    }
    
    public void setDateandtime(Date dateandtime) {
        this.dateandtime = dateandtime;
    }
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Integer getUcatId() {
        return this.ucatId;
    }
    
    public void setUcatId(Integer ucatId) {
        this.ucatId = ucatId;
    }
    public String getUserCat() {
        return this.userCat;
    }
    
    public void setUserCat(String userCat) {
        this.userCat = userCat;
    }




}


