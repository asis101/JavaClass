package day6;

import javax.swing.*;

public class SwitchDemo3 {
    public static void main(String[] args) {
        String choice = JOptionPane.showInputDialog("enter your choice");

        switch (choice) {

            case "add":
                System.out.println("addition");
                break;
            case "sub":
                System.out.println("subtraction");
                break;
            case "mul":
                System.out.println("multiplication");
                break;
            case "div":
                System.out.println("division");
                break;
            default:
                System.out.println("wrong choice");
                break;
        }
        System.out.println("exist");
    }
}
