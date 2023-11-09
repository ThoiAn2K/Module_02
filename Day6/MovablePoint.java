import javax.swing.plaf.PanelUI;

public class MovablePoint extends Point1 {
    private float xSpeed;
    private float ySpeed;


    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed() {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed() {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed =xSpeed;
        this.ySpeed = ySpeed;
    }
    public float [] getSpeed(){
        float [] array = new float[2];
        return array;
    }
    public String toString(){
        return getX() + " " + getY() + " " + getXSpeed() + " " + getYSpeed();
    }
 public void move(){
        float newX = getX() + xSpeed;
        float newY = getY() + ySpeed;
       setX(newX);
       setY(newY);


 }
}
