package day6;

public class NestedIfElseDemo {
    public static void main(String[] args) {
        int a = 55;
        int b =99;
        int c = 77;

        if (a > b)  {
            if (a > c) {
                System.out.println("a is the greatest one");
            } else {
                System.out.println("c is greater than a");
            }
        } else {
            System.out.println("a is smaller than b but smaller or greater than c");
        }
    }
}
