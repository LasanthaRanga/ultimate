package pojo;
// Generated Sep 6, 2019 4:30:16 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * AssQstart generated by hbm2java
 */
public class AssQstart  implements java.io.Serializable {


     private Integer idassQstart;
     private Assessment assessment;
     private Integer assQstartQuaterNumber;
     private Date assQstartProcessDate;
     private Double assQstartLyArreas;
     private Double assQstartLyWarrant;
     private Double assQstartLycArreas;
     private Double assQstartLycWarrant;
     private Double assQstartLqArreas;
     private Double assQstartLqcArreas;
     private Double assQstartLqWarrant;
     private Double assQstartLqcWarrant;
     private Double assQstartHaveToQpay;
     private Double assQstartQpay;
     private Double assQstartQdiscont;
     private Double assQstartQtot;
     private Double assQstartFullTotal;
     private Integer assQstartStatus;
     private Integer assQstartYear;
     private Double processUpdateWarant;
     private Double processUpdateArrears;
     private String processUpdateComment;
     private Double assQstartTyoldArrias;
     private Double assQstartTyoldWarant;

    public AssQstart() {
    }

	
    public AssQstart(Assessment assessment) {
        this.assessment = assessment;
    }
    public AssQstart(Assessment assessment, Integer assQstartQuaterNumber, Date assQstartProcessDate, Double assQstartLyArreas, Double assQstartLyWarrant, Double assQstartLycArreas, Double assQstartLycWarrant, Double assQstartLqArreas, Double assQstartLqcArreas, Double assQstartLqWarrant, Double assQstartLqcWarrant, Double assQstartHaveToQpay, Double assQstartQpay, Double assQstartQdiscont, Double assQstartQtot, Double assQstartFullTotal, Integer assQstartStatus, Integer assQstartYear, Double processUpdateWarant, Double processUpdateArrears, String processUpdateComment, Double assQstartTyoldArrias, Double assQstartTyoldWarant) {
       this.assessment = assessment;
       this.assQstartQuaterNumber = assQstartQuaterNumber;
       this.assQstartProcessDate = assQstartProcessDate;
       this.assQstartLyArreas = assQstartLyArreas;
       this.assQstartLyWarrant = assQstartLyWarrant;
       this.assQstartLycArreas = assQstartLycArreas;
       this.assQstartLycWarrant = assQstartLycWarrant;
       this.assQstartLqArreas = assQstartLqArreas;
       this.assQstartLqcArreas = assQstartLqcArreas;
       this.assQstartLqWarrant = assQstartLqWarrant;
       this.assQstartLqcWarrant = assQstartLqcWarrant;
       this.assQstartHaveToQpay = assQstartHaveToQpay;
       this.assQstartQpay = assQstartQpay;
       this.assQstartQdiscont = assQstartQdiscont;
       this.assQstartQtot = assQstartQtot;
       this.assQstartFullTotal = assQstartFullTotal;
       this.assQstartStatus = assQstartStatus;
       this.assQstartYear = assQstartYear;
       this.processUpdateWarant = processUpdateWarant;
       this.processUpdateArrears = processUpdateArrears;
       this.processUpdateComment = processUpdateComment;
       this.assQstartTyoldArrias = assQstartTyoldArrias;
       this.assQstartTyoldWarant = assQstartTyoldWarant;
    }
   
    public Integer getIdassQstart() {
        return this.idassQstart;
    }
    
    public void setIdassQstart(Integer idassQstart) {
        this.idassQstart = idassQstart;
    }
    public Assessment getAssessment() {
        return this.assessment;
    }
    
    public void setAssessment(Assessment assessment) {
        this.assessment = assessment;
    }
    public Integer getAssQstartQuaterNumber() {
        return this.assQstartQuaterNumber;
    }
    
    public void setAssQstartQuaterNumber(Integer assQstartQuaterNumber) {
        this.assQstartQuaterNumber = assQstartQuaterNumber;
    }
    public Date getAssQstartProcessDate() {
        return this.assQstartProcessDate;
    }
    
    public void setAssQstartProcessDate(Date assQstartProcessDate) {
        this.assQstartProcessDate = assQstartProcessDate;
    }
    public Double getAssQstartLyArreas() {
        return this.assQstartLyArreas;
    }
    
    public void setAssQstartLyArreas(Double assQstartLyArreas) {
        this.assQstartLyArreas = assQstartLyArreas;
    }
    public Double getAssQstartLyWarrant() {
        return this.assQstartLyWarrant;
    }
    
