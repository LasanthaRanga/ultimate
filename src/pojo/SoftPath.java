package pojo;
// Generated Oct 3, 2019 9:56:57 AM by Hibernate Tools 4.3.1



/**
 * SoftPath generated by hbm2java
 */
public class SoftPath  implements java.io.Serializable {


     private Integer idSoft;
     private Integer appid;
     private String path;
     private Integer status;
     private String comment;

    public SoftPath() {
    }

    public SoftPath(Integer appid, String path, Integer status, String comment) {
       this.appid = appid;
       this.path = path;
       this.status = status;
       this.comment = comment;
    }
   
    public Integer getIdSoft() {
        return this.idSoft;
    }
    
    public void setIdSoft(Integer idSoft) {
        this.idSoft = idSoft;
    }
    public Integer getAppid() {
        return this.appid;
    }
    
    public void setAppid(Integer appid) {
        this.appid = appid;
    }
    public String getPath() {
        return this.path;
    }
    
    public void setPath(String path) {
        this.path = path;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }




}

