package day19;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo3 {
    public static void main(String[] args) {
        System.out.println("using hash map");
        Map<Integer, String> studentMap1 = new HashMap<>();
        studentMap1.put(100, "ram lama");
        studentMap1.put(110, "hari gopal");
        studentMap1.put(120, "krishna lal");
        studentMap1.put(115, "gopal neapl");
        System.out.println(studentMap1);

        for (Map.Entry<Integer, String> student : studentMap1.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }
        System.out.println("==================");

        System.out.println("using linked hash map");
        Map<Integer, String> studentMap2 = new LinkedHashMap<>();
        studentMap2.put(100, "ram lama");
        studentMap2.put(110, "hari gopal");
        studentMap2.put(120, "krishna lal");
        studentMap2.put(115, "gopal neapl");
        System.out.println(studentMap2);

        for (Map.Entry<Integer, String> student : studentMap2.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }
        System.out.println("==================");

        System.out.println("using tree map");
        Map<Integer, String> studentMap3 = new TreeMap<>();
        studentMap3.put(100, "ram lama");
        studentMap3.put(110, "hari gopal");
        studentMap3.put(120, "krishna lal");
        studentMap3.put(115, "gopal neapl");
        System.out.println(studentMap3);

        for (Map.Entry<Integer, String> student : studentMap3.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }
        System.out.println("==================");
    }
}
