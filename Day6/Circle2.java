import javax.swing.*;

public class Circle2 {
    private double radius = 4;
    private String color = "White";

    public Circle2() {

    }


    public Circle2( double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public String toString(){
        return "Radius: " + getRadius() + " , color: " + getColor() + " ,Area: " + getArea();
    }

}
