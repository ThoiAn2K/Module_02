package Model;

public class Saler {
    private String loginOfSalerAccount;
    private String loginOfSalerPassword;

    public Saler() {
    }

    public Saler(String loginOfSalerAccount, String loginOfSalerPassword) {
        this.loginOfSalerAccount = loginOfSalerAccount;
        this.loginOfSalerPassword = loginOfSalerPassword;
    }

    public String getLoginOfSalerAccount() {
        return loginOfSalerAccount;
    }

    public void setLoginOfSalerAccount(String loginOfSalerAccount) {
        this.loginOfSalerAccount = loginOfSalerAccount;
    }

    public String getLoginOfSalerPassword() {
        return loginOfSalerPassword;
    }

    public void setLoginOfSalerPassword(String loginOfSalerPassword) {
        this.loginOfSalerPassword = loginOfSalerPassword;
    }
}
