package day11;

import java.util.Scanner;

public class ArrayDemo1 {

    public static void main(String[] args) {
        //<data type> []  <array name> = new <data type> [size];

        int[] arr = new int[3];
        System.out.println(arr);
        arr[0] = 22;
        arr[1] = 52;
        arr[2] = 42;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        int[] arr1 = new int[3];
        System.out.println(arr1.length);

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("enter");
            arr1[i] = input.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
