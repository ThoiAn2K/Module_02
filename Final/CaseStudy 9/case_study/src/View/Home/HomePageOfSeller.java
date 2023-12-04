package View.Home;

import Controller.HomePage;

public class HomePageOfSeller implements HomePage {
    private static HomePageOfSeller instance;

    public static HomePageOfSeller getInstance() {
        if (instance == null) {
            instance = new HomePageOfSeller();
        }
        return instance;
    }

    @Override
    public void load() {
        homePageOfSeller();
    }
    public void homePageOfSeller(){
        System.out.println("1.See your product list");
        System.out.println("2.Add new products to your list");
        System.out.println("3.Repair info Product");
        System.out.println("4.Delete product");
        System.out.println("5.Return");
        System.out.println("6.log out");

    }
}
