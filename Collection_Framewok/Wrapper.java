package Collection_Framewok;

public class Wrapper {
    public static void main(String[] args) {
        // Create Integer object
        @SuppressWarnings("removal")
        Integer obj = new Integer(12);

        Integer obj2 = Integer.valueOf(12); 
        Integer obj3 = 12; // autoboxing
        int age = obj; // unboxing
    }
}