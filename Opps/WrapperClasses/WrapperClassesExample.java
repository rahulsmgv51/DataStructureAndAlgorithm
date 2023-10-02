package Opps.WrapperClasses;

public class WrapperClassesExample {
    public static void main(String[] args) {
        // Integer intvalue = Integer.valueOf("123");
        Integer intvalue = Integer.valueOf("10101", 2); // We can also pass argu. as a binary number
        Double doubleValue = Double.valueOf("3.14");

        System.out.println(intvalue + "  " + doubleValue);

        int strNumber = Integer.parseInt("132"); // parseXxx return xxx type value
        System.out.println(strNumber);
        int newint = intvalue.intValue();
        System.out.println(newint);
    }
}
