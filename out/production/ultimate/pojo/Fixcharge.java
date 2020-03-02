package pojo;
// Generated Dec 19, 2019 12:34:46 PM by Hibernate Tools 4.3.1



/**
 * Fixcharge generated by hbm2java
 */
public class Fixcharge  implements java.io.Serializable {


     private int idFix;
     private Integer idAppCat;
     private Integer paytype;
     private String appName;
     private Double charge;
     private Integer hasVat;
     private Integer hasNbt;
     private Integer hasStamp;
     private Integer hasOther;
     private Integer voteId;

    public Fixcharge() {
    }

	
    public Fixcharge(int idFix) {
        this.idFix = idFix;
    }
    public Fixcharge(int idFix, Integer idAppCat, Integer paytype, String appName, Double charge, Integer hasVat, Integer hasNbt, Integer hasStamp, Integer hasOther, Integer voteId) {
       this.idFix = idFix;
       this.idAppCat = idAppCat;
       this.paytype = paytype;
       this.appName = appName;
       this.charge = charge;
       this.hasVat = hasVat;
       this.hasNbt = hasNbt;
       this.hasStamp = hasStamp;
       this.hasOther = hasOther;
       this.voteId = voteId;
    }
   
    public int getIdFix() {
        return this.idFix;
    }
    
    public void setIdFix(int idFix) {
        this.idFix = idFix;
    }
    public Integer getIdAppCat() {
        return this.idAppCat;
    }
    
    public void setIdAppCat(Integer idAppCat) {
        this.idAppCat = idAppCat;
    }
    public Integer getPaytype() {
        return this.paytype;
    }
    
    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }
    public String getAppName() {
        return this.appName;
    }
    
    public void setAppName(String appName) {
        this.appName = appName;
    }
    public Double getCharge() {
        return this.charge;
    }
    
    public void setCharge(Double charge) {
        this.charge = charge;
    }
    public Integer getHasVat() {
        return this.hasVat;
    }
    
    public void setHasVat(Integer hasVat) {
        this.hasVat = hasVat;
    }
    public Integer getHasNbt() {
        return this.hasNbt;
    }
    
    public void setHasNbt(Integer hasNbt) {
        this.hasNbt = hasNbt;
    }
    public Integer getHasStamp() {
        return this.hasStamp;
    }
    
    public void setHasStamp(Integer hasStamp) {
        this.hasStamp = hasStamp;
    }
    public Integer getHasOther() {
        return this.hasOther;
    }
    
    public void setHasOther(Integer hasOther) {
        this.hasOther = hasOther;
    }
    public Integer getVoteId() {
        return this.voteId;
    }
    
    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }




}

