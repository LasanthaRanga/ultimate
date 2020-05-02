package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Streetline generated by hbm2java
 */
public class Streetline  implements java.io.Serializable {


     private Integer idStreetLine;
     private Assessment assessment;
     private Customer customer;
     private Date streetLineDate;
     private Integer assessmentStatus;
     private Integer waterStatus;
     private Integer tradetaxStatus;
     private String partsNo;
     private String streetLineDescription;
     private Double deposit;
     private Double amount;
     private Double vat;
     private Double nbt;
     private Integer approveTopPayStatus;
     private String survyOfficer;
     private String surveyDate;
     private Double distance;
     private String planNo;
     private String soTitle;
     private Integer yesNo;
     private Double price;
     private Set<Applications> applicationses = new HashSet<Applications>(0);

    public Streetline() {
    }

	
    public Streetline(Customer customer) {
        this.customer = customer;
    }
    public Streetline(Assessment assessment, Customer customer, Date streetLineDate, Integer assessmentStatus, Integer waterStatus, Integer tradetaxStatus, String partsNo, String streetLineDescription, Double deposit, Double amount, Double vat, Double nbt, Integer approveTopPayStatus, String survyOfficer, String surveyDate, Double distance, String planNo, String soTitle, Integer yesNo, Double price, Set<Applications> applicationses) {
       this.assessment = assessment;
       this.customer = customer;
       this.streetLineDate = streetLineDate;
       this.assessmentStatus = assessmentStatus;
       this.waterStatus = waterStatus;
       this.tradetaxStatus = tradetaxStatus;
       this.partsNo = partsNo;
       this.streetLineDescription = streetLineDescription;
       this.deposit = deposit;
       this.amount = amount;
       this.vat = vat;
       this.nbt = nbt;
       this.approveTopPayStatus = approveTopPayStatus;
       this.survyOfficer = survyOfficer;
       this.surveyDate = surveyDate;
       this.distance = distance;
       this.planNo = planNo;
       this.soTitle = soTitle;
       this.yesNo = yesNo;
       this.price = price;
       this.applicationses = applicationses;
    }
   
    public Integer getIdStreetLine() {
        return this.idStreetLine;
    }
    
    public void setIdStreetLine(Integer idStreetLine) {
        this.idStreetLine = idStreetLine;
    }
    public Assessment getAssessment() {
        return this.assessment;
    }
    
    public void setAssessment(Assessment assessment) {
        this.assessment = assessment;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Date getStreetLineDate() {
        return this.streetLineDate;
    }
    
    public void setStreetLineDate(Date streetLineDate) {
        this.streetLineDate = streetLineDate;
    }
    public Integer getAssessmentStatus() {
        return this.assessmentStatus;
    }
    
    public void setAssessmentStatus(Integer assessmentStatus) {
        this.assessmentStatus = assessmentStatus;
    }
    public Integer getWaterStatus() {
        return this.waterStatus;
    }
    
    public void setWaterStatus(Integer waterStatus) {
        this.waterStatus = waterStatus;
    }
    public Integer getTradetaxStatus() {
        return this.tradetaxStatus;
    }
    
    public void setTradetaxStatus(Integer tradetaxStatus) {
        this.tradetaxStatus = tradetaxStatus;
    }
    public String getPartsNo() {
        return this.partsNo;
    }
    
    public void setPartsNo(String partsNo) {
        this.partsNo = partsNo;
    }
    public String getStreetLineDescription() {
        return this.streetLineDescription;
    }
    
    public void setStreetLineDescription(String streetLineDescription) {
        this.streetLineDescription = streetLineDescription;
    }
    public Double getDeposit() {
        return this.deposit;
    }
    
    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }
    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public Double getVat() {
        return this.vat;
    }
    
    public void setVat(Double vat) {
        this.vat = vat;
    }
    public Double getNbt() {
        return this.nbt;
    }
    
    public void setNbt(Double nbt) {
        this.nbt = nbt;
    }
    public Integer getApproveTopPayStatus() {
        return this.approveTopPayStatus;
    }
    
    public void setApproveTopPayStatus(Integer approveTopPayStatus) {
        this.approveTopPayStatus = approveTopPayStatus;
    }
    public String getSurvyOfficer() {
        return this.survyOfficer;
    }
    
    public void setSurvyOfficer(String survyOfficer) {
        this.survyOfficer = survyOfficer;
    }
    public String getSurveyDate() {
        return this.surveyDate;
    }
    
    public void setSurveyDate(String surveyDate) {
        this.surveyDate = surveyDate;
    }
    public Double getDistance() {
        return this.distance;
    }
    
    public void setDistance(Double distance) {
        this.distance = distance;
    }
    public String getPlanNo() {
        return this.planNo;
    }
    
    public void setPlanNo(String planNo) {
        this.planNo = planNo;
    }
    public String getSoTitle() {
        return this.soTitle;
    }
    
    public void setSoTitle(String soTitle) {
        this.soTitle = soTitle;
    }
    public Integer getYesNo() {
        return this.yesNo;
    }
    
    public void setYesNo(Integer yesNo) {
        this.yesNo = yesNo;
    }
    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    public Set<Applications> getApplicationses() {
        return this.applicationses;
    }
    
    public void setApplicationses(Set<Applications> applicationses) {
        this.applicationses = applicationses;
    }




}


