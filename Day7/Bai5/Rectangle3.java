public class Rectangle3 extends Shape3 implements Colorable3{
    private double width = 1.0;
    private double length = 1.0;

    public void howToColor(){
        System.out.println("Color all fours sides..");
    }

    public Rectangle3() {
    }

    public Rectangle3(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle3(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }
}
