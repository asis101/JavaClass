package day4;

public class OperatorsDemo2 {
    public static void main(String[] args) {
        //3. Increment/Decrement Operators
        //++ --
        //post pre
        //a++ a-- ++a --a
        int i = 5;
        System.out.println(i);
        i++; //++i;  // i = i+1;
        System.out.println(i);

        int a = 7;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);

        int b = 7;
        System.out.println(b);
        System.out.println(++b);
        System.out.println(b);

        int m = 8;
        int n = m++;
        System.out.println(m);
        System.out.println(n);
    }
}
