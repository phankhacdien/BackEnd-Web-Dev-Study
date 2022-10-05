package com.shareprogramingPracticeJavaOOP.Exercise13.Service;

import com.shareprogramingPracticeJavaOOP.Exercise13.Entities.ExperienceEmployee;
import com.shareprogramingPracticeJavaOOP.Exercise13.Repositories.ExperienceEmployeeRepo;
import com.shareprogramingPracticeJavaOOP.Exercise13.Service.Interfaces.iExperienceService;
import com.shareprogramingPracticeJavaOOP.Exercise13.Utils.Response.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements iExperienceService {
    private final ExperienceEmployeeRepo experienceEmployeeRepo;

    @Autowired
    public ExperienceService(ExperienceEmployeeRepo experienceEmployeeRepo) {
        this.experienceEmployeeRepo = experienceEmployeeRepo;
    }

    @Override
    public ResponseEntity<ResponseObject> insertNewEmployee(ExperienceEmployee newEmployee) {
        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject("Ok", "Insert Experience employee successfully", this.experienceEmployeeRepo.save(newEmployee))
        );
    }

    @Override
    public ResponseEntity<ResponseObject> updateExistedEmployee(ExperienceEmployee updateEmployee) {
        if(this.experienceEmployeeRepo.findById(updateEmployee.getEmployeeID()).orElse(null) == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ResponseObject("Ok",
                                        "Cannot found employee with ID: " + updateEmployee.getEmployeeID() + " to update new employee will be created!",
                                        updateEmployee)
            );
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseObject("Ok", "Update employee successfully", ExperienceEmployee updatedEmployee -> {

                    })
            );
        }
    }
}
