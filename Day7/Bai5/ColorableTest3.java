public class ColorableTest3 {
    public static void main(String[] args) {
        Colorable3[] objects = new Colorable3[2];
        objects[0] = new Circle3();
        objects[1] = new Rectangle3();

        for (Colorable3 object : objects) {
            System.out.println(object.getArea());

            if(object instanceof Colorable3){
                object.howToColor();
            }


        }
    }
}
