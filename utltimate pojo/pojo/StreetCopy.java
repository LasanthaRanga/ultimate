package pojo;
// Generated Sep 6, 2019 4:30:16 PM by Hibernate Tools 4.3.1



/**
 * StreetCopy generated by hbm2java
 */
public class StreetCopy  implements java.io.Serializable {


     private Integer idStreet;
     private Ward ward;
     private String streetName;
     private String strretNo;
     private Integer status;
     private Integer syn;

    public StreetCopy() {
    }

	
    public StreetCopy(Ward ward) {
        this.ward = ward;
    }
    public StreetCopy(Ward ward, String streetName, String strretNo, Integer status, Integer syn) {
       this.ward = ward;
       this.streetName = streetName;
       this.strretNo = strretNo;
       this.status = status;
       this.syn = syn;
    }
   
    public Integer getIdStreet() {
        return this.idStreet;
    }
    
    public void setIdStreet(Integer idStreet) {
        this.idStreet = idStreet;
    }
    public Ward getWard() {
        return this.ward;
    }
    
    public void setWard(Ward ward) {
        this.ward = ward;
    }
    public String getStreetName() {
        return this.streetName;
    }
    
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public String getStrretNo() {
        return this.strretNo;
    }
    
    public void setStrretNo(String strretNo) {
        this.strretNo = strretNo;
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


