package pojo;
// Generated Oct 3, 2019 9:56:57 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * WbMUsers generated by hbm2java
 */
public class WbMUsers  implements java.io.Serializable {


     private Integer userId;
     private WbULevel wbULevel;
     private String userName;
     private String pwd;
     private Date dateCreated;
     private Date dateModified;
     private Integer approved;

    public WbMUsers() {
    }

    public WbMUsers(WbULevel wbULevel, String userName, String pwd, Date dateCreated, Date dateModified, Integer approved) {
       this.wbULevel = wbULevel;
       this.userName = userName;
       this.pwd = pwd;
       this.dateCreated = dateCreated;
       this.dateModified = dateModified;
       this.approved = approved;
    }
   
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public WbULevel getWbULevel() {
        return this.wbULevel;
    }
    
    public void setWbULevel(WbULevel wbULevel) {
        this.wbULevel = wbULevel;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPwd() {
        return this.pwd;
    }
    
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public Date getDateModified() {
        return this.dateModified;
    }
    
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }
    public Integer getApproved() {
        return this.approved;
    }
    
    public void setApproved(Integer approved) {
        this.approved = approved;
    }




}

