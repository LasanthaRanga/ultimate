package pojo;
// Generated Dec 19, 2019 12:34:46 PM by Hibernate Tools 4.3.1



/**
 * SrPaidStatus generated by hbm2java
 */
public class SrPaidStatus  implements java.io.Serializable {


     private Integer srPaidStatusId;
     private String srPaidStatusName;
     private Integer srPaidStatusNo;

    public SrPaidStatus() {
    }

    public SrPaidStatus(String srPaidStatusName, Integer srPaidStatusNo) {
       this.srPaidStatusName = srPaidStatusName;
       this.srPaidStatusNo = srPaidStatusNo;
    }
   
    public Integer getSrPaidStatusId() {
        return this.srPaidStatusId;
    }
    
    public void setSrPaidStatusId(Integer srPaidStatusId) {
        this.srPaidStatusId = srPaidStatusId;
    }
    public String getSrPaidStatusName() {
        return this.srPaidStatusName;
    }
    
    public void setSrPaidStatusName(String srPaidStatusName) {
        this.srPaidStatusName = srPaidStatusName;
    }
    public Integer getSrPaidStatusNo() {
        return this.srPaidStatusNo;
    }
    
    public void setSrPaidStatusNo(Integer srPaidStatusNo) {
        this.srPaidStatusNo = srPaidStatusNo;
    }




}

