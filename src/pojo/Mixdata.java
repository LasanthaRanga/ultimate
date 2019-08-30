package pojo;
// Generated Aug 6, 2019 9:53:07 AM by Hibernate Tools 4.3.1



/**
 * Mixdata generated by hbm2java
 */
public class Mixdata  implements java.io.Serializable {


     private Integer idMixdata;
     private Mixincome mixincome;
     private Mixintype mixintype;
     private String mdDescription;
     private Double mdAmount;
     private Double mdVat;
     private Double mdNbt;
     private Double mdStamp;
     private Double mdTotal;

    public Mixdata() {
    }

    public Mixdata(Mixincome mixincome, Mixintype mixintype, String mdDescription, Double mdAmount, Double mdVat, Double mdNbt, Double mdStamp, Double mdTotal) {
       this.mixincome = mixincome;
       this.mixintype = mixintype;
       this.mdDescription = mdDescription;
       this.mdAmount = mdAmount;
       this.mdVat = mdVat;
       this.mdNbt = mdNbt;
       this.mdStamp = mdStamp;
       this.mdTotal = mdTotal;
    }
   
    public Integer getIdMixdata() {
        return this.idMixdata;
    }
    
    public void setIdMixdata(Integer idMixdata) {
        this.idMixdata = idMixdata;
    }
    public Mixincome getMixincome() {
        return this.mixincome;
    }
    
    public void setMixincome(Mixincome mixincome) {
        this.mixincome = mixincome;
    }
    public Mixintype getMixintype() {
        return this.mixintype;
    }
    
    public void setMixintype(Mixintype mixintype) {
        this.mixintype = mixintype;
    }
    public String getMdDescription() {
        return this.mdDescription;
    }
    
    public void setMdDescription(String mdDescription) {
        this.mdDescription = mdDescription;
    }
    public Double getMdAmount() {
        return this.mdAmount;
    }
    
    public void setMdAmount(Double mdAmount) {
        this.mdAmount = mdAmount;
    }
    public Double getMdVat() {
        return this.mdVat;
    }
    
    public void setMdVat(Double mdVat) {
        this.mdVat = mdVat;
    }
    public Double getMdNbt() {
        return this.mdNbt;
    }
    
    public void setMdNbt(Double mdNbt) {
        this.mdNbt = mdNbt;
    }
    public Double getMdStamp() {
        return this.mdStamp;
    }
    
    public void setMdStamp(Double mdStamp) {
        this.mdStamp = mdStamp;
    }
    public Double getMdTotal() {
        return this.mdTotal;
    }
    
    public void setMdTotal(Double mdTotal) {
        this.mdTotal = mdTotal;
    }




}


