package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1



/**
 * BopPaymentVote generated by hbm2java
 */
public class BopPaymentVote  implements java.io.Serializable {


     private Integer bopPaymentVoteId;
     private Integer bopPaymentAmountVote;
     private Integer bopPaymentVat;
     private Integer bopPaymentDeposit;
     private Integer bopPaymentStamp;
     private Integer bopPaymentOther1;
     private Integer bopPaymentNbt;
     private Integer bopAccountId;
     private Integer bopCashId;
     private Integer bopChequeId;

    public BopPaymentVote() {
    }

    public BopPaymentVote(Integer bopPaymentAmountVote, Integer bopPaymentVat, Integer bopPaymentDeposit, Integer bopPaymentStamp, Integer bopPaymentOther1, Integer bopPaymentNbt, Integer bopAccountId, Integer bopCashId, Integer bopChequeId) {
       this.bopPaymentAmountVote = bopPaymentAmountVote;
       this.bopPaymentVat = bopPaymentVat;
       this.bopPaymentDeposit = bopPaymentDeposit;
       this.bopPaymentStamp = bopPaymentStamp;
       this.bopPaymentOther1 = bopPaymentOther1;
       this.bopPaymentNbt = bopPaymentNbt;
       this.bopAccountId = bopAccountId;
       this.bopCashId = bopCashId;
       this.bopChequeId = bopChequeId;
    }
   
    public Integer getBopPaymentVoteId() {
        return this.bopPaymentVoteId;
    }
    
    public void setBopPaymentVoteId(Integer bopPaymentVoteId) {
        this.bopPaymentVoteId = bopPaymentVoteId;
    }
    public Integer getBopPaymentAmountVote() {
        return this.bopPaymentAmountVote;
    }
    
    public void setBopPaymentAmountVote(Integer bopPaymentAmountVote) {
        this.bopPaymentAmountVote = bopPaymentAmountVote;
    }
    public Integer getBopPaymentVat() {
        return this.bopPaymentVat;
    }
    
    public void setBopPaymentVat(Integer bopPaymentVat) {
        this.bopPaymentVat = bopPaymentVat;
    }
    public Integer getBopPaymentDeposit() {
        return this.bopPaymentDeposit;
    }
    
    public void setBopPaymentDeposit(Integer bopPaymentDeposit) {
        this.bopPaymentDeposit = bopPaymentDeposit;
    }
    public Integer getBopPaymentStamp() {
        return this.bopPaymentStamp;
    }
    
    public void setBopPaymentStamp(Integer bopPaymentStamp) {
        this.bopPaymentStamp = bopPaymentStamp;
    }
    public Integer getBopPaymentOther1() {
        return this.bopPaymentOther1;
    }
    
    public void setBopPaymentOther1(Integer bopPaymentOther1) {
        this.bopPaymentOther1 = bopPaymentOther1;
    }
    public Integer getBopPaymentNbt() {
        return this.bopPaymentNbt;
    }
    
    public void setBopPaymentNbt(Integer bopPaymentNbt) {
        this.bopPaymentNbt = bopPaymentNbt;
    }
    public Integer getBopAccountId() {
        return this.bopAccountId;
    }
    
    public void setBopAccountId(Integer bopAccountId) {
        this.bopAccountId = bopAccountId;
    }
    public Integer getBopCashId() {
        return this.bopCashId;
    }
    
    public void setBopCashId(Integer bopCashId) {
        this.bopCashId = bopCashId;
    }
    public Integer getBopChequeId() {
        return this.bopChequeId;
    }
    
    public void setBopChequeId(Integer bopChequeId) {
        this.bopChequeId = bopChequeId;
    }




}


