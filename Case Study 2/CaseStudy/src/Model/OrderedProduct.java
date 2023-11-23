package Model;

public class OrderedProduct {
    private Product product;
    private CustomerOrder order;
    private int quantity;
    public OrderedProduct(){}

    public OrderedProduct(int quantity){
        this.quantity= quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public CustomerOrder getCustomerOrder() {
        return order;
    }

    public void setCustomerOder(CustomerOrder order) {
        this.order = order;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "oder= " + getCustomerOrder().getId() +" product Id= "+getProduct().getId() ;
    }
}
