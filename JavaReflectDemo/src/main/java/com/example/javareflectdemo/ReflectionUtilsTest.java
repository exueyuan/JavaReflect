package com.example.javareflectdemo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 测试类,用JUnit4 进行测试
 * @author syh
 *
 */

public class ReflectionUtilsTest {

    /**
     * 测试获取父类的各个方法对象
     */
    public void testGetDeclaredMethod() {

        Object obj = new Son() ;

        //获取公共方法名
        Method publicMethod = ReflectionUtils.getDeclaredMethod(obj, "publicMethod") ;
        System.out.println(publicMethod.getName());

        //获取默认方法名
        Method defaultMethod = ReflectionUtils.getDeclaredMethod(obj, "defaultMethod") ;
        System.out.println(defaultMethod.getName());

        //获取被保护方法名
        Method protectedMethod = ReflectionUtils.getDeclaredMethod(obj, "protectedMethod") ;
        System.out.println(protectedMethod.getName());

        //获取私有方法名
        Method privateMethod = ReflectionUtils.getDeclaredMethod(obj, "privateMethod", int.class) ;
        System.out.println(privateMethod.getName());
    }

    /**
     * 测试调用父类的方法
     * @throws Exception
     */
    public void testInvokeMethod() throws Exception {
        Object obj = new Son() ;

        //调用父类的公共方法
        ReflectionUtils.invokeMethod(obj, "publicMethod", null , null) ;

        //调用父类的默认方法
        ReflectionUtils.invokeMethod(obj, "defaultMethod", null , null) ;

        //调用父类的被保护方法
        ReflectionUtils.invokeMethod(obj, "protectedMethod", null , null) ;

        //调用父类的私有方法
        ReflectionUtils.invokeMethod(obj, "privateMethod", new Class<?>[]{int.class}, new Object[]{3});
    }

    /**
     * 测试获取父类的各个属性名
     */
    public void testGetDeclaredField() {

        Object obj = new Son() ;

        //获取公共属性名
        Field publicField = ReflectionUtils.getDeclaredField(obj, "publicField") ;
        System.out.println(publicField.getName());

        //获取公共属性名
        Field defaultField = ReflectionUtils.getDeclaredField(obj, "defaultField") ;
        System.out.println(defaultField.getName());

        //获取公共属性名
        Field protectedField = ReflectionUtils.getDeclaredField(obj, "protectedField") ;
        System.out.println(protectedField.getName());

        //获取公共属性名
        Field privateField = ReflectionUtils.getDeclaredField(obj, "privateField") ;
        System.out.println(privateField.getName());

    }

    public void testSetFieldValue() {

        Object obj = new Son() ;

        System.out.println("原来的各个属性的值: ");
        System.out.println("publicField = " + ReflectionUtils.getFieldValue(obj, "publicField"));
        System.out.println("defaultField = " + ReflectionUtils.getFieldValue(obj, "defaultField"));
        System.out.println("protectedField = " + ReflectionUtils.getFieldValue(obj, "protectedField"));
        System.out.println("privateField = " + ReflectionUtils.getFieldValue(obj, "privateField"));

        ReflectionUtils.setFieldValue(obj, "publicField", "a") ;
        ReflectionUtils.setFieldValue(obj, "defaultField", "b") ;
        ReflectionUtils.setFieldValue(obj, "protectedField", "c") ;
        ReflectionUtils.setFieldValue(obj, "privateField", 8) ;

        System.out.println("***********************************************************");

        System.out.println("将属性值改变后的各个属性值: ");
        System.out.println("publicField = " + ReflectionUtils.getFieldValue(obj, "publicField"));
        System.out.println("defaultField = " + ReflectionUtils.getFieldValue(obj, "defaultField"));
        System.out.println("protectedField = " + ReflectionUtils.getFieldValue(obj, "protectedField"));
        System.out.println("privateField = " + ReflectionUtils.getFieldValue(obj, "privateField"));

    }

    public void testGetFieldValue() {

        Object obj = new Son() ;

        System.out.println("publicField = " + ReflectionUtils.getFieldValue(obj, "publicField"));
        System.out.println("defaultField = " + ReflectionUtils.getFieldValue(obj, "defaultField"));
        System.out.println("protectedField = " + ReflectionUtils.getFieldValue(obj, "protectedField"));
        System.out.println("privateField = " + ReflectionUtils.getFieldValue(obj, "privateField"));
    }

}
