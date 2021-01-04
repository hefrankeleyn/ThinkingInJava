package com.hef.chapter15.generics;

/**
 * @author lifei
 * @since 2020/9/14
 */
interface GenericGetter<T extends GenericGetter<T>>{
    T get();
}
interface Getter extends GenericGetter<Getter>{ }
public class GenericsAndReturnTypes {
    void test(Getter g){
        Getter result = g.get();
        GenericGetter gg = g.get();
    }
}
