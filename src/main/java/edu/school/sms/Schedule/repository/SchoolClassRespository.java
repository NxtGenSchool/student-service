package edu.school.sms.Schedule.repository;

import edu.school.sms.Schedule.domain.SchoolClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolClassRespository extends JpaRepository<SchoolClass, Long> {
}
