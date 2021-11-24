import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void merge(Student[] array, int low, int mid, int high) {
        Student leftArray[] = new Student[mid - low + 1];
        Student rightArray[] = new Student[high - mid];

        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = array[low + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = array[mid + i + 1];
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = low; i < high + 1; i++) {
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) < 0) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
    public static void mergeSort(Student[] array, int low, int high) {
        if (high <= low) return;
        int mid = (low+high)/2;
        mergeSort(array, low, mid);
        mergeSort(array, mid+1, high);
        merge(array, low, mid, high);
    }
    public static void main(String[] args) {
        //Task 1
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        Student[] iDNumber = new Student[n];
        for (int i=0;i<n;i++){
            int currentID = console.nextInt();
            Student current = new Student(currentID);
            iDNumber[i] = current;
        }
        for (int i=0;i<n;i++){
            System.out.print(iDNumber[i].getiD());
            System.out.print(' ');
        }
        System.out.println();
        for (int i = 1; i < iDNumber.length; i++) {
            Student current = iDNumber[i];
            int j = i-1;
            while ((j > -1) && (iDNumber[j].compareTo(current)>=0)) {
                iDNumber[j+1] = iDNumber[j];
                j--;
            }
            iDNumber[j+1] = current;
        }
        for (int i=0;i<n;i++){
            System.out.print(iDNumber[i].getiD());
            System.out.print(' ');
        }
        //Task 3
        Student[] array1 = new Student[7];
        for (int i=0;i< array1.length;i++){
            int currentID = (int)(Math.random() * 100);
            Student current = new Student(currentID);
            array1[i] = current;
        }
        Student[] array2 = new Student[11];
        for (int i=0;i< array2.length;i++){
            int currentID = (int)(Math.random() * 100);
            Student current = new Student(currentID);
            array2[i] = current;
        }
        int j=0;
        int size = array1.length+ array2.length;
        Student[] array = new Student[size];
        for(int i=0;i<array.length;i++){
            if(i < array1.length){
                array[i]=array1[i];
            }
            else{
                array[i]=array2[j];
                j++;
            }
        }
//        for (int i=0;i<array1.length;i++){
//            System.out.print(array1[i].getiD());
//            System.out.print(' ');
//        }
//        System.out.println();
//        for (int i=0;i<array2.length;i++){
//            System.out.print(array2[i].getiD());
//            System.out.print(' ');
//        }
//        System.out.println();
        for (int i=0;i<array.length;i++){
            System.out.print(array[i].getiD());
            System.out.print(' ');
        }
        mergeSort(array, 0, array.length-1);
        System.out.println();
        for (int i=0;i<array.length;i++){
            System.out.print(array[i].getiD());
            System.out.print(' ');
        }
    }

}
