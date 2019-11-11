package edu.school.sms.common.client;

import edu.school.sms.common.domain.CourseIdentifier;
import edu.school.sms.common.domain.external.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class CourseClient {

    public List<Course> getCourses(Set<CourseIdentifier> courseIdentifiers) {
        return new ArrayList<>();
    }
}
