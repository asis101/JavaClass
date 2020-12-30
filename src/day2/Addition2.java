package day2;

import java.util.Scanner;

public class Addition2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num1 = input.nextInt();

        System.out.println("Enter another number");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);
        System.out.println("Sum = " + sum);
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
