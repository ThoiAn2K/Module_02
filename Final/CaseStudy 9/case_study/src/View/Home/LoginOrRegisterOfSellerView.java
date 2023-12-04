package View.Home;

import Controller.HomePage;

public class LoginOrRegisterOfSellerView implements HomePage {

    private static LoginOrRegisterOfSellerView instance;

    public static LoginOrRegisterOfSellerView getInstance() {
        if (instance == null) {
            instance = new LoginOrRegisterOfSellerView();
        }
        return instance;
    }

    @Override
    public void load() {
        displayLoginOrRegisterOfSellers();
    }

    public static void displayLoginOrRegisterOfSellers() {
        System.out.println("********** Seller ***********");
        System.out.println("1.Login");
        System.out.println("2.Register");
        System.out.println("3.Return to previous step");
    }}
