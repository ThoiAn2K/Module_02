import java.util.*;

public class Tester {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

        Product newProduct = new Product(123, "fan", 350000);
        Product newProduct1 = new Product(122, "Car", 350000);
        manager.addProduct(newProduct1);
        manager.addProduct(newProduct);
//        System.out.println(manager);
        manager.disPlay();
        System.out.println();

        manager.updateProduct(123, "Machine", 500000);
        manager.disPlay();
//
        System.out.println();
        manager.updateProduct(12, "Machine", 500000);
        manager.disPlay();

        System.out.println();

        manager.findproduct("Machine");



        System.out.println();
        manager.findproduct("Hello");

            }
}