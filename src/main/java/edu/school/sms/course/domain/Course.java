package edu.school.sms.course.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import edu.school.sms.teacher.domain.Teacher;

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
    private LocalDate startDate;
    private LocalDate endDate;
    @OneToMany(mappedBy = "course")
    @JsonManagedReference
    private List<PeriodSeries> periodSeries;
    @ManyToOne
    @JsonManagedReference
    private Teacher teacher;

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

    public List<PeriodSeries> getPeriodSeries() {
        return periodSeries;
    }

    public void setPeriodSeries(List<PeriodSeries> periodSeries) {
        this.periodSeries = periodSeries;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
