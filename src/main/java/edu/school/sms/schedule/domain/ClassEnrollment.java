package edu.school.sms.schedule.domain;

import javax.persistence.*;

@Entity
@Table(name = "CLASS_ENROLLMENT")
public class ClassEnrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long uidPk;
    @Column(name = "STUDENT_UID_PK")
    private Long studentUidPk;
    @Column(name="COURSE_UID_PK")
    private Long courseUidPk;

    public Long getUidPk() {
        return uidPk;
    }

    public void setUidPk(Long uidPk) {
        this.uidPk = uidPk;
    }

    public Long getStudentUidPk() {
        return studentUidPk;
    }

    public void setStudentUidPk(Long studentUidPk) {
        this.studentUidPk = studentUidPk;
    }

    public Long getCourseUidPk() {
        return courseUidPk;
    }

    public void setCourseUidPk(Long courseUidPk) {
        this.courseUidPk = courseUidPk;
    }
}
