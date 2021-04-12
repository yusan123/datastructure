package com.yu;

import java.util.StringJoiner;

/**
 * @Author yu
 * @DateTime 2021/4/7 21:21
 */
public class Array<E> {

    private E[] data;
    private int size;

    public Array(int capacity) {
        this.data = (E[]) new Object[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    public boolean contains(E e) {
        for (E d : data) {
            if (e == d) {
                return true;
            }
        }
        return false;
    }

    // 返回第一个e元素的索引
    public int indexOfFirst(E e) {
        for (int i = 0; i < data.length; i++) {
            if (e == data[i]) {
                return i;
            }
        }
        return -1;
    }

    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index is illegal.");
        }
        E remove = data[index];
        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }
        size--;
        data[size] = null;
        if (size == data.length / 4 && data.length / 2 != 0) {
            resize(data.length / 2);
        }
        return remove;
    }

    public E removeFirst() {
        return remove(0);
    }

    public E removeLast() {
        return remove(size - 1);
    }

    // 删除第一个值为e的元素
    public void removeElement(E e) {
        int i = indexOfFirst(e);
        if (i != -1) {
            remove(i);
        }
    }

    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index is illegal.");
        }
        // 如果数组满了则自动扩容
        if (size == data.length) {
            resize(data.length * 2);
        }
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = e;
        size++;
    }

    private void resize(int newSize) {
        E[] newData = (E[]) new Object[newSize];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public void addLast(E e) {
        add(size, e);
    }

    public void addFirst(E e) {
        add(0, e);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        System.out.println(String.format("Array: size=%d,capacity=%d", size, data.length));
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < size; i++) {
            sj.add(String.valueOf(data[i]));
        }
        return sj.toString();
    }
}
