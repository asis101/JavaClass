package day18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo8 {

    public static void main(String[] args) {
        convertDateToString();
        try {
            convertStringToDate();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void convertDateToString() {
        Date currentDate = new Date();
        System.out.println(currentDate);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        String date = sdf.format(currentDate);
        System.out.println(date);
    }

    public static void convertStringToDate() throws ParseException {
        String date = "2011-01-23";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date newDate = sdf.parse(date);
        System.out.println(newDate);
    }
}
