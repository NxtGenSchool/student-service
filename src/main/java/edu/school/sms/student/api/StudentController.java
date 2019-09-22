package edu.school.sms.student.api;

import edu.school.sms.schedule.domain.SchoolClass;
import edu.school.sms.student.domain.Student;
import edu.school.sms.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping(path = "/students/{studentId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Student findByStudentId(@PathVariable String studentId) {
        return studentService.findByStudentId(studentId);
    }

    @GetMapping(path = "/students/{studentId}/classes", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<SchoolClass> findEnrolledClassesByStudentId(@PathVariable String studentId) {
        return studentService.findByStudentId(studentId).getSchoolClasses();
    }
}
