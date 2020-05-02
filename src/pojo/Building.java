package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Building generated by hbm2java
 */
public class Building  implements java.io.Serializable {


     private Integer idBuilding;
     private Customer customer;
     private Integer assessmentIdAssessment;
     private Set<BuildingHasAssessment> buildingHasAssessments = new HashSet<BuildingHasAssessment>(0);

    public Building() {
    }

	
    public Building(Customer customer) {
        this.customer = customer;
    }
    public Building(Customer customer, Integer assessmentIdAssessment, Set<BuildingHasAssessment> buildingHasAssessments) {
       this.customer = customer;
       this.assessmentIdAssessment = assessmentIdAssessment;
       this.buildingHasAssessments = buildingHasAssessments;
    }
   
    public Integer getIdBuilding() {
        return this.idBuilding;
    }
    
    public void setIdBuilding(Integer idBuilding) {
        this.idBuilding = idBuilding;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Integer getAssessmentIdAssessment() {
        return this.assessmentIdAssessment;
    }
    
    public void setAssessmentIdAssessment(Integer assessmentIdAssessment) {
        this.assessmentIdAssessment = assessmentIdAssessment;
    }
    public Set<BuildingHasAssessment> getBuildingHasAssessments() {
        return this.buildingHasAssessments;
    }
    
    public void setBuildingHasAssessments(Set<BuildingHasAssessment> buildingHasAssessments) {
        this.buildingHasAssessments = buildingHasAssessments;
    }




}


