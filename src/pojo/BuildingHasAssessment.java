package pojo;
// Generated Aug 6, 2019 9:53:07 AM by Hibernate Tools 4.3.1



/**
 * BuildingHasAssessment generated by hbm2java
 */
public class BuildingHasAssessment  implements java.io.Serializable {


     private Integer idBuildingHasAssessment;
     private Assessment assessment;
     private Building building;
     private Integer buildingHasAssessmentStatus;

    public BuildingHasAssessment() {
    }

	
    public BuildingHasAssessment(Assessment assessment, Building building) {
        this.assessment = assessment;
        this.building = building;
    }
    public BuildingHasAssessment(Assessment assessment, Building building, Integer buildingHasAssessmentStatus) {
       this.assessment = assessment;
       this.building = building;
       this.buildingHasAssessmentStatus = buildingHasAssessmentStatus;
    }
   
    public Integer getIdBuildingHasAssessment() {
        return this.idBuildingHasAssessment;
    }
    
    public void setIdBuildingHasAssessment(Integer idBuildingHasAssessment) {
        this.idBuildingHasAssessment = idBuildingHasAssessment;
    }
    public Assessment getAssessment() {
        return this.assessment;
    }
    
    public void setAssessment(Assessment assessment) {
        this.assessment = assessment;
    }
    public Building getBuilding() {
        return this.building;
    }
    
    public void setBuilding(Building building) {
        this.building = building;
    }
    public Integer getBuildingHasAssessmentStatus() {
        return this.buildingHasAssessmentStatus;
    }
    
    public void setBuildingHasAssessmentStatus(Integer buildingHasAssessmentStatus) {
        this.buildingHasAssessmentStatus = buildingHasAssessmentStatus;
    }




}


