package Controller;

import Services.CheckLoginClient;

import java.util.Scanner;

public class LoginOfClient {

    public static String loginOfClientAccount;

    public static String loginOfClientPassword;
    public static void loginOfClient() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Account");
        loginOfClientAccount = scanner.nextLine();

        System.out.println("Enter Password");
        loginOfClientPassword = scanner.nextLine();

        CheckLoginClient.checkDataClient();

    }
}
