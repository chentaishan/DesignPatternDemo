package com.example.designdemo.instance;

/**
 * 饿汉式
 */
public class SingleTon2 {

    private static SingleTon2 singleTon2 = new SingleTon2();

    private SingleTon2(){}

    public static synchronized SingleTon2 getInstance(){

      return singleTon2;
    }

    public void doSomething(){

    }
}
