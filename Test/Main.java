public class Main {
    public static void main(String[] args) {
        Product product = new Product("aa","bb","cc","dd");
        Item item = new Item(product,12,20);
        Item item1 = new Item(product,23,33);
        System.out.println(item);
        System.out.println(item1);
        Product product1 = new Product("bb","cc","dd","ee");
        Item item2 = new Item(product1,123,3333);
        System.out.println(item2);
        System.out.println(item1);
    }
}
