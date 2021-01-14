package day14;

public class Dog extends Demo implements Animal, Breed {

    @Override
    public void makeSound() {
        System.out.println("dog barks...");
    }

    @Override
    public void nameOfDog() {
        System.out.println("German Shepherd");
    }
}
