package day19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ArraylistDemo2 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(al);
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
        System.out.println("==============");

        for (int a : al) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("==============");

        Iterator<Integer> it = al.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.println("==============");

        ListIterator<Integer> lit = al.listIterator();
        while (lit.hasNext()) {
            System.out.print(lit.next() + " ");
        }
        System.out.println();
        System.out.println("==============");

        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }
        System.out.println();
        System.out.println("==============");

        al.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.print(i + " ");
            }
        });
    }

}
