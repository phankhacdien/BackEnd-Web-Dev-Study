package com.shareprogramingPracticeJavaOOP.Exercise13.Repositories;

import com.shareprogramingPracticeJavaOOP.Exercise13.Entities.ExperienceEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceEmployeeRepo extends JpaRepository<ExperienceEmployee, Long> {
}
