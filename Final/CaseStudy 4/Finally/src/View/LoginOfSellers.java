package View;

import Services.CheckingDataSellers;

import java.util.Scanner;

public class LoginOfSellers {
    private String accountOfSeller;
    private String passwordOfSeller;
    public void loginOfSellers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********Seller***********");
        System.out.println("Enter Account");
        accountOfSeller = scanner.nextLine();

        System.out.println("Enter Password");
        passwordOfSeller = scanner.nextLine();


    }
}
