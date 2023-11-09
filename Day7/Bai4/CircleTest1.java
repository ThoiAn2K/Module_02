public class CircleTest1 {

        public static void main(String[] args) {
            Circle1 circle = new Circle1();
            System.out.println(circle);

            circle = new Circle1(3.5);
            System.out.println(circle);

            circle = new Circle1(3.5, "indigo", false);
            System.out.println(circle);

            Circle1 circle1 = new Circle1();
            System.out.println(circle1);

            circle1.setRadius(2.6);
            System.out.println(circle1);

            circle1.resize(3.5);
            System.out.println(circle1);


        }
    }

