package com.shareprogramingPracticeJavaOOP.Exercise13.Service;

import com.shareprogramingPracticeJavaOOP.Exercise13.Entities.ExperienceEmployee;
import com.shareprogramingPracticeJavaOOP.Exercise13.Entities.FresherEmployee;
import com.shareprogramingPracticeJavaOOP.Exercise13.Repositories.FresherEmployeeRepo;
import com.shareprogramingPracticeJavaOOP.Exercise13.Service.Interfaces.iFresherService;
import com.shareprogramingPracticeJavaOOP.Exercise13.Utils.Response.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class FresherService implements iFresherService {

    private final FresherEmployeeRepo fresherEmployeeRepo;

    @Autowired
    public FresherService(FresherEmployeeRepo fresherEmployeeRepo) {
        this.fresherEmployeeRepo = fresherEmployeeRepo;
    }

    @Override
    public ResponseEntity<ResponseObject> insertNewEmployee(FresherEmployee newEmployee) {
        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject("Ok", "Insert Experience employee successfully", this.fresherEmployeeRepo.save(newEmployee))
        );
    }

    @Override
    public ResponseEntity<ResponseObject> updateExistedEmployee(FresherEmployee updateEmployee) {


        return null;
    }
}
