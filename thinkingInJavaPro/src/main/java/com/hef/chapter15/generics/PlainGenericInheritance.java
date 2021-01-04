package com.hef.chapter15.generics;

/**
 * @author lifei
 * @since 2020/9/14
 */
class GenericSetter<T> {
    void set(T arg){
        System.out.println("GenericSetter.set(base)");
    }
}
class DerivedGS extends GenericSetter<Base>{
    void set(Derived derived){
        System.out.println("DerivedGS.set()");
    }
}
public class PlainGenericInheritance{
    public static void main(String[] args) {
        Base base = new Base();
        Derived derived = new Derived();
        DerivedGS derivedGS = new DerivedGS();
        derivedGS.set(derived);
        derivedGS.set(base);
    }
}


