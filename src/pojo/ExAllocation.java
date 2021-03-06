package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1



/**
 * ExAllocation generated by hbm2java
 */
public class ExAllocation  implements java.io.Serializable {


     private Integer exAllocationId;
     private String exAllocationVoteId;
     private Integer exAllocationYear;
     private Double exAllocationAllocation;
     private Integer exAllocationActiveStatus;
     private Integer exAllocation;
     private Double exAllocationBalance;

    public ExAllocation() {
    }

    public ExAllocation(String exAllocationVoteId, Integer exAllocationYear, Double exAllocationAllocation, Integer exAllocationActiveStatus, Integer exAllocation, Double exAllocationBalance) {
       this.exAllocationVoteId = exAllocationVoteId;
       this.exAllocationYear = exAllocationYear;
       this.exAllocationAllocation = exAllocationAllocation;
       this.exAllocationActiveStatus = exAllocationActiveStatus;
       this.exAllocation = exAllocation;
       this.exAllocationBalance = exAllocationBalance;
    }
   
    public Integer getExAllocationId() {
        return this.exAllocationId;
    }
    
    public void setExAllocationId(Integer exAllocationId) {
        this.exAllocationId = exAllocationId;
    }
    public String getExAllocationVoteId() {
        return this.exAllocationVoteId;
    }
    
    public void setExAllocationVoteId(String exAllocationVoteId) {
        this.exAllocationVoteId = exAllocationVoteId;
    }
    public Integer getExAllocationYear() {
        return this.exAllocationYear;
    }
    
    public void setExAllocationYear(Integer exAllocationYear) {
        this.exAllocationYear = exAllocationYear;
    }
    public Double getExAllocationAllocation() {
        return this.exAllocationAllocation;
    }
    
    public void setExAllocationAllocation(Double exAllocationAllocation) {
        this.exAllocationAllocation = exAllocationAllocation;
    }
    public Integer getExAllocationActiveStatus() {
        return this.exAllocationActiveStatus;
    }
    
    public void setExAllocationActiveStatus(Integer exAllocationActiveStatus) {
        this.exAllocationActiveStatus = exAllocationActiveStatus;
    }
    public Integer getExAllocation() {
        return this.exAllocation;
    }
    
    public void setExAllocation(Integer exAllocation) {
        this.exAllocation = exAllocation;
    }
    public Double getExAllocationBalance() {
        return this.exAllocationBalance;
    }
    
    public void setExAllocationBalance(Double exAllocationBalance) {
        this.exAllocationBalance = exAllocationBalance;
    }




}


