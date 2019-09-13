package pojo;
// Generated Sep 6, 2019 4:30:16 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * SrShopFinePrcDetail generated by hbm2java
 */
public class SrShopFinePrcDetail  implements java.io.Serializable {


     private Integer srShopFinePrcDetailId;
     private SrShop srShop;
     private SrShopProc srShopProc;
     private Double srShopFinePrcDetailRentAmount;
     private Double srShopFinePrcDetailFine;
     private Date srShopFinePrcDetailDate;
     private Date srShopFinePrcDetailTime;
     private Integer srShopFinePrcDetailYear;
     private Integer srShopFinePrcDetailMonth;
     private Integer srShopFinePrcDetailUserid;

    public SrShopFinePrcDetail() {
    }

    public SrShopFinePrcDetail(SrShop srShop, SrShopProc srShopProc, Double srShopFinePrcDetailRentAmount, Double srShopFinePrcDetailFine, Date srShopFinePrcDetailDate, Date srShopFinePrcDetailTime, Integer srShopFinePrcDetailYear, Integer srShopFinePrcDetailMonth, Integer srShopFinePrcDetailUserid) {
       this.srShop = srShop;
       this.srShopProc = srShopProc;
       this.srShopFinePrcDetailRentAmount = srShopFinePrcDetailRentAmount;
       this.srShopFinePrcDetailFine = srShopFinePrcDetailFine;
       this.srShopFinePrcDetailDate = srShopFinePrcDetailDate;
       this.srShopFinePrcDetailTime = srShopFinePrcDetailTime;
       this.srShopFinePrcDetailYear = srShopFinePrcDetailYear;
       this.srShopFinePrcDetailMonth = srShopFinePrcDetailMonth;
       this.srShopFinePrcDetailUserid = srShopFinePrcDetailUserid;
    }
   
    public Integer getSrShopFinePrcDetailId() {
        return this.srShopFinePrcDetailId;
    }
    
    public void setSrShopFinePrcDetailId(Integer srShopFinePrcDetailId) {
        this.srShopFinePrcDetailId = srShopFinePrcDetailId;
    }
    public SrShop getSrShop() {
        return this.srShop;
    }
    
    public void setSrShop(SrShop srShop) {
        this.srShop = srShop;
    }
    public SrShopProc getSrShopProc() {
        return this.srShopProc;
    }
    
    public void setSrShopProc(SrShopProc srShopProc) {
        this.srShopProc = srShopProc;
    }
    public Double getSrShopFinePrcDetailRentAmount() {
        return this.srShopFinePrcDetailRentAmount;
    }
    
    public void setSrShopFinePrcDetailRentAmount(Double srShopFinePrcDetailRentAmount) {
        this.srShopFinePrcDetailRentAmount = srShopFinePrcDetailRentAmount;
    }
    public Double getSrShopFinePrcDetailFine() {
        return this.srShopFinePrcDetailFine;
    }
    
    public void setSrShopFinePrcDetailFine(Double srShopFinePrcDetailFine) {
        this.srShopFinePrcDetailFine = srShopFinePrcDetailFine;
    }
    public Date getSrShopFinePrcDetailDate() {
        return this.srShopFinePrcDetailDate;
    }
    
    public void setSrShopFinePrcDetailDate(Date srShopFinePrcDetailDate) {
        this.srShopFinePrcDetailDate = srShopFinePrcDetailDate;
    }
    public Date getSrShopFinePrcDetailTime() {
        return this.srShopFinePrcDetailTime;
    }
    
    public void setSrShopFinePrcDetailTime(Date srShopFinePrcDetailTime) {
        this.srShopFinePrcDetailTime = srShopFinePrcDetailTime;
    }
    public Integer getSrShopFinePrcDetailYear() {
        return this.srShopFinePrcDetailYear;
    }
    
    public void setSrShopFinePrcDetailYear(Integer srShopFinePrcDetailYear) {
        this.srShopFinePrcDetailYear = srShopFinePrcDetailYear;
    }
    public Integer getSrShopFinePrcDetailMonth() {
        return this.srShopFinePrcDetailMonth;
    }
    
    public void setSrShopFinePrcDetailMonth(Integer srShopFinePrcDetailMonth) {
        this.srShopFinePrcDetailMonth = srShopFinePrcDetailMonth;
    }
    public Integer getSrShopFinePrcDetailUserid() {
        return this.srShopFinePrcDetailUserid;
    }
    
    public void setSrShopFinePrcDetailUserid(Integer srShopFinePrcDetailUserid) {
        this.srShopFinePrcDetailUserid = srShopFinePrcDetailUserid;
    }




}


