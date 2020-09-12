package com.hef.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * @author lifei
 * @since 2020/8/29
 */
public class AddGroups {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(16,17,18,19,20);
//        list.add(21); // Runtime error because the underlying array cannot be resized
        System.out.println(list);

        List<Integer> oneList = new ArrayList<>(list);
        List<Integer> subList = oneList.subList(0, 3);
        System.out.println(subList);
//        subList.add(23);
        subList.set(0, 11);
        System.out.println(subList);
        System.out.println(list);

        Integer[] array = oneList.toArray(new Integer[7]);
        System.out.println(Arrays.toString(array));

        ListIterator<Integer> integerListIterator = list.listIterator(3);
        while (integerListIterator.hasNext()){
            System.out.print(integerListIterator.next() + ", ");
        }
        System.out.println();

    }
}
