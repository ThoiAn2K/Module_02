package Controller.Seller.Login;

import Model.Implement.HomePage;
import Model.Entity.Product;
import Model.Utils.Seller.ReadProductOfSeller;
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
    private void repair(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input product name you want repair");
        productNameNeedRepair = scanner.nextLine();
    }

    private void repairProduct() {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();




        System.out.println();
        ReadProductOfSeller readProductOfSeller = ReadProductOfSeller.getInstance();
        readProductOfSeller.readAProduct(productNameNeedRepair, product.getShopName());
        System.out.println();


        ReadProductOfSeller readAllProduct = ReadProductOfSeller.getInstance();
        WriterRepairProduct writerRepairProduct = WriterRepairProduct.getInstance();
        String newName = "";
        String newDescription = "";
        double newPrice;
        int quantity;


        if (readAllProduct.isValid(product.getShopName(), productNameNeedRepair)) {


            RepairProductView repairProductView = RepairProductView.getInstance();
            repairProductView.load();
            String number = scanner.nextLine();

            switch (number) {
                case "1":
                    System.out.println("The alternative name for product " + productNameNeedRepair + " is");
                    newName = scanner.nextLine();
                    writerRepairProduct.setProductName(productNameNeedRepair, newName);
                    productNameNeedRepair = newName;
                    System.out.println("Product updated successfully");
                    System.out.println();
                    repairProduct();
                    break;

                case "2":
                    System.out.println("The alternative description for product " + productNameNeedRepair + " is");
                    newDescription = scanner.nextLine();
                    writerRepairProduct.setProductDescription(newDescription, productNameNeedRepair);
                    System.out.println("Product updated successfully");
                    System.out.println();
                    repairProduct();
                    break;

                case "3":
                    System.out.println("The alternative price for product " + newName + " is");
                    newPrice = 0;
                    boolean isValidPrice = false;
                    while (!isValidPrice) {
                        try {
                            newPrice = Double.parseDouble(scanner.nextLine());
                            isValidPrice = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a valid price.");
                        }
                    }
                    writerRepairProduct.setProductPrice(newPrice, productNameNeedRepair);
                    System.out.println("Product updated successfully");
                    System.out.println();
                    repairProduct();
                    break;


                case "4":
                    boolean isValidQuantity = false;
                    quantity = 0;
                    while (!isValidQuantity) {
                        System.out.println("The alternative quantity for product " + newName + " is");
                        try {
                            quantity = Integer.parseInt(scanner.nextLine());
                            isValidQuantity = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a valid quantity.");
                        }
                    }
                    writerRepairProduct.setQuantity(quantity, productNameNeedRepair);
                    System.out.println("Product updated successfully");
                    System.out.println();
                    repairProduct();
                    break;


                case "5":
                    HomePageOfSeller homePageOfSeller = HomePageOfSeller.getInstance();
                    homePageOfSeller.load();
                    break;

//                case "6":
//                    HomePageOfSeller homePageOfSellerNew = HomePageOfSeller.getInstance();
//                    homePageOfSellerNew.load();
//                    break;
                default:
                    repairProduct();
            }
        } else {
            HomePageOfSeller homePageOfSeller = HomePageOfSeller.getInstance();
            homePageOfSeller.load();
        }
    }
}