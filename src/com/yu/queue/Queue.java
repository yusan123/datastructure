package com.yu.queue;

/**
 * @Author yu
 * @DateTime 2021/5/13 21:28
 */
public interface Queue<E> {
    void enqueue(E e);

    E dequeue();

    E getFront();

    int getSize();

    boolean isEmpty();
}
