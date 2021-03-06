package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1



/**
 * AssPayto generated by hbm2java
 */
public class AssPayto  implements java.io.Serializable {


     private Integer idassPayto;
     private AssPayment assPayment;
     private Integer assPaytoQno;
     private Double assPaytoWarrant;
     private Double assPaytoArrears;
     private Double assPaytoQvalue;
     private Double assPaytoDiscount;
     private Double assPaytoDiscountRate;
     private Integer assPaytoStatus;

    public AssPayto() {
    }

	
    public AssPayto(AssPayment assPayment) {
        this.assPayment = assPayment;
    }
    public AssPayto(AssPayment assPayment, Integer assPaytoQno, Double assPaytoWarrant, Double assPaytoArrears, Double assPaytoQvalue, Double assPaytoDiscount, Double assPaytoDiscountRate, Integer assPaytoStatus) {
       this.assPayment = assPayment;
       this.assPaytoQno = assPaytoQno;
       this.assPaytoWarrant = assPaytoWarrant;
       this.assPaytoArrears = assPaytoArrears;
       this.assPaytoQvalue = assPaytoQvalue;
       this.assPaytoDiscount = assPaytoDiscount;
       this.assPaytoDiscountRate = assPaytoDiscountRate;
       this.assPaytoStatus = assPaytoStatus;
    }
   
    public Integer getIdassPayto() {
        return this.idassPayto;
    }
    
    public void setIdassPayto(Integer idassPayto) {
        this.idassPayto = idassPayto;
    }
    public AssPayment getAssPayment() {
        return this.assPayment;
    }
    
    public void setAssPayment(AssPayment assPayment) {
        this.assPayment = assPayment;
    }
    public Integer getAssPaytoQno() {
        return this.assPaytoQno;
    }
    
    public void setAssPaytoQno(Integer assPaytoQno) {
        this.assPaytoQno = assPaytoQno;
    }
    public Double getAssPaytoWarrant() {
        return this.assPaytoWarrant;
    }
    
    public void setAssPaytoWarrant(Double assPaytoWarrant) {
        this.assPaytoWarrant = assPaytoWarrant;
    }
    public Double getAssPaytoArrears() {
        return this.assPaytoArrears;
    }
    
    public void setAssPaytoArrears(Double assPaytoArrears) {
        this.assPaytoArrears = assPaytoArrears;
    }
    public Double getAssPaytoQvalue() {
        return this.assPaytoQvalue;
    }
    
    public void setAssPaytoQvalue(Double assPaytoQvalue) {
        this.assPaytoQvalue = assPaytoQvalue;
    }
    public Double getAssPaytoDiscount() {
        return this.assPaytoDiscount;
    }
    
    public void setAssPaytoDiscount(Double assPaytoDiscount) {
        this.assPaytoDiscount = assPaytoDiscount;
    }
    public Double getAssPaytoDiscountRate() {
        return this.assPaytoDiscountRate;
    }
    
    public void setAssPaytoDiscountRate(Double assPaytoDiscountRate) {
        this.assPaytoDiscountRate = assPaytoDiscountRate;
    }
    public Integer getAssPaytoStatus() {
        return this.assPaytoStatus;
    }
    
    public void setAssPaytoStatus(Integer assPaytoStatus) {
        this.assPaytoStatus = assPaytoStatus;
    }




}


