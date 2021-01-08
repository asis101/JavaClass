package day13;

//composition
public class Car {

    Engine engine;

    public Car() {
        engine = new Engine();
    }

    public void start() {
        engine.move();
        System.out.println("car starts");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
