import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Remove Product");
            System.out.println("4. Display Products");
            System.out.println("5. Search Product by Name");
            System.out.println("6. Sort Products by Price (Ascending)");
            System.out.println("7. Sort Products by Price (Descending)");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();

                    Product newProduct = new Product(id, name, price);
                    productManager.addProduct(newProduct);
                    System.out.println("Product added successfully.");
                    break;
                case 2:
                    System.out.print("Enter product ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new product name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new product price: ");
                    double newPrice = scanner.nextDouble();
                    scanner.nextLine();

                    productManager.updateProduct(updateId, newName, newPrice);
                    System.out.println("Product updated successfully.");
                    break;
                case 3:
                    System.out.print("Enter product ID to remove: ");
                    int removeId = scanner.nextInt();
                    scanner.nextLine();

                    productManager.removeProduct(removeId);
                    System.out.println("Product removed successfully.");
                    break;
                case 4:
                    System.out.println("Product List:");
                    productManager.displayProducts();
                    break;
                case 5:
                    System.out.print("Enter product name to search: ");
                    String searchName = scanner.nextLine();

                    System.out.println("Search Results:");
                    productManager.searchProductByName(searchName);
                    break;
                case 6:
                    productManager.sortProductsByPriceAscending();
                    System.out.println("Products sorted by price (ascending).");
                    break;
                case 7:
                    productManager.sortProductsByPriceDescending();
                    System.out.println("Products sorted by price (descending).");
                    break;
                case 8:
                    exit = true;
            }
        }
    }
}
