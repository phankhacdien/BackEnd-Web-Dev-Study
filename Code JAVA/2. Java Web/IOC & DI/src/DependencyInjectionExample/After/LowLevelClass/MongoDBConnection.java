package DependencyInjectionExample.After.LowLevelClass;

import DependencyInjectionExample.After.Interface.DBConnectionInterface;

public class MongoDBConnection implements DBConnectionInterface {
    @Override
    public String connect() {
        return "Mongo Database Connection";
    }
}
