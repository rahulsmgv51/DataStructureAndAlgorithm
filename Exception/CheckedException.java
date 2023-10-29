package Exception;

import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        throw new IOException(); // Compile time exception 
        System.out.println("Compile time Exception");
    }
}
