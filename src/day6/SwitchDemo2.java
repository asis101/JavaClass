package day6;

import javax.swing.*;

public class SwitchDemo2 {
    public static void main(String[] args) {

        char choice = JOptionPane.showInputDialog("enter your choice").charAt(0);

        switch (choice) {

            case '+':
                System.out.println("addition");
                break;
            case '-':
                System.out.println("subtraction");
                break;
            case '*':
                System.out.println("multiplication");
                break;
            case '/':
                System.out.println("division");
                break;
            default:
                System.out.println("wrong choice");
                break;
        }
        System.out.println("exist");
    }
}
