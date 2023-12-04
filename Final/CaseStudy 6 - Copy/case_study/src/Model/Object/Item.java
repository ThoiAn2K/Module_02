package Model.Object;

public class Item extends ListSeller {

    private ListSeller shopNameOfSeller;
    private String nameOfProduct;
    private double price;
    private String description;
    private int quantity;

//    public Item(String shopName) {
//        super(shopName);
//    }

    public Item(String nameOfProduct, double price, String description, int quantity) {
        getShopName();
        this.nameOfProduct = nameOfProduct;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

//    public Item(ListSeller shopName, String nameOfProduct, double price, String description, int quantity) {
//        this.shopName = shopName.getShopName();
//        this.nameOfProduct = nameOfProduct;
//        this.price = price;
//        this.description = description;
//        this.quantity = quantity;
//    }

    public String getShopName() {
        return super.getShopName();
    }

//    public void setShopName(String shopName) {
//        this.shopName = shopName;
//    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "shopName='" + getShopName() + '\'' +
                ", nameOfProduct='" + getNameOfProduct() + '\'' +
                ", price=" + getPrice() +
                ", description='" + getDescription() + '\'' +
                ", quantity=" + getQuantity() +
                '}';
    }
}
