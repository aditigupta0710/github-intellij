package com.aditi.practice;

import java.util.Arrays;

public class variable_arguments{
    public static void main(String[] args) {
        fun(76,43,54,3,3,2,22,2,2,32);
        multiple(45,65,"Aditi", "ayush");
    }
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String ...v) {

    }
}