    public void setAssQstartLyWarrant(Double assQstartLyWarrant) {
        this.assQstartLyWarrant = assQstartLyWarrant;
    }
    public Double getAssQstartLycArreas() {
        return this.assQstartLycArreas;
    }
    
    public void setAssQstartLycArreas(Double assQstartLycArreas) {
        this.assQstartLycArreas = assQstartLycArreas;
    }
    public Double getAssQstartLycWarrant() {
        return this.assQstartLycWarrant;
    }
    
    public void setAssQstartLycWarrant(Double assQstartLycWarrant) {
        this.assQstartLycWarrant = assQstartLycWarrant;
    }
    public Double getAssQstartLqArreas() {
        return this.assQstartLqArreas;
    }
    
    public void setAssQstartLqArreas(Double assQstartLqArreas) {
        this.assQstartLqArreas = assQstartLqArreas;
    }
    public Double getAssQstartLqcArreas() {
        return this.assQstartLqcArreas;
    }
    
    public void setAssQstartLqcArreas(Double assQstartLqcArreas) {
        this.assQstartLqcArreas = assQstartLqcArreas;
    }
    public Double getAssQstartLqWarrant() {
        return this.assQstartLqWarrant;
    }
    
    public void setAssQstartLqWarrant(Double assQstartLqWarrant) {
        this.assQstartLqWarrant = assQstartLqWarrant;
    }
    public Double getAssQstartLqcWarrant() {
        return this.assQstartLqcWarrant;
    }
    
    public void setAssQstartLqcWarrant(Double assQstartLqcWarrant) {
        this.assQstartLqcWarrant = assQstartLqcWarrant;
    }
    public Double getAssQstartHaveToQpay() {
        return this.assQstartHaveToQpay;
    }
    
    public void setAssQstartHaveToQpay(Double assQstartHaveToQpay) {
        this.assQstartHaveToQpay = assQstartHaveToQpay;
    }
    public Double getAssQstartQpay() {
        return this.assQstartQpay;
    }
    
    public void setAssQstartQpay(Double assQstartQpay) {
        this.assQstartQpay = assQstartQpay;
    }
    public Double getAssQstartQdiscont() {
        return this.assQstartQdiscont;
    }
    
    public void setAssQstartQdiscont(Double assQstartQdiscont) {
        this.assQstartQdiscont = assQstartQdiscont;
    }
    public Double getAssQstartQtot() {
        return this.assQstartQtot;
    }
    
    public void setAssQstartQtot(Double assQstartQtot) {
        this.assQstartQtot = assQstartQtot;
    }
    public Double getAssQstartFullTotal() {
        return this.assQstartFullTotal;
    }
    
    public void setAssQstartFullTotal(Double assQstartFullTotal) {
        this.assQstartFullTotal = assQstartFullTotal;
    }
    public Integer getAssQstartStatus() {
        return this.assQstartStatus;
    }
    
    public void setAssQstartStatus(Integer assQstartStatus) {
        this.assQstartStatus = assQstartStatus;
    }
    public Integer getAssQstartYear() {
        return this.assQstartYear;
    }
    
    public void setAssQstartYear(Integer assQstartYear) {
        this.assQstartYear = assQstartYear;
    }
    public Double getProcessUpdateWarant() {
        return this.processUpdateWarant;
    }
    
    public void setProcessUpdateWarant(Double processUpdateWarant) {
        this.processUpdateWarant = processUpdateWarant;
    }
    public Double getProcessUpdateArrears() {
        return this.processUpdateArrears;
    }
    
    public void setProcessUpdateArrears(Double processUpdateArrears) {
        this.processUpdateArrears = processUpdateArrears;
    }
    public String getProcessUpdateComment() {
        return this.processUpdateComment;
    }
    
    public void setProcessUpdateComment(String processUpdateComment) {
        this.processUpdateComment = processUpdateComment;
    }
    public Double getAssQstartTyoldArrias() {
        return this.assQstartTyoldArrias;
    }
    
    public void setAssQstartTyoldArrias(Double assQstartTyoldArrias) {
        this.assQstartTyoldArrias = assQstartTyoldArrias;
    }
    public Double getAssQstartTyoldWarant() {
        return this.assQstartTyoldWarant;
    }
    
    public void setAssQstartTyoldWarant(Double assQstartTyoldWarant) {
        this.assQstartTyoldWarant = assQstartTyoldWarant;
    }




}

