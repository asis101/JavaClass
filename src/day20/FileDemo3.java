package day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) {

        String readFilePath = "C:/Users/Aarty/Desktop/test.txt";
        String writeFilePath = "C:/Users/Aarty/Desktop/demo/demo1.txt";
        try (
                FileInputStream in = new FileInputStream(readFilePath);
                FileOutputStream out = new FileOutputStream(writeFilePath);
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
