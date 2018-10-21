package sit.ecr.courseservice.student;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import sit.ecr.courseservice.course.Course;


@Entity
@Table(name = "students")
public class Student implements Serializable{

    private static final long serialVersionUID = 1L;

  @Id
    private Long studentId;

    @NotBlank
    private String name;
    
    @NotBlank
    private String surname;
    
    @NotBlank
    private String department;
    
    @NotBlank
    private String facuty;

    private int year;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "courses_courses_registed_student ",
            joinColumns = { @JoinColumn(name = "students_student_id") },
            inverseJoinColumns = { @JoinColumn(name = "courses_courses_registed_student") })
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Course> course;

    public Student(){

    }

  /**
   * @return the course
   */
  public List<Course> getCourse() {
    return course;
  }

  /**
   * @param course the course to set
   */
  public void setCourse(List<Course> course) {
    this.course = course;
  }

  @JsonCreator
  public Student(
    @JsonProperty("studentid")long id,
    @JsonProperty("name")String name,
    @JsonProperty("surname")String surname,
    @JsonProperty("department")String department,
    @JsonProperty("facuty")String facuty,
    @JsonProperty("year")int year
  ){
    this.studentId = id;
    this.name = name;
    this.surname = surname;
    this.department = department;
    this.facuty = facuty;
    this.year = year;
  }

  /**
   * @return the studentId
   */
  public Long getStudentId() {
    return studentId;
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
  public void setStudentId(Long studentId) {
    this.studentId = studentId;
  }

    
}