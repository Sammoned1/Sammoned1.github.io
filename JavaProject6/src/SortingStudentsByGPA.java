import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

public class SortingStudentsByGPA implements Comparable<SortingStudentsByGPA>{
    int GPA;
    SortingStudentsByGPA(int GPA){
        this.GPA = GPA;
    }
    int getGPA(){
        return this.GPA;
    }
    @Override
    public int compareTo(SortingStudentsByGPA o) {
        if(this.GPA > o.GPA)
            return 1;
        else if(this.GPA == o.GPA){
            return 0;
        }
        else
            return -1;
    }
    public static void quickSort(SortingStudentsByGPA[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение если длина массива равна 0
        if (low >= high)
            return;//завершить выполнение если уже нечего делить
        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        SortingStudentsByGPA base = array[middle];
        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i].compareTo(base) < 0) {
                i++;
            }
            while (array[j] .compareTo(base) > 0) {
                j--;
            }
            if (i <= j) {//меняем местами
                SortingStudentsByGPA temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        SortingStudentsByGPA[] studentGPA = new SortingStudentsByGPA[n];
        for (int i=0;i<n;i++){
            int currentGPA = console.nextInt();
            SortingStudentsByGPA current = new SortingStudentsByGPA(currentGPA);
            studentGPA[i] = current;
        }
        int low = 0;
        int high = studentGPA.length - 1;
        System.out.println("Было");
        for (int i=0;i<n;i++){
            System.out.print(studentGPA[i].getGPA());
            System.out.print(' ');
        }
        quickSort(studentGPA,low,high);
        System.out.println();
        System.out.println("Стало");
        for (int i=0;i<n;i++){
            System.out.print(studentGPA[i].getGPA());
            System.out.print(' ');
        }
    }
}
//3
//88 67 87