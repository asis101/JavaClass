package day19;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) {
        String filepath = "C:/Users/Aarty/Desktop/hello.text";
        File file = new File(filepath);

        try {
            if (file.createNewFile()) {
                System.out.println("file created");
            } else {
                System.out.println("file already exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("==========");
        filepath = "C:/Users/Aarty/Desktop/hello";
        File f = new File(filepath);
        f.mkdir();
    }
}
