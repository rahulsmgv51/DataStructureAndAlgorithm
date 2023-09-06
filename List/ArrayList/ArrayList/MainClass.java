package List.ArrayList.ArrayList;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        int n = 5;
         // Declaring the ArrayList with initialize size
        ArrayList<Integer> a1 = new ArrayList<Integer>(n);

        // Declaring the ArrayList
        ArrayList<Integer> a2 = new ArrayList<Integer>();

        System.out.println("arr1 : "+ a1);
        System.out.println("arr1 : "+ a2);

        for(int i=1; i<=n; i++){
            a1.add(i);
            a2.add(i);
        }

        System.out.println("arr1 : "+ a1);
        System.out.println("arr1 : "+ a2);

    }
}
