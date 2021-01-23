package day21;

import java.util.Arrays;
import java.util.List;

public class Printers {

    public static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> l = Arrays.asList("a", "b", "c");
        l.forEach(Printers::print);
    }
}
