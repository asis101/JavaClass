package day21;

import java.util.HashMap;
import java.util.Map;

public class Demo3 {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(100, "ram");
        studentMap.put(110, "shyam");
        studentMap.put(120, "sita");
        studentMap.put(130, "laxmi");

        //old
        for (Map.Entry<Integer, String> s : studentMap.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
        System.out.println("=============");

        //java8
        studentMap.entrySet().forEach(m -> {
            System.out.println(m.getKey() + " " + m.getValue());
        });
    }
}
