package day13;

public class Child extends Parent {

    public Child() {
//        super();//by defualt by constructor
        System.out.println("child's default constructor");
    }

    public Child(int a) {
        super(4);//to call parent's arg constructor explicitly
        System.out.println("child's arg constructor");
    }

    String name = "hello i am child";

    public void sayHello() {
        System.out.println(name);//gives child name
        System.out.println(super.name);//gives parent name
        System.out.println("hello from child");
        super.sayHello();//calls parent method
    }

}
