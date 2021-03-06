package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1



/**
 * Login generated by hbm2java
 */
public class Login  implements java.io.Serializable {


     private Integer idLogin;
     private UserCopy userCopy;
     private String uname;
     private String pword;
     private Integer status;
     private Integer syn;

    public Login() {
    }

	
    public Login(UserCopy userCopy) {
        this.userCopy = userCopy;
    }
    public Login(UserCopy userCopy, String uname, String pword, Integer status, Integer syn) {
       this.userCopy = userCopy;
       this.uname = uname;
       this.pword = pword;
       this.status = status;
       this.syn = syn;
    }
   
    public Integer getIdLogin() {
        return this.idLogin;
    }
    
    public void setIdLogin(Integer idLogin) {
        this.idLogin = idLogin;
    }
    public UserCopy getUserCopy() {
        return this.userCopy;
    }
    
    public void setUserCopy(UserCopy userCopy) {
        this.userCopy = userCopy;
    }
    public String getUname() {
        return this.uname;
    }
    
    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getPword() {
        return this.pword;
    }
    
    public void setPword(String pword) {
        this.pword = pword;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getSyn() {
        return this.syn;
    }
    
    public void setSyn(Integer syn) {
        this.syn = syn;
    }




}


