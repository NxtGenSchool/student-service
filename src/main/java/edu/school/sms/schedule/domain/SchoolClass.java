package edu.school.sms.schedule.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import edu.school.sms.course.domain.Course;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

@Entity
public class SchoolClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "UID_PK")
    @JsonIgnore
    private Long uidPk;
    @OneToOne
    private Course course;
    private long classId;
    private String roomNumber;
    @OneToMany(mappedBy = "schoolClass")
    @JsonManagedReference
    private List<SchoolClassTime> schoolClassTimes;
    private Duration duration;
    private LocalDate startDate;
    private LocalDate endDate;

    public Long getUidPk() {
        return uidPk;
    }

    public void setUidPk(Long uidPk) {
        this.uidPk = uidPk;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
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

    public List<SchoolClassTime> getSchoolClassTimes() {
        return schoolClassTimes;
    }

    public void setSchoolClassTimes(List<SchoolClassTime> schoolClassTimes) {
        this.schoolClassTimes = schoolClassTimes;
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