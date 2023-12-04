package View.Home;

public class AddProductView implements AddProduct {
    private static AddProductView instance;

    public static AddProductView getInstance() {
        if (instance == null) {
            instance = new AddProductView();
        }
        return instance;
    }

    @Override
    public void nameOfProduct() {
        nameOfProducts();
    }

    @Override
    public void description() {
        descriptions();
    }

    @Override
    public void price() {
        prices();
    }

    public void nameOfProducts() {
        System.out.println("Enter name of product");
    }

    public void descriptions() {
        System.out.println("Enter description of product");
    }

    public void prices() {
        System.out.println("Enter price of product");
    }

}
