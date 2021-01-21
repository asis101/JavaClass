package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class SetDemo3 {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(40);
        s.add(30);
        s.add(60);
        s.add(40);
        System.out.println(s);

        for (int i : s) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("==============");

        Iterator<Integer> it = s.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.println("==============");

        s.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.print(i + " ");
            }
        });
        System.out.println();
        System.out.println("==============");
    }
}
