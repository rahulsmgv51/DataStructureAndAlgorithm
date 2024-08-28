package Java8;

public class FunctionalInterfaceClass {
    // Anonymous Class
    OuterClass outerClass = new OuterClass() {
        public void anonymousMethod() {
            System.out.println("This class is anonymous class's child class of Outerclass it is only once use");
        }

        public void outermethod() {
            System.out.println("Method overrirde");
        };
    };

    // Anonymous Class
    OuterInterface outerInterface = new OuterInterface() {

        @Override
        public void interfaceMethod() {
            System.out.println("Anonymous class that create by using OuterInterface");
        }

    };

    // above object creation replace by below code by using lambda expression
    //lambda expression
    OuterInterface outerInterface2 = () -> {

    };

    public static void main(String[] args) {

        // You can not create multiple object of anonymous class
        Walkable walkable = (int steps) ->{
            System.out.println("My today steps count are "+ steps);
            return steps;
        };
        walkable.walk(11032);

        // also written like this
        // Walkable walkable2 = (int steps) -> 5*steps;
        //Above and below both are same
        Walkable walkable2 = (steps) -> 5*steps;
        System.out.println("Today walked distance "+ walkable2.walk(20));
    }

}

class OuterClass {
    public void outermethod() {
        System.out.println("Outer class Method");
    }
}

// An informative annotation type used to indicate that an interface type declaration is intended to be a functional interface as defined by the Java Language Specification.
@FunctionalInterface
interface OuterInterface {
    void interfaceMethod();
}

interface Walkable{
    int walk(int steps);
}