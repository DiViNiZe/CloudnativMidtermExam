package sit.ecr.studentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sit.ecr.studentservice.student.*;

@RestController
class StudentServiceController {

  @Autowired
  private StudentService studentService;


  @GetMapping("/studentservice/student/{id}")
  public ResponseEntity<Student> getStudentById(@PathVariable("id") long id){
    Student student = studentService.findById(id);
    return new ResponseEntity<Student>(student,HttpStatus.OK);
  } 
  
}