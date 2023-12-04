package Model.Entity;


public class Product {

    private static String shopName  ;
    private String nameOfProduct;
    private String Description;
    private double price;

    public Product() {
    }

//    public Product(String shopName) {
//        this.shopName = shopName;
//    }

//    public Product(String shopName, String nameOfProduct, String description, double price) {
//        this.shopName = shopName;
//        this.nameOfProduct = nameOfProduct;
//        Description = description;
//        this.price = price;
//    }

    public Product(String nameOfProduct, String description, double price) {
        this.nameOfProduct = nameOfProduct;
        Description = description;
        this.price = price;
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

    @Override
    public String toString() {
        return "Product: " +
                "Shop =  "+ shopName +
                ",   Product Name = " + nameOfProduct +
                ",   Description = " + Description +
                ",   price = " + String.valueOf(price) ;
    }
}
