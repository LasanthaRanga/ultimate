package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * CashFlow generated by hbm2java
 */
public class CashFlow  implements java.io.Serializable {


     private Integer idCashFlow;
     private BankInfo bankInfo;
     private ChequeBank chequeBank;
     private Vort vort;
     private String reciptNo;
     private Double cash;
     private Double cheque;
     private String chequeNo;
     private String applicationNo;
     private Double totale;
     private Integer year;
     private Integer mont;
     private Date cfDate;
     private Integer status;
     private Integer syn;

    public CashFlow() {
    }

	
    public CashFlow(BankInfo bankInfo, Vort vort) {
        this.bankInfo = bankInfo;
        this.vort = vort;
    }
    public CashFlow(BankInfo bankInfo, ChequeBank chequeBank, Vort vort, String reciptNo, Double cash, Double cheque, String chequeNo, String applicationNo, Double totale, Integer year, Integer mont, Date cfDate, Integer status, Integer syn) {
       this.bankInfo = bankInfo;
       this.chequeBank = chequeBank;
       this.vort = vort;
       this.reciptNo = reciptNo;
       this.cash = cash;
       this.cheque = cheque;
       this.chequeNo = chequeNo;
       this.applicationNo = applicationNo;
       this.totale = totale;
       this.year = year;
       this.mont = mont;
       this.cfDate = cfDate;
       this.status = status;
       this.syn = syn;
    }
   
    public Integer getIdCashFlow() {
        return this.idCashFlow;
    }
    
    public void setIdCashFlow(Integer idCashFlow) {
        this.idCashFlow = idCashFlow;
    }
    public BankInfo getBankInfo() {
        return this.bankInfo;
    }
    
    public void setBankInfo(BankInfo bankInfo) {
        this.bankInfo = bankInfo;
    }
    public ChequeBank getChequeBank() {
        return this.chequeBank;
    }
    
    public void setChequeBank(ChequeBank chequeBank) {
        this.chequeBank = chequeBank;
    }
    public Vort getVort() {
        return this.vort;
    }
    
    public void setVort(Vort vort) {
        this.vort = vort;
    }
    public String getReciptNo() {
        return this.reciptNo;
    }
    
    public void setReciptNo(String reciptNo) {
        this.reciptNo = reciptNo;
    }
    public Double getCash() {
        return this.cash;
    }
    
    public void setCash(Double cash) {
        this.cash = cash;
    }
    public Double getCheque() {
        return this.cheque;
    }
    
    public void setCheque(Double cheque) {
        this.cheque = cheque;
    }
    public String getChequeNo() {
        return this.chequeNo;
    }
    
    public void setChequeNo(String chequeNo) {
        this.chequeNo = chequeNo;
    }
    public String getApplicationNo() {
        return this.applicationNo;
    }
    
    public void setApplicationNo(String applicationNo) {
        this.applicationNo = applicationNo;
    }
    public Double getTotale() {
        return this.totale;
    }
    
    public void setTotale(Double totale) {
        this.totale = totale;
    }
    public Integer getYear() {
        return this.year;
    }
    
    public void setYear(Integer year) {
        this.year = year;
    }
    public Integer getMont() {
        return this.mont;
    }
    
    public void setMont(Integer mont) {
        this.mont = mont;
    }
    public Date getCfDate() {
        return this.cfDate;
    }
    
    public void setCfDate(Date cfDate) {
        this.cfDate = cfDate;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getSyn() {
        return this.syn;
    }
    
    public void setSyn(Integer syn) {
        this.syn = syn;
    }




}


