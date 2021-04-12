package com.yu;

public class Main {

    public static void main(String[] args) {
        Array<String> sa = new Array<>(5);

        System.out.println(sa);

        sa.addLast("a");
        sa.addLast("b");
        sa.addLast("c");
        sa.addLast("d");
        sa.addLast("e");
        System.out.println(sa);
        sa.addLast("d");
        System.out.println(sa);
        sa.removeFirst();
        System.out.println(sa);

    }
}
