package day20;

import java.io.*;

public class FileDemo4 {
    public static void main(String[] args) {

        String readFilePath = "C:/Users/Aarty/Desktop/test.txt";
        String writeFilePath = "C:/Users/Aarty/Desktop/demo/demo2.txt";
        try (
                FileReader in = new FileReader(readFilePath);
                FileWriter out = new FileWriter(writeFilePath);
        ) {
            int len;
            while ((len = in.read()) != -1) {
                System.out.println(len);
                out.write(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
