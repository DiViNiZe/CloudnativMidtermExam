package sit.ecr.courseservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sit.ecr.courseservice.course.*;
import sit.ecr.courseservice.student.*;


@RestController
class CourseServiceController {

  @Autowired
  private StudentService studentService;
  
  @Autowired
  private CourseService courseService;

  @GetMapping("/courseservice/courses")
  public ResponseEntity<List<Course>> getAllCourses(){
    List<Course> courses = courseService.getAllCourses();
    return new ResponseEntity<>(courses,HttpStatus.OK);
  }
  
  @GetMapping("/courseservice/courses/{id}")
  public ResponseEntity<Course> getCoursesById(@PathVariable("id") int targetCourseId){
    Course course = courseService.getCourseById(targetCourseId);
    return new ResponseEntity<>(course,HttpStatus.OK);
  }
  
  @PostMapping("/courseservice/courses/{courseId}")
  public ResponseEntity<Boolean> saveStudentToCourse(@PathVariable("courseId") int targetCourseId,@RequestBody Student student){
    Boolean isSuccess = false;
    isSuccess = courseService.saveStudentToCourse(targetCourseId, student);
    return new ResponseEntity<>(isSuccess,HttpStatus.OK);
  }
  
  @PostMapping("/courseservice/student")
  public ResponseEntity<Student> saveStudentFromStudentService(@RequestBody Student student){
    Student newStudent = studentService.saveStudent(student);
    return new ResponseEntity<>(newStudent,HttpStatus.OK);
  }

  @GetMapping("/courseservice/student/{id}")
  public ResponseEntity<Student> getStudentById(@PathVariable("id") long id){
    Student student = studentService.findById(id);
    return new ResponseEntity<Student>(student,HttpStatus.OK);
  }

  

  @GetMapping("/courseservice/courses/registed/{id}")
  public ResponseEntity<List<Student>> getRegistedCourse(@PathVariable("id") int courseId){
    List<Student> studentsInCouse = courseService.getStudentInCourse(courseId);
    return new ResponseEntity<>(studentsInCouse,HttpStatus.OK);
  }

}