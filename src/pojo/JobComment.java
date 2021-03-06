package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * JobComment generated by hbm2java
 */
public class JobComment  implements java.io.Serializable {


     private int idJobcom;
     private String comment;
     private Integer assignId;
     private Date comentTime;

    public JobComment() {
    }

	
    public JobComment(int idJobcom) {
        this.idJobcom = idJobcom;
    }
    public JobComment(int idJobcom, String comment, Integer assignId, Date comentTime) {
       this.idJobcom = idJobcom;
       this.comment = comment;
       this.assignId = assignId;
       this.comentTime = comentTime;
    }
   
    public int getIdJobcom() {
        return this.idJobcom;
    }
    
    public void setIdJobcom(int idJobcom) {
        this.idJobcom = idJobcom;
    }
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }
    public Integer getAssignId() {
        return this.assignId;
    }
    
    public void setAssignId(Integer assignId) {
        this.assignId = assignId;
    }
    public Date getComentTime() {
        return this.comentTime;
    }
    
    public void setComentTime(Date comentTime) {
        this.comentTime = comentTime;
    }




}


