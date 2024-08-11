package Opps.Keywords.SuperKeyword;

public class Car extends Super_keyword{
    String color;
    void start(){
        Scooter scooter = new Scooter();
        scooter.breaking(this);
        super.stat();
        System.out.println(this);
        System.out.println(this.model+" Car is starting");
    }

    Car breaking(){
        return this;
    }

    Car(){
        super(4);
        System.out.println("Car is being created");
    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.wheel = 4;
        obj.model = "Gray";
        obj.color = "Red";
        obj.start();
    }
}

class Scooter{
    void breaking(Car car){
        System.out.println(car.model+" is breaking");
    }
}