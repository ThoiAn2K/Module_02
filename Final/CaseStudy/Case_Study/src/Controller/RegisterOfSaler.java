package Controller;

import Services.CheckRegisterSaler;
import Services.ServicesRegex;

import java.util.Scanner;

public class RegisterOfSaler extends ServicesRegex {

    public static void registerOfSaler(){
        System.out.println("-------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Account");
        String registerOfSalerAccount = scanner.nextLine();

        System.out.println("Enter Password");
        String registerOfSalerPassword = scanner.nextLine();

        CheckRegisterSaler.checkDataRegisterSaler(registerOfSalerAccount,registerOfSalerPassword);

        System.out.println("Enter Shop name");
        String registerOfSalerShopName = scanner.nextLine();


    }
}
