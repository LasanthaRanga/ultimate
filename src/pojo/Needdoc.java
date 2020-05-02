package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1



/**
 * Needdoc generated by hbm2java
 */
public class Needdoc  implements java.io.Serializable {


     private Integer idNeedDoc;
     private ApplicationCatagory applicationCatagory;
     private Doccat doccat;
     private Integer needDocPriority;

    public Needdoc() {
    }

	
    public Needdoc(ApplicationCatagory applicationCatagory, Doccat doccat) {
        this.applicationCatagory = applicationCatagory;
        this.doccat = doccat;
    }
    public Needdoc(ApplicationCatagory applicationCatagory, Doccat doccat, Integer needDocPriority) {
       this.applicationCatagory = applicationCatagory;
       this.doccat = doccat;
       this.needDocPriority = needDocPriority;
    }
   
    public Integer getIdNeedDoc() {
        return this.idNeedDoc;
    }
    
    public void setIdNeedDoc(Integer idNeedDoc) {
        this.idNeedDoc = idNeedDoc;
    }
    public ApplicationCatagory getApplicationCatagory() {
        return this.applicationCatagory;
    }
    
    public void setApplicationCatagory(ApplicationCatagory applicationCatagory) {
        this.applicationCatagory = applicationCatagory;
    }
    public Doccat getDoccat() {
        return this.doccat;
    }
    
    public void setDoccat(Doccat doccat) {
        this.doccat = doccat;
    }
    public Integer getNeedDocPriority() {
        return this.needDocPriority;
    }
    
    public void setNeedDocPriority(Integer needDocPriority) {
        this.needDocPriority = needDocPriority;
    }




}


