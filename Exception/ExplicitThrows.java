package Exception;

public class ExplicitThrows {
    public static void main(String[] args) {
        int balance = 5000;
        int withdrawlAmount = 6000;

        try {
            if(balance < withdrawlAmount){
                throw new ArithmeticException("Insufficient Balance"); //Declared Exception message explicitly
            }
            balance = balance - withdrawlAmount;
            System.out.println("Transaction Successfully Completed");
        } catch (Exception e) { //  Beside the implicitly exception throw 
            System.out.println("Exception "+ e.getMessage());
        }
        System.out.println("Program Continue.....");
    }
}