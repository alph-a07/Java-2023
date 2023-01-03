# Interface

- An interface is a class which can only have **abstract methods**(empty body).


- `static` or `default` methods in an interface can have a body.


- `static` methods can only be accessed with the interface and can not be overridden by the implemented class.


- It is not mandatory to override a `default` method of an interface.

> For a successful compilation, implemented class must override all the abstract methods except `static`/`default`
> methods.

```java
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
```

> Methods of an interface are `public` and `abstract` by default.

> Variables of an interface are `static` and `final` by default.