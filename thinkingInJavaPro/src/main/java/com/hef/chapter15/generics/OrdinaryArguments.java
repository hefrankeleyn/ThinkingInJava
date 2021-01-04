package com.hef.chapter15.generics;

/**
 * @author lifei
 * @since 2020/9/14
 */
class OrdinarySetter{
    void set(Base base){
        System.out.println("OrdinarySetter.set(base)");
    }
}
class DerivedSetter extends OrdinarySetter{
    void set(Derived derived){
        System.out.println("DerivedSetter.set(derived)");
    }
}
public class OrdinaryArguments {
    public static void main(String[] args) {
        Base base = new Base();
        Derived derived = new Derived();
        DerivedSetter ds = new DerivedSetter();
        ds.set(derived);
        ds.set(base);
    }
}
