package input_output;

public class Streams {
    public static void main(String[] args) {
        System.out.println("This is a message. - 1");
        System.out.flush();
        System.err.println("This is an error message - 1");
        System.err.flush();
        System.out.println("This is a message. - 2");
        System.out.flush();
        System.err.println("This is an error message - 2");
        System.err.flush();
        System.out.println("This is a message. - 3");
        System.out.flush();
        System.err.println("This is an error message - 3");
        System.err.flush();
    }
}
