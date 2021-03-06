package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * WbMConnectionTypeDetail generated by hbm2java
 */
public class WbMConnectionTypeDetail  implements java.io.Serializable {


     private Integer wbMConTypeId;
     private String wbMConType;
     private Set<WbMConnection> wbMConnections = new HashSet<WbMConnection>(0);

    public WbMConnectionTypeDetail() {
    }

    public WbMConnectionTypeDetail(String wbMConType, Set<WbMConnection> wbMConnections) {
       this.wbMConType = wbMConType;
       this.wbMConnections = wbMConnections;
    }
   
    public Integer getWbMConTypeId() {
        return this.wbMConTypeId;
    }
    
    public void setWbMConTypeId(Integer wbMConTypeId) {
        this.wbMConTypeId = wbMConTypeId;
    }
    public String getWbMConType() {
        return this.wbMConType;
    }
    
    public void setWbMConType(String wbMConType) {
        this.wbMConType = wbMConType;
    }
    public Set<WbMConnection> getWbMConnections() {
        return this.wbMConnections;
    }
    
    public void setWbMConnections(Set<WbMConnection> wbMConnections) {
        this.wbMConnections = wbMConnections;
    }




}


