package edu.school.sms.course.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uidPk;
    private String title;
    private String author;
    private String isbnNumber;
    @ManyToOne
    private Course course;

    public long getUidPk() {
        return uidPk;
    }

    public void setUidPk(long uidPk) {
        this.uidPk = uidPk;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public Course getCourses() {
        return course;
    }

    public void setCourses(Course course) {
        this.course = course;
    }
}
