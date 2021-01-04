package com.hef.chapter15;

/**
 * @author lifei
 * @since 2021/1/4
 */
public abstract class GenericWithCreate<T> {

    final T element;
    public GenericWithCreate(){
        element = create();
    }
    public abstract T create();
}
