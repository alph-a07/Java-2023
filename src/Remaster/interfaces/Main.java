package Remaster.interfaces;

public class Main {
    public static void main(String[] args) {
        // Not advisable
        /*Interface myInterface = new Interface() {
            @Override
            public void method1() {

            }

            @Override
            public void method2(String s) {

            }
        };*/
        Interface myInterface;

        myInterface = new ImplementedClass();
        myInterface.method1();
        myInterface.method2("X");
        myInterface.defaultMethod("Y");
        // myInterface.staticMethod(); -- error
        Interface.staticMethod("Z");
        System.out.println(Interface.a);
    }
}
