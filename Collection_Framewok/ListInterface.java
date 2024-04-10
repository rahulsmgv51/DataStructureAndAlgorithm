package Collection_Framewok;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>(); //as well use LinkedList 
        // List<Integer> list2 = new ArrayList<>();

        // list.add(10);
        // list.add(15);
        // list.add(20);
        // list.add(100);
        // list2.addAll(list);
        // list2.add(31);
        // list2.add(32);
        // list2.add(33);
        // list2.add(34);
        // System.out.println(list);
        // System.out.println(list.size());

        // list.remove(0);
        // list.remove(Integer.valueOf(15));
        // System.out.println(list);

        // list.addAll(list2);
        // System.out.println(list);
        // list.retainAll(list2);
        // System.out.println(list + "   =retainAll=   " + list2);
        // list.removeAll(list2);
        // System.out.println(list + "   ==   " + list2);

        // Object a[] = list2.toArray();
        // for (Object object : a) {
        //     Integer temp = (Integer) object;
        //     System.out.println(temp);
        // }
        
        List<String> fruits = new ArrayList<>();
        fruits.add("Kiwi");
        fruits.add("Strwaberry");
        fruits.add("Mango");
        fruits.add("Papaya");
        fruits.add("Apple");
        fruits.add("Watermelon");

        // for(int i=0; i<fruits.size(); i++){
        //     System.out.println("Fruit is "+ fruits.get(i));
        // }

        // for (String fruit : fruits) {
        //     System.out.println("Fruit is "+ fruit);
        // }

        // iterator come from collection framework
        // Iterator<String> f = fruits.iterator();
        Iterator<String> f = fruits.listIterator();
        while (f.hasNext()) {
            System.out.println(" Iterator "+f.next());
        }

        // Find subList
        List<String> smallList = fruits.subList(1, 3);
        System.out.println(smallList);
    }
}