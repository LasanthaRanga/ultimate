package pojo;
// Generated Apr 18, 2020 9:36:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * BookReson generated by hbm2java
 */
public class BookReson  implements java.io.Serializable {


     private Integer idbookReson;
     private BookPlace bookPlace;
     private String bookResonName;
     private Double bookResonDayprice;
     private Double bookResonHoureprice;
     private Integer bookResonIdVote;
     private Integer bookResonIdAccount;
     private Integer bookResonStatus;
     private Integer bookResonDipositVote;
     private Double bookResonDipositAmount;
     private Set<Book> books = new HashSet<Book>(0);

    public BookReson() {
    }

	
    public BookReson(BookPlace bookPlace) {
        this.bookPlace = bookPlace;
    }
    public BookReson(BookPlace bookPlace, String bookResonName, Double bookResonDayprice, Double bookResonHoureprice, Integer bookResonIdVote, Integer bookResonIdAccount, Integer bookResonStatus, Integer bookResonDipositVote, Double bookResonDipositAmount, Set<Book> books) {
       this.bookPlace = bookPlace;
       this.bookResonName = bookResonName;
       this.bookResonDayprice = bookResonDayprice;
       this.bookResonHoureprice = bookResonHoureprice;
       this.bookResonIdVote = bookResonIdVote;
       this.bookResonIdAccount = bookResonIdAccount;
       this.bookResonStatus = bookResonStatus;
       this.bookResonDipositVote = bookResonDipositVote;
       this.bookResonDipositAmount = bookResonDipositAmount;
       this.books = books;
    }
   
    public Integer getIdbookReson() {
        return this.idbookReson;
    }
    
    public void setIdbookReson(Integer idbookReson) {
        this.idbookReson = idbookReson;
    }
    public BookPlace getBookPlace() {
        return this.bookPlace;
    }
    
    public void setBookPlace(BookPlace bookPlace) {
        this.bookPlace = bookPlace;
    }
    public String getBookResonName() {
        return this.bookResonName;
    }
    
    public void setBookResonName(String bookResonName) {
        this.bookResonName = bookResonName;
    }
    public Double getBookResonDayprice() {
        return this.bookResonDayprice;
    }
    
    public void setBookResonDayprice(Double bookResonDayprice) {
        this.bookResonDayprice = bookResonDayprice;
    }
    public Double getBookResonHoureprice() {
        return this.bookResonHoureprice;
    }
    
    public void setBookResonHoureprice(Double bookResonHoureprice) {
        this.bookResonHoureprice = bookResonHoureprice;
    }
    public Integer getBookResonIdVote() {
        return this.bookResonIdVote;
    }
    
    public void setBookResonIdVote(Integer bookResonIdVote) {
        this.bookResonIdVote = bookResonIdVote;
    }
    public Integer getBookResonIdAccount() {
        return this.bookResonIdAccount;
    }
    
    public void setBookResonIdAccount(Integer bookResonIdAccount) {
        this.bookResonIdAccount = bookResonIdAccount;
    }
    public Integer getBookResonStatus() {
        return this.bookResonStatus;
    }
    
    public void setBookResonStatus(Integer bookResonStatus) {
        this.bookResonStatus = bookResonStatus;
    }
    public Integer getBookResonDipositVote() {
        return this.bookResonDipositVote;
    }
    
    public void setBookResonDipositVote(Integer bookResonDipositVote) {
        this.bookResonDipositVote = bookResonDipositVote;
    }
    public Double getBookResonDipositAmount() {
        return this.bookResonDipositAmount;
    }
    
    public void setBookResonDipositAmount(Double bookResonDipositAmount) {
        this.bookResonDipositAmount = bookResonDipositAmount;
    }
    public Set<Book> getBooks() {
        return this.books;
    }
    
    public void setBooks(Set<Book> books) {
        this.books = books;
    }




}


