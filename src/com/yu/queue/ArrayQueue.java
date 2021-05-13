package com.yu.queue;

import com.yu.Array;

import java.util.StringJoiner;

/**
 * @Author yu
 * @DateTime 2021/5/13 21:30
 */
public class ArrayQueue<E> implements Queue<E> {

    private Array<E> array;

    public ArrayQueue(int capacity) {
        this.array = new Array(capacity);
    }

    public ArrayQueue() {
        this.array = new Array();
    }

    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return array.getFirst();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ", "Queue: front[", "]tail");
        int size = array.getSize();
        for (int i = 0; i < size; i++) {
            sj.add(array.get(i).toString());
        }
        return sj.toString();
    }
}
