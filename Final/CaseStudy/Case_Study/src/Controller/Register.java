package Controller;
import java.util.Scanner;

public class Register {

    public static void register(){
        System.out.println("-------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Client");

        System.out.println("2.Saler");

         String choice = scanner.next();


        switch (choice) {
            case "1":
                RegisterOfClient.registerOfClient();
                break;
            case "2":
                RegisterOfSaler.registerOfSaler();
                break;

        }
    }
}


