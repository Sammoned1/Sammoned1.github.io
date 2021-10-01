import java.lang.*;

public class testDog {
    public static void main(String[] args) {
        dog dog1 = new dog("Mike", 5);
        dog dog2 = new dog("Helen", 1);
        dog2.setAge(3);
        System.out.println(dog1);
        dog1.getDogAgeToHuman();
        dog2.getDogAgeToHuman();
        System.out.println(dog1.getName());
        System.out.println(dog2.getAge());
        System.out.println("\n");


        ball ball1 = new ball("volleyball", 10);
        ball1.setColor("yellow");
        ball1.setLabel("puma");
        ball1.getInfo();

        book book1 = new book("Lev Nikolaevich Tolstoy", 1700);
        book1.setName("War and piece");
        book1.getInfo();
    }
}
