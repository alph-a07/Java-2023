package Remaster.interfaces;

public class ImplementedClass implements Interface {

    @Override
    public void method1() {
        System.out.println("Method 1");
    }

    @Override
    public void method2(String s) {
        System.out.println("Method 2 string : " + s);
    }

    // Not mandatory
    @Override
    public void defaultMethod(String s) {
        Interface.super.defaultMethod(s);
        System.out.println("Default string (Class) : " + s);
    }
}
