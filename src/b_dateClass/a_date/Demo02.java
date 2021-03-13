package b_dateClass.a_date;

import java.util.Date;

/*
    从当前日期往后推算5天,问7天后是星期几
 */
public class Demo02 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        //getTime() / setTime()
        long l1 = date.getTime();
        l1 = l1 + 5l*24*60*60*1000;
        //设置时间
        date.setTime(l1);
        System.out.println(date);
        //long l2 = System.currentTimeMillis();


    }

}
