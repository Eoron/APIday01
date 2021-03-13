package a_objectClass;

import java.util.Objects;

public class ZiEquals {
    private String name;
    private int age;

    public ZiEquals() {
    }

    public ZiEquals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ZiEquals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

   /* public boolean equals(Object obj){
        //1.判断是不是同一个对象
        if(this == obj){
            return true;
        }
        //2.判断是不是同一个类型 - instanceof
        if(obj instanceof ZiEquals){
            //如果是,就进行强转
            ZiEquals zi = (ZiEquals)obj;
            return this.age == zi.age && this.name.equals(zi.name);
        }
        //3.不是同类型,也不是同一个对象
        return false;
    }*/

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ZiEquals ziEquals = (ZiEquals) object;
        return age == ziEquals.age &&
                Objects.equals(name, ziEquals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
