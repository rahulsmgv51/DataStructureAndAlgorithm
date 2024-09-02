package Java_Object_Class;

class Bike{
    String model;
    int year;

    public Bike(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public boolean equalss(Object object){
        Bike that = (Bike) object;
        if (this.model==that.model && this.year==that.year) {
            return true;
        }
        return false;
    }

    // toString is overriden method from Object class
    @Override
    public String toString() {
        return "Bike [model=" + model + ", year=" + year + "]";
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        Bike obj = new Bike("Shine", 2024);
        Bike obj2 = new Bike("Shine", 2024);

        System.out.println(obj == obj2); // op => false both of reference is different
        System.out.println(obj.equalss(obj2)); // op => true
        System.out.println(obj.equals(obj2));

        // Java call directly or indirectly call toString Method. so both of the below op will be same 
        System.out.println(obj.toString());
        System.out.println(obj);
    }
}