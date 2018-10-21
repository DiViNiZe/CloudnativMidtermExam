package sit.ecr.courseservice.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import sit.ecr.courseservice.student.*;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepo ;

    @Autowired StudentService studentService;

    public Course getCourseById(int id) {
      Course course = courseRepo.getOne(id);
        return course;
    }
    
    public List<Course> getAllCourses() {
      List<Course> course = courseRepo.findAll();
        return course;
    }

    public boolean saveStudentToCourse(int courseId,Student student){
      boolean isSuccess  = false;
      Course targetCourse = getCourseById(courseId);
      targetCourse.getRegisted().add(student);
      if(courseRepo.save(targetCourse) != null){
        isSuccess = true;
      }
      return isSuccess;
    }

    public List<Student> getStudentInCourse(int courseId){
      Course targetCourse = getCourseById(courseId);
      List<Student> registedStudents =  targetCourse.getRegisted();
      return registedStudents;
    }

}