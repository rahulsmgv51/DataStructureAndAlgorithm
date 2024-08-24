package Opps.Abstraction.class_and_method_2nd_example;

public class LearnAbstract {
    public static void main(String[] args) {
        // Cannot instantiate the type Animal
        // Animal a1 = new Animal();
        Dog dog = new Dog();
        dog.eat();
        dog.walk();
        dog.legs(4);
        dog.sleep();
    }
}

abstract class Animal {
    abstract void eat();

    abstract void walk();

    abstract int legs(int legs);

    void sleep(){
        System.out.println("Cow sleep");
    }
}

abstract class Pet{
    abstract void nickname();
}

// We cannot extends Pet class with Dog class, because in abstract only on abstract class can extends
class Dog extends Animal {

    /*
     * Indicates that a method declaration is intended to override a method
     * declaration in a supertype. If a method is annotated with this annotation
     * type compilers are required to generate an error message unless at least one
     * of the following conditions hold:
     * The method does override or implement a method declared in a supertype.
     * The method has a signature that is override-equivalent to that of any public
     * method declared in Object.
     */
    @Override
    void eat() {
        System.out.println("Animal is eating");
    }

    @Override
    void walk() {
        System.out.println("Dog is runnig");
    }

    @Override
    int legs(int legs) {
        return legs;
    }
}