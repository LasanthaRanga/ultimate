package pojo;
// Generated Sep 6, 2019 4:30:16 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Customer generated by hbm2java
 */
public class Customer  implements java.io.Serializable {


     private Integer idCustomer;
     private String cusName;
     private String cusPersonTitle;
     private String cusNic;
     private String cusMobile;
     private String cusTel;
     private String cusAddressL1;
     private String cusAddressL2;
     private String cusAddressL3;
     private String cusSity;
     private Integer cusStatus;
     private Integer cusSyn;
     private Date cusRegDate;
     private Date cusUpdateDate;
     private String cusNameSinhala;
     private String cusAddressL1Sinhala;
     private String cusAddressL2Sinhala;
     private String cusAddressL3Sinhala;
     private Set<Contact> contacts = new HashSet<Contact>(0);
     private Set<CustomerHasCusCat> customerHasCusCats = new HashSet<CustomerHasCusCat>(0);
     private Set<Applications> applicationses = new HashSet<Applications>(0);
     private Set<SlDetails> slDetailses = new HashSet<SlDetails>(0);
     private Set<Bop> bops = new HashSet<Bop>(0);
     private Set<Streetline> streetlines = new HashSet<Streetline>(0);
     private Set<Application> applications = new HashSet<Application>(0);
     private Set<Environment> environments = new HashSet<Environment>(0);
     private Set<CustomerHasTradeLicense> customerHasTradeLicenses = new HashSet<CustomerHasTradeLicense>(0);
     private Set<Uploads> uploadses = new HashSet<Uploads>(0);
     private Set<CustomerHasApplicationCatagory> customerHasApplicationCatagories = new HashSet<CustomerHasApplicationCatagory>(0);
     private Set<Assessment> assessments = new HashSet<Assessment>(0);
     private Set<Building> buildings = new HashSet<Building>(0);
     private Set<SrShopHasCustomer> srShopHasCustomers = new HashSet<SrShopHasCustomer>(0);
     private Set<CustomerHasSrShop> customerHasSrShops = new HashSet<CustomerHasSrShop>(0);
     private Set<Gali> galis = new HashSet<Gali>(0);
     private Set<Referenceno> referencenos = new HashSet<Referenceno>(0);

    public Customer() {
    }

    public Customer(String cusName, String cusPersonTitle, String cusNic, String cusMobile, String cusTel, String cusAddressL1, String cusAddressL2, String cusAddressL3, String cusSity, Integer cusStatus, Integer cusSyn, Date cusRegDate, Date cusUpdateDate, String cusNameSinhala, String cusAddressL1Sinhala, String cusAddressL2Sinhala, String cusAddressL3Sinhala, Set<Contact> contacts, Set<CustomerHasCusCat> customerHasCusCats, Set<Applications> applicationses, Set<SlDetails> slDetailses, Set<Bop> bops, Set<Streetline> streetlines, Set<Application> applications, Set<Environment> environments, Set<CustomerHasTradeLicense> customerHasTradeLicenses, Set<Uploads> uploadses, Set<CustomerHasApplicationCatagory> customerHasApplicationCatagories, Set<Assessment> assessments, Set<Building> buildings, Set<SrShopHasCustomer> srShopHasCustomers, Set<CustomerHasSrShop> customerHasSrShops, Set<Gali> galis, Set<Referenceno> referencenos) {
       this.cusName = cusName;
       this.cusPersonTitle = cusPersonTitle;
       this.cusNic = cusNic;
       this.cusMobile = cusMobile;
       this.cusTel = cusTel;
       this.cusAddressL1 = cusAddressL1;
       this.cusAddressL2 = cusAddressL2;
       this.cusAddressL3 = cusAddressL3;
       this.cusSity = cusSity;
       this.cusStatus = cusStatus;
       this.cusSyn = cusSyn;
       this.cusRegDate = cusRegDate;
       this.cusUpdateDate = cusUpdateDate;
       this.cusNameSinhala = cusNameSinhala;
       this.cusAddressL1Sinhala = cusAddressL1Sinhala;
       this.cusAddressL2Sinhala = cusAddressL2Sinhala;
       this.cusAddressL3Sinhala = cusAddressL3Sinhala;
       this.contacts = contacts;
       this.customerHasCusCats = customerHasCusCats;
       this.applicationses = applicationses;
       this.slDetailses = slDetailses;
       this.bops = bops;
       this.streetlines = streetlines;
       this.applications = applications;
       this.environments = environments;
       this.customerHasTradeLicenses = customerHasTradeLicenses;
       this.uploadses = uploadses;
       this.customerHasApplicationCatagories = customerHasApplicationCatagories;
       this.assessments = assessments;
       this.buildings = buildings;
       this.srShopHasCustomers = srShopHasCustomers;
       this.customerHasSrShops = customerHasSrShops;
       this.galis = galis;
       this.referencenos = referencenos;
    }
   
