package pojo;
// Generated Dec 19, 2019 12:34:46 PM by Hibernate Tools 4.3.1



/**
 * UserHasCatagory generated by hbm2java
 */
public class UserHasCatagory  implements java.io.Serializable {


     private Integer idUserHasCatagory;
     private Catagory catagory;
     private User user;
     private Integer status;
     private Integer syn;

    public UserHasCatagory() {
    }

	
    public UserHasCatagory(Catagory catagory, User user) {
        this.catagory = catagory;
        this.user = user;
    }
    public UserHasCatagory(Catagory catagory, User user, Integer status, Integer syn) {
       this.catagory = catagory;
       this.user = user;
       this.status = status;
       this.syn = syn;
    }
   
    public Integer getIdUserHasCatagory() {
        return this.idUserHasCatagory;
    }
    
    public void setIdUserHasCatagory(Integer idUserHasCatagory) {
        this.idUserHasCatagory = idUserHasCatagory;
    }
    public Catagory getCatagory() {
        return this.catagory;
    }
    
    public void setCatagory(Catagory catagory) {
        this.catagory = catagory;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
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

