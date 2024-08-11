package Opps.Keywords.final_keyword;

public class Car extends Vehical{
    // Implicit super constructor Vehical() is undefined for default constructor. Must define an explicit constructor
    Car(int wheelCount) {
        super(wheelCount);
        
    }

    // Cannot override the final method from Vehical
    // void accelerate(){

    // }
    
}
