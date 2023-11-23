import java.sql.SQLOutput;

public class MySQLStorage implements UserStorage{
    @Override
    public void store(User user) {
        System.out.println("Save info of SQL");
    }
}
