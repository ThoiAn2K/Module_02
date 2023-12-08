package View.Home;

public class AddProductView implements Model.Implement.AddProductView {
    private static AddProductView instance;

    public static AddProductView getInstance() {
        if (instance == null) {
            instance = new AddProductView();
        }
        return instance;
    }

    @Override
    public void quantity() {
        quantityProduct();
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


    private void quantityProduct() {
        System.out.println("Enter quantity of product : (Quantities can only be entered as integers and cannot be entered as decimals or words)");
    }

    private void nameOfProducts() {
        System.out.println("Enter name of product");
    }

    private void descriptions() {
        System.out.println("Enter a description of your product");
    }

    private void prices() {
        System.out.println("Enter price of product : (The price must be entered as a number and cannot contain alphanumeric characters)");
    }


}
