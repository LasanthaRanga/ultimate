package pojo;
// Generated Aug 6, 2019 9:53:07 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * AssDiscription generated by hbm2java
 */
public class AssDiscription  implements java.io.Serializable {


     private Integer idassDiscription;
     private String assDiscription;
     private String assDiscriptionStatus;
     private Set<Assessment> assessments = new HashSet<Assessment>(0);

    public AssDiscription() {
    }

    public AssDiscription(String assDiscription, String assDiscriptionStatus, Set<Assessment> assessments) {
       this.assDiscription = assDiscription;
       this.assDiscriptionStatus = assDiscriptionStatus;
       this.assessments = assessments;
    }
   
    public Integer getIdassDiscription() {
        return this.idassDiscription;
    }
    
    public void setIdassDiscription(Integer idassDiscription) {
        this.idassDiscription = idassDiscription;
    }
    public String getAssDiscription() {
        return this.assDiscription;
    }
    
    public void setAssDiscription(String assDiscription) {
        this.assDiscription = assDiscription;
    }
    public String getAssDiscriptionStatus() {
        return this.assDiscriptionStatus;
    }
    
    public void setAssDiscriptionStatus(String assDiscriptionStatus) {
        this.assDiscriptionStatus = assDiscriptionStatus;
    }
    public Set<Assessment> getAssessments() {
        return this.assessments;
    }
    
    public void setAssessments(Set<Assessment> assessments) {
        this.assessments = assessments;
    }




}


