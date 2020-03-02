package pojo;
// Generated Sep 6, 2019 4:30:16 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Doccat generated by hbm2java
 */
public class Doccat  implements java.io.Serializable {


     private Integer idDoccat;
     private String doccatName;
     private Set<Uploads> uploadses = new HashSet<Uploads>(0);
     private Set<Needdoc> needdocs = new HashSet<Needdoc>(0);

    public Doccat() {
    }

    public Doccat(String doccatName, Set<Uploads> uploadses, Set<Needdoc> needdocs) {
       this.doccatName = doccatName;
       this.uploadses = uploadses;
       this.needdocs = needdocs;
    }
   
    public Integer getIdDoccat() {
        return this.idDoccat;
    }
    
    public void setIdDoccat(Integer idDoccat) {
        this.idDoccat = idDoccat;
    }
    public String getDoccatName() {
        return this.doccatName;
    }
    
    public void setDoccatName(String doccatName) {
        this.doccatName = doccatName;
    }
    public Set<Uploads> getUploadses() {
        return this.uploadses;
    }
    
    public void setUploadses(Set<Uploads> uploadses) {
        this.uploadses = uploadses;
    }
    public Set<Needdoc> getNeeddocs() {
        return this.needdocs;
    }
    
    public void setNeeddocs(Set<Needdoc> needdocs) {
        this.needdocs = needdocs;
    }




}

