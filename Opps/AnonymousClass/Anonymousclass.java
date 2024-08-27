package Opps.AnonymousClass;

public class Anonymousclass {
    // Anonymous Class
    OuterClass outerClass = new OuterClass(){
        public void anonymousMethod(){
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

}

class OuterClass{
    public void outermethod(){
        System.out.println("Outer class Method");
    }
}



interface OuterInterface {
    void interfaceMethod();
}