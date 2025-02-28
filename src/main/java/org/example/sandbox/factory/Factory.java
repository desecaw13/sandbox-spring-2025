package org.example.sandbox.factory;

public class Factory {
    public static <T> T getInstance(Class<T> clazz) throws Exception {
        return clazz.getConstructor().newInstance();
    }

    private Factory() {
    }
}
