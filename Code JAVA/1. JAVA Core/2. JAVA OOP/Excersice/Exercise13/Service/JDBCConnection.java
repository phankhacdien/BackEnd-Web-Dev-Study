package Exercise13.Service;

import Exercise13.Entity.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class JDBCConnection {
    public static Connection getJDBCConnection() {
        final String url = "jdbc:mysql://localhost:3306/Exercise13";
        final String user = "root";
        final String password = "11101998dien";

        try {
            Class.forName("com.mysql.jdbc.Driver");
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

    public static List<Employee> getEmployee(String type) {
        Connection conn = getJDBCConnection();
        List<Employee> employeeList = new ArrayList<>();
        String sqlQuery = null;
        Statement stmt = null;
        ResultSet rs = null;

        if (type.toUpperCase(Locale.ROOT).equals("EXPERIENCE")) {
            sqlQuery = "SELECT * FROM exercise13.expEmployee;";
        } else if (type.toUpperCase(Locale.ROOT).equals("FRESHER")) {
            sqlQuery = "SELECT * FROM exercise13.fresherEmployee;";
        } else if (type.toUpperCase(Locale.ROOT).equals("INTERN")) {
            sqlQuery = "SELECT * FROM exercise13.internEmployee;";
        }

        if (conn != null) {
            try {
                stmt = conn.createStatement();
                rs = stmt.executeQuery(sqlQuery);
                while (rs.next()) {
                    String db_empID = rs.getString("emp_id");
                    String db_empName = rs.getString("emp_fullName");
                    LocalDate db_empDoB = rs.getDate("emp_doB").toLocalDate();
                    int db_empPhone = Integer.valueOf(rs.getString("emp_phone"));
                    String db_empEmail = rs.getString("emp_email");
                    List<Certificate> certificateList = getCertificateByEmpName(db_empName);

                    if (type.toUpperCase(Locale.ROOT).equals("EXPERIENCE")) {
                        int db_empExpInYear = rs.getInt("emp_yearExp");
                        String db_empProSkill = rs.getString("emp_proSkill");
                        employeeList.add(new ExpEmployee(db_empID, db_empName, db_empDoB, db_empPhone, db_empEmail, certificateList, db_empExpInYear, db_empProSkill));
                    } else if (type.toUpperCase(Locale.ROOT).equals("FRESHER")) {
                        LocalDate graduationDate = rs.getDate("emp_graduationDate").toLocalDate();
                        String graduationRank = rs.getString("emp_graduationRank");
                        employeeList.add(new FresherEmployee(db_empID, db_empName, db_empDoB, db_empPhone, db_empEmail, certificateList, graduationDate, graduationRank));
                    } else if (type.toUpperCase(Locale.ROOT).equals("INTERN")) {
                        String major = rs.getString("emp_major");
                        int semester = rs.getInt("emp_semester");
                        String university = rs.getString("emp_university");
                        employeeList.add(new InternEmployee(db_empID, db_empName, db_empDoB, db_empPhone, db_empEmail, certificateList, major, semester, university));
                    }
                }
                return employeeList;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static List<Certificate> getCertificateByEmpName(String empName) {
        Connection conn = getJDBCConnection();
        List<Certificate> certificateList = new ArrayList<>();
        String sqlQuery = String.format("SELECT * FROM exercise13.certificate where emp_fullName = '%s';", empName);
        Statement stmt = null;
        ResultSet rs = null;

        if (conn != null) {
            try {
                stmt = conn.createStatement();
                rs = stmt.executeQuery(sqlQuery);
                while (rs.next()) {
                    String certificateID = rs.getString("certificate_id");
                    String certificateName = rs.getString("certificate_name");
                    int certificateRank = rs.getInt("certificate_rank");
                    LocalDate certificateDate = rs.getDate("certificate_date").toLocalDate();
                    certificateList.add(new Certificate(certificateName, certificateID, certificateRank, certificateDate));
                }
                return certificateList;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
