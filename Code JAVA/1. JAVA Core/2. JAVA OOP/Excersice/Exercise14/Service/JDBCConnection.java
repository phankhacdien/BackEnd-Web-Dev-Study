package Exercise14.Service;

import Exercise14.Entity.GoodStudent;
import Exercise14.Entity.NormalStudent;
import Exercise14.Entity.Student;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class JDBCConnection {
    public static Connection getJDBCConnection() {
        final String url = "jdbc:mysql://localhost:3306/Exercise14";
        final String user = "root";
        final String password = "11101998dien";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                return DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Student> getStudents(String stud_type) {
        Connection conn = getJDBCConnection();
        List<Student> res = new ArrayList<Student>();
        String sqlQuery = null;
        Statement stmt = null;
        ResultSet rs = null;

        if (stud_type.toUpperCase(Locale.ROOT).equals("GOOD")) {
            sqlQuery = "SELECT * FROM exercise14.goodStudents order by gpa, fullName desc;";
        } else if (stud_type.toUpperCase(Locale.ROOT).equals("NORMAL")) {
            sqlQuery = "select * from normalStudents";
        }

        if (conn != null) {
            try {
                stmt = conn.createStatement();
                rs = stmt.executeQuery(sqlQuery);
                while (rs.next()) {
                    String db_name = rs.getString("fullName");
                    LocalDate db_doB = rs.getDate("dob").toLocalDate();
                    String db_sex = rs.getString("sex");
                    String db_phone = rs.getString("phoneNumber");
                    String db_university = rs.getString("universityName");
                    String db_gradeLevel = rs.getString("graduateLevel");
                    Student new_student = null;
                    if (stud_type.toUpperCase(Locale.ROOT).equals("GOOD")) {
                        float db_gpa = rs.getFloat("gpa");
                        String db_bestReward = rs.getString("bestRewardName");
                        new_student = new GoodStudent(db_name, db_doB, db_sex, db_phone, db_university, db_gradeLevel, db_gpa, db_bestReward);
                    } else if (stud_type.toUpperCase(Locale.ROOT).equals("NORMAL")) {
                        int db_englishScores = rs.getInt("englishScores");
                        float db_entryTestScores = rs.getFloat("entryTestScores");
                        new_student = new NormalStudent(db_name, db_doB, db_sex, db_phone, db_university, db_gradeLevel, db_englishScores, db_entryTestScores);
                    }
                    res.add(new_student);
                }
                return res;
            } catch (SQLException e) {
                e.printStackTrace();

                return null;
            } finally {
                try {
                    if (conn != null) {
                        conn.close();
                    }
                    if (stmt != null) {
                        stmt.close();
                    }
                    if (rs != null) {
                        rs.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
