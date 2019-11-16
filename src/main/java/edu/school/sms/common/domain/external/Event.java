package edu.school.sms.common.domain.external;

import java.time.LocalDate;

public class Event {

    private Long uidPk;
    private Group group;
    private Author author;
    private String title;
    private String Description;
    private String Location;
    private LocalDate Time;
    private LocalDate createdDate;
}
