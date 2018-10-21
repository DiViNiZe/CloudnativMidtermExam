package sit.ecr.courseservice.student;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "students")
public class Student implements Serializable{

    private static final long serialVersionUID = 1L;

  @Id
    private Long studentid;

    @NotBlank
    private String name;
    
    @NotBlank
    private String surname;
    
    @NotBlank
    private String department;
    
    @NotBlank
    private String facuty;

    @NotBlank
    private int year;

  /**
   * @return the studentid
   */
  public Long getStudentid() {
    return studentid;
  }

  /**
   * @return the year
   */
  public int getYear() {
    return year;
  }

  /**
   * @param year the year to set
   */
  public void setYear(int year) {
    this.year = year;
  }

  /**
   * @return the facuty
   */
  public String getFacuty() {
    return facuty;
  }

  /**
   * @param facuty the facuty to set
   */
  public void setFacuty(String facuty) {
    this.facuty = facuty;
  }

  /**
   * @return the department
   */
  public String getDepartment() {
    return department;
  }

  /**
   * @param department the department to set
   */
  public void setDepartment(String department) {
    this.department = department;
  }

  /**
   * @return the surname
   */
  public String getSurname() {
    return surname;
  }

  /**
   * @param surname the surname to set
   */
  public void setSurname(String surname) {
    this.surname = surname;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @param studentid the studentid to set
   */
  public void setStudentid(Long studentid) {
    this.studentid = studentid;
  }

    
}