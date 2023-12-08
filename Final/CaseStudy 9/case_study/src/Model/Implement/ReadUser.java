package Model.Implement;

public interface ReadUser {
    void read(String [] data);
    boolean isRead(String data);
    boolean isReadData(String name);
    boolean isLogin(String account,String password);
}
