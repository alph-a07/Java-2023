package strings;

public class StringBuilders {
    public static void main(String[] args) {
        String a = ""; // Immutable
        StringBuilder b = new StringBuilder(); // Mutable

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            a = a + ch; // creates a new object every iteration
        }

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i); // modifies the same object every iteration
            b.append(ch);
        }

        // same function
        System.out.println(a); // less efficient
        System.out.println(b); // more efficient
    }
}
