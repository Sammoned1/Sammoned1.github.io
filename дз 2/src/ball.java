public class ball {
    private double x;
    private double y;

    public ball(double x, double y){
        this.x=x;
        this.y=y;
    }
    public ball(){
        x=0.0;
        y=0.0;
    }
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x=x;
    }
    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y=y;
    }
    public void setXY(double x, double y){
        this.x=x;
        this.y=y;
    }
    public void move(double xDisp, double yDisp){
        x+=xDisp;
        y+=yDisp;
    }

    @Override
    public String toString() {
        return "ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
