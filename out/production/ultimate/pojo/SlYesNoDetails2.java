package pojo;
// Generated Dec 19, 2019 12:34:46 PM by Hibernate Tools 4.3.1



/**
 * SlYesNoDetails2 generated by hbm2java
 */
public class SlYesNoDetails2  implements java.io.Serializable {


     private Integer yesNoStatusId;
     private String yesNoStatusName;

    public SlYesNoDetails2() {
    }

    public SlYesNoDetails2(String yesNoStatusName) {
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

