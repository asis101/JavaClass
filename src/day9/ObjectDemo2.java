package day9;

import javax.jnlp.IntegrationService;

public class ObjectDemo2 {
    public static void main(String[] args) {
        System.out.println(new ObjectDemo2());

        ObjectDemo2 ob1 = new ObjectDemo2();
        System.out.println(ob1);

        ObjectDemo2 ob2;
        ob2 = new ObjectDemo2();
        System.out.println(ob2);
        System.out.println("day9.ObjectDemo2@" + Integer.toHexString(ob2.hashCode()));
        System.out.println(ob2.getClass().getName() + "@" + Integer.toHexString(ob2.hashCode()));
    }
}
