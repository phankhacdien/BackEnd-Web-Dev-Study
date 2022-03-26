package DependencyInjectionExample.After.HighLevelClass;

import DependencyInjectionExample.After.Interface.DBConnectionInterface;
import DependencyInjectionExample.After.Interface.GetConnectInjection;

public class PasswordReminder implements GetConnectInjection {
    private DBConnectionInterface dbConnection;

    public PasswordReminder(DBConnectionInterface dbConnection) {
        this.dbConnection = dbConnection;
    }

    public PasswordReminder() {
    }

    @Override
    public void getConnect (DBConnectionInterface dbConnection) {
        dbConnection.connect();
    }

    public void setDbConnection(DBConnectionInterface dbConnection) {
        this.dbConnection = dbConnection;
    }
}
