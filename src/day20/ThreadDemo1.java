package day20;

public class ThreadDemo1 extends Thread {

    @Override
    public void run() {
        System.out.println("hello from thread...");
    }

    public static void main(String[] args) {
       ThreadDemo1 t = new ThreadDemo1();
       t.start();
    }
}
