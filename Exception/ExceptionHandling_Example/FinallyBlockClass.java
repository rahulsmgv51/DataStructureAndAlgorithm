package Exception.ExceptionHandling_Example;

public class FinallyBlockClass {
    // Java code to display the use of finally block in exception handling
    public static void main(String[] args) {
        try {
            // Code that may cause an exception
            int result = divide(10, 0); // Attempting to divide by zero
            System.out.println("Result: " + result); // This line won't be executed
        } catch (ArithmeticException e) { // Handling the exception
            System.out.println("An error occurred: " + e.getMessage());
        } finally { // finally block
            System.out.println("\nFinally block executed, performing cleanup tasks.");
        }
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
}
