package com.hef.chapter12;

/**
 * @author lifei
 * @since 2020/9/3
 */
public class TwoClass extends OneClass{

    public void run() throws TwoException {
        throw new TwoException();
    }
}
