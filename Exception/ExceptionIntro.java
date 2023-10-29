package Exception;
public class ExceptionIntro {
    public static void main(String[] args) {
        // System.out.println("Exception java.lang.ArithmeticException "+ 3/0);
        try {
            System.out.println("Exception java.lang.ArithmeticException "+ 3/0);
            System.out.println("Exception next Line ");
        } catch (ArithmeticException e) {
            System.out.println("Exception "+ e);
        }
        finally{
            System.out.println("Final code of Exception Handling");
        }
       
    }
}