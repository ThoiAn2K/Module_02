public class RectangleTest1 {
        public static void main(String[] args) {
            Rectangle1 rectangle = new Rectangle1();
            System.out.println(rectangle);

            rectangle = new Rectangle1(2.3, 5.8);
            System.out.println(rectangle);

            rectangle = new Rectangle1(2.5, 3.8, "orange", true);
            System.out.println(rectangle);


            rectangle.resize(4.9);
            System.out.println(rectangle);
        }
    }

