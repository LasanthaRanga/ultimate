package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * ExCrossApprove generated by hbm2java
 */
public class ExCrossApprove  implements java.io.Serializable {


     private Integer exCrossApproveId;
     private String exCrossApproveComment;
     private Integer exCrossApproveStatus;
     private Integer exCrossApproveUser;
     private Date exCrossApproveDate;
     private Integer exCrossReciptId;

    public ExCrossApprove() {
    }

    public ExCrossApprove(String exCrossApproveComment, Integer exCrossApproveStatus, Integer exCrossApproveUser, Date exCrossApproveDate, Integer exCrossReciptId) {
       this.exCrossApproveComment = exCrossApproveComment;
       this.exCrossApproveStatus = exCrossApproveStatus;
       this.exCrossApproveUser = exCrossApproveUser;
       this.exCrossApproveDate = exCrossApproveDate;
       this.exCrossReciptId = exCrossReciptId;
    }
   
    public Integer getExCrossApproveId() {
        return this.exCrossApproveId;
    }
    
    public void setExCrossApproveId(Integer exCrossApproveId) {
        this.exCrossApproveId = exCrossApproveId;
    }
    public String getExCrossApproveComment() {
        return this.exCrossApproveComment;
    }
    
    public void setExCrossApproveComment(String exCrossApproveComment) {
        this.exCrossApproveComment = exCrossApproveComment;
    }
    public Integer getExCrossApproveStatus() {
        return this.exCrossApproveStatus;
    }
    
    public void setExCrossApproveStatus(Integer exCrossApproveStatus) {
        this.exCrossApproveStatus = exCrossApproveStatus;
    }
    public Integer getExCrossApproveUser() {
        return this.exCrossApproveUser;
    }
    
    public void setExCrossApproveUser(Integer exCrossApproveUser) {
        this.exCrossApproveUser = exCrossApproveUser;
    }
    public Date getExCrossApproveDate() {
        return this.exCrossApproveDate;
    }
    
    public void setExCrossApproveDate(Date exCrossApproveDate) {
        this.exCrossApproveDate = exCrossApproveDate;
    }
    public Integer getExCrossReciptId() {
        return this.exCrossReciptId;
    }
    
    public void setExCrossReciptId(Integer exCrossReciptId) {
        this.exCrossReciptId = exCrossReciptId;
    }




}

