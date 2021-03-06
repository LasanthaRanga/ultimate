package pojo;
// Generated Oct 3, 2019 9:56:57 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * WbTPayment generated by hbm2java
 */
public class WbTPayment  implements java.io.Serializable {


     private Integer wbTPayId;
     private Receipt receipt;
     private WbMConnection wbMConnection;
     private WbTBillProcess wbTBillProcess;
     private Double wbTPayLya;
     private Double wbTPayLma;
     private Double wbTPayTma;
     private Double wbTPayOp;
     private Double wbTPayLyca;
     private Double wbTPayLmca;
     private Double wbTPayTmca;
     private Double wbTPayCop;
     private String wbTPayReceiptNo;
     private Date wbTPayReceiptDate;
     private Integer wbTPayMonth;
     private Integer wbTPayYear;
     private Double wbTPayCash;
     private Double wbTPayCheque;
     private String wbTPayChequeNo;
     private Date wbTPayChequeDate;
     private Integer wbTPayCashStatus;
     private Integer wbTPayChequeStatus;
     private Integer wbTPayCompleteOrNot;
     private Double wbTPayTotal;

    public WbTPayment() {
    }

    public WbTPayment(Receipt receipt, WbMConnection wbMConnection, WbTBillProcess wbTBillProcess, Double wbTPayLya, Double wbTPayLma, Double wbTPayTma, Double wbTPayOp, Double wbTPayLyca, Double wbTPayLmca, Double wbTPayTmca, Double wbTPayCop, String wbTPayReceiptNo, Date wbTPayReceiptDate, Integer wbTPayMonth, Integer wbTPayYear, Double wbTPayCash, Double wbTPayCheque, String wbTPayChequeNo, Date wbTPayChequeDate, Integer wbTPayCashStatus, Integer wbTPayChequeStatus, Integer wbTPayCompleteOrNot, Double wbTPayTotal) {
       this.receipt = receipt;
       this.wbMConnection = wbMConnection;
       this.wbTBillProcess = wbTBillProcess;
       this.wbTPayLya = wbTPayLya;
       this.wbTPayLma = wbTPayLma;
       this.wbTPayTma = wbTPayTma;
       this.wbTPayOp = wbTPayOp;
       this.wbTPayLyca = wbTPayLyca;
       this.wbTPayLmca = wbTPayLmca;
       this.wbTPayTmca = wbTPayTmca;
       this.wbTPayCop = wbTPayCop;
       this.wbTPayReceiptNo = wbTPayReceiptNo;
       this.wbTPayReceiptDate = wbTPayReceiptDate;
       this.wbTPayMonth = wbTPayMonth;
       this.wbTPayYear = wbTPayYear;
       this.wbTPayCash = wbTPayCash;
       this.wbTPayCheque = wbTPayCheque;
       this.wbTPayChequeNo = wbTPayChequeNo;
       this.wbTPayChequeDate = wbTPayChequeDate;
       this.wbTPayCashStatus = wbTPayCashStatus;
       this.wbTPayChequeStatus = wbTPayChequeStatus;
       this.wbTPayCompleteOrNot = wbTPayCompleteOrNot;
       this.wbTPayTotal = wbTPayTotal;
    }
   
    public Integer getWbTPayId() {
        return this.wbTPayId;
    }
    
