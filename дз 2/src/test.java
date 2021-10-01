public class test {
    public static void main(String[] args) {
        ball ball1=new ball();
        ball ball2 = new ball(2.4,1.7);
        ball ball3 = new ball();
        ball1.setX(23.2);
        ball1.setY(17.6);
        ball3.setXY(1.0,2.0);
        ball2.move(8.6,2.3);
        System.out.println("Координаты первого мяча: "+ball1.getX()+" "+ball1.getY()+"\n");
        System.out.println("Координаты второго мяча: "+ball2.getX()+" "+ball2.getY()+"\n");
        System.out.println("Координаты третего мяча: "+ball3.getX()+" "+ball3.getY()+"\n");
    }
}
