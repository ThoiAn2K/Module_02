package Model.Entity;

public class Wallet {
    private String name = null;
    private double money = 0.0;

    public Wallet() {
    }

    public Wallet(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Wallet : " +
                "Owner = " + name  +
                ", Money = " + money ;
    }
}
