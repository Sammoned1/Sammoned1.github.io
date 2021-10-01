import java.lang.*;

public class ball {
    private String label;
    private int radius;
    private String color;
    private String type;

    public ball(String type, int radius){
        this.type = type;
        this.radius = radius;
    }

    public void setLabel(String label){
        this.label=label;
    }

    public double getSize(){
        return 4/3*3.14*this.radius*radius*radius;
    }

    public void setColor(String color){
        this.color=color;
    }

    public void getInfo(){
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Label: " + label);
        System.out.println("Size: " + this.getSize() + " cm^3\n");

    }
}
