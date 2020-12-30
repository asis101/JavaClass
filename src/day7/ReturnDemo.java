package day7;

public class ReturnDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3){
                return;
            }
            System.out.println(i);
        }
        System.out.println("exist");
    }
}
