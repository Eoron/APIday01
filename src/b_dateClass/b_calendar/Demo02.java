package b_dateClass.b_calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    时间的格式化

 */
public class Demo02 {
    //向方法中抛出转换异常
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy-MM-dd");

        /*
            format() -> Date 转换成 String 输出
            parse() -> String 转换成 Date
                Date -> Calendar
         */
        Date date = new Date();
        System.out.println(date);
        String s = sdf.format(date);
        System.out.println(s);

        String str ="2021-11-11 11:11:11";
        /*try {
            sdf.parse(str);
        } catch (ParseException e) {//捕抓异常
            e.printStackTrace();
        }*/
        Date d = sdf.parse(str);
        System.out.println(d);

    }
}
