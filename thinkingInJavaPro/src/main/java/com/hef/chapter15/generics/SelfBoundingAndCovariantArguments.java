package com.hef.chapter15.generics;

/**
 * @author lifei
 * @since 2020/9/14
 */
interface SelfBoundingSetter<T extends SelfBoundingSetter<T>>{
    void set(T arg);
}
interface Setter extends SelfBoundingSetter<Setter>{}
public class SelfBoundingAndCovariantArguments {
    void testA(Setter s1, Setter s2, SelfBoundingSetter sbs){
        s1.set(s2);
        /**
         * 下面这个调用会报编译错误
         * 编译期不能识别将基类当作参数传递给set()的尝试，因为没有任何方法具有这样的签名
         * 实际上，这个参数已经被覆盖
         * */
//        s1.set(sbs);
    }
}
