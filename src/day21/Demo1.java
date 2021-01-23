package day21;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(5, 2, 4, 1, 3);

        //java8
        l.forEach(i -> System.out.print(i + " "));
        System.out.println();

        new Thread(() -> System.out.println("hello from thread")).start();

        l.sort((o1, o2) -> {
            if (o1 > o2) {
                return 1;
            } else {
                return -1;
            }
        });
        System.out.println(l);


        //old
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
        System.out.println();

        for (int a : l) {
            System.out.print(a + " ");
        }
        System.out.println();

        l.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer + " ");
            }
        });
        System.out.println();

        l.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2){
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        System.out.println(l);


    }
}
