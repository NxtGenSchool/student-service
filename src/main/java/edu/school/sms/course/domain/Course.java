package edu.school.sms.course.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "UID_PK")
    @JsonIgnore
    private Long uidPk;
    @OneToOne
    private Subject subject;
    private long classId;
    private String roomNumber;
    @OneToMany(mappedBy = "course")
    @JsonManagedReference
    private List<CourseTime> courseTimes;
    private Duration duration;
    private LocalDate startDate;
    private LocalDate endDate;

    public Long getUidPk() {
        return uidPk;
    }

    public void setUidPk(Long uidPk) {
        this.uidPk = uidPk;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public long getClassId() {
        return classId;
    }

    public void setClassId(long classId) {
        this.classId = classId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public List<CourseTime> getCourseTimes() {
        return courseTimes;
    }

    public void setCourseTimes(List<CourseTime> courseTimes) {
        this.courseTimes = courseTimes;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
