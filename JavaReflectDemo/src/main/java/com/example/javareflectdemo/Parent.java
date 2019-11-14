package com.example.javareflectdemo;

/**
 * 父类
 * @author syh
 *
 */

public class Parent {

    public String publicField  = "1";

    String defaultField = "2";

    protected String protectedField = "3";

    private int privateField = 4 ;

    public void publicMethod() {
        System.out.println("publicMethod...");
    }

    void defaultMethod() {
        System.out.println("defaultMethod...");
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod...");
    }

    private void privateMethod(int integer) {
        System.out.println("privateMethod..."+integer);
    }

}
