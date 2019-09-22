package edu.school.sms.student.api;

import edu.school.sms.student.domain.Student;
import edu.school.sms.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "/students", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Student> findAll() {
        return studentService.findAll();
    }
}
