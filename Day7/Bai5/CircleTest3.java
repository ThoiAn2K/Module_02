public class CircleTest3 {
    public static void main(String[] args) {
        Circle3 circle = new Circle3();
        System.out.println(circle);

        circle = new Circle3(3.5);
        System.out.println(circle);

        circle = new Circle3(3.5, "indigo", false);
        System.out.println(circle);
    }
}
