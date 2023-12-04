package View;

import Controller.ControllerCheckDataClients;
import Controller.ControllerCheckDataSellers;
import Controller.ControllerLoginOfSellers;
import Services.CheckingDataSellers;
import Services.Write;
import Utils.WriterDataAccountSellers;

import java.util.Scanner;

public class RegisterOfSellers {
    private String accountOfSellers;
    private String passwordOfSellers;
    public void displayRegisterOfSeller(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("********** Register Seller ***********");
        System.out.println("1.Enter Account");
        accountOfSellers = scanner.nextLine();
        System.out.println("2.Enter Password");
        passwordOfSellers = scanner.nextLine();

        ControllerCheckDataSellers.controllerCheckDataSellers(accountOfSellers);


    }
}
