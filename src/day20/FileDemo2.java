package day20;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo2 {
    public static void main(String[] args) {
        String filepath = "C:/Users/Aarty/Desktop/hello.text";
        File file = new File(filepath);
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.getFreeSpace());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(file.canRead());
        file.setWritable(false);
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a").format(file.lastModified()));

        filepath = "C:/Users/Aarty/Desktop/hello/hi.txt";
        File f = new File(filepath);
        file.renameTo(f);
        f.delete();

    }
}
