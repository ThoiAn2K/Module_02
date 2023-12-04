package Model;

import java.util.List;

public class Product {
    private int id;
    private String name;
    private String description = "";
    private String quantity;
    private int price =0;


    transient private PetCategory petCategory;
    transient private ProductCategory productCategory;
    transient private Storage storage;
    transient private List<OrderedProduct> productOrders;







    public Product() {
    }

    public Product(int id) {
        this.id = id;
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product(int id, String name, String quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public Product(int id, String name, String description, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public PetCategory getPetCategory() {
        return petCategory;
    }

    public void setPetCategory(PetCategory petCategory) {
        this.petCategory = petCategory;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public List<OrderedProduct> getProductOrders() {
        return productOrders;
    }

    public void setProductOrders(List<OrderedProduct> productOrders) {
        this.productOrders = productOrders;
    }
    @Override
    public String toString(){
        return String.format("Product: id=%s, name=%s, price=%d ,description=%s,", id,name,price,description);
    }
}
