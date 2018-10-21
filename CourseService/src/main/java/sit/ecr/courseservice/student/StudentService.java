package sit.ecr.courseservice.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo ;

    public Student findById(long id) {
        Student student = studentRepo.getOne(id);
        return student;
    }

    public Student saveStudent(Student student){
        studentRepo.save(student);
        return student;
    }

}