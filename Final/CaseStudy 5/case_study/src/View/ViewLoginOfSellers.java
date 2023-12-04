package View;

import Model.LoginInterface;

public class ViewLoginOfSellers implements LoginInterface {

    @Override
    public void header() {
        System.out.println("********** Login of Seller ***********");
    }

    @Override
    public void enterAccount() {
        System.out.println("Enter Account");
    }

    @Override
    public void enterPassword() {
        System.out.println("Enter Password");
    }
}
