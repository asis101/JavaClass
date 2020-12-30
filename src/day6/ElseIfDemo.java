package day6;

public class ElseIfDemo {
    public static void main(String[] args) {
        int marks = 30;
        if (marks >= 80 && marks <= 100) {
            System.out.println("distintion");
        } else if (marks >= 60 && marks <= 79) {
            System.out.println("first division");
        } else if (marks >= 40 && marks <= 59) {
            System.out.println("second division");
        } else {
            System.out.println("fail");
        }
        System.out.println("exist");
    }
}
