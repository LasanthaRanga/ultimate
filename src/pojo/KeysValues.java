package pojo;
// Generated Aug 6, 2019 9:53:07 AM by Hibernate Tools 4.3.1



/**
 * KeysValues generated by hbm2java
 */
public class KeysValues  implements java.io.Serializable {


     private Integer id;
     private String keyname;
     private String val;

    public KeysValues() {
    }

    public KeysValues(String keyname, String val) {
       this.keyname = keyname;
       this.val = val;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getKeyname() {
        return this.keyname;
    }
    
    public void setKeyname(String keyname) {
        this.keyname = keyname;
    }
    public String getVal() {
        return this.val;
    }
    
    public void setVal(String val) {
        this.val = val;
    }




}


