package day4;

public class LiteralsDemo {
    public static void main(String[] args) {
        //literals: fixed value + data type

        //1. Integer Literals 234 5656 7879879
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l1 = 2147483647;
        long l2 = 2147483648L;
        long l3 = 9223372036854775807L;

        //2. Float Literals 34.67 78.09 (double)
        float f = 12.67F;
        double d = 23.45;

        //3. Boolean Literals
        boolean b1 = true;
        boolean b2 = false;

        //4.Charater Literals
        char c1 = 'a';
        char c2 = '1';
        char c3 = '?';
        char c4 = '\u0000';

        //5. String Literals
        String s1 = "a";
        String s2 = "Nepal";
        String s3 = "abc@123";
        String s4 = "I am ashish shrestha. I am from kathmandu.";
        String s5 = "";
        String s6 = " ";
        String s7 = "123";
        String s8 = "23.45";
        String s9 = "true";

        //6. Null Literals
        String s10 = null;
        LiteralsDemo ob = new LiteralsDemo();  // This is object in Java
        LiteralsDemo obj = null;
    }
}
