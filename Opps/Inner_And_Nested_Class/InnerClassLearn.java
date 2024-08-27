package Opps.Inner_And_Nested_Class;

public class InnerClassLearn {

    class Toy {
        int price;
    }

    static class PlayFootball {
        int ticketPrice;
    }

    public static void main(String[] args) {
        // We can not this type this things because can not access a non static class in
        // static method
        // And if we want to use then first create outer class object and next create
        // inner class object.
        // Toy toy = new Toy();

        Toy toy = new InnerClassLearn().new Toy();
        // or
        InnerClassLearn learn = new InnerClassLearn();
        Toy toy2 = learn.new Toy();
        toy.price = 6;

        // We can access PlayFootball class without create outer class obj. because it is a nested (static class)
        // class.
        PlayFootball playFootball = new InnerClassLearn.PlayFootball();
        playFootball.ticketPrice = 10;

    }
}