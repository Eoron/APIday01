package a_objectClass;

public class EqualsDemo {
    public static void main(String[] args) {
        ZiEquals z1 = new ZiEquals("小明",21);
        ZiEquals z2 = new ZiEquals("小明", 21);
        // == 比较的是地址值
        System.out.println(z1 == z2);
        System.out.println(z1.equals(z2));

        //ZitoString z3 = new ZitoString("小明", 21);

        // 1967205423
        System.out.println(z1.hashCode());
        System.out.println(z2.hashCode());

    }
}
