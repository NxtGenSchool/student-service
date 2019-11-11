package edu.school.sms.teacher.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.school.sms.common.domain.CourseIdentifier;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "UID_PK")
    @JsonIgnore
    private Long uidPk;
    private String firstName;
    private String middleName;
    private String lastName;
    private String teacherId;
    private String emailAddress;
    private String phoneNumber;
    private String officeLocation;
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<CourseIdentifier> courseIdentifiers;

    public Long getUidPk() {
        return uidPk;
    }

    public void setUidPk(Long uidPk) {
        this.uidPk = uidPk;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public Set<CourseIdentifier> getCourseIdentifiers() {
        return courseIdentifiers;
    }

    public void setCourseIdentifiers(Set<CourseIdentifier> courseIdentifiers) {
        this.courseIdentifiers = courseIdentifiers;
    }
}
