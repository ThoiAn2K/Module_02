public class MainTestCricle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2);

        double radius = circle1.getRadius();
        double area = circle1.getArea();

        System.out.println("Radius : " + radius);
        System.out.println("Area : " + area);
    }
}
