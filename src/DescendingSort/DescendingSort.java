package DescendingSort;
import java.util.*;

public class DescendingSort {
    public static void main(String[] args) {
        Integer[] array = {-10, 0, 2, 9, -5};
        Arrays.sort(array, Collections.reverseOrder());
        System.out.printf("Modified arr[] : %s", Arrays.toString(array));
//        int number = array[0];
//        for (int i = 1; i < array.length; i++){
//            if (array[i] > number) {
//                number = array[i];
//            }
//        }
//        System.out.println(number);
    }
}
