package day13;

public class ParentTest {

    public static void main(String[] args) {

        Child c1 = new Child();
        c1.sayHello();

        System.out.println("=========");

        Child c2 = new Child(3);
        c2.sayHello();

        System.out.println("============");

        //Implicit type casting
        Parent c3 = new Child(3);
        c3.sayHello();

        System.out.println("===========");

//        Child c4 = new Parent(); // not allowed
        //Explicit type casting
        Parent p = new Parent();
        Child cc = (Child) p;
    }
}
