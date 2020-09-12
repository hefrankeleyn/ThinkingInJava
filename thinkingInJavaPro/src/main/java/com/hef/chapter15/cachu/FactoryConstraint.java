package com.hef.chapter15.cachu;

/**
 * @author lifei
 * @since 2020/9/12
 */
public class FactoryConstraint {
    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<Widget>(new Widget.Factory());
    }
}


interface FactoryI<T>{
    T create();
}

class Foo2<T>{
    private T t;
    public <F extends FactoryI<T>> Foo2(F f){
        t = f.create();
    }
}

class IntegerFactory implements FactoryI<Integer>{
    @Override
    public Integer create() {
        return new Integer(0);
    }
}

class Widget{
    public static class Factory implements FactoryI<Widget>{
        @Override
        public Widget create() {
            return new Widget();
        }
    }
}