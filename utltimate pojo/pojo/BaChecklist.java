package pojo;
// Generated Oct 3, 2019 9:56:57 AM by Hibernate Tools 4.3.1



/**
 * BaChecklist generated by hbm2java
 */
public class BaChecklist  implements java.io.Serializable {


     private Integer baChecklistId;
     private Integer baAppId;
     private Integer baQuestionId;
     private Integer baCusYesnoStatus;
     private Integer baDrafnabYesnoStatus;
     private Integer baActiveStatus;

    public BaChecklist() {
    }

    public BaChecklist(Integer baAppId, Integer baQuestionId, Integer baCusYesnoStatus, Integer baDrafnabYesnoStatus, Integer baActiveStatus) {
       this.baAppId = baAppId;
       this.baQuestionId = baQuestionId;
       this.baCusYesnoStatus = baCusYesnoStatus;
       this.baDrafnabYesnoStatus = baDrafnabYesnoStatus;
       this.baActiveStatus = baActiveStatus;
    }
   
    public Integer getBaChecklistId() {
        return this.baChecklistId;
    }
    
    public void setBaChecklistId(Integer baChecklistId) {
        this.baChecklistId = baChecklistId;
    }
    public Integer getBaAppId() {
        return this.baAppId;
    }
    
    public void setBaAppId(Integer baAppId) {
        this.baAppId = baAppId;
    }
    public Integer getBaQuestionId() {
        return this.baQuestionId;
    }
    
    public void setBaQuestionId(Integer baQuestionId) {
        this.baQuestionId = baQuestionId;
    }
    public Integer getBaCusYesnoStatus() {
        return this.baCusYesnoStatus;
    }
    
    public void setBaCusYesnoStatus(Integer baCusYesnoStatus) {
        this.baCusYesnoStatus = baCusYesnoStatus;
    }
    public Integer getBaDrafnabYesnoStatus() {
        return this.baDrafnabYesnoStatus;
    }
    
    public void setBaDrafnabYesnoStatus(Integer baDrafnabYesnoStatus) {
        this.baDrafnabYesnoStatus = baDrafnabYesnoStatus;
    }
    public Integer getBaActiveStatus() {
        return this.baActiveStatus;
    }
    
    public void setBaActiveStatus(Integer baActiveStatus) {
        this.baActiveStatus = baActiveStatus;
    }




}

