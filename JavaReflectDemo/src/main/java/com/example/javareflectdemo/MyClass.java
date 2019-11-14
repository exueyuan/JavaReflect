package com.example.javareflectdemo;

public class MyClass {
    public static void main(String args[]) {
        System.out.println("哈哈哈hhh");
        ReflectionUtilsTest reflectionUtilsTest = new ReflectionUtilsTest();
        reflectionUtilsTest.testGetDeclaredMethod();
        reflectionUtilsTest.testGetDeclaredField();
        reflectionUtilsTest.testGetFieldValue();
        try {
            reflectionUtilsTest.testInvokeMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
        reflectionUtilsTest.testSetFieldValue();
    }
}
