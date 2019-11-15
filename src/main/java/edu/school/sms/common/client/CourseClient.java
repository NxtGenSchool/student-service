package edu.school.sms.common.client;

import edu.school.sms.common.domain.CourseIdentifier;
import edu.school.sms.common.domain.external.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class CourseClient {

    private RestTemplate restTemplate;
    private String CourseUrl = "http://localhost:4060/courses";

    @Autowired
    public CourseClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Course> getCourses(List<CourseIdentifier> listOfCourseIds) {
        List<Course> listOfCourses = new ArrayList<>();
        for (CourseIdentifier id : listOfCourseIds) {
            Course course = restTemplate
                    .getForObject(CourseUrl + "/" + id.getCourseId(), Course.class);
            listOfCourses.add(course);
        }
        return listOfCourses;
    }

    public List<Course> getCourses(Set<CourseIdentifier> courseIdentifiers) {
        return new ArrayList<>();
    }
}
