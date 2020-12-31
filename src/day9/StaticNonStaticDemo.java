package day9;

public class StaticNonStaticDemo {

    String nonStaticVar = "this is non-static variable";
    static String staticVar = "this is static varaiable";

    public void nonStaticMethod() {
        System.out.println("this is non-static method");
    }
    public static void staticMethod() {
        System.out.println("this is static method");
    }

    public static void main(String[] args) {
        StaticNonStaticDemo ob = new StaticNonStaticDemo();
        ob.nonStaticMethod();
        System.out.println(ob.nonStaticVar);

        StaticNonStaticDemo.staticMethod();
        System.out.println(StaticNonStaticDemo.staticVar);

        //bad pratise
        staticMethod();
        System.out.println(staticVar);
    }
}
