package Set;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {

    enum Color{
        RED, YELLOW, GREEN
    }

    public static void main(String[] args) {

        System.out.println(Color.GREEN);

        //Create enum set of Color
        EnumSet<Color> enumSet = EnumSet.allOf(Color.class);

        Set<Integer> set = new HashSet<>(); // TimeComplexity O(1)
        // Set<Integer> set = new LinkedHashSet<>(); //TimeComplexity O(n)

        // Duplicate no allow
        set.add(10);
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(30);
        // print only 3 element
        System.out.println(set);

        set.remove(10);
        System.out.println(set.contains(30));

        // Tree sort the element //TimeComplexity O(logn)
        Set<Integer> set1 = new TreeSet<>();
        set1.add(10);
        set1.add(30);
        set1.add(20);
        set1.add(50);
        set1.add(40);
        System.out.println(set1);

        Set<String> str = new HashSet<>();
        str.add("Ram");
        str.add("Shaym");
        str.add("Ghanshaym");
        str.add("Rakesh");
        str.add("Ram");
        System.out.println(str);

        // HashSet of Custom Objects

        Set<Person> persons = new HashSet<>();
        persons.add(new Person(1, "Ram"));
        persons.add(new Person(2, "Mahesh"));
        persons.add(new Person(2, "Mahesh"));
        persons.add(new Person(2, "Mahesh"));

        //Remove duplicate by using hashCode() and equals() method
        System.out.println(persons);
    }
}

class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }   
}