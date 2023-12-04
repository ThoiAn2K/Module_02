package View;

import Model.RegisterInterface;

public class ViewRegisterOfClients implements RegisterInterface {
    @Override
    public void header() {
        System.out.println("********** Client ***********");
    }

    @Override
    public void enterAccount() {
        System.out.println("Enter Account");

    }

    @Override
    public void enterPassword() {
        System.out.println("Enter Password");
    }

    public void nameOfShop() {
        System.out.println("Enter Shop name");
    }

    public void phoneNumber() {
        System.out.println("Enter your phone number ");
    }
}
