package day20;

public class ThreadDemo2 implements Runnable {

    @Override
    public void run() {
        System.out.println("hello from thread...");
    }

    public static void main(String[] args) {
        ThreadDemo2 th = new ThreadDemo2();
        Thread t = new Thread(th);
        t.start();
    }
}
