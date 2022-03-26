package Exercise13;

import Exercise13.Entity.Employee;
import Exercise13.Exception.BirthDayException;
import Exercise13.Service.EmployeeManager;
import Exercise13.Service.JDBCConnection;
import Exercise13.UI.UI;

import java.text.ParseException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws BirthDayException {
//        UI app = new UI();
//        app.run();
        EmployeeManager manager = new EmployeeManager();
        List<Employee> expEmployees = JDBCConnection.getEmployee("EXPERIENCE");
        List<Employee> fresherEmployees = JDBCConnection.getEmployee("FRESHER");
        List<Employee> internEmployees = JDBCConnection.getEmployee("INTERN");
        manager.insert(expEmployees);
        manager.insert(fresherEmployees);
        manager.insert(internEmployees);
        int a= 1;
    }
}
