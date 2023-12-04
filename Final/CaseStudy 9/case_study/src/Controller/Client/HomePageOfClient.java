package Controller.Client;

import Controller.Home;
import Controller.HomePage;
import Model.Utils.ReadProductOfSeller;

import java.util.Scanner;

public class HomePageOfClient implements HomePage {
    private static HomePageOfClient instance;

    public static HomePageOfClient getInstance() {
        if (instance == null) {
            instance = new HomePageOfClient();
        }
        return instance;
    }

    @Override
    public void load() {
        homePageClient();
    }

    public void homePageClient() {
        View.Home.HomePageOfClient homePageOfClient = View.Home.HomePageOfClient.getInstance();
        homePageOfClient.load();
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        switch (number){
            case "1":
                System.out.println();
                ReadProductOfSeller readProductOfSeller = ReadProductOfSeller.getInstance();
                readProductOfSeller.ReadAll();
                System.out.println();
                homePageClient();
                System.out.println();
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                System.exit(0);
                break;
            default:
                homePageClient();
                break;
        }
    }


}
