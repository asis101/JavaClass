package day17;

import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        int[] ar = new int[2];
        System.out.println(ar[2]);

        String n = "aa";
        int i = Integer.parseInt(n);
        System.out.println(i);

        String s = null;
        System.out.println(s.concat(" helloo"));

        Scanner input = new Scanner(System.in);
        System.out.println("enter number1:");
        int a = input.nextInt();
        System.out.println("enter number2:");
        int b = input.nextInt();

        int div = a / b;
        System.out.println("division is: " + div);

    }
}
//try   => block {}
//catch => block
//finally   => block
//throw => statement
//throws => clause