package day5;

import javax.swing.*;

public class Question11b {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter a:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter b:"));

        System.out.println("Before swapping a and b is: " + a + " and " + b);

        a = a + b;//10+5=15
        b = a - b;//15-5=10
        a = a - b;//15-10=5

        System.out.println("After swapping a and b is: " + a + " and " + b);

    }
}
