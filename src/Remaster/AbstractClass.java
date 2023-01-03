package Remaster;

abstract class AbstractClass {
    void method1() {
        System.out.println("Method 1");
    }

    abstract void abstractMethod();
}

class Main extends AbstractClass {
    public static void main(String[] args) {
        Main main = new Main();
        main.abstractMethod();
        main.method1();
    }

    @Override
    void abstractMethod() {
        System.out.println("Abstract methods must be overridden.");
    }

    @Override
    void method1() {
        super.method1();
        System.out.println("Overriding non-abstract methods is not mandatory.");
    }
}


