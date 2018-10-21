package sit.ecr.studentservice.student;

import java.util.List;

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

}