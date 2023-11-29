package com.interview.reflection;

import java.lang.reflect.Constructor;

class SingletonDemo {
    public static void main( String args[] ) throws Exception{
        Class<?> c = SingletonClass.class;

        Constructor<?> ctr = c.getDeclaredConstructors()[0];
        // Remember to set accessiblity
        ctr.setAccessible(true);
        SingletonClass[] instances = new SingletonClass[10];
        for (int i = 0; i < 10; i++) {
            instances[i] = (SingletonClass) ctr.newInstance();
            System.out.println(instances[i]);
        }
    }
}

class SingletonClass {

    private static SingletonClass singleton = new SingletonClass();

    private SingletonClass() { }

    public SingletonClass getInstance() {
        return singleton;
    }

}