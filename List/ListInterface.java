package List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); //LinkedList
        List<Integer> list2 = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(0);

        list2.add(21);
        list2.add(22);
        list2.add(23);

        // System.out.println(list.toString());
        System.out.println(list);

        System.out.println(list.contains(20));
        //Pass the object for removing element
        System.out.println(list.remove(Integer.valueOf(30)));
        // Pass index for removing index value
        System.out.println(list.remove(0));

        // Adds all elemetn from the specified collection to the collection.
        list.addAll(list2);
        System.out.println(list);

        // Removes all elements in the collection that are also contained in the specified collection.
        // list.removeAll(list2);

        //Removes all elements from the collection that are not present in the specified collection.
        list.retainAll(list2);
        System.out.println(list);

        // Convert List into array
        Object a[] = list.toArray();
        for (Object object : a) {
            Integer temp  = (Integer) object;
            System.out.println(temp);
        }

        //Below method come from list interface and above are from collection interface
        System.out.println(list.get(0));
        System.out.println(list.set(0, 501));
        list.add(2, 502);
        System.out.println(list);

        List<String> vegetables = new ArrayList<>();
        vegetables.add("Tamato");
        vegetables.add("Potato");
        vegetables.add("Onion");
        vegetables.add("Brinjal");

        for(int i=0; i<list.size(); i++){
            System.out.println("Vegetable is "+ vegetables.get(i));
        }

        for (String vege : vegetables) {
            System.out.println("for each vegetable "+ vege);
        }

        //This method come from collection interface
        Iterator<String> veg = vegetables.iterator();
        while (veg.hasNext()) {
            System.out.println("Iterate all vegetable "+veg.next());
        }

        Iterator<String> vegs = vegetables.listIterator();
        while (vegs.hasNext()) {
            System.out.println("Iterate all vegetable "+vegs.next());
        }
    }
}