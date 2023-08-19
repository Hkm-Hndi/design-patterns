package com.hndi.designpatterns;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    // Public static method to get the instance
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
}
