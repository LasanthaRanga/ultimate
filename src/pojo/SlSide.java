package pojo;
// Generated Sep 6, 2019 4:30:16 PM by Hibernate Tools 4.3.1



/**
 * SlSide generated by hbm2java
 */
public class SlSide  implements java.io.Serializable {


     private Integer sideId;
     private String sideName;

    public SlSide() {
    }

    public SlSide(String sideName) {
       this.sideName = sideName;
    }
   
    public Integer getSideId() {
        return this.sideId;
    }
    
    public void setSideId(Integer sideId) {
        this.sideId = sideId;
    }
    public String getSideName() {
        return this.sideName;
    }
    
    public void setSideName(String sideName) {
        this.sideName = sideName;
    }




}


