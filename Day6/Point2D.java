public class Point2D {
    private float x;
    private float y;

    public Point2D(){}

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX(){
        return x;
    }
    public void setX(){
        this.x = x;
    }
    public float getY(){
        return y;
    }
    public void setY(){
        this.y = y;
    }
    public void setXY(float x , float y){
        this.x = x;
        this.y = y;
    }


    public float [] getXY(){
        float [] array = {x,y};
        return array;
    }
   public String toString(){
        return "x: " + getX() + " Y: " + getY();
   }
}
