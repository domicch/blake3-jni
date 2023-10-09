package io.lktk;

public class NativeBLAKE3Util {

    public static void assertEquals(boolean val, boolean val2, String message) throws AssertFailException {
        if (val != val2)
            throw new AssertFailException("FAIL: " + message);
        else
            System.out.println("PASS: " + message);
    }

    public static void checkState(boolean expression) {
        if (!expression) {
            throw new IllegalStateException();
        }
    }

    public static void checkArgument(boolean expression) {
        if (!expression) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkOutput(boolean expression, String message) throws InvalidNativeOutput {
        if (!expression) {
            throw new InvalidNativeOutput(message);
        }
    }

    public static class InvalidNativeOutput extends Exception {
        public InvalidNativeOutput(String message) { super(message); }
    }

    public static class AssertFailException extends Exception {
        public AssertFailException(String message) {
            super(message);
        }
    }
}
