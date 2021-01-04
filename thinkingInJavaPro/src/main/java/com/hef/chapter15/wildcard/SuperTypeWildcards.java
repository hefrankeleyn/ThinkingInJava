package com.hef.chapter15.wildcard;

import java.util.List;

/**
 * @author lifei
 * @since 2020/9/13
 */
public class SuperTypeWildcards {

    static void writeTo(List<? super Apple> apples){
        apples.add(new Apple());
        apples.add(new Jonathan());
//        apples.add(new Fruit());
        //  类型信息会丢失
        Object object = apples.get(0);
    }
}
