package exceptions_java;

public class UncheckedException {
    public static void main(String[] args) {
//        nullPointer(); // ArithmeticException
//        invalidIndex(); // ArrayIndexOutOfBoundsException

        try {
            nullPointer();
        } catch (Exception e) {
            System.out.println("Custom message : " + e);
        }
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
