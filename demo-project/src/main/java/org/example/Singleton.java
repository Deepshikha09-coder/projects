package org.example;

import java.io.Serial;
import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
    @Serial
    private static final long serialVersionUID = 1L;

    // The single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {
        // Preventing reflection from breaking the Singleton pattern
        if (instance != null) {
            throw new IllegalStateException("Instance already exists!");
        }
    }

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Ensure the singleton remains intact during deserialization
    protected Object readResolve() {
        return getInstance();
    }

    // Prevent cloning from breaking the Singleton pattern
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton instance can't be cloned");
    }

    // Example method to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        // Testing the Singleton implementation
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton1.showMessage();
        System.out.println("Hashcode of singleton1: " + singleton1.hashCode());
        System.out.println("Hashcode of singleton2: " + singleton2.hashCode());

        // Ensuring both instances are the same
        System.out.println("singleton1 and singleton2 are the same instance: " + (singleton1 == singleton2));
    }
}

