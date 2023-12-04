package Controller.Seller;

import Controller.HomePage;
import Model.Utils.ReadDataSeller;
import Model.Utils.ReadProduct;
import Model.Utils.ReadProductOfSeller;
import Model.Utils.WriterRepairProduct;
import View.Home.RepairProductView;

import java.util.Scanner;

public class RepairProduct implements HomePage {
    private static RepairProduct instance;

    public static RepairProduct getInstance() {
        if (instance == null) {
            instance = new RepairProduct();
        }
        return instance;
    }

    @Override
    public void load() {
        repair();
        repairProduct();
    }

    private String productNameNeedRepair;

    private void repair() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input product name you want repair");
        productNameNeedRepair = scanner.nextLine();
    }

    private void repairProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        ReadProductOfSeller readProductOfSeller = ReadProductOfSeller.getInstance();
        readProductOfSeller.readAProduct(productNameNeedRepair);
        System.out.println();


        RepairProductView repairProductView = RepairProductView.getInstance();
        repairProductView.load();

        System.out.println("Input number you want");
        String number = scanner.nextLine();
        ReadProductOfSeller readAllProduct = ReadProductOfSeller.getInstance();
        WriterRepairProduct writerRepairProduct = WriterRepairProduct.getInstance();
        String newName = "";
        String newDescription = "";
        int newPrice;



        if (readAllProduct.isValid(productNameNeedRepair)) {

            switch (number) {
                case "1":
                    System.out.println("The alternative name for product " + productNameNeedRepair + " is");
                    newName = scanner.nextLine();
                    writerRepairProduct.setProductName(productNameNeedRepair, newName);
                    productNameNeedRepair = newName;
                    repairProduct();
                    System.out.println("Product updated successfully");
                    System.out.println();
                    break;

                case "2":
                    System.out.println("The alternative description for product " + productNameNeedRepair + " is");
                    newDescription = scanner.nextLine();
                    writerRepairProduct.setProductDescription(newDescription,productNameNeedRepair);
                    repairProduct();
                    System.out.println("Product updated successfully");
                    System.out.println();
                    break;

                case "3":
                    System.out.println("The alternative price for product " + newName + " is");
                    newPrice = scanner.nextInt();
                    writerRepairProduct.setProductPrice(newPrice,productNameNeedRepair);
                    repairProduct();
                    System.out.println("Product updated successfully");
                    System.out.println();
                    break;

                case "4":
                    HomePageOfSeller homePageOfSeller = HomePageOfSeller.getInstance();
                    homePageOfSeller.load();
                    break;
                default:
                    repairProduct();
            }
        }
    }
}