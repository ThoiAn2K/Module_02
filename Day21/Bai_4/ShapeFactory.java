public class ShapeFactory {
    public static Shape createShape(String shapleType){
        if (shapleType.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shapleType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }else if (shapleType.equalsIgnoreCase("Square")){
            return new Square();
        }return null;
    }
}
