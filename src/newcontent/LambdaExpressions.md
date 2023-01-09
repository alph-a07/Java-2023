# Lambda expressions

- Lambda expressions basically express instances of `functional interfaces` (An interface with **single abstract method
  is called functional interface.

- Lambda expressions were introduced in Java 8.

```
 lambda operator -> body
```

### Functionalities

* A function that can be created without belonging to any class.
* A lambda expression can be passed around as if it was an object and executed on demand.

```java
public class LambdaExpressions {
    public static void main(String[] args) {
        FunInterface1 lambda1 = (int a, int b) -> a + b; // lambda implementation of funInterface1
        // FunInterface sum = Integer::sum; -- using Integer.sum() reference

        FunInterface2 lambda2 = (int a, int b) -> a * b; // lambda implementation of funInterface2

        helper(5, 3, lambda1, lambda2);
    }

    // passing lambda as an object reference
    private static void helper(int a, int b, FunInterface1 funInterface1, FunInterface2 funInterface2) {
        System.out.println("a + b = " + funInterface1.sum(a, b));
        System.out.println("a * b = " + funInterface2.multiply(a, b));
    }

    // Functional Interface
    static interface FunInterface1 {
        int sum(int a, int b);
    }

    // Functional Interface
    static interface FunInterface2 {
        int multiply(int a, int b);
    }
}
```

```
a + b = 8
a * b = 15

Process finished with exit code 0
```

> The body of a lambda expression can contain zero, one or more statements.


