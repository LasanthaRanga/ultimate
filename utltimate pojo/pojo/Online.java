package pojo;
// Generated Oct 3, 2019 9:56:57 AM by Hibernate Tools 4.3.1



/**
 * Online generated by hbm2java
 */
public class Online  implements java.io.Serializable {


     private Integer idonline;
     private String email;
     private String mobile;
     private String nic;
     private String code;
     private Integer status;

    public Online() {
    }

    public Online(String email, String mobile, String nic, String code, Integer status) {
       this.email = email;
       this.mobile = mobile;
       this.nic = nic;
       this.code = code;
       this.status = status;
    }
   
    public Integer getIdonline() {
        return this.idonline;
    }
    
    public void setIdonline(Integer idonline) {
        this.idonline = idonline;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getNic() {
        return this.nic;
    }
    
    public void setNic(String nic) {
        this.nic = nic;
    }
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }




}


