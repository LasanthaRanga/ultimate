package pojo;
// Generated Oct 3, 2019 9:56:57 AM by Hibernate Tools 4.3.1



/**
 * WbMApplicationCategory generated by hbm2java
 */
public class WbMApplicationCategory  implements java.io.Serializable {


     private int wbMApplicationTblid;
     private Integer wbMApplicationId;

    public WbMApplicationCategory() {
    }

	
    public WbMApplicationCategory(int wbMApplicationTblid) {
        this.wbMApplicationTblid = wbMApplicationTblid;
    }
    public WbMApplicationCategory(int wbMApplicationTblid, Integer wbMApplicationId) {
       this.wbMApplicationTblid = wbMApplicationTblid;
       this.wbMApplicationId = wbMApplicationId;
    }
   
    public int getWbMApplicationTblid() {
        return this.wbMApplicationTblid;
    }
    
    public void setWbMApplicationTblid(int wbMApplicationTblid) {
        this.wbMApplicationTblid = wbMApplicationTblid;
    }
    public Integer getWbMApplicationId() {
        return this.wbMApplicationId;
    }
    
    public void setWbMApplicationId(Integer wbMApplicationId) {
        this.wbMApplicationId = wbMApplicationId;
    }




}


