package Model;

public class Order {
    private int id;
    private String date;
    private int customerId;
    private double totalMoney;

    public Order() {
    }

    public Order(int id, String date, int customerId, double totalMoney) {
        this.id = id;
        this.date = date;
        this.customerId = customerId;
        this.totalMoney = totalMoney;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }
}
