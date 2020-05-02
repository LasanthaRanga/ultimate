package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * ApprovalCat generated by hbm2java
 */
public class ApprovalCat  implements java.io.Serializable {


     private Integer idApprovalCat;
     private String approvalName;
     private Integer statusAppCat;
     private Integer synAppCat;
     private Set<UserHasApprovalCat> userHasApprovalCats = new HashSet<UserHasApprovalCat>(0);
     private Set<ApprovalBy> approvalBies = new HashSet<ApprovalBy>(0);
     private Set<WebPrivHasApproveCat> webPrivHasApproveCats = new HashSet<WebPrivHasApproveCat>(0);

    public ApprovalCat() {
    }

    public ApprovalCat(String approvalName, Integer statusAppCat, Integer synAppCat, Set<UserHasApprovalCat> userHasApprovalCats, Set<ApprovalBy> approvalBies, Set<WebPrivHasApproveCat> webPrivHasApproveCats) {
       this.approvalName = approvalName;
       this.statusAppCat = statusAppCat;
       this.synAppCat = synAppCat;
       this.userHasApprovalCats = userHasApprovalCats;
       this.approvalBies = approvalBies;
       this.webPrivHasApproveCats = webPrivHasApproveCats;
    }
   
    public Integer getIdApprovalCat() {
        return this.idApprovalCat;
    }
    
    public void setIdApprovalCat(Integer idApprovalCat) {
        this.idApprovalCat = idApprovalCat;
    }
    public String getApprovalName() {
        return this.approvalName;
    }
    
    public void setApprovalName(String approvalName) {
        this.approvalName = approvalName;
    }
    public Integer getStatusAppCat() {
        return this.statusAppCat;
    }
    
    public void setStatusAppCat(Integer statusAppCat) {
        this.statusAppCat = statusAppCat;
    }
    public Integer getSynAppCat() {
        return this.synAppCat;
    }
    
    public void setSynAppCat(Integer synAppCat) {
        this.synAppCat = synAppCat;
    }
    public Set<UserHasApprovalCat> getUserHasApprovalCats() {
        return this.userHasApprovalCats;
    }
    
    public void setUserHasApprovalCats(Set<UserHasApprovalCat> userHasApprovalCats) {
        this.userHasApprovalCats = userHasApprovalCats;
    }
    public Set<ApprovalBy> getApprovalBies() {
        return this.approvalBies;
    }
    
    public void setApprovalBies(Set<ApprovalBy> approvalBies) {
        this.approvalBies = approvalBies;
    }
    public Set<WebPrivHasApproveCat> getWebPrivHasApproveCats() {
        return this.webPrivHasApproveCats;
    }
    
    public void setWebPrivHasApproveCats(Set<WebPrivHasApproveCat> webPrivHasApproveCats) {
        this.webPrivHasApproveCats = webPrivHasApproveCats;
    }




}


