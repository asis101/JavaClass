package other;

import day15.AccessModifierDemo;

public class AccessModifierChild extends AccessModifierDemo {
    public static void main(String[] args) {
        AccessModifierDemo ob = new AccessModifierDemo();
        ob.publicMethod();
//        ob.protectedMethod();
//        ob.defaultMethod();
//        ob.privateMethod();

        AccessModifierChild child = new AccessModifierChild();
        child.protectedMethod();
    }
}
