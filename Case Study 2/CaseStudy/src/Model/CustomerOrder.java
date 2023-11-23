package Model;

import java.util.Date;
import java.util.List;

public class CustomerOrder {
    private int id;
    private Date dataOfCreation;
    private String status;
    private Customer customer;
    private List<OrderedProduct> productsInOrder;

    public CustomerOrder(){

    }
    public CustomerOrder(int id, Date dataOfCreation, String status){
        this.id =id;
        this.dataOfCreation = dataOfCreation;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataOfCreation() {
        return dataOfCreation;
    }

    public void setDataOfCreation(Date dataOfCreation) {
        this.dataOfCreation = dataOfCreation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderedProduct> getProductsInOrder() {
        return productsInOrder;
    }

    public void setProductsInOrder(List<OrderedProduct> productsInOrder) {
        this.productsInOrder = productsInOrder;
    }
    public int hashCode(){
        return id;
    }
    public boolean equals(Object object){
        if(!(object instanceof CustomerOrder)){
          return false;
        }
        CustomerOrder order = (CustomerOrder) object;
        return ((this.id!=0)&&(this.id==order.id))?true:false;
    }
    public String toString(){
        return "Order: id= " + id + " status =" + status;
    }
}
