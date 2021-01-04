package com.hef.chapter17.containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author lifei
 * @since 2020/9/23
 */
class StringAddress{
    private String s;
    public StringAddress(String s){
        this.s = s;
    }

    @Override
    public String toString() {
        return super.toString()+ " " + s;
    }
}
public class FillingLists {
    public static void main(String[] args) {
        List<StringAddress> hello = new ArrayList<>(Collections.nCopies(4, new StringAddress("Hello")));
        System.out.println(hello);
        Collections.fill(hello, new StringAddress("World"));
        System.out.println(hello);
    }
}
