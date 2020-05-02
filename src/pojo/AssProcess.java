package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * AssProcess generated by hbm2java
 */
public class AssProcess  implements java.io.Serializable {


     private Integer idProcess;
     private Date processDate;
     private Integer quaterNumber;
     private Integer userId;
     private Date startTime;
     private Date endTime;

    public AssProcess() {
    }

    public AssProcess(Date processDate, Integer quaterNumber, Integer userId, Date startTime, Date endTime) {
       this.processDate = processDate;
       this.quaterNumber = quaterNumber;
       this.userId = userId;
       this.startTime = startTime;
       this.endTime = endTime;
    }
   
    public Integer getIdProcess() {
        return this.idProcess;
    }
    
    public void setIdProcess(Integer idProcess) {
        this.idProcess = idProcess;
    }
    public Date getProcessDate() {
        return this.processDate;
    }
    
    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }
    public Integer getQuaterNumber() {
        return this.quaterNumber;
    }
    
    public void setQuaterNumber(Integer quaterNumber) {
        this.quaterNumber = quaterNumber;
    }
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Date getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    public Date getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }




}


