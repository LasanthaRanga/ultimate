package pojo;
// Generated Dec 19, 2019 12:34:46 PM by Hibernate Tools 4.3.1



/**
 * Ui generated by hbm2java
 */
public class Ui  implements java.io.Serializable {


     private int idui;
     private String name;

    public Ui() {
    }

	
    public Ui(int idui) {
        this.idui = idui;
    }
    public Ui(int idui, String name) {
       this.idui = idui;
       this.name = name;
    }
   
    public int getIdui() {
        return this.idui;
    }
    
    public void setIdui(int idui) {
        this.idui = idui;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}

