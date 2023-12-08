package Model.Services.Buyer;

import Controller.Clients.Login.HomePageOfClient;
import Model.Implement.HomePage;
import Model.Implement.ReadClient;
import Model.Utils.Client.ReadDataClient;
import Model.Utils.Seller.ReadDataSeller;
import Model.Utils.WriterCart;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RepairProductInCart implements HomePage {
    private static RepairProductInCart instance;

    public static RepairProductInCart getInstance() {
        if (instance == null) {
            instance = new RepairProductInCart();
        }
        return instance;
    }

    @Override
    public void load() {
        repair();
    }

    public void repair(  ) {
        Scanner scanner = new Scanner(System.in);
        ReadDataClient readDataClient = ReadDataClient.getInstance();
      String name =  readDataClient.name;
        System.out.println(name);
        Model.Utils.Client.RepairProductInCart repairProductInCart = Model.Utils.Client.RepairProductInCart.getInstance();
        HomePageOfClient homePageOfClient = HomePageOfClient.getInstance();

        String nameShop = null;
        String nameProduct = null;
        int quantity = 0;

        int countShop = 0;
        boolean isShop = false;
        while (!isShop) {
            countShop++;
            System.out.println("Enter the name of the shop whose product needs repair");
            nameShop = scanner.nextLine();
            if (repairProductInCart.isShop(name, nameShop)) {
                isShop = true;
            } else {
                System.out.println("Can't find the name of this shop in your shopping cart, please enter the store name again");
            }
            if (countShop == 3) {
                System.out.println("If there is too much incorrect information, you can review the product list in cart");
                homePageOfClient.load();
                isShop = true;
            }

        }

        int countProduct = 0;
        boolean isProduct = false;
        while (!isProduct) {
            countProduct++;
            System.out.println("Enter the name of the product");
            nameProduct = scanner.nextLine();
            if (repairProductInCart.isProduct(name, nameShop, nameProduct)) {
                isProduct = true;
            } else {
                System.out.println("Can't find the name of this product in your shopping cart, please enter the store name again");
            }
            if (countProduct == 3) {
                System.out.println("If there is too much incorrect information, you can review the product list in cart");
                homePageOfClient.load();
                isProduct = true;
            }
        }
        int countQuantity = 0;
        boolean isQuantity = false;
        while (!isQuantity) {
            countQuantity++;
            System.out.println("Enter the quantity you need");
            try {
                quantity = scanner.nextInt();
                System.out.println();
                if (repairProductInCart.isQuantity(name, nameShop, nameProduct, quantity)) {
                    isQuantity = true;
                } else {
                    System.out.println("Please enter an integer, and the quantity must be smaller or equal to the quantity in stock");
                }
            } catch (InputMismatchException e) {
                System.out.println("error");
            }
        }
        if (countQuantity == 3) {
            System.out.println("If there is too much incorrect information, you can review the product list in cart");
            homePageOfClient.load();
            isQuantity = true;
        }

        WriterCart writerCart = WriterCart.getInstance();
        writerCart.buy(name,nameShop,nameProduct,quantity);
        System.out.println("The changes have been updated successfully");
    }

}


