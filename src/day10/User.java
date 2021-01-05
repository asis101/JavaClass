package day10;

public class User {
    String name;
    int age;

    public User(String n, int a) {
        name = n;
        age = a;
        System.out.println("constructor called");
    }

    public void assignInfo(String n, int a){
        name = n;
        age = a;
        System.out.println("assign info called");
    }

    public void displayInfo() {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }


    public static void main(String[] args) {
        User user1 = new User("Ram", 23);
        user1.displayInfo();
        System.out.println("================");
        User user2 = new User("sita", 21);
        user2.displayInfo();

        user2.assignInfo("shyam", 11);
        user2.assignInfo("hari", 22);
        user2.assignInfo("don", 33);
    }
}

//Constructor: is a special function which has folling features:
//1. it's name is same as class name
//2. it has no return type
//3. we can not use 'void' keyword too
//4. it is mainly used to initialize the member's data
//5. it runs only once for each object
//6. it can have any access modifier
