# Immutable class

- Immutable class in java means that once an object is created, we cannot change its content.

```java
public final class ImmutableClass {
    private final int attr1;
    private final String attr2;

    public ImmutableClass(int attr1, String attr2) {
        this.attr1 = attr1;
        this.attr2 = attr2;
    }

    public int getAttr1() {
        return attr1;
    }

    public String getAttr2() {
        return attr2;
    }
}
```

> Immutable class should be declared final.

> Data members of an immutable class should be declared private and final.