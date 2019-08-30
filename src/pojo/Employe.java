package pojo;
// Generated Aug 6, 2019 9:53:07 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Employe generated by hbm2java
 */
public class Employe  implements java.io.Serializable {


     private Integer idEmploye;
     private Grade grade;
     private Set<EmployeHasApplicationCatagory> employeHasApplicationCatagories = new HashSet<EmployeHasApplicationCatagory>(0);
     private Set<GaliHasEmploye> galiHasEmployes = new HashSet<GaliHasEmploye>(0);

    public Employe() {
    }

	
    public Employe(Grade grade) {
        this.grade = grade;
    }
    public Employe(Grade grade, Set<EmployeHasApplicationCatagory> employeHasApplicationCatagories, Set<GaliHasEmploye> galiHasEmployes) {
       this.grade = grade;
       this.employeHasApplicationCatagories = employeHasApplicationCatagories;
       this.galiHasEmployes = galiHasEmployes;
    }
   
    public Integer getIdEmploye() {
        return this.idEmploye;
    }
    
    public void setIdEmploye(Integer idEmploye) {
        this.idEmploye = idEmploye;
    }
    public Grade getGrade() {
        return this.grade;
    }
    
    public void setGrade(Grade grade) {
        this.grade = grade;
    }
    public Set<EmployeHasApplicationCatagory> getEmployeHasApplicationCatagories() {
        return this.employeHasApplicationCatagories;
    }
    
    public void setEmployeHasApplicationCatagories(Set<EmployeHasApplicationCatagory> employeHasApplicationCatagories) {
        this.employeHasApplicationCatagories = employeHasApplicationCatagories;
    }
    public Set<GaliHasEmploye> getGaliHasEmployes() {
        return this.galiHasEmployes;
    }
    
    public void setGaliHasEmployes(Set<GaliHasEmploye> galiHasEmployes) {
        this.galiHasEmployes = galiHasEmployes;
    }




}


