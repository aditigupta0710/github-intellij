package com.aditi.practice;

public class overloading {
    public static void main(String[] args) {
        fun(67);
        fun("Aditi Gupta");
    }
    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }
    static void fun(String name) {
        System.out.println("second one");
        System.out.println(name);
    }
}
