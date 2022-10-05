package com.shareprogramingPracticeJavaOOP.Exercise13.Repositories;

import com.shareprogramingPracticeJavaOOP.Exercise13.Entities.FresherEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FresherEmployeeRepo extends JpaRepository<FresherEmployee, Long> {
}
