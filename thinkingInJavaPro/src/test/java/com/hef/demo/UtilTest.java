package com.hef.demo;

import org.junit.Test;

/**
 * @author lifei
 * @since 2020/9/10
 */
public class UtilTest {

    @Test
    public void test01(){
        String s = "aa";
        s.toCharArray();
        int i = s.indexOf("");
        System.out.println(i);
    }
}
