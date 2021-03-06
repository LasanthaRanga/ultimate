package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1



/**
 * ExVote generated by hbm2java
 */
public class ExVote  implements java.io.Serializable {


     private ExVoteId id;
     private String exVoteAndBalCode;
     private String exVoteAndBalName;
     private String exProNameEng;
     private Integer exProId;
     private Integer exProCode;
     private String exTitleNameEng;
     private Integer exTitleId;
     private Integer exTitleCode;
     private String exSubtitleNameEng;
     private Integer exSubtitleId;
     private Integer exSubtitleCode;
     private Integer exType1Id;
     private String exType1Name;
     private Integer exType2Id;
     private String exType2Name;
     private Integer exVoteOrBal;
     private Integer exOrder;
     private Integer exVBId;
     private String exProNameSinhala;
     private String exProNameTamil;
     private String exTitleNameSinhala;
     private String exSubtitleNameTamil;
     private String exSubtitleNameSinhala;
     private String exVoteAndBalNameSinhala;
     private String exVoteAndBalNameTamil;
     private Integer exProjectId;
     private String exProjectNameSin;
     private String exProjectNameEng;
     private String exProjectNameTamil;
     private Integer exVoteTypeStatus;

    public ExVote() {
    }

	
    public ExVote(ExVoteId id) {
        this.id = id;
    }
    public ExVote(ExVoteId id, String exVoteAndBalCode, String exVoteAndBalName, String exProNameEng, Integer exProId, Integer exProCode, String exTitleNameEng, Integer exTitleId, Integer exTitleCode, String exSubtitleNameEng, Integer exSubtitleId, Integer exSubtitleCode, Integer exType1Id, String exType1Name, Integer exType2Id, String exType2Name, Integer exVoteOrBal, Integer exOrder, Integer exVBId, String exProNameSinhala, String exProNameTamil, String exTitleNameSinhala, String exSubtitleNameTamil, String exSubtitleNameSinhala, String exVoteAndBalNameSinhala, String exVoteAndBalNameTamil, Integer exProjectId, String exProjectNameSin, String exProjectNameEng, String exProjectNameTamil, Integer exVoteTypeStatus) {
       this.id = id;
       this.exVoteAndBalCode = exVoteAndBalCode;
       this.exVoteAndBalName = exVoteAndBalName;
       this.exProNameEng = exProNameEng;
       this.exProId = exProId;
       this.exProCode = exProCode;
       this.exTitleNameEng = exTitleNameEng;
       this.exTitleId = exTitleId;
       this.exTitleCode = exTitleCode;
       this.exSubtitleNameEng = exSubtitleNameEng;
       this.exSubtitleId = exSubtitleId;
       this.exSubtitleCode = exSubtitleCode;
       this.exType1Id = exType1Id;
       this.exType1Name = exType1Name;
       this.exType2Id = exType2Id;
       this.exType2Name = exType2Name;
       this.exVoteOrBal = exVoteOrBal;
       this.exOrder = exOrder;
       this.exVBId = exVBId;
       this.exProNameSinhala = exProNameSinhala;
       this.exProNameTamil = exProNameTamil;
       this.exTitleNameSinhala = exTitleNameSinhala;
       this.exSubtitleNameTamil = exSubtitleNameTamil;
       this.exSubtitleNameSinhala = exSubtitleNameSinhala;
       this.exVoteAndBalNameSinhala = exVoteAndBalNameSinhala;
       this.exVoteAndBalNameTamil = exVoteAndBalNameTamil;
       this.exProjectId = exProjectId;
       this.exProjectNameSin = exProjectNameSin;
       this.exProjectNameEng = exProjectNameEng;
       this.exProjectNameTamil = exProjectNameTamil;
       this.exVoteTypeStatus = exVoteTypeStatus;
    }
   
    public ExVoteId getId() {
        return this.id;
    }
    
    public void setId(ExVoteId id) {
        this.id = id;
    }
    public String getExVoteAndBalCode() {
        return this.exVoteAndBalCode;
    }
    
    public void setExVoteAndBalCode(String exVoteAndBalCode) {
        this.exVoteAndBalCode = exVoteAndBalCode;
    }
    public String getExVoteAndBalName() {
        return this.exVoteAndBalName;
    }
    
    public void setExVoteAndBalName(String exVoteAndBalName) {
        this.exVoteAndBalName = exVoteAndBalName;
    }
    public String getExProNameEng() {
        return this.exProNameEng;
    }
    
    public void setExProNameEng(String exProNameEng) {
        this.exProNameEng = exProNameEng;
    }
    public Integer getExProId() {
        return this.exProId;
    }
    
    public void setExProId(Integer exProId) {
        this.exProId = exProId;
    }
    public Integer getExProCode() {
        return this.exProCode;
    }
    
    public void setExProCode(Integer exProCode) {
        this.exProCode = exProCode;
    }
    public String getExTitleNameEng() {
        return this.exTitleNameEng;
    }
    
    public void setExTitleNameEng(String exTitleNameEng) {
        this.exTitleNameEng = exTitleNameEng;
    }
    public Integer getExTitleId() {
        return this.exTitleId;
    }
    
