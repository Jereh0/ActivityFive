/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysort;
import java.util.Arrays;
/**
 *
 * @author Administrator
 */
public class ArraySort {

    public static boolean isSorted(int[] arr){
        return isSorted(arr, 0);
    }
    
    private static boolean isSorted(int[] arr, int index){
        if(index == arr.length - 1){
            return true;
        }
        if(arr[index] > arr [index + 1]){
            return false;
        }
        return isSorted(arr, index + 1);
    }
    public static void sort(){
        int[] array = {1, 2, 3, 4};
        Arrays.sort(array);
        System.out.println("Array: " + Arrays.toString(array));
        boolean sorted = isSorted(array);
        System.out.println("Is the Array sorted?\nAnswer: " + sorted);
    }
    public static void main(String[] args) {
        sort();
    }
    
}
