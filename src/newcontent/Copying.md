# Copying or Cloning

### Shallow(fast) vs Deep(slow) copying

```java
public class Copying {

    static class Demo {
        private int[] data;

        // data points to the same location as val
        public void shallowCopy(int[] val) {
            data = val;
        }

        // data is a new reference with same content as val
        public void deepCopy(int[] val) {
            data = new int[val.length];
            System.arraycopy(val, 0, data, 0, val.length);
        }

        public void display() {
            System.out.println(Arrays.toString(data));
        }
    }

    public static void main(String[] args) {
        Demo o = new Demo();
        int[] val = new int[]{1, 2, 3};

        o.shallowCopy(val);
        o.display(); // 1,2,3
        val[2] = 4;
        o.display(); // 1,2,4 - unintended modification

        o.deepCopy(val);
        o.display(); // 1,2,4
        val[2] = 3;
        o.display(); // 1,2,4
    }
}
```

### Lazy copying

- Lazy copying is a combination of deep copying and shallow copying.
- Shallow copying is implemented until any object is found to be sharing data, then only deep copy is implemented.

> If only primitive type fields or Immutable objects are there then there is no difference between shallow and deep copy
> in Java.

**Explanation:**
Primitive type fields does not have a reference, hence shallow copy can not affect them. Immutable objects are not
modifiable anyway.
