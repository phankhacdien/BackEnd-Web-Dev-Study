package DependencyInjectionExample.Before.HighLevelClass;

import DependencyInjectionExample.Before.LowLevelClass.MySQLConnection;

public class PasswordReminder {
    private MySQLConnection dbConnection;

    public PasswordReminder(MySQLConnection dbConnection) {
        this.dbConnection = dbConnection;
    }
}
