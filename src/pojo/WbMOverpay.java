package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1



/**
 * WbMOverpay generated by hbm2java
 */
public class WbMOverpay  implements java.io.Serializable {


     private Integer wbMOverPayId;
     private WbMConnection wbMConnection;
     private Double wbMOverPayAmount;

    public WbMOverpay() {
    }

    public WbMOverpay(WbMConnection wbMConnection, Double wbMOverPayAmount) {
       this.wbMConnection = wbMConnection;
       this.wbMOverPayAmount = wbMOverPayAmount;
    }
   
    public Integer getWbMOverPayId() {
        return this.wbMOverPayId;
    }
    
    public void setWbMOverPayId(Integer wbMOverPayId) {
        this.wbMOverPayId = wbMOverPayId;
    }
    public WbMConnection getWbMConnection() {
        return this.wbMConnection;
    }
    
    public void setWbMConnection(WbMConnection wbMConnection) {
        this.wbMConnection = wbMConnection;
    }
    public Double getWbMOverPayAmount() {
        return this.wbMOverPayAmount;
    }
    
    public void setWbMOverPayAmount(Double wbMOverPayAmount) {
        this.wbMOverPayAmount = wbMOverPayAmount;
    }




}

