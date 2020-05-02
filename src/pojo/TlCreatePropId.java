package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TlCreatePropId generated by hbm2java
 */
public class TlCreatePropId  implements java.io.Serializable {


     private Integer tlCreateIdId;
     private ElectroDivision electroDivision;
     private Gnd gnd;
     private Office office;
     private Street street;
     private Ward ward;
     private String tlCreateNo;
     private Integer tlCreateOrder;
     private String tlOnlyNumber;
     private String tlCreateFirstCode;
     private String tlCreatePlaceAdd1E;
     private String tlCreatePlaceAdd2E;
     private String tlCreatePlaceAdd3E;
     private String tlCreatePlaceAdd1S;
     private String tlCreatePlaceAdd2S;
     private String tlCreatePlaceAdd3S;
     private Integer tlCreateIdStatus;
     private Date tlCreateDate;
     private Date tlCreateTime;
     private Integer tlCreateUser;
     private Set<TlApp> tlApps = new HashSet<TlApp>(0);

    public TlCreatePropId() {
    }

    public TlCreatePropId(ElectroDivision electroDivision, Gnd gnd, Office office, Street street, Ward ward, String tlCreateNo, Integer tlCreateOrder, String tlOnlyNumber, String tlCreateFirstCode, String tlCreatePlaceAdd1E, String tlCreatePlaceAdd2E, String tlCreatePlaceAdd3E, String tlCreatePlaceAdd1S, String tlCreatePlaceAdd2S, String tlCreatePlaceAdd3S, Integer tlCreateIdStatus, Date tlCreateDate, Date tlCreateTime, Integer tlCreateUser, Set<TlApp> tlApps) {
       this.electroDivision = electroDivision;
       this.gnd = gnd;
       this.office = office;
       this.street = street;
       this.ward = ward;
       this.tlCreateNo = tlCreateNo;
       this.tlCreateOrder = tlCreateOrder;
       this.tlOnlyNumber = tlOnlyNumber;
       this.tlCreateFirstCode = tlCreateFirstCode;
       this.tlCreatePlaceAdd1E = tlCreatePlaceAdd1E;
       this.tlCreatePlaceAdd2E = tlCreatePlaceAdd2E;
       this.tlCreatePlaceAdd3E = tlCreatePlaceAdd3E;
       this.tlCreatePlaceAdd1S = tlCreatePlaceAdd1S;
       this.tlCreatePlaceAdd2S = tlCreatePlaceAdd2S;
       this.tlCreatePlaceAdd3S = tlCreatePlaceAdd3S;
       this.tlCreateIdStatus = tlCreateIdStatus;
       this.tlCreateDate = tlCreateDate;
       this.tlCreateTime = tlCreateTime;
       this.tlCreateUser = tlCreateUser;
       this.tlApps = tlApps;
    }
   
    public Integer getTlCreateIdId() {
        return this.tlCreateIdId;
    }
    
    public void setTlCreateIdId(Integer tlCreateIdId) {
        this.tlCreateIdId = tlCreateIdId;
    }
    public ElectroDivision getElectroDivision() {
        return this.electroDivision;
    }
    
    public void setElectroDivision(ElectroDivision electroDivision) {
        this.electroDivision = electroDivision;
    }
    public Gnd getGnd() {
        return this.gnd;
    }
    
    public void setGnd(Gnd gnd) {
        this.gnd = gnd;
    }
    public Office getOffice() {
        return this.office;
    }
    
    public void setOffice(Office office) {
        this.office = office;
    }
    public Street getStreet() {
        return this.street;
    }
    
    public void setStreet(Street street) {
        this.street = street;
    }
    public Ward getWard() {
        return this.ward;
    }
    
    public void setWard(Ward ward) {
        this.ward = ward;
    }
    public String getTlCreateNo() {
        return this.tlCreateNo;
    }
    
    public void setTlCreateNo(String tlCreateNo) {
        this.tlCreateNo = tlCreateNo;
    }
    public Integer getTlCreateOrder() {
        return this.tlCreateOrder;
    }
    
    public void setTlCreateOrder(Integer tlCreateOrder) {
        this.tlCreateOrder = tlCreateOrder;
    }
    public String getTlOnlyNumber() {
        return this.tlOnlyNumber;
    }
    
    public void setTlOnlyNumber(String tlOnlyNumber) {
        this.tlOnlyNumber = tlOnlyNumber;
    }
    public String getTlCreateFirstCode() {
        return this.tlCreateFirstCode;
    }
    
    public void setTlCreateFirstCode(String tlCreateFirstCode) {
        this.tlCreateFirstCode = tlCreateFirstCode;
    }
    public String getTlCreatePlaceAdd1E() {
        return this.tlCreatePlaceAdd1E;
    }
    
    public void setTlCreatePlaceAdd1E(String tlCreatePlaceAdd1E) {
        this.tlCreatePlaceAdd1E = tlCreatePlaceAdd1E;
    }
    public String getTlCreatePlaceAdd2E() {
        return this.tlCreatePlaceAdd2E;
    }
    
    public void setTlCreatePlaceAdd2E(String tlCreatePlaceAdd2E) {
        this.tlCreatePlaceAdd2E = tlCreatePlaceAdd2E;
    }
    public String getTlCreatePlaceAdd3E() {
        return this.tlCreatePlaceAdd3E;
    }
    
    public void setTlCreatePlaceAdd3E(String tlCreatePlaceAdd3E) {
        this.tlCreatePlaceAdd3E = tlCreatePlaceAdd3E;
    }
    public String getTlCreatePlaceAdd1S() {
        return this.tlCreatePlaceAdd1S;
    }
    
    public void setTlCreatePlaceAdd1S(String tlCreatePlaceAdd1S) {
        this.tlCreatePlaceAdd1S = tlCreatePlaceAdd1S;
    }
    public String getTlCreatePlaceAdd2S() {
        return this.tlCreatePlaceAdd2S;
    }
    
    public void setTlCreatePlaceAdd2S(String tlCreatePlaceAdd2S) {
        this.tlCreatePlaceAdd2S = tlCreatePlaceAdd2S;
    }
    public String getTlCreatePlaceAdd3S() {
        return this.tlCreatePlaceAdd3S;
    }
    
    public void setTlCreatePlaceAdd3S(String tlCreatePlaceAdd3S) {
        this.tlCreatePlaceAdd3S = tlCreatePlaceAdd3S;
    }
    public Integer getTlCreateIdStatus() {
        return this.tlCreateIdStatus;
    }
    
    public void setTlCreateIdStatus(Integer tlCreateIdStatus) {
        this.tlCreateIdStatus = tlCreateIdStatus;
    }
    public Date getTlCreateDate() {
        return this.tlCreateDate;
    }
    
    public void setTlCreateDate(Date tlCreateDate) {
        this.tlCreateDate = tlCreateDate;
    }
    public Date getTlCreateTime() {
        return this.tlCreateTime;
    }
    
    public void setTlCreateTime(Date tlCreateTime) {
        this.tlCreateTime = tlCreateTime;
    }
    public Integer getTlCreateUser() {
        return this.tlCreateUser;
    }
    
    public void setTlCreateUser(Integer tlCreateUser) {
        this.tlCreateUser = tlCreateUser;
    }
    public Set<TlApp> getTlApps() {
        return this.tlApps;
    }
    
    public void setTlApps(Set<TlApp> tlApps) {
        this.tlApps = tlApps;
    }




}


