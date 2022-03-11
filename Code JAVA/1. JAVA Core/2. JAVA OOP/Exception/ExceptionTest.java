public class ExceptionTest {
    public static void main(String[] args) throws TestCheckedException {
        // Unchecked Exception
        try {
            int data = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Rest of code...");

        // Checked Exception
        ExceptionTest.testCheckedException();

        // UnChecked Exception
        ExceptionTest.testUnCheckedException();
    }

    public static void testCheckedException() throws TestCheckedException{
        System.out.println("Check exception demo");
    }

    public static void testUnCheckedException() throws TestCheckedException{
        System.out.println("UnChecked exception demo");
    }
}

class TestCheckedException extends Exception{
    public TestCheckedException(String message) {
        super(message);
    }
}

class TestUnCheckedException extends RuntimeException{
    public TestUnCheckedException(String message) {
        super(message);
    }
}