    public void setWbTPayId(Integer wbTPayId) {
        this.wbTPayId = wbTPayId;
    }
    public Receipt getReceipt() {
        return this.receipt;
    }
    
    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }
    public WbMConnection getWbMConnection() {
        return this.wbMConnection;
    }
    
    public void setWbMConnection(WbMConnection wbMConnection) {
        this.wbMConnection = wbMConnection;
    }
    public WbTBillProcess getWbTBillProcess() {
        return this.wbTBillProcess;
    }
    
    public void setWbTBillProcess(WbTBillProcess wbTBillProcess) {
        this.wbTBillProcess = wbTBillProcess;
    }
    public Double getWbTPayLya() {
        return this.wbTPayLya;
    }
    
    public void setWbTPayLya(Double wbTPayLya) {
        this.wbTPayLya = wbTPayLya;
    }
    public Double getWbTPayLma() {
        return this.wbTPayLma;
    }
    
    public void setWbTPayLma(Double wbTPayLma) {
        this.wbTPayLma = wbTPayLma;
    }
    public Double getWbTPayTma() {
        return this.wbTPayTma;
    }
    
    public void setWbTPayTma(Double wbTPayTma) {
        this.wbTPayTma = wbTPayTma;
    }
    public Double getWbTPayOp() {
        return this.wbTPayOp;
    }
    
    public void setWbTPayOp(Double wbTPayOp) {
        this.wbTPayOp = wbTPayOp;
    }
    public Double getWbTPayLyca() {
        return this.wbTPayLyca;
    }
    
    public void setWbTPayLyca(Double wbTPayLyca) {
        this.wbTPayLyca = wbTPayLyca;
    }
    public Double getWbTPayLmca() {
        return this.wbTPayLmca;
    }
    
    public void setWbTPayLmca(Double wbTPayLmca) {
        this.wbTPayLmca = wbTPayLmca;
    }
    public Double getWbTPayTmca() {
        return this.wbTPayTmca;
    }
    
    public void setWbTPayTmca(Double wbTPayTmca) {
        this.wbTPayTmca = wbTPayTmca;
    }
    public Double getWbTPayCop() {
        return this.wbTPayCop;
    }
    
    public void setWbTPayCop(Double wbTPayCop) {
        this.wbTPayCop = wbTPayCop;
    }
    public String getWbTPayReceiptNo() {
        return this.wbTPayReceiptNo;
    }
    
    public void setWbTPayReceiptNo(String wbTPayReceiptNo) {
        this.wbTPayReceiptNo = wbTPayReceiptNo;
    }
    public Date getWbTPayReceiptDate() {
        return this.wbTPayReceiptDate;
    }
    
    public void setWbTPayReceiptDate(Date wbTPayReceiptDate) {
        this.wbTPayReceiptDate = wbTPayReceiptDate;
    }
    public Integer getWbTPayMonth() {
        return this.wbTPayMonth;
    }
    
    public void setWbTPayMonth(Integer wbTPayMonth) {
        this.wbTPayMonth = wbTPayMonth;
    }
    public Integer getWbTPayYear() {
        return this.wbTPayYear;
    }
    
    public void setWbTPayYear(Integer wbTPayYear) {
        this.wbTPayYear = wbTPayYear;
    }
    public Double getWbTPayCash() {
        return this.wbTPayCash;
    }
    
    public void setWbTPayCash(Double wbTPayCash) {
        this.wbTPayCash = wbTPayCash;
    }
    public Double getWbTPayCheque() {
        return this.wbTPayCheque;
    }
    
    public void setWbTPayCheque(Double wbTPayCheque) {
        this.wbTPayCheque = wbTPayCheque;
    }
    public String getWbTPayChequeNo() {
        return this.wbTPayChequeNo;
    }
    
    public void setWbTPayChequeNo(String wbTPayChequeNo) {
        this.wbTPayChequeNo = wbTPayChequeNo;
    }
    public Date getWbTPayChequeDate() {
        return this.wbTPayChequeDate;
    }
    
    public void setWbTPayChequeDate(Date wbTPayChequeDate) {
        this.wbTPayChequeDate = wbTPayChequeDate;
    }
    public Integer getWbTPayCashStatus() {
        return this.wbTPayCashStatus;
    }
    
    public void setWbTPayCashStatus(Integer wbTPayCashStatus) {
        this.wbTPayCashStatus = wbTPayCashStatus;
    }
    public Integer getWbTPayChequeStatus() {
        return this.wbTPayChequeStatus;
    }
    
    public void setWbTPayChequeStatus(Integer wbTPayChequeStatus) {
        this.wbTPayChequeStatus = wbTPayChequeStatus;
    }
    public Integer getWbTPayCompleteOrNot() {
        return this.wbTPayCompleteOrNot;
    }
    
    public void setWbTPayCompleteOrNot(Integer wbTPayCompleteOrNot) {
        this.wbTPayCompleteOrNot = wbTPayCompleteOrNot;
    }
    public Double getWbTPayTotal() {
        return this.wbTPayTotal;
    }
    
    public void setWbTPayTotal(Double wbTPayTotal) {
        this.wbTPayTotal = wbTPayTotal;
    }




}


