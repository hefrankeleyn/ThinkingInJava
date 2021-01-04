package com.hef.chapter15.generics;

/**
 * @author lifei
 * @since 2020/9/14
 */
public class BasicHolder<T> {
    T element;
    void set(T arg){element = arg;}
    T get(){return element;}
    void f(){
        System.out.println(element.getClass().getSimpleName());
    }
}
