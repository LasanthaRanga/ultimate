package pojo;
// Generated Aug 6, 2019 9:53:07 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * SlArrearsPanelName generated by hbm2java
 */
public class SlArrearsPanelName  implements java.io.Serializable {


     private int slArrearsPanelNameId;
     private SlArrearsType slArrearsType;
     private String slArrearsPanelName;
     private Set<SlLoadArrearsPanels> slLoadArrearsPanelses = new HashSet<SlLoadArrearsPanels>(0);

    public SlArrearsPanelName() {
    }

	
    public SlArrearsPanelName(int slArrearsPanelNameId) {
        this.slArrearsPanelNameId = slArrearsPanelNameId;
    }
    public SlArrearsPanelName(int slArrearsPanelNameId, SlArrearsType slArrearsType, String slArrearsPanelName, Set<SlLoadArrearsPanels> slLoadArrearsPanelses) {
       this.slArrearsPanelNameId = slArrearsPanelNameId;
       this.slArrearsType = slArrearsType;
       this.slArrearsPanelName = slArrearsPanelName;
       this.slLoadArrearsPanelses = slLoadArrearsPanelses;
    }
   
    public int getSlArrearsPanelNameId() {
        return this.slArrearsPanelNameId;
    }
    
    public void setSlArrearsPanelNameId(int slArrearsPanelNameId) {
        this.slArrearsPanelNameId = slArrearsPanelNameId;
    }
    public SlArrearsType getSlArrearsType() {
        return this.slArrearsType;
    }
    
    public void setSlArrearsType(SlArrearsType slArrearsType) {
        this.slArrearsType = slArrearsType;
    }
    public String getSlArrearsPanelName() {
        return this.slArrearsPanelName;
    }
    
    public void setSlArrearsPanelName(String slArrearsPanelName) {
        this.slArrearsPanelName = slArrearsPanelName;
    }
    public Set<SlLoadArrearsPanels> getSlLoadArrearsPanelses() {
        return this.slLoadArrearsPanelses;
    }
    
    public void setSlLoadArrearsPanelses(Set<SlLoadArrearsPanels> slLoadArrearsPanelses) {
        this.slLoadArrearsPanelses = slLoadArrearsPanelses;
    }




}


