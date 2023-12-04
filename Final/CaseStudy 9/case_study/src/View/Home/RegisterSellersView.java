package View.Home;

import Controller.Register;

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
        System.out.println("Input your Account");
    }

    public void enterPasswordMethod() {
        System.out.println("Input your Password");
    }

    public void enterPasswordAgainMethod() {
        System.out.println("Input your Password again");
    }

    public void enterNameMethod() {
        System.out.println("Input your Shop name");

    }
}
