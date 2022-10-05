package com.shareprogramingPracticeJavaOOP.Exercise13.Controller;

import com.shareprogramingPracticeJavaOOP.Exercise13.Entities.Employee;
import com.shareprogramingPracticeJavaOOP.Exercise13.Entities.ExperienceEmployee;
import com.shareprogramingPracticeJavaOOP.Exercise13.Entities.FresherEmployee;
import com.shareprogramingPracticeJavaOOP.Exercise13.Entities.InternEmployee;
import com.shareprogramingPracticeJavaOOP.Exercise13.Service.Interfaces.iExperienceService;
import com.shareprogramingPracticeJavaOOP.Exercise13.Service.Interfaces.iFresherService;
import com.shareprogramingPracticeJavaOOP.Exercise13.Service.Interfaces.iInternService;
import com.shareprogramingPracticeJavaOOP.Exercise13.Utils.Response.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/Employee")
public class EmployeeController {

    private final iExperienceService experienceService;
    private final iFresherService fresherService;
    private final iInternService internService;

    @Autowired
    public EmployeeController(iExperienceService experienceService, iFresherService fresherService, iInternService internService) {
        this.experienceService = experienceService;
        this.fresherService = fresherService;
        this.internService = internService;
    }

    @PostMapping("/insert")
    public ResponseEntity<ResponseObject> insertNewEmployee(@RequestParam Employee newEmployee) {
        switch(newEmployee.getEmployeeType()) {
            case Experience: {
                return this.experienceService.insertNewEmployee((ExperienceEmployee) newEmployee);
            }
            case Fresher: {
                return this.fresherService.insertNewEmployee((FresherEmployee) newEmployee);
            }
            case Intern: {
                return this.internService.insertNewEmployee((InternEmployee) newEmployee);
            }
            default: {
                return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(
                        new ResponseObject("Failed", "Employee type is not match, please check", newEmployee)
                );
            }
        }
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseObject> updateExistedEmployee(@RequestParam Employee updateEmployee) {
        switch(updateEmployee.getEmployeeType()) {
            case Experience: {
                return this.experienceService.updateExistedEmployee((ExperienceEmployee) updateEmployee);
            }
            case Fresher: {
                return this.fresherService.updateExistedEmployee((FresherEmployee) updateEmployee);
            }
            case Intern: {
                return this.internService.updateExistedEmployee((InternEmployee) updateEmployee);
            }
            default: {
                return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(
                        new ResponseObject("Failed", "Employee type is not match, please check", updateEmployee)
                );
            }
        }

    }
}
