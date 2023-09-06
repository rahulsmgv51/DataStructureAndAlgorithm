package List.ArrayList.ArrayList;

import java.util.ArrayList;

public class Operation {
    public static void main(String[] args) {
        // ArrayList arr1 = new ArrayList<>();

        // // Heterogeneous objects are allowed.
        // arr1.add("Hello");
        // arr1.add(1);
        // arr1.add(true);
        // arr1.add('A');
        // System.out.println(arr1);


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("world");
        System.out.println("ArrayList : "+ arrayList);
        // Here we are mentioning the index at which it is to be added
        arrayList.add(1, "Rahul");
        System.out.println("Add in the Index value : "+ arrayList);
        
        

    }
}
