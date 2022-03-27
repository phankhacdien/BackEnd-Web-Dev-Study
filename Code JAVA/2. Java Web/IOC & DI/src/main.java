import DependencyInjectionExample.After.HighLevelClass.PasswordReminder;
import DependencyInjectionExample.After.Interface.DBConnectionInterface;
import DependencyInjectionExample.After.Interface.GetConnectInjection;
import DependencyInjectionExample.After.LowLevelClass.MongoDBConnection;
import DependencyInjectionExample.After.LowLevelClass.MySQLConnection;

public class main {
    public static void main(String[] args) {
        DBConnectionInterface sqlConnection = new MySQLConnection();
        DBConnectionInterface mongoConnection = new MongoDBConnection();



        GetConnectInjection reminder = new PasswordReminder();


        reminder.getConnect(sqlConnection);
    }
}
