package remaster;

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

class Driver {
    public static void main(String[] args) {
        ImmutableClass obj = new ImmutableClass(123, "xyz");

        // Modification not allowed
        // obj.attr1 = 345;
        // obj.setAttr2() = "abc";

        System.out.println("attr1 : " + obj.getAttr1());
        System.out.println("attr2 : " + obj.getAttr2());
    }
}
