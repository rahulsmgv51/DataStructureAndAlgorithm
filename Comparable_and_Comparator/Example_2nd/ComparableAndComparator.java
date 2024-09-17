package Comparable_and_Comparator.Example_2nd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableAndComparator {
    public static void main(String[] args) {
        Animal a1 = new Animal(9, "Bob", 60);
        Animal a2 = new Animal(2, "Oggy", 34);
        Animal a3 = new Animal(3, "Tiger", 55);
        Animal a4 = new Animal(8, "DoggyDon", 44);
        Animal a5 = new Animal(4, "Pigi", 54);
        Animal a6 = new Animal(2, "Olly", 30);

        List<Animal> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        list.add(a6);
        System.out.println(list);

        //sort on the basis of age and if age equal then sort according to name using comparable interface
        // Collections.sort(list);
        // System.out.println(list);

        //sort using by custom ways by using comparator interface
        // Collections.sort(list, new MyCustomSortingComparator()); // same has do like below code
        
        /*
        Collections.sort(list, new Comparator<Animal>() {
            // Now i am free to sort with any parameter without disturbing other code.
            // sort on the basis of name
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        */

        // above all code of Comparator change by lambda expression like below
        Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        // we can also use java 8 Comparator method comparing like below
        // In this code also use if age equal thenComparing() method for further comparing like on the basis of Name. it also called chaining

        // Collections.sort(list, Comparator.comparing(Animal::getAge).thenComparing(Animal::getName)); // This code written like this  Collections.sort(list, (l1, l2) -> { return l1.getAge() - l2.getAge(); });

        System.out.println(list);
    }
}

//Define own custom sorting logic without any changes in other classes or code.
class MyCustomSortingComparator implements Comparator<Animal>{

    @Override
    public int compare(Animal o1, Animal o2) {
        //return o1.weight - o2.weight; // this method work as below but in case negative case it can overflow for too negative value.
        return Integer.compare(o1.getWeight(), o2.getWeight());
    }

}