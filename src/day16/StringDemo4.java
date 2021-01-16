package day16;

public class StringDemo4 {
    public static void main(String[] args) {
        String line = "Hello, I am Santosh lal Karna. I am from Jaleshwor-12, Nepal. I am Java Developer Developer, I also worked as Java Instructor.";

        String[] words = line.split(" ");
        for (String w : words) {
            System.out.println(w);
        }


        String s2 = "hi";
        if (s2.matches("[H|h]ello|[H|h]i")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
