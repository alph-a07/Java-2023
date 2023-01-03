# Abstract Keyword

- **Abstract class** can not be instantiated, but can be inherited.


- **Abstract method** can not have a body, and can only be defined inside an abstract class or an interface.

```java
abstract class AbstractClass {
    void method1() {
        System.out.println("Method 1");
    }

    abstract void abstractMethod();
}

class Main extends AbstractClass {

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
```