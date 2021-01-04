package com.hef.chapter15;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lifei
 * @since 2020/9/14
 */
interface Payable<T>{}
//class Employee implements Payable<Employee>{}
//class Hourly extends Employee implements Payable<Hourly>{}

class Employee implements Payable{}
class Hourly extends Employee implements Payable{}
public class MultipleInterfaceVariants {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        list.add("aaa");
        List<String> res = List.class.cast(list);
        System.out.println(res.toString());
    }

}
