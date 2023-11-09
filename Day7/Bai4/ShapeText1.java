import java.util.Random;

public class ShapeText1 {

        public static void main(String[] args) {
//            Shape1 shape = new Shape1();
//            System.out.println(shape);
//
//            shape = new Shape1("red", false);
//            System.out.println(shape);


//            Random random = new Random();
            Resizeable[] shapes = new Resizeable[2];

            shapes[0] = new Circle1(5);
            shapes[1] = new Rectangle1(4,6);

            for (Resizeable shape : shapes) {
                double percent = Math.random() * 100 + 1;
                System.out.println("Before resizing:");
                System.out.println(shape);
                System.out.println("Area: " + shape.getArea());

                shape.resize(percent);

                System.out.println("After resizing:");
                System.out.println(shape);
                System.out.println("Area: " + shape.getArea());
                System.out.println();




            }
        }
    }

