package Controller;

import Services.CheckRegisterClient;
import Services.ServicesRegex;

import java.util.Scanner;

public class RegisterOfClient extends ServicesRegex {
    static String registerOfClientAccount;
    static String registerOfClientPassword;

   public static void registerOfClient(){
       System.out.println("-------------------------------------------------");

       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter Account");
       registerOfClientAccount = scanner.nextLine();

       System.out.println("Enter Password");
       registerOfClientPassword = scanner.nextLine();

      CheckRegisterClient.checkDataRegisterClient(registerOfClientAccount,registerOfClientPassword);




   }

}
