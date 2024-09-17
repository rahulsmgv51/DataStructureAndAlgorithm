package Comparable_and_Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * MyCustomComparatorClass
 */
class MyCustomComparatorClass implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        // return o1.age - o2.age;
        return Integer.compare(o1.age, o1.age);
    }

}

public class Comparable_Class {
    public static void main(String[] args) {
        Person p1 = new Person(24, "Rahul", 74);
        Person p2 = new Person(25, "Chahul", 65);
        Person p3 = new Person(23, "Ghanshayam", 79);
        Person p4 = new Person(11, "Kamal", 32);
        Person p5 = new Person(23, "Radhyshayam", 78);
        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);

        System.out.println(persons);
        // Collections.sort(persons); // Use for comparable
        Collections.sort(persons, new MyCustomComparatorClass());
        // Collections.sort(persons, new Comparator<Person>() {
        // @Override
        // public int compare(Person o1, Person o2) {
        // return o1.name.compareTo(o2.name);
        // }

        // });

        // Lambda expression
        // Collections.sort(persons, (o1, o2) -> o1.name.compareTo(o2.name));

        System.out.println(persons);

        int arr[][] = { 
                        { 4, 5, 2 }, 
                        { 5, 1, 2 }, 
                        { 1, 4, 7 }
                      };

        // Sort the Array on the basis of first column element
        /*
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
            
        });
        */
        
        // above code write like below code by using lambda expression
        Arrays.sort(arr, (arr1, arr2) -> {
            return arr1[0] - arr2[0];
        });

        for (int[] is : arr) {
            for (int element : is) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}