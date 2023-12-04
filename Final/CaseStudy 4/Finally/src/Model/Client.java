package Model;

public class Client {
    private String accountOfClient;
    private String passwordOfClient;

    public Client() {
    }

    public Client(String accountOfClient, String passwordOfClient) {
        this.accountOfClient = accountOfClient;
        this.passwordOfClient = passwordOfClient;
    }

    public String getAccountOfClient() {
        return accountOfClient;
    }

    public void setAccountOfClient(String accountOfClient) {
        this.accountOfClient = accountOfClient;
    }

    public String getPasswordOfClient() {
        return passwordOfClient;
    }

    public void setPasswordOfClient(String passwordOfClient) {
        this.passwordOfClient = passwordOfClient;
    }
}
