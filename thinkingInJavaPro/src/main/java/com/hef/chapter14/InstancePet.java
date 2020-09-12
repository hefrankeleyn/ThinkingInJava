package com.hef.chapter14;

import java.util.Arrays;

/**
 * @author lifei
 * @since 2020/9/9
 */
public class InstancePet {

    public static void main(String[] args) {
        String str = "aa";
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));
        Pet pet = new Pet();
        Pet dog = new Dog();
        System.out.println(pet instanceof Pet);
        System.out.println(dog instanceof Pet);
        System.out.println(dog instanceof Dog);
        System.out.println(Pet.class.isInstance(dog));
        System.out.println(Dog.class.isInstance(dog));
        System.out.println(dog.getClass().isAssignableFrom(Pet.class));
        System.out.println(Pet.class.isAssignableFrom(dog.getClass().getSuperclass()));
    }
}
