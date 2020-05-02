package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * AssNature generated by hbm2java
 */
public class AssNature  implements java.io.Serializable {


     private Integer idassNature;
     private String assNatureName;
     private Double assNatureYearRate;
     private Integer assNatureStatus;
     private Double assNatureWarrantRate;
     private Set<Assessment> assessments = new HashSet<Assessment>(0);
     private Set<AssPayment> assPayments = new HashSet<AssPayment>(0);

    public AssNature() {
    }

    public AssNature(String assNatureName, Double assNatureYearRate, Integer assNatureStatus, Double assNatureWarrantRate, Set<Assessment> assessments, Set<AssPayment> assPayments) {
       this.assNatureName = assNatureName;
       this.assNatureYearRate = assNatureYearRate;
       this.assNatureStatus = assNatureStatus;
       this.assNatureWarrantRate = assNatureWarrantRate;
       this.assessments = assessments;
       this.assPayments = assPayments;
    }
   
    public Integer getIdassNature() {
        return this.idassNature;
    }
    
    public void setIdassNature(Integer idassNature) {
        this.idassNature = idassNature;
    }
    public String getAssNatureName() {
        return this.assNatureName;
    }
    
    public void setAssNatureName(String assNatureName) {
        this.assNatureName = assNatureName;
    }
    public Double getAssNatureYearRate() {
        return this.assNatureYearRate;
    }
    
    public void setAssNatureYearRate(Double assNatureYearRate) {
        this.assNatureYearRate = assNatureYearRate;
    }
    public Integer getAssNatureStatus() {
        return this.assNatureStatus;
    }
    
    public void setAssNatureStatus(Integer assNatureStatus) {
        this.assNatureStatus = assNatureStatus;
    }
    public Double getAssNatureWarrantRate() {
        return this.assNatureWarrantRate;
    }
    
    public void setAssNatureWarrantRate(Double assNatureWarrantRate) {
        this.assNatureWarrantRate = assNatureWarrantRate;
    }
    public Set<Assessment> getAssessments() {
        return this.assessments;
    }
    
    public void setAssessments(Set<Assessment> assessments) {
        this.assessments = assessments;
    }
    public Set<AssPayment> getAssPayments() {
        return this.assPayments;
    }
    
    public void setAssPayments(Set<AssPayment> assPayments) {
        this.assPayments = assPayments;
    }




}


