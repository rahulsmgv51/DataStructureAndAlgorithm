package Opps.Keywords.final_keyword;
// The type Car cannot subclass the final class Vehical
// public final class Vehical {

public class Vehical {
    final int gears = 6;
    public static void main(String[] args) {
        Vehical v1 = new Vehical(4);
        // The final field Vehical.gears cannot be assigned
        // v1.gears = 4;
        v1.accelerate();
    }

    int wheelCount;

    Vehical(int wheelCount){
        this.wheelCount = wheelCount;
        System.out.println("Creating vehical  with using "+ this.wheelCount +" wheels");
    }

    final void accelerate(){
        System.out.println("Vehicale is accelerating using accelerator");
    }
}
