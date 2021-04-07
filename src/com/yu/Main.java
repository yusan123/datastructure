package com.yu;

public class Main {

    public static void main(String[] args) {
        Array<String> sa = new Array<>(5);

        System.out.println(sa);

        sa.addLast("a");
        sa.addLast("b");
        sa.addLast("c");
        sa.addLast("d");
        System.out.println(sa);

        boolean c = sa.contains("c");
        System.out.println(c);
        sa.removeElement("b");
        System.out.println(sa);
    }
}
