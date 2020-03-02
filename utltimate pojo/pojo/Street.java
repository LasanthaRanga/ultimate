package pojo;
// Generated Sep 6, 2019 4:30:16 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Street generated by hbm2java
 */
public class Street  implements java.io.Serializable {


     private Integer idStreet;
     private Ward ward;
     private String streetName;
     private String streetNo;
     private Integer streetStatus;
     private Integer streetSyn;
     private String streetComent;
     private String streetNameSinhala;
     private Double streetWidth;
     private Double streetLineLimit;
     private String streetCode;
     private Set<Assessment> assessments = new HashSet<Assessment>(0);
     private Set<SlDistance> slDistances = new HashSet<SlDistance>(0);
     private Set<WbMDivision> wbMDivisions = new HashSet<WbMDivision>(0);

    public Street() {
    }

	
    public Street(Ward ward) {
        this.ward = ward;
    }
    public Street(Ward ward, String streetName, String streetNo, Integer streetStatus, Integer streetSyn, String streetComent, String streetNameSinhala, Double streetWidth, Double streetLineLimit, String streetCode, Set<Assessment> assessments, Set<SlDistance> slDistances, Set<WbMDivision> wbMDivisions) {
       this.ward = ward;
       this.streetName = streetName;
       this.streetNo = streetNo;
       this.streetStatus = streetStatus;
       this.streetSyn = streetSyn;
       this.streetComent = streetComent;
       this.streetNameSinhala = streetNameSinhala;
       this.streetWidth = streetWidth;
       this.streetLineLimit = streetLineLimit;
       this.streetCode = streetCode;
       this.assessments = assessments;
       this.slDistances = slDistances;
       this.wbMDivisions = wbMDivisions;
    }
   
    public Integer getIdStreet() {
        return this.idStreet;
    }
    
    public void setIdStreet(Integer idStreet) {
        this.idStreet = idStreet;
    }
    public Ward getWard() {
        return this.ward;
    }
    
    public void setWard(Ward ward) {
        this.ward = ward;
    }
    public String getStreetName() {
        return this.streetName;
    }
    
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public String getStreetNo() {
        return this.streetNo;
    }
    
    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }
    public Integer getStreetStatus() {
        return this.streetStatus;
    }
    
    public void setStreetStatus(Integer streetStatus) {
        this.streetStatus = streetStatus;
    }
    public Integer getStreetSyn() {
        return this.streetSyn;
    }
    
    public void setStreetSyn(Integer streetSyn) {
        this.streetSyn = streetSyn;
    }
    public String getStreetComent() {
        return this.streetComent;
    }
    
    public void setStreetComent(String streetComent) {
        this.streetComent = streetComent;
    }
    public String getStreetNameSinhala() {
        return this.streetNameSinhala;
    }
    
    public void setStreetNameSinhala(String streetNameSinhala) {
        this.streetNameSinhala = streetNameSinhala;
    }
    public Double getStreetWidth() {
        return this.streetWidth;
    }
    
    public void setStreetWidth(Double streetWidth) {
        this.streetWidth = streetWidth;
    }
    public Double getStreetLineLimit() {
        return this.streetLineLimit;
    }
    
    public void setStreetLineLimit(Double streetLineLimit) {
        this.streetLineLimit = streetLineLimit;
    }
    public String getStreetCode() {
        return this.streetCode;
    }
    
    public void setStreetCode(String streetCode) {
        this.streetCode = streetCode;
    }
    public Set<Assessment> getAssessments() {
        return this.assessments;
    }
    
    public void setAssessments(Set<Assessment> assessments) {
        this.assessments = assessments;
    }
    public Set<SlDistance> getSlDistances() {
        return this.slDistances;
    }
    
    public void setSlDistances(Set<SlDistance> slDistances) {
        this.slDistances = slDistances;
    }
    public Set<WbMDivision> getWbMDivisions() {
        return this.wbMDivisions;
    }
    
    public void setWbMDivisions(Set<WbMDivision> wbMDivisions) {
        this.wbMDivisions = wbMDivisions;
    }




}

