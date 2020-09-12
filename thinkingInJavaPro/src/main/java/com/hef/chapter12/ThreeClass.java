package com.hef.chapter12;

/**
 * @author lifei
 * @since 2020/9/3
 */
public class ThreeClass extends OneClass{

    public void run() throws ThreeException {
        throw new ThreeException();
    }
}
