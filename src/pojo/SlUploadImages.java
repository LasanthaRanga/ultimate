package pojo;
// Generated Aug 6, 2019 9:53:07 AM by Hibernate Tools 4.3.1



/**
 * SlUploadImages generated by hbm2java
 */
public class SlUploadImages  implements java.io.Serializable {


     private Integer imageId;
     private String nicPath;
     private String docPath;

    public SlUploadImages() {
    }

    public SlUploadImages(String nicPath, String docPath) {
       this.nicPath = nicPath;
       this.docPath = docPath;
    }
   
    public Integer getImageId() {
        return this.imageId;
    }
    
    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }
    public String getNicPath() {
        return this.nicPath;
    }
    
    public void setNicPath(String nicPath) {
        this.nicPath = nicPath;
    }
    public String getDocPath() {
        return this.docPath;
    }
    
    public void setDocPath(String docPath) {
        this.docPath = docPath;
    }




}


