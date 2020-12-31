package day9;

public class StaticNonStaticTest {

    public static void main(String[] args) {
        StaticNonStaticDemo ob = new StaticNonStaticDemo();
        ob.nonStaticMethod();
        System.out.println(ob.nonStaticMethod());

        StaticNonStaticDemo.staticMethod();
        System.out.println(StaticNonStaticDemo.staticVar);

    }
}
