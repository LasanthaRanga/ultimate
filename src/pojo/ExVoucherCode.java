package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1



/**
 * ExVoucherCode generated by hbm2java
 */
public class ExVoucherCode  implements java.io.Serializable {


     private Integer exVoucherId;
     private BankInfo bankInfo;
     private String exVoucherCode;
     private Integer exStartNo;

    public ExVoucherCode() {
    }

    public ExVoucherCode(BankInfo bankInfo, String exVoucherCode, Integer exStartNo) {
       this.bankInfo = bankInfo;
       this.exVoucherCode = exVoucherCode;
       this.exStartNo = exStartNo;
    }
   
    public Integer getExVoucherId() {
        return this.exVoucherId;
    }
    
    public void setExVoucherId(Integer exVoucherId) {
        this.exVoucherId = exVoucherId;
    }
    public BankInfo getBankInfo() {
        return this.bankInfo;
    }
    
    public void setBankInfo(BankInfo bankInfo) {
        this.bankInfo = bankInfo;
    }
    public String getExVoucherCode() {
        return this.exVoucherCode;
    }
    
    public void setExVoucherCode(String exVoucherCode) {
        this.exVoucherCode = exVoucherCode;
    }
    public Integer getExStartNo() {
        return this.exStartNo;
    }
    
    public void setExStartNo(Integer exStartNo) {
        this.exStartNo = exStartNo;
    }




}

