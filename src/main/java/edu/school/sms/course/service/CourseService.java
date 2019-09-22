package edu.school.sms.course.service;

import edu.school.sms.course.domain.Course;
import edu.school.sms.course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    public Course findByCourseCode(String courseCode) {
        return courseRepository.findByCode(courseCode);
    }
}
