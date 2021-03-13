package b_dateClass.b_calendar;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;

public class Demo01 {
    public static void main(String[] args) {
        //使用静态方法调用 - 获取当前系统时间
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        /*
            add - 时间的推算
            set - 时间的跳转
            get - 获得时间
            getTime
            setTime
         */
        System.out.println("年:" + cal.get(Calendar.YEAR));
        //月份从0开始计算
        System.out.println("月:" + cal.get(Calendar.MONTH));
        //按国外工作日计算
        System.out.println("星期:" + cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("日" + cal.get(Calendar.DATE));
        System.out.println("时:" + cal.get(Calendar.HOUR));
        System.out.println("分:" + cal.get(Calendar.MINUTE));
        System.out.println("秒:" + cal.get(Calendar.SECOND));

        //从今天起往后往前推算15天
        cal.add(Calendar.DATE,-15);
        cal.add(Calendar.DATE,15);
        System.out.println(cal);

        //Calendar -> Date
        Date time = cal.getTime();
        System.out.println(time);

        //定位到下一周的星期4
        cal.set(Calendar.WEEK_OF_MONTH,1);

        /*
            商品生产日期: 2021年3月13日
            保质期:48天
            过期前的一周周四是促销日,问促销日是那一天
         */
        //获取当前系统时间
        Calendar cal1 = Calendar.getInstance();
        // 到期日
        cal1.add(Calendar.DATE,48);
        cal1.add(Calendar.WEEK_OF_MONTH,-1);
        cal1.set(Calendar.DAY_OF_WEEK,5);
        Date time1 = cal1.getTime();
        System.out.println(time1);


        Date date = new Date(0l);
        Calendar cal3 = Calendar.getInstance();
        cal3.setTime(date);


    }
}
