package Remaster;

public class StaticVsInstanceMethods {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.method1();
        demo.method2();

        Demo.method1();
        // Demo.method2(); error
    }

    static class Demo {
        public static void method1() {
            System.out.println("This is a static method.");
        }

        public void method2() {
            System.out.println("This is an instance method.");
        }
    }
}
