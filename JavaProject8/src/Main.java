import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Pet doggy=new Dog("Carl",8);
        Pet kitten=new Cat("Mir",3);
        Pet owly=new Owl("Phil",15);

        HashMap<String,Pet> pets = new HashMap<>();

        pets.put("a",doggy);
        pets.put("b",kitten);
        pets.put("c",owly);
        System.out.println(pets.toString());
        System.out.println(pets.get("b").toString());

        Dog doggy1=new Dog("Carl jr.",6);
        Cat kitten1=new Cat("Mir jr.",1);
        pets.put("d",doggy1);
        pets.put("b",kitten1);
        System.out.println(pets.toString());

        int[] mas=new int[10];
        for(int i=0;i<10;i++) {
            int a = (int) (Math.random()*(200+1)) ;;
            mas[i]=a;
            System.out.println(mas[i]);
        }
        int count=0;
        for(int q=0;q< mas.length;q++) {
            for(int y=0;y<mas.length;y++) {
                if(mas[q]==mas[y]){
                    count=count++;
                }
            }
        }
        System.out.println("count = "+count);
    }


}
