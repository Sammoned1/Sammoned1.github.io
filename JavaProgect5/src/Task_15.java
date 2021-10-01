import java.lang.*;
import java.util.Scanner;


public class Task_15 {
    private static int n=0;
    static Scanner console = new Scanner(System.in);
    private static int num = console.nextInt();
    public static void recursion(){
        if(num!=0){
            int last = num%10;
            num=num/10;
            System.out.println(last);
            recursion();
        }
    }
    public static void main(String[] args){
        recursion();
    }
}
