package com.hef.chapter15.wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lifei
 * @since 2020/9/13
 */
class Fruit{}
class Apple extends Fruit{}
class Jonathan extends Apple{}
class Orange extends Fruit{}
public class GenericsAndCovariance {

    public static void main(String[] args) {
        List<? extends Fruit> flist = new ArrayList<>();
        // 编译错误： 不能添加任何类型的对象
//        flist.add(new Apple());
//        flist.add(new Fruit());
//        flist.add(new Object());
        // 合法的，但没有意义
        flist.add(null);
        // 至少返回的是fruit
        Fruit fruit = flist.get(0);
    }
}
