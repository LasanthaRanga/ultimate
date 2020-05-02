package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * UserLevel generated by hbm2java
 */
public class UserLevel  implements java.io.Serializable {


     private Integer userLevelId;
     private String userLevel;
     private Set<User> users = new HashSet<User>(0);

    public UserLevel() {
    }

    public UserLevel(String userLevel, Set<User> users) {
       this.userLevel = userLevel;
       this.users = users;
    }
   
    public Integer getUserLevelId() {
        return this.userLevelId;
    }
    
    public void setUserLevelId(Integer userLevelId) {
        this.userLevelId = userLevelId;
    }
    public String getUserLevel() {
        return this.userLevel;
    }
    
    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }
    public Set<User> getUsers() {
        return this.users;
    }
    
    public void setUsers(Set<User> users) {
        this.users = users;
    }




}


