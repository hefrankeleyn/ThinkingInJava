package com.hef.chapter15.generics;

/**
 * @author lifei
 * @since 2020/9/14
 */
class Subtype extends BasicHolder<Subtype>{}
public class CRGWithBasicHolder {
    public static void main(String[] args) {
        Subtype st1 = new Subtype(), st2 = new Subtype();
        st1.set(st2);
        Subtype st3 = st1.get();
        st1.f();
    }
}


class Other{}
class BasicOther extends BasicHolder<Other>{}