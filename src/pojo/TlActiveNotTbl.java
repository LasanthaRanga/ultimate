package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1



/**
 * TlActiveNotTbl generated by hbm2java
 */
public class TlActiveNotTbl  implements java.io.Serializable {


     private int tlActNotId;
     private String tlActStatus;

    public TlActiveNotTbl() {
    }

	
    public TlActiveNotTbl(int tlActNotId) {
        this.tlActNotId = tlActNotId;
    }
    public TlActiveNotTbl(int tlActNotId, String tlActStatus) {
       this.tlActNotId = tlActNotId;
       this.tlActStatus = tlActStatus;
    }
   
    public int getTlActNotId() {
        return this.tlActNotId;
    }
    
    public void setTlActNotId(int tlActNotId) {
        this.tlActNotId = tlActNotId;
    }
    public String getTlActStatus() {
        return this.tlActStatus;
    }
    
    public void setTlActStatus(String tlActStatus) {
        this.tlActStatus = tlActStatus;
    }




}


