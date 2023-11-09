public class Cylinder extends Circle2{
    private double height = 3;

   public Cylinder(){}
    public Cylinder(double height){
       this.height = height;
    }

    public Cylinder(double height, double radius, String color){
       super(radius,color);
       this.height = height;
    }

    public double volume(){
       return Math.PI * (getRadius() * getRadius()) * height;
    }
    public String toString(){
       return "Radius of Cylinder: " + volume() + " , height: " + this.height + " " + super.toString();
    }
}
