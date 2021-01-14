package day14;

public class Addition {

    public void sum() {
        int a = 5;
        int b = 6;
        int add = a + b;
        System.out.println("1. Sum is : " + add);
    }

    public void sum(int a, int b) {
        int add = a + b;
        System.out.println("2. Sum is : " + add);
    }

    public void sum(double a, double b) {
        double add = a + b;
        System.out.println("3. Sum is : " + add);
    }

    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.sum();
        obj.sum(3, 4);
        obj.sum(4.5, 7.9);
    }
}
