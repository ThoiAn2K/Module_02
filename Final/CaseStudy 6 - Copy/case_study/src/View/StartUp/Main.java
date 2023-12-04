package View.StartUp;

import Controller.RegistrationHomePageController;


public class Main {
    public static void main(String[] args) {
        RegistrationHomePageController run = RegistrationHomePageController.startUp();
        run.firstLoad();
//        ControllerRegistrationHomePage test = new ControllerRegistrationHomePage();
//        test.firstLoad();
    }
}