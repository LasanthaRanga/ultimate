package pojo;
// Generated Sep 6, 2019 4:30:16 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Assessment generated by hbm2java
 */
public class Assessment  implements java.io.Serializable {


     private Integer idAssessment;
     private AssDiscription assDiscription;
     private AssNature assNature;
     private Customer customer;
     private Street street;
     private User user;
     private Ward ward;
     private Double assessmentOder;
     private String assessmentNo;
     private Integer assessmentStatus;
     private Integer assessmentSyn;
     private String assessmentComment;
     private String assessmentObsolete;
     private Integer officeIdOffice;
     private Set<AssAllocation> assAllocations = new HashSet<AssAllocation>(0);
     private Set<BuildingHasAssessment> buildingHasAssessments = new HashSet<BuildingHasAssessment>(0);
     private Set<AssQstart> assQstarts = new HashSet<AssQstart>(0);
     private Set<Obsaloot> obsaloots = new HashSet<Obsaloot>(0);
     private Set<AssSubowner> assSubowners = new HashSet<AssSubowner>(0);
     private Set<AssPayhistry> assPayhistries = new HashSet<AssPayhistry>(0);
     private Set<AssPayment> assPayments = new HashSet<AssPayment>(0);
     private Set<AssCreditdebit> assCreditdebits = new HashSet<AssCreditdebit>(0);
     private Set<Streetline> streetlines = new HashSet<Streetline>(0);
     private Set<Application> applications = new HashSet<Application>(0);
     private Set<AssessmentHasProcesstype> assessmentHasProcesstypes = new HashSet<AssessmentHasProcesstype>(0);
     private Set<BopHasAssessment> bopHasAssessments = new HashSet<BopHasAssessment>(0);
     private Set<AssHistory> assHistories = new HashSet<AssHistory>(0);

    public Assessment() {
    }

	
    public Assessment(AssDiscription assDiscription, AssNature assNature, Customer customer, Street street, User user, Ward ward) {
        this.assDiscription = assDiscription;
        this.assNature = assNature;
        this.customer = customer;
        this.street = street;
        this.user = user;
        this.ward = ward;
    }
    public Assessment(AssDiscription assDiscription, AssNature assNature, Customer customer, Street street, User user, Ward ward, Double assessmentOder, String assessmentNo, Integer assessmentStatus, Integer assessmentSyn, String assessmentComment, String assessmentObsolete, Integer officeIdOffice, Set<AssAllocation> assAllocations, Set<BuildingHasAssessment> buildingHasAssessments, Set<AssQstart> assQstarts, Set<Obsaloot> obsaloots, Set<AssSubowner> assSubowners, Set<AssPayhistry> assPayhistries, Set<AssPayment> assPayments, Set<AssCreditdebit> assCreditdebits, Set<Streetline> streetlines, Set<Application> applications, Set<AssessmentHasProcesstype> assessmentHasProcesstypes, Set<BopHasAssessment> bopHasAssessments, Set<AssHistory> assHistories) {
       this.assDiscription = assDiscription;
       this.assNature = assNature;
       this.customer = customer;
       this.street = street;
       this.user = user;
       this.ward = ward;
       this.assessmentOder = assessmentOder;
       this.assessmentNo = assessmentNo;
       this.assessmentStatus = assessmentStatus;
       this.assessmentSyn = assessmentSyn;
       this.assessmentComment = assessmentComment;
       this.assessmentObsolete = assessmentObsolete;
       this.officeIdOffice = officeIdOffice;
       this.assAllocations = assAllocations;
       this.buildingHasAssessments = buildingHasAssessments;
       this.assQstarts = assQstarts;
       this.obsaloots = obsaloots;
       this.assSubowners = assSubowners;
       this.assPayhistries = assPayhistries;
       this.assPayments = assPayments;
       this.assCreditdebits = assCreditdebits;
       this.streetlines = streetlines;
       this.applications = applications;
       this.assessmentHasProcesstypes = assessmentHasProcesstypes;
       this.bopHasAssessments = bopHasAssessments;
       this.assHistories = assHistories;
    }
   
    public Integer getIdAssessment() {
        return this.idAssessment;
    }
    
    public void setIdAssessment(Integer idAssessment) {
        this.idAssessment = idAssessment;
    }
    public AssDiscription getAssDiscription() {
        return this.assDiscription;
    }
    
    public void setAssDiscription(AssDiscription assDiscription) {
        this.assDiscription = assDiscription;
    }
    public AssNature getAssNature() {
        return this.assNature;
    }
    
