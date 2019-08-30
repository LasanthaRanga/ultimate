package pojo;
// Generated Aug 6, 2019 9:53:07 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TradeType generated by hbm2java
 */
public class TradeType  implements java.io.Serializable {


     private Integer idTradeType;
     private Vort vort;
     private String typeName;
     private Integer status;
     private Integer syn;
     private String typeSinhala;
     private Set<TradeNature> tradeNatures = new HashSet<TradeNature>(0);
     private Set<Application> applications = new HashSet<Application>(0);

    public TradeType() {
    }

	
    public TradeType(Vort vort) {
        this.vort = vort;
    }
    public TradeType(Vort vort, String typeName, Integer status, Integer syn, String typeSinhala, Set<TradeNature> tradeNatures, Set<Application> applications) {
       this.vort = vort;
       this.typeName = typeName;
       this.status = status;
       this.syn = syn;
       this.typeSinhala = typeSinhala;
       this.tradeNatures = tradeNatures;
       this.applications = applications;
    }
   
    public Integer getIdTradeType() {
        return this.idTradeType;
    }
    
    public void setIdTradeType(Integer idTradeType) {
        this.idTradeType = idTradeType;
    }
    public Vort getVort() {
        return this.vort;
    }
    
    public void setVort(Vort vort) {
        this.vort = vort;
    }
    public String getTypeName() {
        return this.typeName;
    }
    
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getSyn() {
        return this.syn;
    }
    
    public void setSyn(Integer syn) {
        this.syn = syn;
    }
    public String getTypeSinhala() {
        return this.typeSinhala;
    }
    
    public void setTypeSinhala(String typeSinhala) {
        this.typeSinhala = typeSinhala;
    }
    public Set<TradeNature> getTradeNatures() {
        return this.tradeNatures;
    }
    
    public void setTradeNatures(Set<TradeNature> tradeNatures) {
        this.tradeNatures = tradeNatures;
    }
    public Set<Application> getApplications() {
        return this.applications;
    }
    
    public void setApplications(Set<Application> applications) {
        this.applications = applications;
    }




}


