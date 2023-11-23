import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductFileManager {
    private String filename;

    public ProductFileManager() {
    }


    public ProductFileManager(String filename) {
        this.filename = filename;
    }

    public void addProduct(Product product) {
        List<Product> productsList = readProducts();
        productsList.add(product);
        writeProducts(productsList);

    }
    public void displayProducts(){
        List<Product> productList = readProducts();
        productList.forEach(System.out::println);
    }

    public void searchProducts(String id){
        List<Product> productList = readProducts();
        for (Product product: productList){
            if ( product.getId().equals(id)){
                System.out.println(product);
                return;
            }
        }
        System.out.println("Product not found");
    }

    private void writeProducts(List<Product> productList){
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))){
            outputStream.writeObject(productList);
            System.out.println("Product saved to file.");
        } catch (IOException e){
            e.printStackTrace();
        }
    }


    private List<Product> readProducts() {
        List<Product> productList = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename));

        ) {
           productList = (List<Product>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return productList;
    }

}