    public void setExTitleId(Integer exTitleId) {
        this.exTitleId = exTitleId;
    }
    public Integer getExTitleCode() {
        return this.exTitleCode;
    }
    
    public void setExTitleCode(Integer exTitleCode) {
        this.exTitleCode = exTitleCode;
    }
    public String getExSubtitleNameEng() {
        return this.exSubtitleNameEng;
    }
    
    public void setExSubtitleNameEng(String exSubtitleNameEng) {
        this.exSubtitleNameEng = exSubtitleNameEng;
    }
    public Integer getExSubtitleId() {
        return this.exSubtitleId;
    }
    
    public void setExSubtitleId(Integer exSubtitleId) {
        this.exSubtitleId = exSubtitleId;
    }
    public Integer getExSubtitleCode() {
        return this.exSubtitleCode;
    }
    
    public void setExSubtitleCode(Integer exSubtitleCode) {
        this.exSubtitleCode = exSubtitleCode;
    }
    public Integer getExType1Id() {
        return this.exType1Id;
    }
    
    public void setExType1Id(Integer exType1Id) {
        this.exType1Id = exType1Id;
    }
    public String getExType1Name() {
        return this.exType1Name;
    }
    
    public void setExType1Name(String exType1Name) {
        this.exType1Name = exType1Name;
    }
    public Integer getExType2Id() {
        return this.exType2Id;
    }
    
    public void setExType2Id(Integer exType2Id) {
        this.exType2Id = exType2Id;
    }
    public String getExType2Name() {
        return this.exType2Name;
    }
    
    public void setExType2Name(String exType2Name) {
        this.exType2Name = exType2Name;
    }
    public Integer getExVoteOrBal() {
        return this.exVoteOrBal;
    }
    
    public void setExVoteOrBal(Integer exVoteOrBal) {
        this.exVoteOrBal = exVoteOrBal;
    }
    public Integer getExOrder() {
        return this.exOrder;
    }
    
    public void setExOrder(Integer exOrder) {
        this.exOrder = exOrder;
    }
    public Integer getExVBId() {
        return this.exVBId;
    }
    
    public void setExVBId(Integer exVBId) {
        this.exVBId = exVBId;
    }
    public String getExProNameSinhala() {
        return this.exProNameSinhala;
    }
    
    public void setExProNameSinhala(String exProNameSinhala) {
        this.exProNameSinhala = exProNameSinhala;
    }
    public String getExProNameTamil() {
        return this.exProNameTamil;
    }
    
    public void setExProNameTamil(String exProNameTamil) {
        this.exProNameTamil = exProNameTamil;
    }
    public String getExTitleNameSinhala() {
        return this.exTitleNameSinhala;
    }
    
    public void setExTitleNameSinhala(String exTitleNameSinhala) {
        this.exTitleNameSinhala = exTitleNameSinhala;
    }
    public String getExSubtitleNameTamil() {
        return this.exSubtitleNameTamil;
    }
    
    public void setExSubtitleNameTamil(String exSubtitleNameTamil) {
        this.exSubtitleNameTamil = exSubtitleNameTamil;
    }
    public String getExSubtitleNameSinhala() {
        return this.exSubtitleNameSinhala;
    }
    
    public void setExSubtitleNameSinhala(String exSubtitleNameSinhala) {
        this.exSubtitleNameSinhala = exSubtitleNameSinhala;
    }
    public String getExVoteAndBalNameSinhala() {
        return this.exVoteAndBalNameSinhala;
    }
    
    public void setExVoteAndBalNameSinhala(String exVoteAndBalNameSinhala) {
        this.exVoteAndBalNameSinhala = exVoteAndBalNameSinhala;
    }
    public String getExVoteAndBalNameTamil() {
        return this.exVoteAndBalNameTamil;
    }
    
    public void setExVoteAndBalNameTamil(String exVoteAndBalNameTamil) {
        this.exVoteAndBalNameTamil = exVoteAndBalNameTamil;
    }
    public Integer getExProjectId() {
        return this.exProjectId;
    }
    
    public void setExProjectId(Integer exProjectId) {
        this.exProjectId = exProjectId;
    }
    public String getExProjectNameSin() {
        return this.exProjectNameSin;
    }
    
    public void setExProjectNameSin(String exProjectNameSin) {
        this.exProjectNameSin = exProjectNameSin;
    }
    public String getExProjectNameEng() {
        return this.exProjectNameEng;
    }
    
    public void setExProjectNameEng(String exProjectNameEng) {
        this.exProjectNameEng = exProjectNameEng;
    }
    public String getExProjectNameTamil() {
        return this.exProjectNameTamil;
    }
    
    public void setExProjectNameTamil(String exProjectNameTamil) {
        this.exProjectNameTamil = exProjectNameTamil;
    }
    public Integer getExVoteTypeStatus() {
        return this.exVoteTypeStatus;
    }
    
    public void setExVoteTypeStatus(Integer exVoteTypeStatus) {
        this.exVoteTypeStatus = exVoteTypeStatus;
    }




}


