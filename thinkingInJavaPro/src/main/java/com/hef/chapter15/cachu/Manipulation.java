package com.hef.chapter15.cachu;

/**
 * @author lifei
 * @since 2020/9/12
 */
public class Manipulation {
}

class Manipulator<T extends HasF>{
    private T t;
    public Manipulator(T t){
        this.t = t;
    }
    public void manipulate(){
        t.f();
    }
}

// 可以自行擦除，创建出没有泛型的类
class Manipulator2{
    private HasF obj;
    public void manipulate(){
        obj.f();
    }
}

class Manipulator3<T extends HasF>{
    private T t;
    public Manipulator3(T t){
        this.t = t;
    }
    public T getT(){
        return t;
    }
}