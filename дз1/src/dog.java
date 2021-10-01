import java.lang.*;

public class dog {
    private String name;
    private int age;

    public dog(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void getDogAgeToHuman(){
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }

    public String toString(){
        return this.name+", age "+this.age;
    }

}


