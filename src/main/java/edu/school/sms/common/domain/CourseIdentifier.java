package edu.school.sms.common.domain;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class CourseIdentifier {

    private Long courseId;

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CourseIdentifier)) {
            return false;
        }
        CourseIdentifier that = (CourseIdentifier) o;
        return courseId.equals(that.courseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId);
    }
}
