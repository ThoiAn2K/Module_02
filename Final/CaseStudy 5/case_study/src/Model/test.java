package Model;

public class test {
    public static void main(String[] args) {
        Product product = new Product(1,"fan","fast",12000);
        Item item = new Item(product,20,2000);
        System.out.println(item);
    }
}
