package Exercise14;

import Exercise14.Service.RecruitService;

import java.sql.Connection;
import static Exercise14.Service.JDBCConnection.getJDBCConnection;

public class Main {
    public static void main(String[] args) {
        RecruitService app = new RecruitService();
        app.run();
    }
}
