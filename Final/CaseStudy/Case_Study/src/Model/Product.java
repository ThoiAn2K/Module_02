package Model;

public class Product {
    private String nameOfProduct;
    private String Description;
    private int quantity;

    public Product(){};

    public Product(String nameOfProduct, String description, int quantity) {
        this.nameOfProduct = nameOfProduct;
        Description = description;
        this.quantity = quantity;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
