package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1



/**
 * ExChequeBank generated by hbm2java
 */
public class ExChequeBank  implements java.io.Serializable {


     private Integer exChequeBankDetailsId;
     private String exChequeBank;
     private Integer exActiveStatus;

    public ExChequeBank() {
    }

    public ExChequeBank(String exChequeBank, Integer exActiveStatus) {
       this.exChequeBank = exChequeBank;
       this.exActiveStatus = exActiveStatus;
    }
   
    public Integer getExChequeBankDetailsId() {
        return this.exChequeBankDetailsId;
    }
    
    public void setExChequeBankDetailsId(Integer exChequeBankDetailsId) {
        this.exChequeBankDetailsId = exChequeBankDetailsId;
    }
    public String getExChequeBank() {
        return this.exChequeBank;
    }
    
    public void setExChequeBank(String exChequeBank) {
        this.exChequeBank = exChequeBank;
    }
    public Integer getExActiveStatus() {
        return this.exActiveStatus;
    }
    
    public void setExActiveStatus(Integer exActiveStatus) {
        this.exActiveStatus = exActiveStatus;
    }




}


