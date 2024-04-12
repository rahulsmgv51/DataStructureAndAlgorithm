package Comparable_and_Comparator;

public class Person implements Comparable<Person>{
    int age;
    String name;
    int weight;

    public Person(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + ", weight=" + weight + "]\n";
    }

    @Override
    public int compareTo(Person specifiedObject) {
        if(this.age == specifiedObject.age){
            return this.name.compareTo(specifiedObject.name);
        }
        return this.age - specifiedObject.age;
    }
}