package exceptions_java;

public class UserDefinedExceptions {
    public static void main(String[] args) {

        /*try {
            throw new Exception("This is a direct exception.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/

        try {
            throw new CustomException(10);
        } catch (CustomException e) {
            throw new RuntimeException(e);
        }
    }

    static class CustomException extends Exception {
        int exceptionValue;

        CustomException(int exceptionValue) {
            this.exceptionValue = exceptionValue;
        }

        @Override
        public String toString() {
            return "Exception value = " + exceptionValue;
        }
    }
}
