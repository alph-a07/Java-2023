package remaster;

public class ThisvsSuper {

    static class Parent {
        public int a;
        public int b;

        // Parent constructor
        Parent(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    static class Child extends Parent {
        private int c;
        private int d;

        // Reusing parent constructor to avoid code duplication (super() call)
        Child(int a, int b, int c, int d) {
            super(a, b);
            // super.a = a;
            // super.b = b;
            this.c = c;
            this.d = d;
        }

        // Reusing cousin constructor to avoid code duplication (this() call)
        Child(int a, int b) {
            this(a, b, 0, 0);
            // super.a = a;
            // super.b = b;
        }
    }
}
