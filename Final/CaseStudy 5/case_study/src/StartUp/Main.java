package StartUp;

import Controller.ControllerRegistrationHomePage;


public class Main {
    public static void main(String[] args) {
        ControllerRegistrationHomePage run = ControllerRegistrationHomePage.startUp();
        run.firstLoad();
//        ControllerRegistrationHomePage test = new ControllerRegistrationHomePage();
//        test.firstLoad();
    }
}