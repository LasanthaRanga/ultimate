package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1



/**
 * ExCrossVotes generated by hbm2java
 */
public class ExCrossVotes  implements java.io.Serializable {


     private Integer exCrossId;
     private Integer exCrossVoteId;
     private Integer exCrossActiveStatus;

    public ExCrossVotes() {
    }

    public ExCrossVotes(Integer exCrossVoteId, Integer exCrossActiveStatus) {
       this.exCrossVoteId = exCrossVoteId;
       this.exCrossActiveStatus = exCrossActiveStatus;
    }
   
    public Integer getExCrossId() {
        return this.exCrossId;
    }
    
    public void setExCrossId(Integer exCrossId) {
        this.exCrossId = exCrossId;
    }
    public Integer getExCrossVoteId() {
        return this.exCrossVoteId;
    }
    
    public void setExCrossVoteId(Integer exCrossVoteId) {
        this.exCrossVoteId = exCrossVoteId;
    }
    public Integer getExCrossActiveStatus() {
        return this.exCrossActiveStatus;
    }
    
    public void setExCrossActiveStatus(Integer exCrossActiveStatus) {
        this.exCrossActiveStatus = exCrossActiveStatus;
    }




}

