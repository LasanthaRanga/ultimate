package pojo;
// Generated Dec 19, 2019 12:34:46 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * UserCopy generated by hbm2java
 */
public class UserCopy  implements java.io.Serializable {


     private Integer idUser;
     private String fullName;
     private String nic;
     private String mobile;
     private Date regDate;
     private String sq;
     private String sqa;
     private Integer status;
     private Integer syn;
     private Set<Login> logins = new HashSet<Login>(0);

    public UserCopy() {
    }

    public UserCopy(String fullName, String nic, String mobile, Date regDate, String sq, String sqa, Integer status, Integer syn, Set<Login> logins) {
       this.fullName = fullName;
       this.nic = nic;
       this.mobile = mobile;
       this.regDate = regDate;
       this.sq = sq;
       this.sqa = sqa;
       this.status = status;
       this.syn = syn;
       this.logins = logins;
    }
   
    public Integer getIdUser() {
        return this.idUser;
    }
    
    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
    public String getFullName() {
        return this.fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getNic() {
        return this.nic;
    }
    
    public void setNic(String nic) {
        this.nic = nic;
    }
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public Date getRegDate() {
        return this.regDate;
    }
    
    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
    public String getSq() {
        return this.sq;
    }
    
    public void setSq(String sq) {
        this.sq = sq;
    }
    public String getSqa() {
        return this.sqa;
    }
    
    public void setSqa(String sqa) {
        this.sqa = sqa;
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
    public Set<Login> getLogins() {
        return this.logins;
    }
    
    public void setLogins(Set<Login> logins) {
        this.logins = logins;
    }




}

