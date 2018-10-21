package sit.ecr.courseservice.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sit.ecr.courseservice.student.*;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepo ;

    public Course getCourseById(int id) {
      Course course = courseRepo.getOne(id);
        return course;
    }
    
    public List<Course> getAllCourses() {
      List<Course> course = courseRepo.findAll();
        return course;
    }

    public boolean saveStudentToCourse(int courseId,Student student){
      Course targetCourse = getCourseById(courseId);
      targetCourse.getRegisted().add(student);
      courseRepo.save(targetCourse);
      return false;
    }

    public List<Student> getStudentInCourse(int courseId){
      Course targetCourse = getCourseById(courseId);
      List<Student> registedStudents =  targetCourse.getRegisted();
      return registedStudents;
    }

}