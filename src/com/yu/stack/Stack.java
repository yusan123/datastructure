package com.yu.stack;

/**
 * @Author yu
 * @DateTime 2021/5/13 20:23
 */
public interface Stack<E> {
    int getSize();

    boolean isEmpty();

    void push(E e);

    E pop();

    E peek();
}
