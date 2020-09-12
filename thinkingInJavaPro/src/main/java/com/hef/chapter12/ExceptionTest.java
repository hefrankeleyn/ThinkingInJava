package com.hef.chapter12;

/**
 * @author lifei
 * @since 2020/9/3
 */
public class ExceptionTest {

    public static void main(String[] args) {
        OneClass currentObj = new ThreeClass();
        try {
            currentObj.run();
        } catch (OneException e) {
            e.printStackTrace();
        }
    }
}


class OneException extends Exception{}

class TwoException extends OneException{}

class ThreeException extends TwoException{}
