package com.yu;

/**
 * @Author yu
 * @DateTime 2021/4/7 22:30
 */
public class T1 {
    private String name;
    private int age;

    public T1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "T1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Array<T1> t1Array = new Array<>();

        t1Array.addFirst(new T1("zs",20));
        t1Array.addFirst(new T1("ls",30));
        t1Array.addFirst(new T1("ww",18));

        System.out.println(t1Array);
    }
}
