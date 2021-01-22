package DescendingSort;
import java.util.*;

public class DescendingSort {
    public static void main(String[] args) {
//        Integer[] array = {-10, 0, 2, 9, -5};
//        Arrays.sort(array, Collections.reverseOrder());
//        System.out.printf("Modified arr[] : %s", Arrays.toString(array));
//
        int[] array = {-10, 0, 2, 9, -5};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}