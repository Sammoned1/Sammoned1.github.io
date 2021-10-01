import java.io.IOException;
import java.lang.*;
import java.util.Scanner;


public class Task_16 {
    private static int n=0;
    static Scanner console = new Scanner(System.in);
    private static String num= console.nextLine();
    private static int k=0;
    private static char max='0';
    public static void recursion(){
        if(n<num.length()-1) {
            if(num.charAt(n)!=0){
                if(num.charAt(n)>max){
                    max = num.charAt(n);
                    k=1;
                }
                else if((int) num.charAt(n)==max){
                    k++;
                }
                n++;
                recursion();
            }
            else return;
        }

    }

    public static void main(String[] args) throws IOException {
        recursion();
        System.out.println("Максимальное число: "+max);
        System.out.println("Количество: "+k);
    }
}
