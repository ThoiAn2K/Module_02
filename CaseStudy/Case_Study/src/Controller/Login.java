package Controller;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Login {
    public static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Saler");

        System.out.println("2.Client");
        String choice = scanner.nextLine();


        switch (choice) {
            case "1":
                LoginOfSaler.loginOfSaler();
                break;
            case "2":
                LoginOfClient.loginOfClient();
                break;

        }

    }
}
