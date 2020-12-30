package day4;

public class OperatorsDemo1 {
    public static void main(String[] args) {
        //1. Arithmetic Operator + - * % /
        //Priority + - (low)  / * (high)
        //Associativity: Left to Right

        int a = 4 + 5 - 7 % 2 - 7 / 2 + 2 * 3;
        System.out.println(a);

        //2. Assignment Operator = += -= /= *= %=
        // Right to Left
        int i = 6;
        System.out.println(i);
        i += 3; //i = i+3;
        System.out.println(i);
    }
}
