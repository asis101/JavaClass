package day15;

public class AccessModifierDemo {

    String defaultVar = "this is default variable";
    public String publicVar = "this is public variable";
    private String privateVar = "this is private variable";
    protected String ptotectedVar = "this is protected variable";

    void defaultMethod() {
        System.out.println("this is default method");
    }

    public void publicMethod() {
        System.out.println("this is public method");
    }

    private void privateMethod() {
        System.out.println("this is private method");
    }

    protected void protectedMethod() {
        System.out.println("this is protected method");
    }

    public AccessModifierDemo() {
        System.out.println("this is public constructor");
    }

    public AccessModifierDemo(int a) {
        System.out.println("this is default constructor");
    }

    private AccessModifierDemo(int a, int b) {
        System.out.println("this is private constructor");
    }

    protected AccessModifierDemo(double a) {
        System.out.println("this is protected constructor");
    }

    public static void main(String[] args) {
        AccessModifierDemo ob = new AccessModifierDemo(4,5);
        ob.publicMethod();
        ob.protectedMethod();
        ob.defaultMethod();
        ob.privateMethod();
    }
}
