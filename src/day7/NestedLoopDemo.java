package day7;

public class NestedLoopDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j =1; j <= 3; j++){
                System.out.println(i + " " + j + "");
            }
            System.out.println();
        }
        System.out.println("exist");
    }
}
