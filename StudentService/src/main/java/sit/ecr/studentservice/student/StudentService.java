package sit.ecr.studentservice.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo ;

    @Autowired
    private StudentAdapter studentAdapter;

    public Student findById(long id) {
        Student student = studentRepo.getOne(id);
        return student;
    }

    public Student saveStudent(Student student) {
        Student theNewStudent = studentRepo.save(student);
        studentAdapter.saveStudent(student);
        return theNewStudent;
    }

}