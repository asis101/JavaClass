package day10;

//Contructor overloading
public class Student {

    String name;
    int roll;

    public Student() {
        System.out.println("default contructor called");
    }

    public Student(String n, int r) {
        name = n;
        roll = r;
        System.out.println("arg contructor called");
    }

    public Student(String n) {
        name = n;
    }
    public  Student(int r) {
        roll = r;
    }

    public Student(int r, String n) {
        roll = r;
        name = n;
    }

    public void displayStudentInfo() {
        System.out.println("Student name is: " + name);
        System.out.println("Student roll is: " + roll);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.displayStudentInfo();

        Student student2 = new Student("Ram", 11);
        student2.displayStudentInfo();
    }
}
