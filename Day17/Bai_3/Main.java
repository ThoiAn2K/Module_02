import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filename = "products.dat";
    ProductFileManager fileManager = new ProductFileManager(filename);
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1.Add product");
            System.out.println("2.Display products");
            System.out.println("3.Search product");
            System.out.println("4.Exit");
            System.out.println("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter product Id: ");
                    String id = scanner.nextLine();

                    System.out.println("Enter product Name: ");
                    String name = scanner.nextLine();

                    System.out.println("Enter product Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();


                    System.out.println("Enter product Manufacturer: ");
                    String manufacturer = scanner.nextLine();

                    System.out.println("Enter product Description: ");
                    String description = scanner.nextLine();

                    Product product = new Product(id, name, price, manufacturer, description);
                    fileManager.addProduct(product);
                    break;

                case 2:
                    fileManager.displayProducts();
                    break;

                case 3:
                    System.out.println("Enter product id to search");
                    String search = scanner.nextLine();
                    fileManager.searchProducts(search);
                    break;

                case 4:
                    System.exit(4);
                    break;

                default:
                    System.out.println("Please try again");


            }
        }

    }
}
