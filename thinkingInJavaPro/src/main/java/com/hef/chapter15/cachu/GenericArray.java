package com.hef.chapter15.cachu;


/**
 * @author lifei
 * @since 2020/9/12
 */
public class GenericArray<T> {
    private T[] array;

    public GenericArray(int sz){
        array = (T[]) new Object[sz];
    }

    public T get(int index){
        return array[index];
    }
    public T[] rep(){
        return array;
    }

    public static void main(String[] args) {
        GenericArray<Integer> gai = new GenericArray<>(10);
        // java.lang.ClassCastException,因为实际运行的类型是Object[]
//        Integer[] ia = gai.rep();
        Integer oneV = gai.get(0);
        System.out.println(oneV);
    }
}
