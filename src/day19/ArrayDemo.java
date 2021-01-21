package day19;

import java.util.Arrays;
import java.util.List;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 9};
        System.out.println(arr);

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Integer[] ar = {4, 1, 7, 3, 6, 2, 9};
        List<Integer> l = Arrays.asList(ar);
        System.out.println(l);

        List<Integer> li = Arrays.asList(1, 2, 3, 4);
        System.out.println(li);
    }
}
