package pojo;
// Generated Aug 6, 2019 9:53:07 AM by Hibernate Tools 4.3.1



/**
 * RibillList generated by hbm2java
 */
public class RibillList  implements java.io.Serializable {


     private Integer idRibillLsit;
     private Ribill ribill;
     private Integer idRicit;
     private Integer ricitstatus;
     private Double ricittotal;

    public RibillList() {
    }

    public RibillList(Ribill ribill, Integer idRicit, Integer ricitstatus, Double ricittotal) {
       this.ribill = ribill;
       this.idRicit = idRicit;
       this.ricitstatus = ricitstatus;
       this.ricittotal = ricittotal;
    }
   
    public Integer getIdRibillLsit() {
        return this.idRibillLsit;
    }
    
    public void setIdRibillLsit(Integer idRibillLsit) {
        this.idRibillLsit = idRibillLsit;
    }
    public Ribill getRibill() {
        return this.ribill;
    }
    
    public void setRibill(Ribill ribill) {
        this.ribill = ribill;
    }
    public Integer getIdRicit() {
        return this.idRicit;
    }
    
    public void setIdRicit(Integer idRicit) {
        this.idRicit = idRicit;
    }
    public Integer getRicitstatus() {
        return this.ricitstatus;
    }
    
    public void setRicitstatus(Integer ricitstatus) {
        this.ricitstatus = ricitstatus;
    }
    public Double getRicittotal() {
        return this.ricittotal;
    }
    
    public void setRicittotal(Double ricittotal) {
        this.ricittotal = ricittotal;
    }




}


