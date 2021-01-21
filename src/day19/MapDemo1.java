package day19;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(100, "ramlama");
        studentMap.put(110, "hari gopal");
        studentMap.put(120, "krishna lal");
        studentMap.put(115, "gopal neapl");
        System.out.println(studentMap);

        System.out.println(studentMap.get(100));
        System.out.println(studentMap.get(110));
        System.out.println(studentMap.get(120));
        System.out.println(studentMap.get(110));

        System.out.println(studentMap.containsValue("krishna lal"));
        System.out.println(studentMap.containsKey(100));
        System.out.println(studentMap.size());
        System.out.println(studentMap.replace(100, "shyam thapa"));
        System.out.println(studentMap);
        System.out.println(studentMap.remove(110));
        System.out.println(studentMap);
        System.out.println(studentMap.isEmpty());
    }
}
