package Opps.Final;

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
    
    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword();
        
    }
}
