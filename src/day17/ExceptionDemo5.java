package day17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        int[] ar = new int[2];

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("enter number1:");
            int a = input.nextInt();
            System.out.println("enter number2:");
            int b = input.nextInt();

            ar[2] = divide(a, b);
            System.out.println("division is " + ar[2]);
        } catch (ArithmeticException | InputMismatchException ae) {
            System.out.println("exception is: " + ae);
        }catch (Exception e) {
            System.out.println("exception is: " + e);
        }


        System.out.println("exist");
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
