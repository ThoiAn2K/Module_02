public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c){
        this.a =a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getDiscrimitnant(){
        return b*b -4 * a *c;
    }
    public double getRoot1(){
        if(getDiscrimitnant() >= 0){
            return (-b + Math.sqrt(getDiscrimitnant())) / (2*a);
        } else {
            return 0;
        }
    }
    public double getRoot2(){
        if (getDiscrimitnant() >= 0){
            return (-b - Math.sqrt(getDiscrimitnant()))/(2*a);
        }else{
            return 0;
        }
    }
}

