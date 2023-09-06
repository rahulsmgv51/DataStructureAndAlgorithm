package Opps.Abstraction;

public class RepairShop {

    public static void repairCar(Car car, String name){
        System.out.println("car is repaired");
    }

    public static void main(String[] args) {
        WagonR wagonR = new WagonR();
        Audi audi = new Audi();

        repairCar(audi, "audi");
        repairCar(wagonR, "WagonR");
    }
}
