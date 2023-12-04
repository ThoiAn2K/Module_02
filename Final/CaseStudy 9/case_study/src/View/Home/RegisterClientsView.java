package View.Home;

import Controller.Register;

public class RegisterClientsView implements Register {

    private static RegisterClientsView instance;

    public static RegisterClientsView getInstance() {
        if (instance == null) {
            instance = new RegisterClientsView();
        }
        return instance;
    }

    @Override
    public void enterAccount() {
        System.out.println("Input your Account");
    }

    @Override
    public void enterPassword() {
        System.out.println("Input your Password");
    }

    @Override
    public void enterPasswordAgain() {
        System.out.println("Input your Password again");
    }

    @Override
    public void enterName() {
        System.out.println("Input your Name");

    }
}
