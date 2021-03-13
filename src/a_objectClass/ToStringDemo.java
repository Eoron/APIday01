package a_objectClass;

public class ToStringDemo {
    public static void main(String[] args) {
        ZitoString zi = new ZitoString("小明",21);
        //a_objectClass.a_toString.ZitoString@75412c2f - 哈希值(地址值)
        //@前：a_objectClass.a_toString.ZitoString - 完整类名
        //@后： 75412c2f - 以16进制输出的地址值
        System.out.println(zi);
        System.out.println(zi + "");
        System.out.println(zi.toString());

        String s = "haha";
        System.out.println(s);
    }
}
