package pojo;
// Generated Aug 6, 2019 9:53:07 AM by Hibernate Tools 4.3.1



/**
 * SlYesNoDetails6 generated by hbm2java
 */
public class SlYesNoDetails6  implements java.io.Serializable {


     private Integer yesNoStatusId;
     private String yesNoStatusName;

    public SlYesNoDetails6() {
    }

    public SlYesNoDetails6(String yesNoStatusName) {
       this.yesNoStatusName = yesNoStatusName;
    }
   
    public Integer getYesNoStatusId() {
        return this.yesNoStatusId;
    }
    
    public void setYesNoStatusId(Integer yesNoStatusId) {
        this.yesNoStatusId = yesNoStatusId;
    }
    public String getYesNoStatusName() {
        return this.yesNoStatusName;
    }
    
    public void setYesNoStatusName(String yesNoStatusName) {
        this.yesNoStatusName = yesNoStatusName;
    }




}


