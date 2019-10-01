package edu.school.sms.course.service;

import edu.school.sms.course.domain.Subject;
import edu.school.sms.course.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    private SubjectRepository subjectRepository;

    @Autowired
    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public List<Subject> findAll() {
        return subjectRepository.findAll();
    }

    public Subject findBySubjectCode(String subjectCode) {
        return subjectRepository.findByCode(subjectCode);
    }
}
