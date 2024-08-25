package Opps.Interface;

public class InterfaceUse {
    // Cannot instantiate the type Animal
    // Animal animal = new Animal();

    public static void main(String[] args) {
        Cow cow = new Cow();

        System.out.println(Human.LEGS);
        
        // The final field Human.LEGS cannot be assigned
        // Human.LEGS =4;
    }
}

interface Animal {
    // In Interface methods are by default public and abstract. and also we can
    // remove abstract keyword from below method.
    public abstract void eats();

    void sleep();
}

interface Human {
    // all fields are implicitly public static final.
    // public static final int LEGS = 2; this and below statement are same we cannot change.
    int LEGS = 2;
    void run();
}

class Cow implements Animal, Human {

    @Override
    public void eats() {
        System.out.println("Cow is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cow is sleeping");
    }

    @Override
    public void run() {
        System.out.println("Cow is running");
    }
}