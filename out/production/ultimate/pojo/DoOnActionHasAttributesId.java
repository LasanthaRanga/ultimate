package pojo;
// Generated Dec 19, 2019 12:34:46 PM by Hibernate Tools 4.3.1



/**
 * DoOnActionHasAttributesId generated by hbm2java
 */
public class DoOnActionHasAttributesId  implements java.io.Serializable {


     private int id;
     private int doOnActionIddoOnAction;
     private int attributesIdattributes;

    public DoOnActionHasAttributesId() {
    }

    public DoOnActionHasAttributesId(int id, int doOnActionIddoOnAction, int attributesIdattributes) {
       this.id = id;
       this.doOnActionIddoOnAction = doOnActionIddoOnAction;
       this.attributesIdattributes = attributesIdattributes;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getDoOnActionIddoOnAction() {
        return this.doOnActionIddoOnAction;
    }
    
    public void setDoOnActionIddoOnAction(int doOnActionIddoOnAction) {
        this.doOnActionIddoOnAction = doOnActionIddoOnAction;
    }
    public int getAttributesIdattributes() {
        return this.attributesIdattributes;
    }
    
    public void setAttributesIdattributes(int attributesIdattributes) {
        this.attributesIdattributes = attributesIdattributes;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DoOnActionHasAttributesId) ) return false;
		 DoOnActionHasAttributesId castOther = ( DoOnActionHasAttributesId ) other; 
         
		 return (this.getId()==castOther.getId())
 && (this.getDoOnActionIddoOnAction()==castOther.getDoOnActionIddoOnAction())
 && (this.getAttributesIdattributes()==castOther.getAttributesIdattributes());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getId();
         result = 37 * result + this.getDoOnActionIddoOnAction();
         result = 37 * result + this.getAttributesIdattributes();
         return result;
   }   


}

