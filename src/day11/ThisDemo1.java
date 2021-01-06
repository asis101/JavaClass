package day11;

//shadowing: is the process of hiding instance variable by local variable
//inside non-static method or constructor of a class

//this: is a keyword and is an implicit reference variable
//of current type and current object
//and is available inside non-static method or constructor of a class
public class ThisDemo1 {
    //instance (or non-static) variable(properties, data, attributes, member's data)
    int a = 5;

    public void dispaly() {
        System.out.println("this is:" + this);
        System.out.println(a);
        //local variable
        int a = 6;
        System.out.println(a);
        int sum = a + a;//6+6
        System.out.println(sum);

         sum = a + this.a; //6+5
        System.out.println(sum);
    }

    public static void main(String[] args) {
        ThisDemo1 ob1 = new ThisDemo1();
        System.out.println("ob1 is: " + ob1);
        ob1.dispaly();

        System.out.println("==============");
        ThisDemo1 ob2 = new ThisDemo1();
        System.out.println("ob2 is: " + ob2);
        ob2.dispaly();
    }
}
