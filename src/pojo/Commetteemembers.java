package pojo;
// Generated Aug 6, 2019 9:53:07 AM by Hibernate Tools 4.3.1



/**
 * Commetteemembers generated by hbm2java
 */
public class Commetteemembers  implements java.io.Serializable {


     private Integer idCommetteeMembers;
     private Bophascommettee bophascommettee;
     private User user;

    public Commetteemembers() {
    }

    public Commetteemembers(Bophascommettee bophascommettee, User user) {
       this.bophascommettee = bophascommettee;
       this.user = user;
    }
   
    public Integer getIdCommetteeMembers() {
        return this.idCommetteeMembers;
    }
    
    public void setIdCommetteeMembers(Integer idCommetteeMembers) {
        this.idCommetteeMembers = idCommetteeMembers;
    }
    public Bophascommettee getBophascommettee() {
        return this.bophascommettee;
    }
    
    public void setBophascommettee(Bophascommettee bophascommettee) {
        this.bophascommettee = bophascommettee;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }




}


