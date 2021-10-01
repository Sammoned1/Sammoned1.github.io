public class Square extends Rectangle {
    public Square(){
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side);
        this.color = color;
        this.filled = filled;
    }
    public double getSide(){
        return width;
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    //public abstract void setWidth(double width);
    //public abstract void setLength(double length);
    @Override
    public String toString() {
        return super.toString();
    }
}
