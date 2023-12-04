package View;

import Model.Client;

import java.util.List;
import java.util.Scanner;

public class LoginOfClients extends Client {
public static String accountOfClient;
public static String passwordOfClient;
    public void displayLoginOfClients() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********Client***********");
        System.out.println("Enter Account");
        accountOfClient = scanner.nextLine();

        System.out.println("Enter Password");
        passwordOfClient = scanner.nextLine();



    }
}
