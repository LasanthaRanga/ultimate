package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1



/**
 * BaAnswer generated by hbm2java
 */
public class BaAnswer  implements java.io.Serializable {


     private Integer baAnswerId;
     private String baAnswer;

    public BaAnswer() {
    }

    public BaAnswer(String baAnswer) {
       this.baAnswer = baAnswer;
    }
   
    public Integer getBaAnswerId() {
        return this.baAnswerId;
    }
    
    public void setBaAnswerId(Integer baAnswerId) {
        this.baAnswerId = baAnswerId;
    }
    public String getBaAnswer() {
        return this.baAnswer;
    }
    
    public void setBaAnswer(String baAnswer) {
        this.baAnswer = baAnswer;
    }




}


