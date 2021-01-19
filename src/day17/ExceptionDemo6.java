package day17;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        vote(2);
        System.out.println("exist");
    }

    public static void vote(int age) {
        if (age >= 18) {
            System.out.println("you are eligible to vote");
        } else {
            throw new InvalidAgeException("you are not eligible to vote");
        }
    }

}
