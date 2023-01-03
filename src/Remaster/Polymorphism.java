package Remaster;

public class Polymorphism {
    public static void main(String[] args) {

        // Compile-time polymorphism
        // Method is identified at compile-time with the help of parameter signatures
        System.out.println("1 + 2 = " + Parent.sum(1, 2));
        System.out.println("1 + 2 + 3 = " + Parent.sum(1, 2, 3));

        // Run-time polymorphism
        Parent c1 = new Child1();
        c1.dynamic();
        c1 = new Child2();
        c1.dynamic();
    }

    static class Parent {
        public static int sum(int a, int b) {
            return a + b;
        }

        public static int sum(int a, int b, int c) {
            return a + b + c;
        }

        public void dynamic() {
            System.out.println("Parent class");
        }
    }

    static class Child1 extends Parent {
        @Override
        public void dynamic() {
            System.out.println("Child class 1");
        }
    }

    static class Child2 extends Parent {
        @Override
        public void dynamic() {
            System.out.println("Child class 2");
        }
    }
}
