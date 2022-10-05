package com.shareprogramingPracticeJavaOOP.Exercise13.Repositories;

import com.shareprogramingPracticeJavaOOP.Exercise13.Entities.InternEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternEmployeeRepo extends JpaRepository<InternEmployee, Long> {
}
