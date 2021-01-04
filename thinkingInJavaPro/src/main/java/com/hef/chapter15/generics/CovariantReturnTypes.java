package com.hef.chapter15.generics;

/**
 * @author lifei
 * @since 2020/9/14
 */
class Base{}
class Derived extends Base{}
interface OrdinaryGetter{
    Base get();
}
interface DerivedGetter extends OrdinaryGetter{
    // 覆盖的方法允许返回类型不同
    @Override
    Derived get();
}
public class CovariantReturnTypes {
    void test(DerivedGetter d){
        Derived d2 = d.get();
    }
}
