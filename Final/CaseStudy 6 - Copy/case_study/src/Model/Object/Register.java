package Model.Object;

public class Register {
    private String shopName;
    private String account;
    private String password;

    private String phone;

    public Register() {
    }

    public Register(String shopName, String account, String password,String phone) {
        this.shopName = shopName;
        this.account = account;
        this.password = password;
        this.phone = phone;
    }

    public Register(String shopName) {
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Register{" +
                "shopName='" + shopName + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
