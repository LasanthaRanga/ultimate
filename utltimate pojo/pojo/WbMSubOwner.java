package pojo;
// Generated Oct 3, 2019 9:56:57 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * WbMSubOwner generated by hbm2java
 */
public class WbMSubOwner  implements java.io.Serializable {


     private Integer wbMSubOwnerId;
     private WbMConnection wbMConnection;
     private Integer wbMSubOwnerCusTblId;
     private Date wbMSubOwnerRegDate;
     private Date wbMSubOwnerResignDate;
     private Integer wbMSubOwnerActiveStatus;

    public WbMSubOwner() {
    }

    public WbMSubOwner(WbMConnection wbMConnection, Integer wbMSubOwnerCusTblId, Date wbMSubOwnerRegDate, Date wbMSubOwnerResignDate, Integer wbMSubOwnerActiveStatus) {
       this.wbMConnection = wbMConnection;
       this.wbMSubOwnerCusTblId = wbMSubOwnerCusTblId;
       this.wbMSubOwnerRegDate = wbMSubOwnerRegDate;
       this.wbMSubOwnerResignDate = wbMSubOwnerResignDate;
       this.wbMSubOwnerActiveStatus = wbMSubOwnerActiveStatus;
    }
   
    public Integer getWbMSubOwnerId() {
        return this.wbMSubOwnerId;
    }
    
    public void setWbMSubOwnerId(Integer wbMSubOwnerId) {
        this.wbMSubOwnerId = wbMSubOwnerId;
    }
    public WbMConnection getWbMConnection() {
        return this.wbMConnection;
    }
    
    public void setWbMConnection(WbMConnection wbMConnection) {
        this.wbMConnection = wbMConnection;
    }
    public Integer getWbMSubOwnerCusTblId() {
        return this.wbMSubOwnerCusTblId;
    }
    
    public void setWbMSubOwnerCusTblId(Integer wbMSubOwnerCusTblId) {
        this.wbMSubOwnerCusTblId = wbMSubOwnerCusTblId;
    }
    public Date getWbMSubOwnerRegDate() {
        return this.wbMSubOwnerRegDate;
    }
    
    public void setWbMSubOwnerRegDate(Date wbMSubOwnerRegDate) {
        this.wbMSubOwnerRegDate = wbMSubOwnerRegDate;
    }
    public Date getWbMSubOwnerResignDate() {
        return this.wbMSubOwnerResignDate;
    }
    
    public void setWbMSubOwnerResignDate(Date wbMSubOwnerResignDate) {
        this.wbMSubOwnerResignDate = wbMSubOwnerResignDate;
    }
    public Integer getWbMSubOwnerActiveStatus() {
        return this.wbMSubOwnerActiveStatus;
    }
    
    public void setWbMSubOwnerActiveStatus(Integer wbMSubOwnerActiveStatus) {
        this.wbMSubOwnerActiveStatus = wbMSubOwnerActiveStatus;
    }




}

