package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * AccBalSheetTitle generated by hbm2java
 */
public class AccBalSheetTitle  implements java.io.Serializable {


     private Integer balSheetTitleId;
     private String balSheetTitleName;
     private Integer balSheetTitleStatus;
     private String balSheetTitleCode;
     private Set<AccBalSheetSubtitle> accBalSheetSubtitles = new HashSet<AccBalSheetSubtitle>(0);

    public AccBalSheetTitle() {
    }

    public AccBalSheetTitle(String balSheetTitleName, Integer balSheetTitleStatus, String balSheetTitleCode, Set<AccBalSheetSubtitle> accBalSheetSubtitles) {
       this.balSheetTitleName = balSheetTitleName;
       this.balSheetTitleStatus = balSheetTitleStatus;
       this.balSheetTitleCode = balSheetTitleCode;
       this.accBalSheetSubtitles = accBalSheetSubtitles;
    }
   
    public Integer getBalSheetTitleId() {
        return this.balSheetTitleId;
    }
    
    public void setBalSheetTitleId(Integer balSheetTitleId) {
        this.balSheetTitleId = balSheetTitleId;
    }
    public String getBalSheetTitleName() {
        return this.balSheetTitleName;
    }
    
    public void setBalSheetTitleName(String balSheetTitleName) {
        this.balSheetTitleName = balSheetTitleName;
    }
    public Integer getBalSheetTitleStatus() {
        return this.balSheetTitleStatus;
    }
    
    public void setBalSheetTitleStatus(Integer balSheetTitleStatus) {
        this.balSheetTitleStatus = balSheetTitleStatus;
    }
    public String getBalSheetTitleCode() {
        return this.balSheetTitleCode;
    }
    
    public void setBalSheetTitleCode(String balSheetTitleCode) {
        this.balSheetTitleCode = balSheetTitleCode;
    }
    public Set<AccBalSheetSubtitle> getAccBalSheetSubtitles() {
        return this.accBalSheetSubtitles;
    }
    
    public void setAccBalSheetSubtitles(Set<AccBalSheetSubtitle> accBalSheetSubtitles) {
        this.accBalSheetSubtitles = accBalSheetSubtitles;
    }




}


