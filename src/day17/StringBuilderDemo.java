package day17;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String s1 = "Good";
        System.out.println(s1);
        s1.concat(" Morning");
        System.out.println(s1);
        System.out.println("======================");

        StringBuilder sb = new StringBuilder("Good");
        System.out.println(sb);
        sb.append(" Evening");
        System.out.println(sb);
        System.out.println("======================");

        StringBuffer sbf = new StringBuffer("Good");
        System.out.println(sbf);
        sbf.append(" Morning");
        System.out.println(sbf);
        System.out.println("======================");
    }
}
