package View.Home;

import Model.Implement.HomePage;

public class HomePageOfClient implements HomePage {
    private static HomePageOfClient instance;

    public static HomePageOfClient getInstance() {
        if (instance == null) {
            instance = new HomePageOfClient();
        }
        return instance;
    }

    @Override
    public void load() {
        homePageOfClient();
    }

    public void homePageOfClient() {
        System.out.println("==============================");
        System.out.println("1.See all product lists");
        System.out.println("2.View the product list of the store you want");
        System.out.println("3.See your shopping cart");
        System.out.println("4.Buy product");
        System.out.println("5.Change the number of products in the shopping cart");
        System.out.println("6.Delete product");
        System.out.println("7.Payment");
        System.out.println("8.History");
        System.out.println("9.Log out");
        System.out.println("==============================");
        System.out.println("Please enter the number corresponding to the content you need");
    }
}
