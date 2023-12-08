package View.Home;

import Model.Implement.Login;

public class LoginView implements Login {
    private static LoginView instance;

    public static LoginView getInstance() {
        if (instance == null) {
            instance = new LoginView();
        }
        return instance;
    }

    @Override
    public void enterAccount() {
    enterYourAccount();
    }

    @Override
    public void enterPassWord() {
       enterYourPassword();
    }

    public void enterYourAccount(){
        System.out.println("Input your Account");
    }
    public void enterYourPassword(){
        System.out.println("Input your Password");
    }
}
