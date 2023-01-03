# Instance vs reference

```java
Object object=new Object();
```

- `new` keyword creates an **instance / object** of the class `Object` and stores it in the memory.


- The variable `object` stores the address of the instance in the memory, which is basically **reference**.

> Instance and object are the same thing.

> Object/instance is in the memory, the variable only references it

```java
    public static void main(String[]args){
        House redHouse=new House("Red");
        House otherHouse=redHouse;

        // redHouse and otherHouse both points to the same red colored house.
        System.out.println(redHouse.color); // Red
        System.out.println(otherHouse.color); // Red

        // Color of the red colored house is changed to green.
        otherHouse.setColor("Green");

        System.out.println(redHouse.color); // Green
        System.out.println(otherHouse.color); // Green

        // blueHouse and otherHouse both points to a blue colored house.
        House blueHouse=new House("Blue");
        otherHouse=blueHouse;

        System.out.println(redHouse.color); // Green
        System.out.println(otherHouse.color); // Blue
        System.out.println(blueHouse.color); // Blue
        }

static class House {
    String color;

    public House(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
```