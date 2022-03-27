package DependencyInjectionExample.After.LowLevelClass;

import DependencyInjectionExample.After.Interface.DBConnectionInterface;

public class MySQLConnection implements DBConnectionInterface {
    @Override
    public String connect() {
        return "MySQL Database connection";
    }
}