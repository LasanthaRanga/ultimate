package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * InvoicesJanuaryId generated by hbm2java
 */
public class InvoicesJanuaryId  implements java.io.Serializable {


     private String invoiceId;
     private Date invoiceDate;

    public InvoicesJanuaryId() {
    }

    public InvoicesJanuaryId(String invoiceId, Date invoiceDate) {
       this.invoiceId = invoiceId;
       this.invoiceDate = invoiceDate;
    }
   
    public String getInvoiceId() {
        return this.invoiceId;
    }
    
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }
    public Date getInvoiceDate() {
        return this.invoiceDate;
    }
    
    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof InvoicesJanuaryId) ) return false;
		 InvoicesJanuaryId castOther = ( InvoicesJanuaryId ) other; 
         
		 return ( (this.getInvoiceId()==castOther.getInvoiceId()) || ( this.getInvoiceId()!=null && castOther.getInvoiceId()!=null && this.getInvoiceId().equals(castOther.getInvoiceId()) ) )
 && ( (this.getInvoiceDate()==castOther.getInvoiceDate()) || ( this.getInvoiceDate()!=null && castOther.getInvoiceDate()!=null && this.getInvoiceDate().equals(castOther.getInvoiceDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getInvoiceId() == null ? 0 : this.getInvoiceId().hashCode() );
         result = 37 * result + ( getInvoiceDate() == null ? 0 : this.getInvoiceDate().hashCode() );
         return result;
   }   


}


