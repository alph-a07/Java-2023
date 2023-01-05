package strings;

public class Strings {
    public static void main(java.lang.String[] args) {
        String a = "abc";
        String b = "abc";

        System.out.println(a == b); // true
        System.out.println(a.equals(b)); // true

        String x = new String("abc");
        String y = new String("abc");

        System.out.println(x == y); // false
        System.out.println(x.equals(y)); // true
    }
}
