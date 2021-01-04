package com.hef.chapter15.generics;

/**
 * @author lifei
 * @since 2020/9/14
 */
class GenericType<T>{}
// 古怪的循环： 类相当古怪地出现在它自己地基类中
public class CuriouslyRecurringGeneric extends GenericType<CuriouslyRecurringGeneric>{}
