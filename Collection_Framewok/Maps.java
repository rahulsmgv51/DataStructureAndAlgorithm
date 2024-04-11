package Collection_Framewok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("a", "Apple");
        map.put("b", "Boy");
        map.put("c", "Cat");
        map.put("d", "Doll");
        map.put("f", "Doll");

        System.out.println(map.get("e")); // if not present op-> null
        System.out.println(map.getOrDefault("e", "Elephant")); // return if not present its return default value which i have set

        Set<String> keys = map.keySet();
        // System.out.println(keys);
        for (String key : keys) {
            System.out.println("Map key : "+ key);
        }


        Collection<String> values = map.values();
        // System.out.println(values);
        for (String value : values) {
            System.out.println("Map Value : " + value);
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // for (Entry<String,String> entry : entries) {
        // System.out.println(entry);
        // }
    }
}