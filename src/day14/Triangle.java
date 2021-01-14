package day14;

public class Triangle extends Shape{

    @Override
    public void draw() {
        System.out.println("triangle is drawn...");
    }

    public Triangle() {
        System.out.println("triangle's constructor..");
    }
}
