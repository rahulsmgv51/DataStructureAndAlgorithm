package Opps.Final;

// Final Class it can't be change means it can be inherit by any class
final class Dummy{
}

// Final Method
class Test{
    public final void funMethod(){
        System.out.println("This method can't be overridden, It gives compile time error");
    }
}
class Test2 extends Test{
    // public void funMethod(){
    //     System.out.println("Method Can't be overridden here");
    // }
}

public class FinalKeyword {
    final int x;
    final int y;
    final int z = 9; // Initialization final value at the time of creating variable.
    //final variable are assign through Initialization block 
    {
        x = 9;
    }
    //final variable are assign through Constructor 
    FinalKeyword(){
        y = 5;
    }
    private final static int b = 9; // These the method we initialized final static variable
    private final static int a;
    static{
        a =10;
    }

    // final local variable
    public void fun(){
        final int k; //the value of final variable change only one time after assigning it can't be change.
    }

    
    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword();
        
    }
}
