package Model.Entity;

public class Cart {
    private static String owner;
    private String shop;
    private String product;
    private double price;
    private int quantity;

    private double total;

    public Cart() {
    }

    public Cart(String shop, String product, double price, int quantity, double total) {
        this.shop = shop;
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.total = total;
    }

    public Cart(String shop, String product, int quantity) {
        this.shop = shop;
        this.product = product;
        this.quantity = quantity;
    }

    public static String getOwner() {
        return owner;
    }

    public static void setOwner(String owner) {
        Cart.owner = owner;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return
                "The store you chose to purchase the product from : " + shop +
                        " , Product = " + product +
                        " , Price = " + price +
                        " , Quantity = " + quantity +
                        " , Total = " + total;

    }
}
