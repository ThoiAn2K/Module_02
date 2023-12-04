package View;

import Model.LoginInterface;
import Model.RegisterInterface;

public class ViewRegisterOfSellers implements RegisterInterface {
    @Override
    public void header() {
        System.out.println("**********  Seller ***********");

    }

    @Override
    public void enterAccount() {
        System.out.println("1.Enter Account");
    }

    @Override
    public void enterPassword() {
        System.out.println("2.Enter Password");
    }

}
