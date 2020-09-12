package com.hef.chapter15.cachu;

/**
 * @author lifei
 * @since 2020/9/12
 */

class Employee{}

public class ClassAsFactory<T> {
    T x;
    public ClassAsFactory(Class<T> kind){
        try {
            x = kind.newInstance();
        } catch (InstantiationException|IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ClassAsFactory<Employee> fe = new ClassAsFactory<>(Employee.class);
        System.out.println("ClassAsFactory<Employee> succeed");
        try {
            // Integer 没有默认对构造器， 因此会失败
            ClassAsFactory<Integer> fi = new ClassAsFactory<>(Integer.class);
        }catch (Exception e){
            System.out.println("ClassAsFactory<Integer> failed");
        }
    }
}
