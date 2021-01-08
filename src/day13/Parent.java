package day13;

public class Parent {

    public Parent() {
        System.out.println("parent's default constructor");
    }
    public Parent(int a) {
        System.out.println("parent's arg constructor");
    }

    String name = "Hello, i am parent";

    public void sayHello() {
        System.out.println("hello from parent");
    }
}

//parent members
//hidden variable
//overridden method