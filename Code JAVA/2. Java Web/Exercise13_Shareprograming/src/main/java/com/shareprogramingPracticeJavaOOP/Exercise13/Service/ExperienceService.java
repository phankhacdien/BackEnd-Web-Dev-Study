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
        ExperienceEmployee updatedEmployee = this.experienceEmployeeRepo.findById(updateEmployee.getEmployeeID())
                .map(employee -> {
                    employee.setEmployeeName(updateEmployee.getEmployeeName());
                    employee.setEmployeeBirthday(updateEmployee.getEmployeeBirthday());
                    employee.setEmployeePhone(updateEmployee.getEmployeePhone());
                    employee.setExperienceYear(updateEmployee.getExperienceYear());
                    employee.setProSkill(updateEmployee.getProSkill());
                    return this.experienceEmployeeRepo.save(employee);
                }).orElse(null);

        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject("Ok", "Update employee Successfully!", updateEmployee)
        );
    }
}
