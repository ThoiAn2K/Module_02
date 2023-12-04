package View.Home;

import Controller.HomePage;

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
        System.out.println("1.See all product lists");
        System.out.println("2.View the product list of the store you want");
        System.out.println("3.See your shopping cart");
        System.out.println("4.Log out");
    }
}
