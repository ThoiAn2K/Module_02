public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.createShape("Circle");
        circle.draw();

        Shape rectangle = ShapeFactory.createShape("Rectangle");
        rectangle.draw();

        Shape square = ShapeFactory.createShape("Square");
        square.draw();

    }
}
