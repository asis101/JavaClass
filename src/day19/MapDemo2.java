package day19;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(100, "ramlama");
        studentMap.put(110, "hari gopal");
        studentMap.put(120, "krishna lal");
        studentMap.put(115, "gopal neapl");
        System.out.println(studentMap);

        for (Map.Entry<Integer, String> student : studentMap.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }
        System.out.println("============");

        studentMap.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer key, String value) {
                System.out.println(key + " " + value);
            }
        });
    }
}
