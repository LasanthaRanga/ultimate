package pojo;
// Generated Aug 6, 2019 9:53:07 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Gali generated by hbm2java
 */
public class Gali  implements java.io.Serializable {


     private Integer idGali;
     private Customer customer;
     private String addressGali;
     private String howToGo;
     private Date dateGali;
     private String contactGali;
     private Double distanceGali;
     private Double loadGali;
     private Double priceGali;
     private Double vatGali;
     private Double nbtGali;
     private Double stampGali;
     private Double othersGali;
     private Integer statusGali;
     private Integer synGali;
     private Set<GaliHasEmploye> galiHasEmployes = new HashSet<GaliHasEmploye>(0);

    public Gali() {
    }

	
    public Gali(Customer customer) {
        this.customer = customer;
    }
    public Gali(Customer customer, String addressGali, String howToGo, Date dateGali, String contactGali, Double distanceGali, Double loadGali, Double priceGali, Double vatGali, Double nbtGali, Double stampGali, Double othersGali, Integer statusGali, Integer synGali, Set<GaliHasEmploye> galiHasEmployes) {
       this.customer = customer;
       this.addressGali = addressGali;
       this.howToGo = howToGo;
       this.dateGali = dateGali;
       this.contactGali = contactGali;
       this.distanceGali = distanceGali;
       this.loadGali = loadGali;
       this.priceGali = priceGali;
       this.vatGali = vatGali;
       this.nbtGali = nbtGali;
       this.stampGali = stampGali;
       this.othersGali = othersGali;
       this.statusGali = statusGali;
       this.synGali = synGali;
       this.galiHasEmployes = galiHasEmployes;
    }
   
    public Integer getIdGali() {
        return this.idGali;
    }
    
    public void setIdGali(Integer idGali) {
        this.idGali = idGali;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public String getAddressGali() {
        return this.addressGali;
    }
    
    public void setAddressGali(String addressGali) {
        this.addressGali = addressGali;
    }
    public String getHowToGo() {
        return this.howToGo;
    }
    
    public void setHowToGo(String howToGo) {
        this.howToGo = howToGo;
    }
    public Date getDateGali() {
        return this.dateGali;
    }
    
    public void setDateGali(Date dateGali) {
        this.dateGali = dateGali;
    }
    public String getContactGali() {
        return this.contactGali;
    }
    
    public void setContactGali(String contactGali) {
        this.contactGali = contactGali;
    }
    public Double getDistanceGali() {
        return this.distanceGali;
    }
    
    public void setDistanceGali(Double distanceGali) {
        this.distanceGali = distanceGali;
    }
    public Double getLoadGali() {
        return this.loadGali;
    }
    
    public void setLoadGali(Double loadGali) {
        this.loadGali = loadGali;
    }
    public Double getPriceGali() {
        return this.priceGali;
    }
    
    public void setPriceGali(Double priceGali) {
        this.priceGali = priceGali;
    }
    public Double getVatGali() {
        return this.vatGali;
    }
    
    public void setVatGali(Double vatGali) {
        this.vatGali = vatGali;
    }
    public Double getNbtGali() {
        return this.nbtGali;
    }
    
    public void setNbtGali(Double nbtGali) {
        this.nbtGali = nbtGali;
    }
    public Double getStampGali() {
        return this.stampGali;
    }
    
    public void setStampGali(Double stampGali) {
        this.stampGali = stampGali;
    }
    public Double getOthersGali() {
        return this.othersGali;
    }
    
    public void setOthersGali(Double othersGali) {
        this.othersGali = othersGali;
    }
    public Integer getStatusGali() {
        return this.statusGali;
    }
    
    public void setStatusGali(Integer statusGali) {
        this.statusGali = statusGali;
    }
    public Integer getSynGali() {
        return this.synGali;
    }
    
    public void setSynGali(Integer synGali) {
        this.synGali = synGali;
    }
    public Set<GaliHasEmploye> getGaliHasEmployes() {
        return this.galiHasEmployes;
    }
    
    public void setGaliHasEmployes(Set<GaliHasEmploye> galiHasEmployes) {
        this.galiHasEmployes = galiHasEmployes;
    }




}


