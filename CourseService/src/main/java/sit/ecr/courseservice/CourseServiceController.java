package sit.ecr.courseservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
class CourseServiceController {

  @GetMapping("/courseservice/courses")
  public ResponseEntity<String> getAllCourses(){
    return new ResponseEntity<>(null,HttpStatus.OK);
  }
  
  @GetMapping("/courseservice/courses/{id}")
  public ResponseEntity<String> getCoursesById(){
    return new ResponseEntity<>(null,HttpStatus.OK);
  }
  
  @PostMapping("/courseservice/courses/{studentId}")
  public ResponseEntity<String> saveStudentToCourse(){
    return new ResponseEntity<>(null,HttpStatus.OK);
  }

  @GetMapping("/courseservice/courses/registed/{id}")
  public ResponseEntity<String> getRegistedCourse(){
    return new ResponseEntity<>(null,HttpStatus.OK);
  }

}