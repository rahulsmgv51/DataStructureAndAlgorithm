package Opps.Singleton;
// Java program implementing Singleton1 class

// with method name as that of class

// Class 1
// Helper class
class Singleton1 {
    // Static variable single_instance of type Singleton1
    private static Singleton1 single_instance = null;

    // Declaring a variable of type String
    public String s;

    // Constructor of this class
    // Here private constructor is used to
    // restricted to this class itself
    private Singleton1() {
        s = "Hello I am a string part of Singleton1 class";
    }

    // Method
    // Static method to create instance of Singleton1 class
    public static Singleton1 Singleton1() {
        // To ensure only one instance is created
        if (single_instance == null) {
            single_instance = new Singleton1();
        }
        return single_instance;
    }
}

// Class 2
// Main class
class Singleton2 {
    // Main driver method
    public static void main(String args[]) {
        // Instantiating Singleton1 class with variable x
        Singleton1 x = Singleton1.Singleton1();

        // Instantiating Singleton1 class with variable y
        Singleton1 y = Singleton1.Singleton1();

        // instantiating Singleton1 class with variable z
        Singleton1 z = Singleton1.Singleton1();

        // Now changing variable of instance x
        // via toUpperCase() method
        x.s = (x.s).toUpperCase();

        // Print and display commands
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");

        // Now again changing variable of instance z
        z.s = (z.s).toLowerCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}
