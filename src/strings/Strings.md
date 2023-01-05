# Strings

```java
public class String {
    public static void main(java.lang.String[] args) {

        // a and b points to the same object
        String a = "abc";
        String b = "abc";

        System.out.println(a == b); // true -- same address
        System.out.println(a.equals(b)); // true -- same value

        // Two different objects outside pool, inside heap
        String x = new String("abc");
        String y = new String("abc");

        System.out.println(x == y); // false -- different objects
        System.out.println(x.equals(y)); // true -- same value
    }
}
```

> String objects are stored in an exclusive area in the heap, called **String pool**.

- Duplicate objects are not created but are referenced to the same object only.
- Shallow copy limitations does not affect strings as they are **immutable**.