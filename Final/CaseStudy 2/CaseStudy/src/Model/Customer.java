package Model;

import java.util.Date;
import java.util.List;


public class Customer extends User {

    private List<CustomerOrder> orders;


    public Customer() {
        super();
    }

    public Customer(int id) {
        super(id);
    }

    public Customer(int id, String name, String login, String password) {
        super(id, name, login, password);
    }

    public List<CustomerOrder> getOrder() {
        return orders;
    }

    public void setOrders(List<CustomerOrder> orders) {
        this.orders = orders;

    }

    public int hashCode() {
        return getId();
    }

    public boolean equals(Object object) {
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        return ((this.getId() != 0) && (this.getId() == other.getId())) ? true : false;
    }

    @Override
    public String toString() {
        return "Customer" + super.toString();
    }
}
