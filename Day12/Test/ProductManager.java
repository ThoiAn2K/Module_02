import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    public List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println();
    }

    public void disPlay() {
//        products.forEach(System.out::println);

        for (Product X : products) {
            System.out.println(X);
        }
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

    public void findproduct(String findNeedsName) {
        boolean isFind = false;
        for (Product finds : products) {
            if (finds.getName() == findNeedsName) {
                System.out.println(finds);
                isFind = true;
                break;
            }
//            return;
        }
        if (!isFind){
            System.out.println("I Don't see Name of Product in Data of System");
        }


    }
}



