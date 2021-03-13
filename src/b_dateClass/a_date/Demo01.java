package b_dateClass.a_date;


import java.util.Date;

public class Demo01 {
    public static void main(String[] args) {
        //获取当前系统时间
        long time = System.currentTimeMillis();
        System.out.println(time);

        //Date -> 专门用来显示时间的类
        //获得当前系统时间
        Date date = new Date();
        //Sat Mar 13 11:07:42 CST 2021
        System.out.println(date);

        //Date(long)
        Date date2 = new Date(time);
        System.out.println(date2);

        // int类型超出范围得到的是一个 负数
        //所以计算前必须将所有的类型进行统一 -> long类型
        Date date1 = new Date(0l + 30l*60*60*60*1000);
        System.out.println(date1);



    }
}
