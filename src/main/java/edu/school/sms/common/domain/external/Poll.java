package edu.school.sms.common.domain.external;

import java.time.LocalDate;
import java.util.List;

public class Poll {

    private Long uidPk;
    private Group group;
    private Author author;
    private String content;
    private LocalDate createdDate;
    private int likes;
    private List<Option> options;
}
