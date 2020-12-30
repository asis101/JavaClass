package day8;

import javax.swing.*;

public class MethodDemo1 {
    public void greet() {
        System.out.println("hello");
        System.out.println("Good Morning.");
    }
    //method declaration
    public void displayInfo(String name, int age, String address){
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Address is: " + address);
    }
    //method declaration
    public static void main(String[] args) {
        System.out.println("main start");
        MethodDemo1 ob = new MethodDemo1();

        //method calling
        ob.greet();

        String name = JOptionPane.showInputDialog("Enter name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age"));
        String address = JOptionPane.showInputDialog("Enter address");

        //method calling
        ob.displayInfo(name, age, address);
        System.out.println("main end");
    }
}
