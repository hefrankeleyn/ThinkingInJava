package com.hef.chapter5;

import java.util.Arrays;

/**
 * @author lifei
 * @since 2020/8/20
 */
public class ReArrayParam {

    public void f(Integer...params){
        System.out.println(Arrays.toString(params));
    }

    public void f(Long... params){
        System.out.println(Arrays.toString(params));
    }

    public static void main(String[] args) {
//        f();
    }
}
