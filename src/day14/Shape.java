package day14;

public abstract class Shape {

    public abstract void draw();

    public void paint() {
        System.out.println("shape is painted...");
    }

    public Shape() {
        System.out.println("shape's constructor ...");
    }
}


//abstract class cant have final
//abstract class cant have its object
//abstract method cant be private, final and static