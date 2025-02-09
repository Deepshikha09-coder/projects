package org.example;

import java.lang.reflect.Constructor;

public class ReflectionBreak {
    public static void main(String[] args) {
        try {
            SingletonDesignPattern instanceOne = SingletonDesignPattern.getInstance();
            Constructor<SingletonDesignPattern> constructor = SingletonDesignPattern.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            SingletonDesignPattern instanceTwo = constructor.newInstance();
            instanceOne.log("Hii");
            instanceTwo.log("Hii");

            System.out.println(instanceOne.hashCode()); // Different hash codes
            System.out.println(instanceTwo.hashCode());
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }
}

