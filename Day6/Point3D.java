import java.util.Arrays;

public class Point3D extends Point2D{
    private float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x,y);
        this.z =z;
    }
    public float getZ(){
        return z;
    }
    public void setZ( float z){
        this.z = z;
    }
    public void setXYZ ( float x, float y, float z){
        super.setXY(x,y);
        this.z= z;
    }
    public float [] getXYZ (){
        float [] array1 = {getX(), getY(), z};
        return array1;
    }

@Override
    public String toString() {
        return " X: " + getX()+ ", Y: " + getY() + " , Z: " + getZ() + " array:" + Arrays.toString(getXYZ());
    }
}
