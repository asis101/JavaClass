package day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(5, 2, 4, 1, 3, 6, 7, 8);

        List<Integer> evenList = new ArrayList<>();
        for (int a : l) {
            if (a % 2 == 0) {
                evenList.add(a);
            }
        }
        System.out.println(evenList);


        //java8
        List<Integer> eList = l.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        System.out.println(eList);

        List<Integer> oddMulList = l.stream().map(i -> {
            if (i % 2 != 0) {
                i = i * 2;
            }
            return i;
        }).collect(Collectors.toList());
        System.out.println(oddMulList);

        int sum = l.stream().filter(a -> a % 2 == 0).mapToInt(a -> a).sum();
        System.out.println(sum);
    }
}
