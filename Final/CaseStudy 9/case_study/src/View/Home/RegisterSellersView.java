package View.Home;

import Model.Implement.Register;

public class RegisterSellersView implements Register {
    private static RegisterSellersView instance;

    public static RegisterSellersView getInstance() {
        if (instance == null) {
            instance = new RegisterSellersView();
        }
        return instance;
    }

    @Override
    public void enterAccount() {
        enterAccountMethod();
    }

    @Override
    public void enterPassword() {
        enterPasswordMethod();
    }

    @Override
    public void enterPasswordAgain() {
        enterPasswordAgainMethod();
    }

    @Override
    public void enterName() {
        enterNameMethod();
    }

    public void enterAccountMethod() {
        System.out.println("Input your Account: (The input field must have at least 7 characters and must not contain special characters)");
    }

    public void enterPasswordMethod() {
        System.out.println("Input your Password: (Password must have at least 1 number and 1 special character and must be at least 7 characters long)" );
    }

    public void enterPasswordAgainMethod() {
        System.out.println("Please re-enter the password again to confirm ");
    }

    public void enterNameMethod() {
        System.out.println("Please enter your store name (and your name will be unique in the system)");

    }
}
