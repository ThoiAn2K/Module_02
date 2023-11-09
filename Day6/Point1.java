public class Point1 {
        private float x;
        private float y;

        public Point1(){}

        public Point1(float x, float y){
            this.x = x;
            this.y = y;
        }
        public float getX(){
            return x;
        }
        public void setX(float x){
            this.x = x;
        }
        public float getY(){
            return y;
        }
        public void setY( float y){
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
