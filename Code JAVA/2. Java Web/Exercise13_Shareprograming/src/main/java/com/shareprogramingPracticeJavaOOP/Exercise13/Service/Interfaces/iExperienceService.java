package com.shareprogramingPracticeJavaOOP.Exercise13.Service.Interfaces;

import com.shareprogramingPracticeJavaOOP.Exercise13.Entities.ExperienceEmployee;
import com.shareprogramingPracticeJavaOOP.Exercise13.Entities.FresherEmployee;
import com.shareprogramingPracticeJavaOOP.Exercise13.Entities.InternEmployee;
import com.shareprogramingPracticeJavaOOP.Exercise13.Utils.Response.ResponseObject;
import org.springframework.http.ResponseEntity;

public interface iExperienceService {
    public ResponseEntity<ResponseObject> insertNewEmployee(ExperienceEmployee newEmployee);
    public ResponseEntity<ResponseObject> updateExistedEmployee(ExperienceEmployee updateEmployee);
}
