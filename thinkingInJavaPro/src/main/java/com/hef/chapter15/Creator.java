package com.hef.chapter15;

/**
 * @author lifei
 * @since 2021/1/4
 */
public class Creator extends GenericWithCreate<X>{
    @Override
    public X create() {
        return new X();
    }
    public void f(){
        System.out.println(element.getClass().getSimpleName());
    }
}
