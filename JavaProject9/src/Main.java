import java.util.*;
public class Main {
    public static void adder(ArrayList<String> list, String a) {
        list.add(a);
    }

    public  static void remover(ArrayList<String> list,String a) {
        list.remove(a);
    }

    public  static void changer(ArrayList<String> list,String a,String b) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals(a)) {
                //Replace element
                iterator.set(b);
            }
        }
    }
    public  static void shuffle(ArrayList<String> list) {
        Collections.shuffle(list);
    }
    public  static String randomPick(ArrayList<String> list) {
        Random rand = new Random();
        String randomElement = list.get(rand.nextInt(list.size()));
        return randomElement;
    }
    public  static  void indexShower(ArrayList<String> list,String a) {
        int retval=list.indexOf(a);
        System.out.println("The element u entered is at index " + retval);
    }
    public  static void finder(ArrayList<String> list,String a) {
        if (list.contains(a)) {
            System.out.println("The element u entered is in list " + list);
        }
        else{
            System.out.println("The element u entered is not in the in list ");
        }
    }
    public static void main(String[] args) {
        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");

        // List<String> solarSystem = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(mercury, venus, earth, mars, jupiter)));
        List<String> solarSystem1 = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(mercury, venus, earth)));
        ArrayList<String> solarSystem2 = new ArrayList<>(Arrays.asList(mars, jupiter, earth));
        System.out.println(solarSystem2);
        adder(solarSystem2,"Плутон");
        System.out.println(solarSystem2);
        remover(solarSystem2,"Плутон");
        System.out.println(solarSystem2);
        changer(solarSystem2,"Марс","Нептун");
        System.out.println(solarSystem2);
        shuffle(solarSystem2);
        System.out.println(solarSystem2);
        System.out.println(randomPick(solarSystem2));
        indexShower(solarSystem2,"Земля");
        finder(solarSystem2,"Плутон");
    }
}
