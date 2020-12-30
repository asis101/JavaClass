package day4;

public class ImplicitTypeCasting {
    public static void main(String[] args) {
        //implicit type casting
        byte b = 127;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
}
