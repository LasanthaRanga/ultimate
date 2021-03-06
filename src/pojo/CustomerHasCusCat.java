package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1



/**
 * CustomerHasCusCat generated by hbm2java
 */
public class CustomerHasCusCat  implements java.io.Serializable {


     private Integer idCustomerHasCusCat;
     private CusCat cusCat;
     private Customer customer;
     private Integer syn;

    public CustomerHasCusCat() {
    }

	
    public CustomerHasCusCat(CusCat cusCat, Customer customer) {
        this.cusCat = cusCat;
        this.customer = customer;
    }
    public CustomerHasCusCat(CusCat cusCat, Customer customer, Integer syn) {
       this.cusCat = cusCat;
       this.customer = customer;
       this.syn = syn;
    }
   
    public Integer getIdCustomerHasCusCat() {
        return this.idCustomerHasCusCat;
    }
    
    public void setIdCustomerHasCusCat(Integer idCustomerHasCusCat) {
        this.idCustomerHasCusCat = idCustomerHasCusCat;
    }
    public CusCat getCusCat() {
        return this.cusCat;
    }
    
    public void setCusCat(CusCat cusCat) {
        this.cusCat = cusCat;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Integer getSyn() {
        return this.syn;
    }
    
    public void setSyn(Integer syn) {
        this.syn = syn;
    }




}


