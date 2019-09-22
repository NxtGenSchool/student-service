package edu.school.sms.schedule.repository;

import edu.school.sms.schedule.domain.SchoolClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolClassRespository extends JpaRepository<SchoolClass, Long> {
}