    public Integer getIdCustomer() {
        return this.idCustomer;
    }
    
    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }
    public String getCusName() {
        return this.cusName;
    }
    
    public void setCusName(String cusName) {
        this.cusName = cusName;
    }
    public String getCusPersonTitle() {
        return this.cusPersonTitle;
    }
    
    public void setCusPersonTitle(String cusPersonTitle) {
        this.cusPersonTitle = cusPersonTitle;
    }
    public String getCusNic() {
        return this.cusNic;
    }
    
    public void setCusNic(String cusNic) {
        this.cusNic = cusNic;
    }
    public String getCusMobile() {
        return this.cusMobile;
    }
    
    public void setCusMobile(String cusMobile) {
        this.cusMobile = cusMobile;
    }
    public String getCusTel() {
        return this.cusTel;
    }
    
    public void setCusTel(String cusTel) {
        this.cusTel = cusTel;
    }
    public String getCusAddressL1() {
        return this.cusAddressL1;
    }
    
    public void setCusAddressL1(String cusAddressL1) {
        this.cusAddressL1 = cusAddressL1;
    }
    public String getCusAddressL2() {
        return this.cusAddressL2;
    }
    
    public void setCusAddressL2(String cusAddressL2) {
        this.cusAddressL2 = cusAddressL2;
    }
    public String getCusAddressL3() {
        return this.cusAddressL3;
    }
    
    public void setCusAddressL3(String cusAddressL3) {
        this.cusAddressL3 = cusAddressL3;
    }
    public String getCusSity() {
        return this.cusSity;
    }
    
    public void setCusSity(String cusSity) {
        this.cusSity = cusSity;
    }
    public Integer getCusStatus() {
        return this.cusStatus;
    }
    
    public void setCusStatus(Integer cusStatus) {
        this.cusStatus = cusStatus;
    }
    public Integer getCusSyn() {
        return this.cusSyn;
    }
    
    public void setCusSyn(Integer cusSyn) {
        this.cusSyn = cusSyn;
    }
    public Date getCusRegDate() {
        return this.cusRegDate;
    }
    
    public void setCusRegDate(Date cusRegDate) {
        this.cusRegDate = cusRegDate;
    }
    public Date getCusUpdateDate() {
        return this.cusUpdateDate;
    }
    
    public void setCusUpdateDate(Date cusUpdateDate) {
        this.cusUpdateDate = cusUpdateDate;
    }
    public String getCusNameSinhala() {
        return this.cusNameSinhala;
    }
    
    public void setCusNameSinhala(String cusNameSinhala) {
        this.cusNameSinhala = cusNameSinhala;
    }
    public String getCusAddressL1Sinhala() {
        return this.cusAddressL1Sinhala;
    }
    
    public void setCusAddressL1Sinhala(String cusAddressL1Sinhala) {
        this.cusAddressL1Sinhala = cusAddressL1Sinhala;
    }
    public String getCusAddressL2Sinhala() {
        return this.cusAddressL2Sinhala;
    }
    
    public void setCusAddressL2Sinhala(String cusAddressL2Sinhala) {
        this.cusAddressL2Sinhala = cusAddressL2Sinhala;
    }
    public String getCusAddressL3Sinhala() {
        return this.cusAddressL3Sinhala;
    }
    
    public void setCusAddressL3Sinhala(String cusAddressL3Sinhala) {
        this.cusAddressL3Sinhala = cusAddressL3Sinhala;
    }
    public Set<Contact> getContacts() {
        return this.contacts;
    }
    
    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }
    public Set<CustomerHasCusCat> getCustomerHasCusCats() {
        return this.customerHasCusCats;
    }
    
    public void setCustomerHasCusCats(Set<CustomerHasCusCat> customerHasCusCats) {
        this.customerHasCusCats = customerHasCusCats;
    }
    public Set<Applications> getApplicationses() {
        return this.applicationses;
    }
    
    public void setApplicationses(Set<Applications> applicationses) {
        this.applicationses = applicationses;
    }
    public Set<SlDetails> getSlDetailses() {
        return this.slDetailses;
    }
    
    public void setSlDetailses(Set<SlDetails> slDetailses) {
        this.slDetailses = slDetailses;
    }
    public Set<Bop> getBops() {
        return this.bops;
    }
    
    public void setBops(Set<Bop> bops) {
        this.bops = bops;
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
    public Set<Environment> getEnvironments() {
        return this.environments;
    }
    
    public void setEnvironments(Set<Environment> environments) {
        this.environments = environments;
    }
    public Set<CustomerHasTradeLicense> getCustomerHasTradeLicenses() {
        return this.customerHasTradeLicenses;
    }
    
    public void setCustomerHasTradeLicenses(Set<CustomerHasTradeLicense> customerHasTradeLicenses) {
        this.customerHasTradeLicenses = customerHasTradeLicenses;
    }
    public Set<Uploads> getUploadses() {
        return this.uploadses;
    }
    
    public void setUploadses(Set<Uploads> uploadses) {
        this.uploadses = uploadses;
    }
    public Set<CustomerHasApplicationCatagory> getCustomerHasApplicationCatagories() {
        return this.customerHasApplicationCatagories;
    }
    
    public void setCustomerHasApplicationCatagories(Set<CustomerHasApplicationCatagory> customerHasApplicationCatagories) {
        this.customerHasApplicationCatagories = customerHasApplicationCatagories;
    }
    public Set<Assessment> getAssessments() {
        return this.assessments;
    }
    
    public void setAssessments(Set<Assessment> assessments) {
        this.assessments = assessments;
    }
    public Set<Building> getBuildings() {
        return this.buildings;
    }
    
    public void setBuildings(Set<Building> buildings) {
        this.buildings = buildings;
    }
    public Set<SrShopHasCustomer> getSrShopHasCustomers() {
        return this.srShopHasCustomers;
    }
    
    public void setSrShopHasCustomers(Set<SrShopHasCustomer> srShopHasCustomers) {
        this.srShopHasCustomers = srShopHasCustomers;
    }
    public Set<CustomerHasSrShop> getCustomerHasSrShops() {
        return this.customerHasSrShops;
    }
    
    public void setCustomerHasSrShops(Set<CustomerHasSrShop> customerHasSrShops) {
        this.customerHasSrShops = customerHasSrShops;
    }
    public Set<Gali> getGalis() {
        return this.galis;
    }
    
    public void setGalis(Set<Gali> galis) {
        this.galis = galis;
    }
    public Set<Referenceno> getReferencenos() {
        return this.referencenos;
    }
    
    public void setReferencenos(Set<Referenceno> referencenos) {
        this.referencenos = referencenos;
    }




}


