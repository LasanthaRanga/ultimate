package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1



/**
 * SabhaDetails generated by hbm2java
 */
public class SabhaDetails  implements java.io.Serializable {


     private int sabhaId;
     private String sabhaNameEnglish;
     private String sabhanameSinhala;
     private String sabhaCode;

    public SabhaDetails() {
    }

	
    public SabhaDetails(int sabhaId) {
        this.sabhaId = sabhaId;
    }
    public SabhaDetails(int sabhaId, String sabhaNameEnglish, String sabhanameSinhala, String sabhaCode) {
       this.sabhaId = sabhaId;
       this.sabhaNameEnglish = sabhaNameEnglish;
       this.sabhanameSinhala = sabhanameSinhala;
       this.sabhaCode = sabhaCode;
    }
   
    public int getSabhaId() {
        return this.sabhaId;
    }
    
    public void setSabhaId(int sabhaId) {
        this.sabhaId = sabhaId;
    }
    public String getSabhaNameEnglish() {
        return this.sabhaNameEnglish;
    }
    
    public void setSabhaNameEnglish(String sabhaNameEnglish) {
        this.sabhaNameEnglish = sabhaNameEnglish;
    }
    public String getSabhanameSinhala() {
        return this.sabhanameSinhala;
    }
    
    public void setSabhanameSinhala(String sabhanameSinhala) {
        this.sabhanameSinhala = sabhanameSinhala;
    }
    public String getSabhaCode() {
        return this.sabhaCode;
    }
    
    public void setSabhaCode(String sabhaCode) {
        this.sabhaCode = sabhaCode;
    }




}


