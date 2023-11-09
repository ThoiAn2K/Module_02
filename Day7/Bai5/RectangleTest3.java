public class RectangleTest3 {
    public static void main(String[] args) {
        Rectangle3 rectangle = new Rectangle3();
        System.out.println(rectangle);

        rectangle = new Rectangle3(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle3(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
    }
}
