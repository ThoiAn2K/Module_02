package View.Home;

import Controller.HomePage;

public class RepairProductView implements HomePage {
    private static RepairProductView instance;

    public static RepairProductView getInstance() {
        if (instance == null) {
            instance = new RepairProductView();
        }
        return instance;
    }

    @Override
    public void load() {
        repairProduct();
    }

    private void repairProduct() {
        System.out.println("1.Edit Product");
        System.out.println("2.Edit Description");
        System.out.println("3.Edit Price");
        System.out.println("4.Return");
    }
}
