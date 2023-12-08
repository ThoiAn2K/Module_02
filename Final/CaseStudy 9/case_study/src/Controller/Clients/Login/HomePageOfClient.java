package Controller.Clients.Login;

import Controller.Home;
import Model.Implement.HomePage;
import Model.Entity.Product;
import Model.Services.Buyer.BuyProduct;
import Model.Services.Buyer.RepairProductInCart;
import Model.Utils.ReadCart;
import Model.Utils.Client.ReadDataClient;
import Model.Utils.Client.ReadHistory;
import Model.Utils.Seller.ReadProductOfSeller;
import Model.Utils.WriterCart;
import Model.Utils.Client.WriterWalletOfClient;

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


    RepairProductInCart repairProductInCart = RepairProductInCart.getInstance();
    WriterWalletOfClient writerWalletOfClient = WriterWalletOfClient.getInstance();
    ReadProductOfSeller readProductOfSeller = ReadProductOfSeller.getInstance();
    View.Home.HomePageOfClient homePageOfClient = View.Home.HomePageOfClient.getInstance();
    ReadDataClient readDataClient = ReadDataClient.getInstance();
    WriterCart writerCart = WriterCart.getInstance();
    BuyProduct buyProduct = BuyProduct.getInstance();
    ReadHistory readHistory = ReadHistory.getInstance();
    Payment payment = Payment.getInstance();
    Home home = Home.getInstance();
    ReadCart readCart = ReadCart.getInstance();
    Product productObject = new Product();


    private void homePageClient() {
        writerWalletOfClient.load();
        homePageOfClient.load();

        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        String product = null;
        String shop = null;
        int quantity = 0;
        String owner = readDataClient.name;

        switch (number) {
            case "1":
                System.out.println();
                readProductOfSeller.ReadAll();
                System.out.println();
                homePageClient();
                break;
            case "2":
                System.out.println();
                System.out.println("Enter the name of the store you want to find");
                String shopName = scanner.nextLine();
                readProductOfSeller.readShop(shopName);
                System.out.println();
                homePageClient();
                break;
            case "3":
                System.out.println();
                readCart.buy(readDataClient.name, shop, product, quantity);
                System.out.println();
                homePageClient();
                break;
            case "4":
                System.out.println();
                buyProduct.buy(owner, shop, product, quantity);
                load();
                break;

            case "5":
                repairProductInCart.load();
                load();
                break;

            case "6":
                System.out.println();
                System.out.println("Enter the name of the shop whose products need to be deleted");
                String shopNameDelete = scanner.nextLine();
                System.out.println("Enter the name of the product in the store to be deleted");
                String productDelete = scanner.nextLine();
                writerCart.delete(shopNameDelete, productDelete);
                System.out.println();
                load();
                break;
            case "7":
                System.out.println();
                payment.load();
                System.out.println();
                break;
            case "8":
                System.out.println();
                readHistory.load();
                System.out.println();
                load();
                break;
            case "9":
                System.out.println();
                home.load();
                break;
            default:
                homePageClient();
                break;
        }
    }

}
