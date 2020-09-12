package com.hef.chapter15.cachu;

/**
 * @author lifei
 * @since 2020/9/12
 */

class Generic<T>{}
public class ArrayOfGeneric {

    static final int SIZE = 100;
    static Generic<Integer>[] gia;

    public static void main(String[] args) {
        // java.lang.ClassCastException
//        gia = (Generic<Integer>[]) new Object[SIZE];
        gia = (Generic<Integer>[])new Generic[SIZE];
        System.out.println(gia.getClass().getSimpleName());
    }
}
