public class MovableCircle implements Movable{
    private int radius;
    MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed){
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }
    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
    public void moveUp(){
        center.moveUp();
    }
    public void moveDown(){
        center.moveDown();
    }
    public void moveRight(){
        center.moveRight();
    }
    public void moveLeft(){
        center.moveLeft();
    }
}
