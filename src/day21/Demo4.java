package day21;

import java.util.Arrays;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(5, 2, 4, 1, 3, 6, 7, 8);
        l.forEach(a -> System.out.print(a + " "));
        System.out.println();

        //lambda expression method
        l.forEach(System.out::println);
    }
}
