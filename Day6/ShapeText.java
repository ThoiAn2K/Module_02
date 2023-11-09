public class ShapeText {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

        Circle cricle = new Circle();
        System.out.println(cricle);

        cricle = new Circle(3.5);
        System.out.println(cricle);

        cricle = new Circle(3.5, "Indigo", false);
        System.out.println(cricle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
    }
}

