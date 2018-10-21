package sit.ecr.studentservice.student;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentAdapter {
    public Student saveStudent(Student student) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8081/courseservice/student";
        ResponseEntity<Student> returnedStudent = restTemplate.postForEntity(url, student, Student.class);
        return returnedStudent.getBody();
    }

}