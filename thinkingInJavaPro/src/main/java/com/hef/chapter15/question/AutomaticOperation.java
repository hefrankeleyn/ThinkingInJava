package com.hef.chapter15.question;

import java.util.Arrays;

/**
 * @author lifei
 * @since 2020/9/14
 */
class FArray{
    public static <T> T[] fill(T[] a, Generator<T> gen){
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.next();
        }
        return a;
    }
}
interface Generator<T>{
    T next();
}
public class AutomaticOperation {

    public static void main(String[] args) {
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Integer(i);

        }
        System.out.println(Arrays.toString(array));

        Generator<Integer> generator = new Generator<Integer>() {
            @Override
            public Integer next() {
                return 0;
            }
        };

//        FArray.fill(new int[5], generator);
    }
}
