package com.shareprogramingPracticeJavaOOP.Exercise13.Service.Interfaces;

import com.shareprogramingPracticeJavaOOP.Exercise13.Entities.FresherEmployee;
import com.shareprogramingPracticeJavaOOP.Exercise13.Entities.InternEmployee;
import com.shareprogramingPracticeJavaOOP.Exercise13.Utils.Response.ResponseObject;
import org.springframework.http.ResponseEntity;

public interface iInternService {
    public ResponseEntity<ResponseObject> insertNewEmployee(InternEmployee newEmployee);
    public ResponseEntity<ResponseObject> updateExistedEmployee(InternEmployee updateEmployee);
}
