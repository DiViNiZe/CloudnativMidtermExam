package sit.ecr.courseservice.course;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import sit.ecr.courseservice.student.*;


@Entity
@Table(name = "courses")
public class Course implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    private int id;

    @NotBlank
    private String courseId;

    @NotBlank
    private String courseName;

    @NotBlank
    private String leaturer;

    @NotBlank
    private int capacity;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "courses_courses_registed_student",
            joinColumns = { @JoinColumn(name = "courses_courses_registed_student") },
            inverseJoinColumns = { @JoinColumn(name = "students_student_id") })
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Student> registedStudent;

  /**
   * @return the id
   */
  public int getId() {
    return id;
  }

  /**
   * @return the registed
   */
  public List<Student> getRegisted() {
    return registedStudent;
  }

  /**
   * @param registed the registed to set
   */
  public void setRegisted(List<Student> registed) {
    this.registedStudent = registed;
  }

  /**
   * @return the capacity
   */
  public int getCapacity() {
    return capacity;
  }

  /**
   * @param capacity the capacity to set
   */
  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  /**
   * @return the leaturer
   */
  public String getLeaturer() {
    return leaturer;
  }

  /**
   * @param leaturer the leaturer to set
   */
  public void setLeaturer(String leaturer) {
    this.leaturer = leaturer;
  }

  /**
   * @return the courseName
   */
  public String getCourseName() {
    return courseName;
  }

  /**
   * @param courseName the courseName to set
   */
  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  /**
   * @return the courseId
   */
  public String getCourseId() {
    return courseId;
  }

  /**
   * @param courseId the courseId to set
   */
  public void setCourseId(String courseId) {
    this.courseId = courseId;
  }

  /**
   * @param id the id to set
   */
  public void setId(int id) {
    this.id = id;
  }
    
    
}