package com.hef.chapter11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author lifei
 * @since 2020/8/29
 */
public class AsListTest {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{23,11, 10, 9, 35};
        List<Integer> list01 = Arrays.asList(array);
        System.out.println(Arrays.toString(array));
        System.out.println(list01);
        Collections.shuffle(list01);
        System.out.println(list01);
        System.out.println(Arrays.toString(array));
    }
}
