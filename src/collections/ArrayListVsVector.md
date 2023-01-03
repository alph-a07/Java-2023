# ArrayList vs Vector

<table><thead><tr><th>S. No.</th><th>&nbsp; &nbsp; &nbsp; &nbsp; ArrayList</th><th>Vector</th></tr></thead><tbody><tr><td>1.</td><td>ArrayList is not synchronized.</td><td>Vector is synchronized.</td></tr><tr><td>2.</td><td>ArrayList increments 50% of the current array size if the number of elements exceeds ts capacity.</td><td>Vector increments 100% means doubles the array size if the total number of elements exceeds its capacity.</td></tr><tr><td>3.</td><td>ArrayList is not a legacy class. It is introduced in JDK 1.2.</td><td>Vector is a legacy class.</td></tr><tr><td>4.</td><td>ArrayList is fast because it is non-synchronized.</td><td>Vector is slow because it is synchronized, i.e., in a multithreading environment, it holds the other threads in a runnable or non-runnable state until the current thread releases the lock of the object.</td></tr><tr><td>5.</td><td>ArrayList uses the Iterator interface to traverse the elements.</td><td>A Vector can use the Iterator interface or Enumeration interface to traverse the elements.</td></tr><tr><td>6</td><td>ArrayList performance is high&nbsp;</td><td>Vector performance is low&nbsp;</td></tr><tr><td>7</td><td>Multiple threads is allowed&nbsp;</td><td>only one threads are allowed .</td></tr></tbody></table>

### Synchronization

Vector is synchronized, which means only one thread at a time can access the code, while ArrayList is not synchronized,
which means multiple threads can work on ArrayList at the same time.

### How to get synchronized version of ArrayList?

```java
// non synchronized
ArrayList l1=new ArrayList();
// Synchronized
        List l=Collections.SynchronizedList(l1);
```

> ArrayList is preferable when there is no specific requirement to use vector.