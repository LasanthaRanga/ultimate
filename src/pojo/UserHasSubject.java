package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1



/**
 * UserHasSubject generated by hbm2java
 */
public class UserHasSubject  implements java.io.Serializable {


     private Integer idUserHasSubject;
     private Integer userId;
     private Integer subjectId;
     private Integer uhsStatus;

    public UserHasSubject() {
    }

    public UserHasSubject(Integer userId, Integer subjectId, Integer uhsStatus) {
       this.userId = userId;
       this.subjectId = subjectId;
       this.uhsStatus = uhsStatus;
    }
   
    public Integer getIdUserHasSubject() {
        return this.idUserHasSubject;
    }
    
    public void setIdUserHasSubject(Integer idUserHasSubject) {
        this.idUserHasSubject = idUserHasSubject;
    }
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getSubjectId() {
        return this.subjectId;
    }
    
    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }
    public Integer getUhsStatus() {
        return this.uhsStatus;
    }
    
    public void setUhsStatus(Integer uhsStatus) {
        this.uhsStatus = uhsStatus;
    }




}


