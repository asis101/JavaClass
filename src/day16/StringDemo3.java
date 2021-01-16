package day16;

public class StringDemo3 {
    public static void main(String[] args) {
        String s1 = "Good Morning";
        System.out.println(s1);

        System.out.println(s1.substring(5));//Morning
        System.out.println(s1.substring(0,4));//Good
        System.out.println(s1.substring(0));

        System.out.println(s1.length());

        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        System.out.println(s1.charAt(5));
        System.out.println(s1.indexOf("M"));

        System.out.println(s1.replace("Morning", "Evening"));

        System.out.println(s1.isEmpty());

        char[] ch = s1.toCharArray();
        System.out.println(ch[0]);

        System.out.println(s1.contains("Good"));

        System.out.println("Hello, ".concat(s1));

        String s2 = " Santos Lal Karna ";
        System.out.println(s2);
        System.out.println(s2.trim());
    }
}
