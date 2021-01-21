package day19;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(40);
        s.add(30);
        s.add(60);
        s.add(40);
        System.out.println(s);
    }
}
