package day20;

public class FacebookLite {

    private int likes;

    public FacebookLite(int likes) {
        this.likes = likes;
    }

    public synchronized void incrementLikes() {
        likes++;
        try {
            Thread.sleep(1500);
            System.out.println(likes);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
