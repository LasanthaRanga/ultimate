package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Obsaloot generated by hbm2java
 */
public class Obsaloot  implements java.io.Serializable {


     private Integer idobsaloot;
     private Assessment assessment;
     private String obsalootNo;
     private Date obsalootDate;
     private String obsalootDetails;
     private String obsalootDOrA;

    public Obsaloot() {
    }

	
    public Obsaloot(Assessment assessment) {
        this.assessment = assessment;
    }
    public Obsaloot(Assessment assessment, String obsalootNo, Date obsalootDate, String obsalootDetails, String obsalootDOrA) {
       this.assessment = assessment;
       this.obsalootNo = obsalootNo;
       this.obsalootDate = obsalootDate;
       this.obsalootDetails = obsalootDetails;
       this.obsalootDOrA = obsalootDOrA;
    }
   
    public Integer getIdobsaloot() {
        return this.idobsaloot;
    }
    
    public void setIdobsaloot(Integer idobsaloot) {
        this.idobsaloot = idobsaloot;
    }
    public Assessment getAssessment() {
        return this.assessment;
    }
    
    public void setAssessment(Assessment assessment) {
        this.assessment = assessment;
    }
    public String getObsalootNo() {
        return this.obsalootNo;
    }
    
    public void setObsalootNo(String obsalootNo) {
        this.obsalootNo = obsalootNo;
    }
    public Date getObsalootDate() {
        return this.obsalootDate;
    }
    
    public void setObsalootDate(Date obsalootDate) {
        this.obsalootDate = obsalootDate;
    }
    public String getObsalootDetails() {
        return this.obsalootDetails;
    }
    
    public void setObsalootDetails(String obsalootDetails) {
        this.obsalootDetails = obsalootDetails;
    }
    public String getObsalootDOrA() {
        return this.obsalootDOrA;
    }
    
    public void setObsalootDOrA(String obsalootDOrA) {
        this.obsalootDOrA = obsalootDOrA;
    }




}


