package com.yu.stack;

import com.yu.Array;

import java.util.StringJoiner;

/**
 * @Author yu
 * @DateTime 2021/5/13 20:25
 */
public class ArrayStack<E> implements Stack<E> {

    private Array<E> array;

    public ArrayStack(int capacity) {
        this.array = new Array<>(capacity);
    }

    public ArrayStack() {
        this.array = new Array<>();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ", "Stack: [", "] top");
        int size = array.getSize();
        for (int i = 0; i < size; i++) {
            sj.add(array.get(i).toString());
        }
        return sj.toString();
    }
}
