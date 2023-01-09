# Unchecked Exceptions

- Program can be successfully compiled even without handling unchecked exceptions.

```java
public class UncheckedException {
    public static void main(String[] args) {
        nullPointer(); // ArithmeticException
        invalidIndex(); // ArrayIndexOutOfBoundsException
    }

    static void nullPointer() {
        int x = 35 / 0; // No exception until method is called
        System.out.println(x);
    }

    static void invalidIndex() {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(a[7]); // No exception until method is called
    }
}
```

> Further execution is stopped once an unchecked exception is thrown.
