package day19;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo4 {
    public static void main(String[] args) {
        System.out.println("hash set is:");
        Set<Integer> s = new HashSet<>();
        s.add(40);
        s.add(30);
        s.add(60);
        s.add(40);
        s.add(20);
        System.out.println(s);
        System.out.println();

        System.out.println("linked hash set is:");
        Set<Integer> lhs = new LinkedHashSet<>();
        lhs.add(40);
        lhs.add(30);
        lhs.add(60);
        lhs.add(40);
        lhs.add(20);
        System.out.println(lhs);
        System.out.println();

        System.out.println("tree set is:");
        Set<Integer> ts = new TreeSet<>();
        ts.add(40);
        ts.add(30);
        ts.add(60);
        ts.add(40);
        ts.add(20);
        System.out.println(ts);
        System.out.println();
    }
}
