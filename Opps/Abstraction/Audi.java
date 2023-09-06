package Opps.Abstraction;

public class Audi extends Car{
    @Override
    public void accelerate(){
        System.out.println("Audi is accelerating");
    }

    @Override
    public void breaking(){
        System.out.println("Audi is breaking");
    }
}
