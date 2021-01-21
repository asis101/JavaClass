package day19;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> al1= new LinkedList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        System.out.println(al1);
        al1.add(50);
        System.out.println(al1);
        al1.add(2, 60);
        System.out.println(al1);
        al1.set(3, 45);
        System.out.println(al1);
        System.out.println(al1.get(3));
        System.out.println(al1.size());
        System.out.println(al1.indexOf(50));
//        al1.clear();
        System.out.println(al1.isEmpty());
        System.out.println(al1.contains(40));
        System.out.println(al1);
        System.out.println(al1.remove(2));
        System.out.println(al1);
        System.out.println("================");

        List<Integer> al2 = new LinkedList<>();
        al2.add(60);
        System.out.println(al2);
//        al2.addAll(al1);
        System.out.println(al2);
        al2.addAll(0,al1);
        System.out.println(al2);
//        al2.removeAll(al1);
        System.out.println(al2);
        al2.retainAll(al1);
        System.out.println(al2);

    }
}
