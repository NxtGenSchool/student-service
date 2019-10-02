package edu.school.sms.student.service;

import edu.school.sms.course.domain.Period;
import edu.school.sms.course.domain.PeriodSeries;
import edu.school.sms.student.domain.Student;
import edu.school.sms.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student findByStudentId(String studentId) {
        return studentRepository.findByStudentId(studentId);
    }

    public List<Period> findSchedule(String studentId) {
        return studentRepository.findByStudentId(studentId)
                .getCourses()
                .stream()
                .filter(course -> course.getEndDate().isAfter(LocalDate.now()))
                .filter(course -> course.getStartDate().isBefore(LocalDate.now()))
                .flatMap(course -> course.getPeriodSeries().stream())
                .flatMap(periodSeries -> createPeriods(periodSeries).stream())
                .sorted(this::comparingPeriods)
                .collect(Collectors.toList());
    }

    private List<Period> createPeriods(PeriodSeries periodSeries) {
        LocalDate today = LocalDate.now();
        LocalDate nextPeriodDate;
        List<Period> periods = new ArrayList<>();

        int  daysRemainingToNextPeriodThisWeek = periodSeries.getDayOfWeek().minus(today.getDayOfWeek().getValue()).getValue();
        // Has the period in this series happened this week?
        if (daysRemainingToNextPeriodThisWeek >= 0) {
            Period period = createPeriod(periodSeries);
            period.setDate(today.plusDays(daysRemainingToNextPeriodThisWeek));
            nextPeriodDate = period.getDate().plusDays(7);
            periods.add(period);
        } else {
            nextPeriodDate = today.plusDays(7 - daysRemainingToNextPeriodThisWeek);
        }

        while (nextPeriodDate.isBefore(periodSeries.getCourse().getEndDate())) {
            Period period = createPeriod(periodSeries);
            period.setDate(nextPeriodDate);
            nextPeriodDate = nextPeriodDate.plusDays(7);
            periods.add(period);
        }

        return periods;
    }

    private Period createPeriod(PeriodSeries periodSeries) {
        Period period = new Period();
        period.setLocation(periodSeries.getLocation());
        period.setStartTime(periodSeries.getStartTime());
        period.setEndTime(periodSeries.getEndTime());
        period.setSubjectCode(periodSeries.getCourse().getSubject().getCode());
        period.setSubjectName(periodSeries.getCourse().getSubject().getCode());
        return period;
    }

    private int comparingPeriods(Period one, Period two) {
        if (one.getDate().isBefore(two.getDate())) {
            return -1;
        } else if (one.getDate().isAfter(two.getDate())) {
            return 1;
        } else if (one.getStartTime().isBefore(two.getStartTime())) {
            return -1;
        } else if (one.getStartTime().isAfter(two.getStartTime())) {
            return 1;
        } else {
            return 0;
        }
    }
}
