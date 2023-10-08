package Opps.Constructors_and_this_super_Keywords;

public class ConstructorCall {
    // Method because we define the return type
    void ConstructorCall(){
        System.out.println("Method Call");
    }
    
    // Constructor
    ConstructorCall(){
        System.out.println("Constructor Call");
    }
    public static void main(final String[] args) {
        ConstructorCall c1 = new ConstructorCall();
        c1.ConstructorCall();
        ConstructorCall c2 = new ConstructorCall();
    }
}
