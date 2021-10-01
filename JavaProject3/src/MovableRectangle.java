public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    public boolean check(){
        if(topLeft.xSpeed == bottomRight.xSpeed & topLeft.ySpeed == bottomRight.ySpeed)
            return true;
        else
            return false;
    }
    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
    public void moveUp(){
        if(check()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }
    public void moveDown(){
        if(check()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }
    public void moveRight(){
        if(check()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }
    public void moveLeft(){
        if(check()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }
}
