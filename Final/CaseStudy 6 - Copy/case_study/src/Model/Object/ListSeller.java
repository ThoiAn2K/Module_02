package Model.Object;

public class ListSeller {

private String shopName;

    public ListSeller() {
    }

    public ListSeller(Register shopName) {
        this.shopName = shopName.getShopName();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }


    @Override
    public String toString() {
        return getShopName();
    }

    public static void main(String[] args) {
        Register register = new Register("1","sdf","adf","asfd");
        ListSeller listSeller = new ListSeller(register);
        System.out.println(listSeller.getShopName());
    }
}

