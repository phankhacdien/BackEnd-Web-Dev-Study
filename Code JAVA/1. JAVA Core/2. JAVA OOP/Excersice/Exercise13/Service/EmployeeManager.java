package Exercise13.Service;

import Exercise13.Entity.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class EmployeeManager {
    List<Employee> employeeList;

    public EmployeeManager() {
        this.employeeList = new ArrayList<Employee>();
    }

    public void insert(Employee new_employee) {
        this.employeeList.add(new_employee);
    }

    public void revise(String revise_id) {
        Employee revise_employee = this.employeeList.stream()
                .filter(employee -> employee.getId().equals(revise_id))
                .findFirst().orElse(null);
        if (revise_employee == null) {
            System.out.println("There is none Employee had this ID");
        } else {
            String employeeType = revise_employee.getClass().getSimpleName();
            this.employeeList.stream()
                    .filter(employee -> employee.getId().equals(revise_id))
                    .forEach(employee -> employee.revise());

//            if (employeeType == "ExpEmployee"){
//                System.out.println("Enter 6: Revise Experience year");
//                System.out.println("Enter 7: Revise Skill");
//            }else if(employeeType == "FresherEmployee"){
//                System.out.println("Enter 6: ReviseGraduation Date");
//                System.out.println("Enter 7: ReviseGraduation Rank");
//            }else{
//                System.out.println("Enter 6: ReviseGraduation Major");
//                System.out.println("Enter 7: ReviseGraduation Semester");
//                System.out.println("Enter 8: ReviseGraduation University");
//            }
        }
    }

    public void remove(String remove_id) {
        Employee remove = this.employeeList.stream()
                .filter(employee -> employee.getId().equals(remove_id))
                .findFirst().orElse(null);
        this.employeeList.remove(remove);
    }

}
