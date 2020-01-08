package DateDemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Year;
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
        calendar.set(Calendar.YEAR,2023);

        Date date1 = calendar.getTime();//获取毫秒时刻
        System.out.println(date1);

        calendar.add(Calendar.YEAR,2);
        int year = calendar.get(Calendar.YEAR);

        System.out.println(year);

        //获取当前系统时间
        long starttime = System.currentTimeMillis();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
        Date date2 = new Date();
        System.out.println("当前执行时间是"+ starttime);
        int sum = 0;
        try{
            for (int i =1 ;i<100;i++){
                 sum += i;
            }
        }catch (Exception e){
            System.out.println(e);
        }

        long endtime = System.currentTimeMillis();
        System.out.println("最后执行时间"+ endtime);
        System.out.println("运行时间"+ (endtime-starttime) + "毫秒");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hello").append("world").append(false).append(1000);

        System.out.println(stringBuilder.toString());

        int num2 = Integer.parseInt("100129");
        System.out.println(num2);
    }
}
