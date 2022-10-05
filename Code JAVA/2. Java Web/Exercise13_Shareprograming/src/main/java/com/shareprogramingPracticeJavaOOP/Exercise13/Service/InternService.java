package com.shareprogramingPracticeJavaOOP.Exercise13.Service;

import com.shareprogramingPracticeJavaOOP.Exercise13.Entities.ExperienceEmployee;
import com.shareprogramingPracticeJavaOOP.Exercise13.Entities.InternEmployee;
import com.shareprogramingPracticeJavaOOP.Exercise13.Repositories.InternEmployeeRepo;
import com.shareprogramingPracticeJavaOOP.Exercise13.Service.Interfaces.iInternService;
import com.shareprogramingPracticeJavaOOP.Exercise13.Utils.Response.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class InternService implements iInternService {

    private final InternEmployeeRepo internEmployeeRepo;

    @Autowired
    public InternService(InternEmployeeRepo internEmployeeRepo) {
        this.internEmployeeRepo = internEmployeeRepo;
    }

    @Override
    public ResponseEntity<ResponseObject> insertNewEmployee(InternEmployee newEmployee) {
        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject("Ok", "Insert Experience employee successfully", this.internEmployeeRepo.save(newEmployee))
        );
    }

    @Override
    public ResponseEntity<ResponseObject> updateExistedEmployee(InternEmployee updateEmployee) {


        return null;
    }
}
