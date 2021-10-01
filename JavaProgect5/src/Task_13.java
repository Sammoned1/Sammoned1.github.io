import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

public class Task_13 {
    private static int n=0;
    private static String num;
    private static boolean k = true;
    public static void recursion() throws IOException{
        if(k){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            num = reader.readLine();
            k=false;
        }
        if(n<num.length()-1) {
            if ((int) num.charAt(n) != 0) {
                if (n % 2 != 0) {
                    System.out.println(num.charAt(n));
                }
                n++;
                recursion();
            }
        }
        else return;
    }
    public static void main(String[] args) throws IOException {
        recursion();
    }
}
