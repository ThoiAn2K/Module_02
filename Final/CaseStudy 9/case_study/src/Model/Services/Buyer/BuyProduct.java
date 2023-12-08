package Model.Services.Buyer;

import Controller.Clients.Login.HomePageOfClient;
import Model.Entity.Product;
import Model.Implement.Buy;
import Model.Utils.Seller.ReadProductOfSeller;
import Model.Utils.WriterCart;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BuyProduct implements Buy {
    private static BuyProduct instance;

    public static BuyProduct getInstance() {
        if (instance == null) {
            instance = new BuyProduct();
        }
        return instance;
    }

    @Override
    public void buy(String owner, String shop, String product, int quantity) {
        buyProduct(owner, shop, product, quantity);
    }

    private void buyProduct(String owner, String shop, String product, int quantity) {

        HomePageOfClient homePageOfClient = HomePageOfClient.getInstance();
        ReadProductOfSeller readProductOfSeller = ReadProductOfSeller.getInstance();
        WriterCart writerCart = WriterCart.getInstance();


        Scanner scanner = new Scanner(System.in);
        boolean isValidShop = false;
        int count = 0;
        while (!isValidShop) {

            System.out.println("Enter shop you want buy");
            shop = scanner.nextLine();
            count++;

            try {
                if (readProductOfSeller.isValidShop(shop)) {
                    count = 0;
                    isValidShop = true;


                } else if (count == 3) {
                    System.out.println("If there is too much incorrect information, you can review the store list");
                    homePageOfClient.load();
                    count = 0;
                    isValidShop = true;
                }
            } catch (InputMismatchException e) {
                if (count == 3) {
                    System.out.println("If there is too much incorrect information, you can review the store list");
                    homePageOfClient.load();
                    count = 0;
                    isValidShop = true;
                }
            }

        }
        boolean isValidProduct = false;
        int countProduct = 0;
        while (!isValidProduct) {
            System.out.println("Enter product of shop you want ");
            product = scanner.nextLine();
            countProduct++;
            if (readProductOfSeller.isValid(shop, product)) {
                isValidProduct = true;
            } else if (countProduct == 3) {
                System.out.println("If there is too much incorrect information, you can review the store list");
                isValidProduct = true;
                homePageOfClient.load();
            }
        }

        boolean isValidQuantity = false;
        int countQuantity = 0;


        while (true) {
            System.out.println("Enter quantity of shop you want: ");
            try {
                quantity = Integer.parseInt(scanner.nextLine());
                if (readProductOfSeller.isValidPrice(shop, product, quantity)) {
                    isValidQuantity = true;
                    break;
                } else {
                    System.out.println("Please enter an integer, and the quantity must be smaller or equal to the quantity in stock.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }

            countQuantity++;
            if (countQuantity == 3) {
                System.out.println("There is too much incorrect information.");
                homePageOfClient.load();
                break;
            }
        }

        if (isValidQuantity) {
            writerCart.writerInCart(owner, shop, product, quantity);
            System.out.println("The product has been added to cart");
        }


    }
}
