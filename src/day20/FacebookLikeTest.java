package day20;

public class FacebookLikeTest {
    public static void main(String[] args) {
        FacebookLite fb = new FacebookLite(500);

        Thread user1 = new Thread(new Runnable() {
            @Override
            public void run() {
                fb.incrementLikes();
            }
        });

        Thread user2 = new Thread(new Runnable() {
            @Override
            public void run() {
                fb.incrementLikes();
            }
        });

        Thread user3 = new Thread(new Runnable() {
            @Override
            public void run() {
                fb.incrementLikes();
            }
        });

        Thread user4 = new Thread(new Runnable() {
            @Override
            public void run() {
                fb.incrementLikes();
            }
        });

        user1.start();
        user2.start();
        user3.start();
        user4.start();
    }
}
