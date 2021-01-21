package day19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(40);
        s.add(30);
        s.add(60);
        s.add(40);
//        s.add(2,45); // mot allowed
        System.out.println(s);

        System.out.println("==========");

        List<Integer> l = new ArrayList<>();
        l.add(40);
        l.add(30);
        l.add(60);
        l.add(40);
        l.add(2,39);
        System.out.println(l);
     }
}
