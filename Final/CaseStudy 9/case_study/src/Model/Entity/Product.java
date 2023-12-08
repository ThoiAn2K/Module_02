package Model.Entity;


public class Product {

    private static String shopName  ;
    private String nameOfProduct;
    private String Description;
    private double price;
    private int quantity;

    public Product() {
    }

//    public Product(String shopName) {
//        this.shopName = shopName;
//    }

    public Product(String shopName, String nameOfProduct, String description, double price , int quantity) {
        this.shopName = shopName;
        this.nameOfProduct = nameOfProduct;
        Description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String nameOfProduct, String description, double price) {
        this.nameOfProduct = nameOfProduct;
        Description = description;
        this.price = price;
    }

    public Product(String nameOfProduct, String description, double price, int quantity) {
        this.nameOfProduct = nameOfProduct;
        Description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        Product.shopName = shopName;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product: " +
                "Shop =  "+ shopName +
                ",   Product Name = " + nameOfProduct +
                ",   Description = " + Description +
                ",   Price = " + String.valueOf(price) +
                ",   Quantity = " + String.valueOf(quantity);

    }
}
