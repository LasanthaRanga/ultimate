package pojo;
// Generated Dec 31, 2019 11:13:20 PM by Hibernate Tools 4.3.1



/**
 * KformData generated by hbm2java
 */
public class KformData  implements java.io.Serializable {


     private Integer idkfom;
     private String key;
     private String valueSinhala;
     private String valueEnglish;
     private String valueTemil;

    public KformData() {
    }

    public KformData(String key, String valueSinhala, String valueEnglish, String valueTemil) {
       this.key = key;
       this.valueSinhala = valueSinhala;
       this.valueEnglish = valueEnglish;
       this.valueTemil = valueTemil;
    }
   
    public Integer getIdkfom() {
        return this.idkfom;
    }
    
    public void setIdkfom(Integer idkfom) {
        this.idkfom = idkfom;
    }
    public String getKey() {
        return this.key;
    }
    
    public void setKey(String key) {
        this.key = key;
    }
    public String getValueSinhala() {
        return this.valueSinhala;
    }
    
    public void setValueSinhala(String valueSinhala) {
        this.valueSinhala = valueSinhala;
    }
    public String getValueEnglish() {
        return this.valueEnglish;
    }
    
    public void setValueEnglish(String valueEnglish) {
        this.valueEnglish = valueEnglish;
    }
    public String getValueTemil() {
        return this.valueTemil;
    }
    
    public void setValueTemil(String valueTemil) {
        this.valueTemil = valueTemil;
    }




}


