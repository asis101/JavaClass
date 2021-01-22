package day20;

import java.io.*;

public class FileDemo5 {
    public static void main(String[] args) {

        String readFilePath = "C:/Users/Aarty/Desktop/test.txt";
        String writeFilePath = "C:/Users/Aarty/Desktop/demo/demo3.txt";
        try (
                FileReader fr = new FileReader(readFilePath);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(writeFilePath);
                BufferedWriter bw = new BufferedWriter(fw);
        ) {
            String len;
            while ((len = br.readLine()) != null) {
                System.out.println(len);
                bw.write(len);
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
