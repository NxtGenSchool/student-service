package edu.school.sms.course.api;

import edu.school.sms.course.domain.Subject;
import edu.school.sms.course.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectController {

    private SubjectService subjectService;

    @Autowired
    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping(path = "/subjects", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Subject> findAll() {
        return subjectService.findAll();
    }

    @GetMapping(path = "/subjects/{subjectCode}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Subject findBySubjectCode(@PathVariable String subjectCode) {
        return subjectService.findBySubjectCode(subjectCode);
    }
}
