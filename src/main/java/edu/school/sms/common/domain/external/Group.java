package edu.school.sms.common.domain.external;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.ElementCollection;
import javax.persistence.OneToMany;
import java.util.List;

public class Group {

    private Long uidPk;
    private String admin;
    private List<String> moderator;
    private List<Member> members;
    private List<Post> posts;
    private List<Question> questions;
    private List<Poll> polls;
    private List<Event> events;
}
