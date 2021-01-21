package day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        List<Integer> al1= new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        al1.add(60);
        System.out.println(al1);
        al1.add(50);
        System.out.println(al1);

        List<Integer> ul = Collections.unmodifiableList(al1);
        System.out.println(ul);
//        ul.add(90); // not allowed
    }

}
