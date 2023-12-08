package View.Home;

import Model.Implement.HomePage;

public class LoginOrRegisterOfClientsView implements HomePage {
    private static LoginOrRegisterOfClientsView instance;

    public static LoginOrRegisterOfClientsView getInstance() {
        if (instance == null) {
            instance = new LoginOrRegisterOfClientsView();
        }
        return instance;
    }

    @Override
    public void load() {
        displayLoginOrRegisterOfClients();
    }

    public void displayLoginOrRegisterOfClients() {
        System.out.println("==============================");
        System.out.println("********** Client ***********");
        System.out.println("1.Login");
        System.out.println("2.Register");
        System.out.println("3.Return to previous step");
        System.out.println("==============================");
        System.out.println("Please enter the number corresponding to the content you need");
    }
}
