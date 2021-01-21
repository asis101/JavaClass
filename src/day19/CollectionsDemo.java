package day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> al1= new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        al1.add(60);
        System.out.println(al1);

        Collections.sort(al1);
        System.out.println(al1);

        Collections.reverse(al1);
        System.out.println(al1);

        Collections.shuffle(al1);
        System.out.println(al1);

    }
}
