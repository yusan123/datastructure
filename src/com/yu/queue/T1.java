package com.yu.queue;

/**
 * @Author yu
 * @DateTime 2021/5/13 21:41
 */
public class T1 {

    public static void main(String[] args) {

        ArrayQueue<Integer> queue = new ArrayQueue<>();

        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            if (i % 3 == 2) {
                queue.dequeue();
            }
            System.out.println(queue);
        }

    }
}
