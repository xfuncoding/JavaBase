package DateDemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {
        System.out.println("-----");
        DateFormat dfm = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
        Date date = new Date();

        String str = dfm.format(date);
        System.out.println(str);


        //Calendar日历类，add（） set（）get（）

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);


    }
}
