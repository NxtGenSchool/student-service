package edu.school.sms.course.api;

import edu.school.sms.course.domain.Course;
import edu.school.sms.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    private CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping(path = "/courses", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Course> findAll() {
        return courseService.findAll();
    }

    @GetMapping(path = "/courses/{courseCode}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Course findByCourseCode(@PathVariable String courseCode) {
        return courseService.findByCourseCode(courseCode);
    }
}
