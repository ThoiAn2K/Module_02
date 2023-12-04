package Controller;

import Model.Saler;
import Services.CheckLoginSaler;

import java.util.Scanner;


public class LoginOfSaler extends Saler {
    public static String loginOfSalerAccount;
    public static String loginOfSalerPassword;
    public static void loginOfSaler() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Account");
         loginOfSalerAccount = scanner.nextLine();

        System.out.println("Enter Password");
         loginOfSalerPassword = scanner.nextLine();

        CheckLoginSaler.checkDataSaler();

    }
}
