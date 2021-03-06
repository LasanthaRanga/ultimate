package pojo;
// Generated Oct 3, 2019 9:56:57 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * WbTBillProcess generated by hbm2java
 */
public class WbTBillProcess  implements java.io.Serializable {


     private Integer processId;
     private Street street;
     private WbMConnection wbMConnection;
     private WbMDevision wbMDevision;
     private WbMDivisionHasMeterReader wbMDivisionHasMeterReader;
     private WbMNature wbMNature;
     private WbMProcStatus wbMProcStatus;
     private Integer procMonth;
     private String procInvoiceNo;
     private String procNextInvoice;
     private Double procLastYearArrears;
     private Double procLastYearCurrentArrears;
     private Double procLastMonthArrears;
     private Double procLastMonthCurrentArrears;
     private Double procThisMonthAmount;
     private Double procThisMonthCurrentBalance;
     private Double procOverpayment;
     private Integer procYear;
     private String procUserId;
     private Date procDate;
     private Set<WbTPayment> wbTPayments = new HashSet<WbTPayment>(0);

    public WbTBillProcess() {
    }

    public WbTBillProcess(Street street, WbMConnection wbMConnection, WbMDevision wbMDevision, WbMDivisionHasMeterReader wbMDivisionHasMeterReader, WbMNature wbMNature, WbMProcStatus wbMProcStatus, Integer procMonth, String procInvoiceNo, String procNextInvoice, Double procLastYearArrears, Double procLastYearCurrentArrears, Double procLastMonthArrears, Double procLastMonthCurrentArrears, Double procThisMonthAmount, Double procThisMonthCurrentBalance, Double procOverpayment, Integer procYear, String procUserId, Date procDate, Set<WbTPayment> wbTPayments) {
       this.street = street;
       this.wbMConnection = wbMConnection;
       this.wbMDevision = wbMDevision;
       this.wbMDivisionHasMeterReader = wbMDivisionHasMeterReader;
       this.wbMNature = wbMNature;
       this.wbMProcStatus = wbMProcStatus;
       this.procMonth = procMonth;
       this.procInvoiceNo = procInvoiceNo;
       this.procNextInvoice = procNextInvoice;
       this.procLastYearArrears = procLastYearArrears;
       this.procLastYearCurrentArrears = procLastYearCurrentArrears;
       this.procLastMonthArrears = procLastMonthArrears;
       this.procLastMonthCurrentArrears = procLastMonthCurrentArrears;
       this.procThisMonthAmount = procThisMonthAmount;
       this.procThisMonthCurrentBalance = procThisMonthCurrentBalance;
       this.procOverpayment = procOverpayment;
       this.procYear = procYear;
       this.procUserId = procUserId;
       this.procDate = procDate;
       this.wbTPayments = wbTPayments;
    }
   
    public Integer getProcessId() {
        return this.processId;
    }
    
    public void setProcessId(Integer processId) {
        this.processId = processId;
    }
    public Street getStreet() {
        return this.street;
    }
    
    public void setStreet(Street street) {
        this.street = street;
    }
    public WbMConnection getWbMConnection() {
        return this.wbMConnection;
    }
    
    public void setWbMConnection(WbMConnection wbMConnection) {
        this.wbMConnection = wbMConnection;
    }
    public WbMDevision getWbMDevision() {
        return this.wbMDevision;
    }
    
    public void setWbMDevision(WbMDevision wbMDevision) {
        this.wbMDevision = wbMDevision;
    }
    public WbMDivisionHasMeterReader getWbMDivisionHasMeterReader() {
        return this.wbMDivisionHasMeterReader;
    }
    
    public void setWbMDivisionHasMeterReader(WbMDivisionHasMeterReader wbMDivisionHasMeterReader) {
        this.wbMDivisionHasMeterReader = wbMDivisionHasMeterReader;
    }
    public WbMNature getWbMNature() {
        return this.wbMNature;
    }
    
    public void setWbMNature(WbMNature wbMNature) {
        this.wbMNature = wbMNature;
    }
    public WbMProcStatus getWbMProcStatus() {
        return this.wbMProcStatus;
    }
    
    public void setWbMProcStatus(WbMProcStatus wbMProcStatus) {
        this.wbMProcStatus = wbMProcStatus;
    }
    public Integer getProcMonth() {
        return this.procMonth;
    }
    
    public void setProcMonth(Integer procMonth) {
        this.procMonth = procMonth;
    }
    public String getProcInvoiceNo() {
        return this.procInvoiceNo;
    }
    
    public void setProcInvoiceNo(String procInvoiceNo) {
        this.procInvoiceNo = procInvoiceNo;
    }
    public String getProcNextInvoice() {
        return this.procNextInvoice;
    }
    
    public void setProcNextInvoice(String procNextInvoice) {
        this.procNextInvoice = procNextInvoice;
    }
    public Double getProcLastYearArrears() {
        return this.procLastYearArrears;
    }
    
    public void setProcLastYearArrears(Double procLastYearArrears) {
        this.procLastYearArrears = procLastYearArrears;
    }
    public Double getProcLastYearCurrentArrears() {
        return this.procLastYearCurrentArrears;
    }
    
    public void setProcLastYearCurrentArrears(Double procLastYearCurrentArrears) {
        this.procLastYearCurrentArrears = procLastYearCurrentArrears;
    }
    public Double getProcLastMonthArrears() {
        return this.procLastMonthArrears;
    }
    
    public void setProcLastMonthArrears(Double procLastMonthArrears) {
        this.procLastMonthArrears = procLastMonthArrears;
    }
    public Double getProcLastMonthCurrentArrears() {
        return this.procLastMonthCurrentArrears;
    }
    
    public void setProcLastMonthCurrentArrears(Double procLastMonthCurrentArrears) {
        this.procLastMonthCurrentArrears = procLastMonthCurrentArrears;
    }
    public Double getProcThisMonthAmount() {
        return this.procThisMonthAmount;
    }
    
    public void setProcThisMonthAmount(Double procThisMonthAmount) {
        this.procThisMonthAmount = procThisMonthAmount;
    }
    public Double getProcThisMonthCurrentBalance() {
        return this.procThisMonthCurrentBalance;
    }
    
    public void setProcThisMonthCurrentBalance(Double procThisMonthCurrentBalance) {
        this.procThisMonthCurrentBalance = procThisMonthCurrentBalance;
    }
    public Double getProcOverpayment() {
        return this.procOverpayment;
    }
    
    public void setProcOverpayment(Double procOverpayment) {
        this.procOverpayment = procOverpayment;
    }
    public Integer getProcYear() {
        return this.procYear;
    }
    
    public void setProcYear(Integer procYear) {
        this.procYear = procYear;
    }
    public String getProcUserId() {
        return this.procUserId;
    }
    
    public void setProcUserId(String procUserId) {
        this.procUserId = procUserId;
    }
    public Date getProcDate() {
        return this.procDate;
    }
    
    public void setProcDate(Date procDate) {
        this.procDate = procDate;
    }
    public Set<WbTPayment> getWbTPayments() {
        return this.wbTPayments;
    }
    
    public void setWbTPayments(Set<WbTPayment> wbTPayments) {
        this.wbTPayments = wbTPayments;
    }




}


