package Model;

public class Seller {
    private String accountOfSaler;
    private String passwordOfSaler;

    public Seller() {
    }

    public Seller(String accountOfSaler, String passwordOfSaler) {
        this.accountOfSaler = accountOfSaler;
        this.passwordOfSaler = passwordOfSaler;
    }

    public String getAccountOfSaler() {
        return accountOfSaler;
    }

    public void setAccountOfSaler(String accountOfSaler) {
        this.accountOfSaler = accountOfSaler;
    }

    public String getPasswordOfSaler() {
        return passwordOfSaler;
    }

    public void setPasswordOfSaler(String passwordOfSaler) {
        this.passwordOfSaler = passwordOfSaler;
    }
}
