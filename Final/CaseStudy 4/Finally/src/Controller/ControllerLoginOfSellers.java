package Controller;
import StartUp.Main;
import View.LoginOfSellers;
import View.LoginOrRegisterOfSellers;
import View.RegisterOfClients;
import View.RegisterOfSellers;

import java.util.Scanner;

public class ControllerLoginOfSellers {
    public void controllerLoginOfSellers(){
       Scanner scanner =new Scanner(System.in);
        LoginOrRegisterOfSellers.displayLoginOrRegisterOfSeller();
        String choice =scanner.nextLine();
        switch (choice){
            case "1":
                LoginOfSellers loginOfSellersObject = new LoginOfSellers();
                loginOfSellersObject.loginOfSellers();
                break;
            case "2":
                RegisterOfSellers registerOfSellersObject = new RegisterOfSellers();
                registerOfSellersObject.displayRegisterOfSeller();
                break;
            case "3":
                Main.main(null);
                break;
        }
    }

}
