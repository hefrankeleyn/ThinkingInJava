package com.hef.chapter11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @author lifei
 * @since 2020/8/29
 */
public class QueueTest {

    public static void main(String[] args) {
        Random random = new Random(47);
        Queue<String> queue = new LinkedList<>();
        queue.offer("aaa");
        queue.offer("bbb");
        queue.offer("ccc");
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
    }
}
