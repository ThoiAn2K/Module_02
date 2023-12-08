package Controller.Clients;

import Model.Implement.HomePage;
import Model.Services.Buyer.BuyerRegistration;

public class HomePageRegisterOfClient implements HomePage {
    private static HomePageRegisterOfClient instance;

    public static HomePageRegisterOfClient getInstance() {
        if (instance == null) {
            instance = new HomePageRegisterOfClient();
        }
        return instance;
    }

    @Override
    public void load() {
        homePageRegisterOfSeller();
    }

    public void homePageRegisterOfSeller() {
        BuyerRegistration buyerRegistration = BuyerRegistration.getInstance();
        buyerRegistration.load();
    }
}
