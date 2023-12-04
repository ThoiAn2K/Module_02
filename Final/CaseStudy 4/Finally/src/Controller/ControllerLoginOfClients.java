package Controller;

import StartUp.Main;
import View.LoginOfClients;
import View.LoginOrRegisterOfClients;
import View.RegisterOfClients;
import View.RegistrationHomePage;

import java.util.Scanner;

public class ControllerLoginOfClients {
    public void controllerLoginOfClients(){
        Scanner scanner = new Scanner(System.in);
        LoginOrRegisterOfClients.displayLoginOrRegisterOfClients();
        String choice =scanner.nextLine();
        switch (choice){
            case "1":
                LoginOfClients loginOfClientsObject = new LoginOfClients();
                loginOfClientsObject.displayLoginOfClients();
            break;
            case "2":
                RegisterOfClients registerOfClientsObject = new RegisterOfClients();
                registerOfClientsObject.displayRegisterOfClients();
                break;
            case "3":
                Main.main(null);

                break;
        }
    }

}
