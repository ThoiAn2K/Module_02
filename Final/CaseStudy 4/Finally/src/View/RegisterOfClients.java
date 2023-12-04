package View;

import Controller.ControllerCheckDataClients;
import Services.CheckingDataClients;
import Services.Write;

import java.util.Scanner;

public class RegisterOfClients {
    public static String accountOfClients;
    public static String passwordOfClients;
    public void displayRegisterOfClients(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********Register Client***********");
        System.out.println("1.Enter Account");
        accountOfClients = scanner.nextLine();

        System.out.println("2.Enter Password");
        passwordOfClients = scanner.nextLine();

        ControllerCheckDataClients.controllerCheckDataClient(accountOfClients);

    }
}
