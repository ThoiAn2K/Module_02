package View.Home;

import Controller.Home;

public class HomePage implements Controller.HomePage {

    private static HomePage instance;



    public static HomePage getInstance() {
        if (instance == null) {
            instance = new HomePage();
        }
        return instance;
    }

    @Override
    public void load() {
        homePage();
    }
    public void homePage(){
        System.out.println();
        System.out.println("Welcome to My e-commerce");
        System.out.println("1.Seller");
        System.out.println("2.Client");
        System.out.println("3.Exit");

    }
}
