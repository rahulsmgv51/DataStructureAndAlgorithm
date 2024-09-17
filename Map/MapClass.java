package Map;

import java.util.*;

public class MapClass {
    // Working of Map interface
    // Main driver method
    public static void main(String args[]) {
        // Creating an empty HashMap
        Map<String, Integer> hm = new HashMap<String, Integer>();

        // Inserting pairs in above Map
        // using put() method
        hm.put("a", new Integer(100));
        hm.put("b", new Integer(200));
        hm.put("c", new Integer(300));
        hm.put("d", new Integer(400));
        // also put int value like this
        hm.put("e", 500);

        // Traversing through Map using for-each loop
        for (Map.Entry<String, Integer> me : hm.entrySet()) {
            // Printing keys
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
        hm.remove("c");
        System.out.println(hm);
        System.out.println(hm.containsKey("a"));

        //Copy the keys of map
        Set<String> keys = hm.keySet();
        // ArrayList<String> keys = new ArrayList<>(hm.keySet());
        System.out.println(keys);

        // hm.values() gives the collections of Integer/String
        // Returns a Collection view of the values contained in this map
        Collection<Integer> values = hm.values();
        System.out.println(values);
        
    }
}
