import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    private List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(int id, String newName, double newPrice) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setName(newName);
                product.setPrice(newPrice);
                break;
            }
        }
    }

    public void removeProduct(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void searchProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println(product);
            }
        }
    }

    public void sortProductsByPriceAscending() {
        Collections.sort(products, Comparator.comparingDouble(Product::getPrice));
    }

    public void sortProductsByPriceDescending() {
        Collections.sort(products, Comparator.comparingDouble(Product::getPrice).reversed());
    }
}
