package day15;

public class Other {

    public static void main(String[] args) {
        AccessModifierDemo ob = new AccessModifierDemo(4);
        ob.publicMethod();
        ob.protectedMethod();
        ob.defaultMethod();
//        ob.privateMethod();
    }
}
