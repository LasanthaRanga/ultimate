package pojo;
// Generated Sep 6, 2019 4:30:16 PM by Hibernate Tools 4.3.1



/**
 * ReceiptCodeCreate generated by hbm2java
 */
public class ReceiptCodeCreate  implements java.io.Serializable {


     private Integer receiptCodeId;
     private ApplicationCatagory applicationCatagory;
     private Office office;
     private String receiptCode;
     private String chequeCode;

    public ReceiptCodeCreate() {
    }

    public ReceiptCodeCreate(ApplicationCatagory applicationCatagory, Office office, String receiptCode, String chequeCode) {
       this.applicationCatagory = applicationCatagory;
       this.office = office;
       this.receiptCode = receiptCode;
       this.chequeCode = chequeCode;
    }
   
    public Integer getReceiptCodeId() {
        return this.receiptCodeId;
    }
    
    public void setReceiptCodeId(Integer receiptCodeId) {
        this.receiptCodeId = receiptCodeId;
    }
    public ApplicationCatagory getApplicationCatagory() {
        return this.applicationCatagory;
    }
    
    public void setApplicationCatagory(ApplicationCatagory applicationCatagory) {
        this.applicationCatagory = applicationCatagory;
    }
    public Office getOffice() {
        return this.office;
    }
    
    public void setOffice(Office office) {
        this.office = office;
    }
    public String getReceiptCode() {
        return this.receiptCode;
    }
    
    public void setReceiptCode(String receiptCode) {
        this.receiptCode = receiptCode;
    }
    public String getChequeCode() {
        return this.chequeCode;
    }
    
    public void setChequeCode(String chequeCode) {
        this.chequeCode = chequeCode;
    }




}

