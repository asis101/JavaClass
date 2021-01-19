package day17;

import java.util.Scanner;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number1:");
        int a = input.nextInt();
        System.out.println("enter number2:");
        int b = input.nextInt();

        try {
            System.out.println("try start");
            int div = divide(a, b);
            System.out.println("division is " + div);
            System.out.println("try end");
        } catch (ArithmeticException ae) {
            System.out.println("inside catch block");
        } finally {
            //finally always run
            System.out.println("inside finally block");
            input.close();
        }
        System.out.println("exist");
    }

    public static int divide(int a, int b) {

        return a / b;
    }
}
