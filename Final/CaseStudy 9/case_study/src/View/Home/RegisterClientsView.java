package View.Home;

import Model.Implement.Register;

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
        System.out.println("Input your Account: (The input field must have at least 7 characters and must not contain special characters)");
    }

    @Override
    public void enterPassword() {
        System.out.println("Input your Password: (Password must have at least 1 number and 1 special character and must be at least 7 characters long)");
    }

    @Override
    public void enterPasswordAgain() {
        System.out.println("Please re-enter the password again to confirm ");
    }

    @Override
    public void enterName() {
        System.out.println("Please enter your name (and your name will be unique in the system)");

    }
}
