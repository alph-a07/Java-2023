package remaster.interfaces;

public interface Interface {

    // Initialisation is must
    static final int a = 0;

    // Can not be overridden
    static void staticMethod(String s) {
        System.out.println("Static string : " + s);
    }

    public abstract void method1();

    public abstract void method2(String s);

    // Not mandatory to override
    default void defaultMethod(String s) {
        System.out.println("Default string (Interface) : " + s);
    }
}
