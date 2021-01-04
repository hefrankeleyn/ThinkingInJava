package com.hef.chapter15.generics;

/**
 * @author lifei
 * @since 2020/9/14
 */
class SelfBounded<T extends SelfBounded<T>>{
    T element;
    SelfBounded<T> set(T arg){
        element = arg;
        return this;
    }
    T get(){return element;}
}
class A extends SelfBounded<A>{}
class B extends SelfBounded<A>{}
class C extends SelfBounded<C>{}
class D {}
//class E extends SelfBounded<D>{}

class F extends SelfBounded{}


public class SelfBounding {
}