    public void setAssNature(AssNature assNature) {
        this.assNature = assNature;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Street getStreet() {
        return this.street;
    }
    
    public void setStreet(Street street) {
        this.street = street;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public Ward getWard() {
        return this.ward;
    }
    
    public void setWard(Ward ward) {
        this.ward = ward;
    }
    public Double getAssessmentOder() {
        return this.assessmentOder;
    }
    
    public void setAssessmentOder(Double assessmentOder) {
        this.assessmentOder = assessmentOder;
    }
    public String getAssessmentNo() {
        return this.assessmentNo;
    }
    
    public void setAssessmentNo(String assessmentNo) {
        this.assessmentNo = assessmentNo;
    }
    public Integer getAssessmentStatus() {
        return this.assessmentStatus;
    }
    
    public void setAssessmentStatus(Integer assessmentStatus) {
        this.assessmentStatus = assessmentStatus;
    }
    public Integer getAssessmentSyn() {
        return this.assessmentSyn;
    }
    
    public void setAssessmentSyn(Integer assessmentSyn) {
        this.assessmentSyn = assessmentSyn;
    }
    public String getAssessmentComment() {
        return this.assessmentComment;
    }
    
    public void setAssessmentComment(String assessmentComment) {
        this.assessmentComment = assessmentComment;
    }
    public String getAssessmentObsolete() {
        return this.assessmentObsolete;
    }
    
    public void setAssessmentObsolete(String assessmentObsolete) {
        this.assessmentObsolete = assessmentObsolete;
    }
    public Integer getOfficeIdOffice() {
        return this.officeIdOffice;
    }
    
    public void setOfficeIdOffice(Integer officeIdOffice) {
        this.officeIdOffice = officeIdOffice;
    }
    public Set<AssAllocation> getAssAllocations() {
        return this.assAllocations;
    }
    
    public void setAssAllocations(Set<AssAllocation> assAllocations) {
        this.assAllocations = assAllocations;
    }
    public Set<BuildingHasAssessment> getBuildingHasAssessments() {
        return this.buildingHasAssessments;
    }
    
    public void setBuildingHasAssessments(Set<BuildingHasAssessment> buildingHasAssessments) {
        this.buildingHasAssessments = buildingHasAssessments;
    }
    public Set<AssQstart> getAssQstarts() {
        return this.assQstarts;
    }
    
    public void setAssQstarts(Set<AssQstart> assQstarts) {
        this.assQstarts = assQstarts;
    }
    public Set<Obsaloot> getObsaloots() {
        return this.obsaloots;
    }
    
    public void setObsaloots(Set<Obsaloot> obsaloots) {
        this.obsaloots = obsaloots;
    }
    public Set<AssSubowner> getAssSubowners() {
        return this.assSubowners;
    }
    
    public void setAssSubowners(Set<AssSubowner> assSubowners) {
        this.assSubowners = assSubowners;
    }
    public Set<AssPayhistry> getAssPayhistries() {
        return this.assPayhistries;
    }
    
    public void setAssPayhistries(Set<AssPayhistry> assPayhistries) {
        this.assPayhistries = assPayhistries;
    }
    public Set<AssPayment> getAssPayments() {
        return this.assPayments;
    }
    
    public void setAssPayments(Set<AssPayment> assPayments) {
        this.assPayments = assPayments;
    }
    public Set<AssCreditdebit> getAssCreditdebits() {
        return this.assCreditdebits;
    }
    
    public void setAssCreditdebits(Set<AssCreditdebit> assCreditdebits) {
        this.assCreditdebits = assCreditdebits;
    }
    public Set<Streetline> getStreetlines() {
        return this.streetlines;
    }
    
    public void setStreetlines(Set<Streetline> streetlines) {
        this.streetlines = streetlines;
    }
    public Set<Application> getApplications() {
        return this.applications;
    }
    
    public void setApplications(Set<Application> applications) {
        this.applications = applications;
    }
    public Set<AssessmentHasProcesstype> getAssessmentHasProcesstypes() {
        return this.assessmentHasProcesstypes;
    }
    
    public void setAssessmentHasProcesstypes(Set<AssessmentHasProcesstype> assessmentHasProcesstypes) {
        this.assessmentHasProcesstypes = assessmentHasProcesstypes;
    }
    public Set<BopHasAssessment> getBopHasAssessments() {
        return this.bopHasAssessments;
    }
    
    public void setBopHasAssessments(Set<BopHasAssessment> bopHasAssessments) {
        this.bopHasAssessments = bopHasAssessments;
    }
    public Set<AssHistory> getAssHistories() {
        return this.assHistories;
    }
    
    public void setAssHistories(Set<AssHistory> assHistories) {
        this.assHistories = assHistories;
    }




}


