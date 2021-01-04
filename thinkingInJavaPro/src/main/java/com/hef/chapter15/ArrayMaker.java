package com.hef.chapter15;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author lifei
 * @since 2021/1/4
 */
public class ArrayMaker<T> {

    private Class<T> kind;
    public ArrayMaker(Class<T> kind){
        this.kind = kind;
    }
    public T[] create(int size){
        return (T[]) Array.newInstance(kind, size);
    }

    public static void main(String[] args) {
        ArrayMaker<Integer> am = new ArrayMaker<>(Integer.class);
        Integer[] ri = am.create(3);
        System.out.println(Arrays.toString(ri));
    }
}
