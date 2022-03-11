package Exercise7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TeacherManager {
    private List<Teacher> teacherList;

    public TeacherManager() {
        this.teacherList = new ArrayList<Teacher>();
    }

    public void insert(Teacher new_teacher){
        this.teacherList.add(new_teacher);
    }

    public void delete(String del_ID){
        List del_teacher = this.teacherList.stream()
                .filter(teacher -> teacher.getTeacherID().equals(del_ID))
                .collect(Collectors.toList());
        this.teacherList.removeAll(del_teacher);
    }

    public void calculateSalary(String calculateID, int bonus, int penalty){
        Teacher payment_teacher = this.teacherList.stream()
                .filter(teacher -> teacher.getTeacherID().equals(calculateID))
                .findFirst().orElse(null);
        int gross_salary = payment_teacher.getBasic_salary() + bonus - penalty;
        System.out.println("Salary of "+calculateID+" is: "+gross_salary);
    }
}
